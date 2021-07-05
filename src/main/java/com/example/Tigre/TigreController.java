package com.example.Tigre;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TigreController {

    @Autowired
    TigreService tigreService;

    @GetMapping("check")
    public List<Tigre> voirTigre() {
        return tigreService.getTigre();
    }

    @PostMapping("add")
    public void createTigre(@RequestBody Tigre newTigre) {
        System.out.println("\n-Nouveau tigre receptionné-\n" + newTigre);
        tigreService.addTigre(newTigre);
    }

    @DeleteMapping("/del/{nom}")
    public void enleveTigre(@PathVariable("nom") String nomTigre) {
        System.out.println("\n-Suppression du tigre " + nomTigre + "-");
        tigreService.deleteTigre(nomTigre);
    }
}