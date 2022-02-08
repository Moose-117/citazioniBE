
package com.example.demo.repositories;

import com.example.demo.model.Citazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CitazioneRepository extends JpaRepository<Citazione, Integer> {
}