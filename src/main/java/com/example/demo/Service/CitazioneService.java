package com.example.demo.Service;

import com.example.demo.model.Citazione;
import com.example.demo.model.Utente;
import com.example.demo.repositories.CitazioneRepository;
import java.util.Optional;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitazioneService {
    
    @Autowired
    private final CitazioneRepository citazioneRepository;
    
     public CitazioneService(CitazioneRepository citazioneRepository){
        this.citazioneRepository = citazioneRepository;
    }
   
     public Citazione postCitazione (Citazione citazione){
         Random rd = new Random();
         citazione.setIdCitazione(rd.nextInt());
         return citazioneRepository.save(citazione);
     }      
   
   public Optional<Citazione> getCitazione(Integer id){
       return citazioneRepository.findById(id);
   }
   
    public void deleteCitazione(Integer id){
        citazioneRepository.deleteById(id);
   }
}


