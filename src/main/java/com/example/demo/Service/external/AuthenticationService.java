package com.example.demo.Service.external;

import org.springframework.stereotype.Service;
import com.example.demo.model.CredentialsDto;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.URI;

@Service
public class AuthenticationService {

    public HttpResponse<String> generateToken(CredentialsDto credentialsDto) throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dummyjson.com/auth/login"))
                .setHeader("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(createBody(credentialsDto)))
                .build();
        try {
            return client.send(request, BodyHandlers.ofString());
        } catch (Exception e) {
            System.out.println("orrore nella chiamata al sever di auth");
            throw e;
        }
    }

    private String createBody(CredentialsDto credentialsDto) {
        String body = "{\"username\": \"" + credentialsDto.getUsername() + "\", \"password\": \"" + credentialsDto.getPassword() + "\"}";
        System.out.println("** AUTHENTICATION BODY IS **" + body);
        return body;
    }
}
