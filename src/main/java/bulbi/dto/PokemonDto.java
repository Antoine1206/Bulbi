package bulbi.dto;

import bulbi.enumeration.TypePokemon;
import jakarta.persistence.ElementCollection;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PokemonDto {

    private Long id;
    private String name;
    private String weight;
    private String height;

    @ElementCollection(targetClass = TypePokemon.class)
    private List<TypePokemon> typePokemons;


}
