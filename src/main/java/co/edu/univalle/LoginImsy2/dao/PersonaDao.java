package co.edu.univalle.LoginImsy2.dao;

import co.edu.univalle.LoginImsy2.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {
}
