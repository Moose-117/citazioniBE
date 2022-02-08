package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artista implements Serializable {
    
@Id
 Integer idArtista;
 String nome;        
 String cognome;
 String natoA;
 String annoNascita;
 String annoMorte;

    public Integer getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(Integer idArtista) {
        this.idArtista = idArtista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNatoA() {
        return natoA;
    }

    public void setNatoA(String natoA) {
        this.natoA = natoA;
    }

    public String getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(String annoNascita) {
        this.annoNascita = annoNascita;
    }

    public String getAnnoMorte() {
        return annoMorte;
    }

    public void setAnnoMorte(String annoMorte) {
        this.annoMorte = annoMorte;
    }

    @Override
    public String toString() {
        return "Artista{" + "idArtista=" + idArtista + ", nome=" + nome + ", cognome=" + cognome + ", natoA=" + natoA + ", annoNascita=" + annoNascita + ", annoMorte=" + annoMorte + '}';
    }
}
