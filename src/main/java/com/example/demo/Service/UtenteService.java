
package com.example.demo.Service;

import com.example.demo.repositories.UtenteRepository;
import com.example.demo.model.Utente;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class UtenteService {
    
    @Autowired
    private final UtenteRepository utenteRepository;
    
     public UtenteService(UtenteRepository utenteRepository){
        this.utenteRepository = utenteRepository;
    }
   
     public Utente postUtente (Utente utente){
         Random rd = new Random();
         utente.setIdUtente(rd.nextInt());
         return utenteRepository.save(utente);
     }      
   
   public Optional<Utente> getUtente(Integer id){
       return utenteRepository.findById(id);
   }
   
    public void deleteUtente(Integer id){
        utenteRepository.deleteById(id);
   }
}

