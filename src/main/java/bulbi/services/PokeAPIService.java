package bulbi.services;

import bulbi.model.Pokemon;
import bulbi.repository.PokemonRepository;
import org.springframework.stereotype.Service;

@Service
public class PokeAPIService {


    private final PokemonRepository pokemonRepository;

    public PokeAPIService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public void getPokemonInfo(Pokemon pokemon) {

        pokemonRepository.save(pokemon);

    }
}
