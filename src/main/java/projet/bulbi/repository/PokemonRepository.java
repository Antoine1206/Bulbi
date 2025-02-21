package projet.bulbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projet.bulbi.model.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {


}
