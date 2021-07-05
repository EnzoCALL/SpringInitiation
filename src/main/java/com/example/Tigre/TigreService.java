package com.example.Tigre;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TigreService {

    private final List<Tigre> tigres = new ArrayList<Tigre>();


    //GET
    public List<Tigre> getTigre(){
        return tigres;
    }

    //ADD
    public void addTigre(Tigre newTigre){
        tigres.add(newTigre);
    }

    //REMOVE
    public void deleteTigre(String nomTigreSupp){
        Tigre toSupp = null;
        for (Tigre t: tigres){
            if (t.getNom().equals(nomTigreSupp)){
                toSupp = t;
            }
        }
        tigres.remove(toSupp);
        System.out.println("[Le tigre " + toSupp.getNom() + " a était supprimé.]");
    }
}
