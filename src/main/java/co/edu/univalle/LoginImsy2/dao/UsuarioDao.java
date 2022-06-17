package co.edu.univalle.LoginImsy2.dao;

import co.edu.univalle.LoginImsy2.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
