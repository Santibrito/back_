package backend.BackEnd_ArgPrograma.repository;

import backend.BackEnd_ArgPrograma.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
