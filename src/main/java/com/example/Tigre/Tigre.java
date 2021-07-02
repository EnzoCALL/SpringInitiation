package com.example.Tigre;

public class Tigre {

    private String nom;
    private int age;
    private String caractere;
    private boolean aggressif;
    private String couleurDePelage;
    private int enfants;
    private boolean vaccine;

    public Tigre(String nom, int age, String caractere, boolean aggressif, String couleurDePelage, int enfants, boolean vaccine) {
        this.nom = nom;
        this.age = age;
        this.caractere = caractere;
        this.aggressif = aggressif;
        this.couleurDePelage = couleurDePelage;
        this.enfants = enfants;
        this.vaccine = vaccine;
    }

    public Tigre() {

    }

    @Override
    public String toString() {
        return "Nom: " + nom + " | Age: " + age + " | Caractere: " + caractere + " | Aggressif: " + aggressif
                + " | Couleur du pelage: " + couleurDePelage + " | Enfants: " + enfants + " | Vacciné: " + vaccine;
    }

    public String getCaractere() {
        return caractere;
    }

    public void setCaractere(String caractere) {
        this.caractere = caractere;
    }

    public boolean isAggressif() {
        return aggressif;
    }

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

    public boolean isVaccine() {
        return vaccine;
    }

    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
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
