package com.example.Tigre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TigreServiceSQL {

    @Autowired
    TigreRepository tigreRepository;

    public List<Tigre> getTigres(){
        return tigreRepository.findAll();
    }
    public void addTigre(Tigre nouveauTigre) {
        tigreRepository.save(nouveauTigre);
    }
}