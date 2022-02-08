
package com.example.demo.Service;

import com.example.demo.model.Artista;
import com.example.demo.repositories.ArtistaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class ArtistaService {
    
    @Autowired
    private final ArtistaRepository artistaRepository;
    
     public ArtistaService(ArtistaRepository artistaRepository){
        this.artistaRepository = artistaRepository;
    }
   
     public Artista postArtista (Artista artista){
         Random rd = new Random();
         artista.setIdArtista(rd.nextInt());
         return artistaRepository.save(artista);
     }      
   
   public Optional<Artista> getArtista(Integer id){
       return artistaRepository.findById(id);
   }
   
    public void deleteArtista(Integer id){
        artistaRepository.deleteById(id);
   }
}