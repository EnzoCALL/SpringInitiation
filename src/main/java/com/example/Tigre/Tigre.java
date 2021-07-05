package com.example.Tigre;

import javax.persistence.*;

@Entity
@Table(name="tigre")
public class Tigre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    //ATTRIBUTS DU TIGRE
    @Column(name="nom")
    private String nom;
    @Column(name="age")
    private int age;
    @Column(name="caractere")
    private String caractere;
    @Column(name="aggressif")
    private boolean aggressif;

    @Column(name="couleur_de_pelage")
    private String couleurDePelage;

    @Column(name="enfants")
    private int enfants;


    //CONSTRUCTEUR PAR DEFAUT VIDE
    public Tigre() {}

    //CONSTRUCTEUR COMPLET
    public Tigre(String nom, int age, String caractere, boolean aggressif, String couleurDePelage, int enfants) {
        this.nom = nom;
        this.age = age;
        this.caractere = caractere;
        this.aggressif = aggressif;
        this.couleurDePelage = couleurDePelage;
        this.enfants = enfants;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + " | Age: " + age + " | Caractere: " + caractere + " | Aggressif: " + aggressif + " | Couleur du pelage: " + couleurDePelage
                +  " | Enfants: " + enfants;
    }

    //GETTER - SETTER
    public String getCaractere() {
        return caractere;
    }
    public void setCaractere(String caractere) {
        this.caractere = caractere;
    }

    public boolean isAggressif() {return aggressif;}
    public void setAggressif(boolean aggressif) {
        this.aggressif = aggressif;
    }

    public String getCouleurDePelage() {
        return couleurDePelage;
    }
    public void setCouleurDePelage(String couleurDePelage) {
        this.couleurDePelage = couleurDePelage;
    }

    public int getEnfants() {
        return enfants;
    }
    public void setEnfants(int enfants) {
        this.enfants = enfants;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

}
