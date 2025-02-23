package bulbi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bulbi.services.PokemonService;

@RestController
@RequestMapping("/api/players")
public class PokemonController {

    private final PokemonService pokemonService;  //Final => Après l'initialisation, l'objet n'est plus modifiable

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }



}
