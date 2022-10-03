package com.example.demo;

// creator Marco Grassi Judge Federica Chiara Spelta
import com.example.demo.Service.ArtistaService;
import com.example.demo.Service.UtenteService;
import com.example.demo.Service.CitazioneService;
import com.example.demo.Service.LibroService;
import com.example.demo.model.Artista;
import com.example.demo.model.Citazione;
import com.example.demo.model.Libro;
import com.example.demo.model.Utente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@SpringBootApplication
@RestController
@RequestMapping("/users")
public class DemoApplication {

    @Autowired
    private UtenteService utenteService;
    @Autowired
    private ArtistaService artistaService;
    @Autowired
    private CitazioneService citazioneService;
    @Autowired
    private LibroService libroService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // ######## UTENTE CONTROLLER ########

    @GetMapping(value = "/getUserById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Utente> getUsers(@PathVariable("id") Integer id) {
        return utenteService.getUtente(id);
    }

    @PostMapping("/postUtente")
    public Utente postUtente(@RequestBody Utente utente) {
        return utenteService.postUtente(utente);
    }

    @GetMapping("/deleteUtente/{id}")
    public void deleteUtente(@PathVariable("id") Integer id) {
        utenteService.deleteUtente(id);
    }

    // ######## ARTISTA CONTROLLER ########

    @GetMapping("/getArtistaById/{id}")
    public Optional<Artista> getArtista(@PathVariable("id") Integer id) {
        return artistaService.getArtista(id);
    }

    @PostMapping("/postArtista")
    public Artista postArtista(@RequestBody Artista artista) {
        return artistaService.postArtista(artista);
    }

    @GetMapping("/deleteArtista/{id}")
    public void deleteArtista(@PathVariable("id") Integer id) {
        artistaService.deleteArtista(id);
    }

    // ######## CITAZIONE CONTROLLER ########

    @GetMapping("/getCitazione/{stringaCercata}")
    public List<Citazione> getCitazione(@PathVariable("stringaCercata") String stringaCercata) {
        return citazioneService.getCitazione(stringaCercata);
    }

    @PostMapping("/postCitazione")
    public Citazione postCitazione(@RequestBody Citazione citazione) {
        return citazioneService.postCitazione(citazione);
    }

    @GetMapping("/deleteCitazione/{id}")
    public void deleteCitazione(@PathVariable("id") Integer id) {
        citazioneService.deleteCitazione(id);
    }
    // ######## LIBRO CONTROLLER ########

    @GetMapping("/getLibroById/{id}")
    public Optional<Libro> getLibro(@PathVariable("id") Integer id) {
        return libroService.getLibro(id);
    }

    @PostMapping("/postLibro")
    public Libro postLibro(@RequestBody Libro libro) {
        return libroService.postLibro(libro);
    }

    @GetMapping("/deleteLibro/{id}")
    public void deleteLibro(@PathVariable("id") Integer id) {
        libroService.deleteLibro(id);
    }

    // ######## heroku CONTROLLER ########
    @GetMapping("/stampa")
    public String stampa() {
        return "ciao";
    }
}
