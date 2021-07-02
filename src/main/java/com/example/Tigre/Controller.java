package com.example.Tigre;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public ArrayList<Tigre> tigrou() {

        Tigre tigrou = new Tigre();
        tigrou.setAge(12);
        tigrou.setAggressif(false);
        tigrou.setCaractere("affectif");
        tigrou.setCouleurDePelage("classique");
        tigrou.setEnfants(0);
        tigrou.setNom("Tigrou");
        tigrou.setVaccine(true);

        Tigre tigrex = new Tigre();
        tigrex.setAge(20);
        tigrex.setAggressif(true);
        tigrex.setCaractere("territorial");
        tigrex.setCouleurDePelage("roux");
        tigrex.setEnfants(2);
        tigrex.setNom("Tigrex");
        tigrex.setVaccine(true);

        ArrayList<Tigre> tigres = new ArrayList<Tigre>();
        tigres.add(tigrou);
        tigres.add(tigrex);

        return tigres;
    }

    @PostMapping("/Tigre")
    public void receptionTigre(@RequestBody Tigre newTigre) {
        System.out.println("\n-Nouveau tigre receptionné-\n" + newTigre);
    }
}