package bulbi.services;

import bulbi.dto.PokemonDto;
import org.springframework.stereotype.Service;
import bulbi.repository.PokemonRepository;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }


/*     private PokemonDto createPokemon() {

     }*/



}
