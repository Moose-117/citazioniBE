package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Citazione implements Serializable {
    
@Id
private Integer idCitazione;
private Integer idArtista;  
private Integer idLibro;  

    public Integer getIdCitazione() {
        return idCitazione;
    }
    public void setIdCitazione(Integer idCitazione) {
        this.idCitazione = idCitazione;
    }
    public Integer getIdArtista() {
        return idArtista;
    }
    public void setIdArtista(Integer idArtista) {
        this.idArtista = idArtista;
    }
    public Integer getIdLibro() {
        return idLibro;
    }
    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    @Override
    public String toString() {
        return "Citazione{" + "idCitazione=" + idCitazione + ", idArtista=" + idArtista + ", idLibro=" + idLibro + '}';
    }
}
