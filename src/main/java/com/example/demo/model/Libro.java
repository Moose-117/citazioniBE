package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Libro implements Serializable{
@Id
private Integer idLibro;
private Integer idArtista;
private String  nomeLibro;
private String annoPubblicazione;

    public Integer getIdLibro() {
        return idLibro;
    }
    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }
    public Integer getIdArtista() {
        return idArtista;
    }
    public void setIdArtista(Integer idArtista) {
        this.idArtista = idArtista;
    }
    public String getNomeLibro() {
        return nomeLibro;
    }
    public void setNomeLibro(String nomeLibro) {
        this.nomeLibro = nomeLibro;
    }
    public String getAnnoPubblicazione() {
        return annoPubblicazione;
    }
    public void setAnnoPubblicazione(String annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    @Override
    public String toString() {
        return "Libro{" + "idLibro=" + idLibro + ", idArtista=" + idArtista + ", nomeLibro=" + nomeLibro + ", annoPubblicazione=" + annoPubblicazione + '}';
    }
}
