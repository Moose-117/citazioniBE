package com.example.demo.Service;

import com.example.demo.Service.external.TikTokRestCallsService;
import com.example.demo.model.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.Random;

@Service
public class ManageTokenService {

    @Autowired
    private TikTokRestCallsService tikTokRestCallsService;

    /*
     * public Utente postUtente (Utente utente){
     * Random rd = new Random();
     * utente.setIdUtente(rd.nextInt());
     * return utenteRepository.save(utente);
     * }
     */

    public Token createToken() {
        Token token = new Token();
        Random rd = new Random();
        Integer generatedToken = rd.nextInt();
        token.setContent(generatedToken.toString());
        return token;
    }

    public HttpResponse<String> validateToken(Token token) {
        try {
            return tikTokRestCallsService.callTikTokAuthServer(token);
        } catch (IOException | InterruptedException e) {
            return null;
        }
    }
}
