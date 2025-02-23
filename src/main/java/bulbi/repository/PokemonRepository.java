package bulbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import bulbi.model.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {


}
