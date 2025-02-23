package bulbi.controller;

import bulbi.model.Pokemon;
import bulbi.services.PokeAPIService;
import bulbi.services.PokemonService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.json.Json;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
@RequestMapping("/api/pokeAPI")
public class PokeAPIController {

    private final PokeAPIService pokeAPIService;

    public PokeAPIController(PokeAPIService pokeAPIService) {
        this.pokeAPIService = pokeAPIService;
    }

    // Endpoint GET pour récupérer les informations sur un Pokémon
    @GetMapping("/pokemon")
    public void getPokemonInfo(@RequestParam String idOrName) throws IOException, InterruptedException {
        // Construction de l'URL de l'API Pokémon avec le paramètre idOrName
        String url = "https://pokeapi.co/api/v2/pokemon/" + idOrName;

        // Création de la requête HTTP GET
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // Création du client HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Envoi de la requête et récupération de la réponse

        ObjectMapper objectMapper = new ObjectMapper();
        Pokemon pokemon = objectMapper.readValue(client.send(request, HttpResponse.BodyHandlers.ofString()).body(), Pokemon.class);
        pokeAPIService.getPokemonInfo(pokemon);
    }
}
