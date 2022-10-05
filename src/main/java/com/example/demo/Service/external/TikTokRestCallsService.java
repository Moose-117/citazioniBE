package com.example.demo.Service.external;

import org.springframework.stereotype.Service;
import com.example.demo.model.Token;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.io.IOException;
import java.net.URI;

@Service
public class TikTokRestCallsService {

    public HttpResponse<String> callTikTokAuthServer(Token token) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.tiktok.com/"))
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        System.out.println(response.body());
        return response;
    }
}
