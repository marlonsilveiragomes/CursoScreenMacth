package br.com.marlon.screenmatch.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Tradutor {
    private static final String API_URL = "https://libretranslate.de/translate";

    public String traduzir(String texto, String idiomaDestino) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        String json = String.format("{\"q\":\"%s\",\"source\":\"auto\",\"target\":\"%s\",\"format\":\"text\"}",
                texto, idiomaDestino);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
    

