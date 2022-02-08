/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Service;

import com.example.demo.model.Citazione;
import com.example.demo.model.Libro;
import com.example.demo.repositories.LibroRepository;
import java.util.Optional;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LibroService {
    
    @Autowired
    private final LibroRepository libroRepository;
    
     public LibroService(LibroRepository libroRepository){
        this.libroRepository = libroRepository;
    }
   
     public Libro postLibro (Libro libro){
         Random rd = new Random();
         libro.setIdLibro(rd.nextInt());
         return libroRepository.save(libro);
     }      
   
   public Optional<Libro> getLibro(Integer id){
       return libroRepository.findById(id);
   }
   
    public void deleteLibro(Integer id){
        libroRepository.deleteById(id);
   }
}
