package bulbi.enumeration;

import lombok.Getter;

@Getter
public enum TypePokemon {

    NORMAL("Normal"),
    FIRE("Feu"),
    WATER("Eau"),
    GRASS("Plante"),
    ELECTRIC("Électrik"),
    ICE("Glace"),
    FIGHTING("Combat"),
    POISON("Poison"),
    GROUND("Sol"),
    FLYING("Vol"),
    PSYCHIC("Psy"),
    BUG("Insecte"),
    ROCK("Roche"),
    GHOST("Spectre"),
    DRAGON("Dragon"),
    DARK("Ténèbres"),
    STEEL("Acier"),
    FAIRY("Fée");


    private String libelle;

    TypePokemon(String libelle) {
        this.libelle = libelle;
    }
}
