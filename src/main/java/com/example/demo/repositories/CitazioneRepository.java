
package com.example.demo.repositories;

import com.example.demo.model.Citazione;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CitazioneRepository extends JpaRepository<Citazione, Integer> {
    @Query("SELECT c FROM Citazione c WHERE c.content LIKE ?1%")
    public List<Citazione> getCitazione(String stringaCercata);
}