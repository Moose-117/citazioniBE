package com.example.demo.Service.external;

import org.springframework.stereotype.Service;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.URI;

@Service
public class TikTokRestCallsService {

    public HttpResponse<String> callTikTokAuthServer() throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dummyjson.com/auth/login"))
                .setHeader("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString("{\"username\": \"kminchelle\",\"password\": \"0lelplR\"}"))
                .build();
        try {
            return client.send(request, BodyHandlers.ofString());
            } catch (Exception e) {
            System.out.println("orrore nella chiamata al sever di auth");
            throw e;
        }
    }
}
