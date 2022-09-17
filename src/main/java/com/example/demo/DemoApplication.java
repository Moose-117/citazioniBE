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
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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


@CrossOrigin( origins = "*")
@SpringBootApplication
@RestController
@RequestMapping("/users")
public class DemoApplication {

        @Autowired
        private final UtenteService utenteService;
        @Autowired
        private final ArtistaService artistaService;
        @Autowired
        private final CitazioneService citazioneService;
        @Autowired
        private final LibroService libroService;
   
        public DemoApplication(UtenteService utenteService, ArtistaService artistaService, CitazioneService citazioneService, LibroService libroService ) {
            this.utenteService = utenteService;
            this.artistaService = artistaService;
            this.citazioneService = citazioneService;
            this.libroService = libroService;

        }
            
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
        
        
        // ######## UTENTE CONTROLLER ########
        
        @GetMapping(value = "/getUserById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity getUsers(@PathVariable("id") Integer id) {
           Optional<Utente> utenteCercato = utenteService.getUtente(id);
                 return new ResponseEntity<>(utenteCercato, HttpStatus.OK);
        }
        @PostMapping("/postUtente")
        public ResponseEntity postUtente(@RequestBody Utente utente){
            utenteService.postUtente(utente);
            return new ResponseEntity<>(utente, HttpStatus.CREATED);
        }
        @GetMapping("/deleteUtente/{id}")
        public ResponseEntity deleteUtente(@PathVariable("id") Integer id){
            utenteService.deleteUtente(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        
         // ######## ARTISTA CONTROLLER ########
        
        @GetMapping("/getArtistaById/{id}")
        public ResponseEntity getArtista(@PathVariable("id") Integer id) {
           Optional<Artista> artistaCercato = artistaService.getArtista(id);
                 return new ResponseEntity<>(artistaCercato, HttpStatus.OK);
        }
        
         @PostMapping("/postArtista")
        public ResponseEntity postArtista(@RequestBody Artista artista){
            artistaService.postArtista(artista);
            return new ResponseEntity<>(artista, HttpStatus.CREATED);
        }
        
          @GetMapping("/deleteArtista/{id}")
        public ResponseEntity deleteArtista(@PathVariable("id") Integer id){
            artistaService.deleteArtista(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        
        
                 // ######## CITAZIONE CONTROLLER ########
        
         @GetMapping("/getCitazioneById/{id}")
        public ResponseEntity getCitazione(@PathVariable("id") Integer id) {
           Optional<Citazione> citazioneCercata = citazioneService.getCitazione(id);
                 return new ResponseEntity<>(citazioneCercata, HttpStatus.OK);
        }
        
         @PostMapping("/postCitazione")
        public ResponseEntity postCitazione(@RequestBody Citazione citazione){
            citazioneService.postCitazione(citazione);
            return new ResponseEntity<>(citazione, HttpStatus.CREATED);
        }
        
          @GetMapping("/deleteCitazione/{id}")
        public ResponseEntity deleteCitazione(@PathVariable("id") Integer id){
            citazioneService.deleteCitazione(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        
        
                 // ######## LIBRO CONTROLLER ########

            @GetMapping("/getLibroById/{id}")
        public ResponseEntity getLibro(@PathVariable("id") Integer id) {
           Optional<Libro> libroCercato = libroService.getLibro(id);
                 return new ResponseEntity<>(libroCercato, HttpStatus.OK);
        }
        
         @PostMapping("/postLibro")
        public ResponseEntity postLibro(@RequestBody Libro libro){
            libroService.postLibro(libro);
            return new ResponseEntity<>(libro, HttpStatus.CREATED);
        }
        
          @GetMapping("/deleteLibro/{id}")
        public ResponseEntity deleteLibro(@PathVariable("id") Integer id){
            libroService.deleteLibro(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
		
		// ######## heroku CONTROLLER ########
		  @GetMapping("/stampa")
        public ResponseEntity stampa () {
          return new ResponseEntity<>("ciao", HttpStatus.OK);
        }   
}
