package bulbi.mapper;

import bulbi.dto.PokemonDto;
import bulbi.model.Pokemon;

public class PokemonMapper {


    private PokemonDto toDto(Pokemon pokemon) {

        PokemonDto pokemonDto = new PokemonDto();
        pokemonDto.setId(pokemon.getId());
        pokemonDto.setName(pokemon.getName());
        pokemonDto.setWeight(pokemon.getWeight());
        pokemonDto.setHeight(pokemon.getHeight());
        pokemonDto.setTypePokemons(pokemon.getTypePokemons());

        return pokemonDto;
    }



    private Pokemon toBo(PokemonDto pokemonDto) {

        Pokemon pokemon = new Pokemon();
        pokemon.setId(pokemonDto.getId());
        pokemon.setName(pokemonDto.getName());
        pokemon.setWeight(pokemonDto.getWeight());
        pokemon.setHeight(pokemonDto.getHeight());
        pokemon.setTypePokemons(pokemonDto.getTypePokemons());

        return pokemon;
    }


}
