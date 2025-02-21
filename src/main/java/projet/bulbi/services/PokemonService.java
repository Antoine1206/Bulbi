package projet.bulbi.services;

import org.springframework.stereotype.Service;
import projet.bulbi.model.Pokemon;
import projet.bulbi.repository.PokemonRepository;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

}
