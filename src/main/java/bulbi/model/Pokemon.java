package bulbi.model;

import bulbi.enumeration.TypePokemon;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {

    @Id //=> Cette annotation indique que l'id est la clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //=> La clé primaire sera générée automatiquement par la BDD lors de l'insertion d'un nouveau joueur
    private Long id;
    private String name;
    private String weight;
    private String height;

    @ElementCollection(targetClass = TypePokemon.class)
    private List<TypePokemon> typePokemons;


}
