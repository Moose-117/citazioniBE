package com.example.demo.Service;

import com.example.demo.Service.external.AuthenticationService;
import com.example.demo.model.CredentialsDto;
import com.example.demo.model.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import java.util.Random;
import org.json.*;

@Service

public class ManageTokenService {

    @Autowired
    private AuthenticationService authenticationService;

    /*
     * public Utente postUtente (Utente utente){
     * Random rd = new Random();
     * utente.setIdUtente(rd.nextInt());
     * return utenteRepository.save(utente);
     * }
     */

    // public Token createToken() {
    // Token token = new Token();
    // Random rd = new Random();
    // Integer generatedToken = rd.nextInt();
    // token.setContent(generatedToken.toString());
    // return token;
    // }

    public String createToken(CredentialsDto credentialsDto) {
        Token token = new Token();
        String responseServer;
        try {
            responseServer = authenticationService.generateToken(credentialsDto).body();
            JSONObject json = new JSONObject(responseServer);
            token.setToken(json.getString("token"));
        } catch (Exception e) {
        }
        return token.getToken();
    }

    // public String validateToken() {
    //     String response = null;
    //     try {
    //         response = authenticationService.().body();
    //     } catch (Exception e) {
    //     }
    //     return response;
    // }
}
