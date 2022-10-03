package com.example.demo.Service;

import com.example.demo.model.Citazione;
import com.example.demo.repositories.CitazioneRepository;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitazioneService {

    @Autowired
    private CitazioneRepository citazioneRepository;

    public List<Citazione> getCitazione(String stringaCercata) {
        return citazioneRepository.getCitazione(stringaCercata);
    }

    public Citazione postCitazione(Citazione citazione) {
        Random rd = new Random();
        citazione.setIdCitazione(rd.nextInt());
        return citazioneRepository.save(citazione);
    }

    public void deleteCitazione(Integer id) {
        try{
            citazioneRepository.deleteById(id);
        }
        catch(Exception e){
            System.out.println("errore nel rimuovere la citazione");
        }
    }
}