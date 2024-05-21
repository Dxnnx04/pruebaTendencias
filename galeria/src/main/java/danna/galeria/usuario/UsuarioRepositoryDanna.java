package danna.galeria.usuario;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface UsuarioRepositoryDanna extends CrudRepository<UsuarioDanna, Long> {
    @Modifying
    @Transactional
    @Query("DELETE FROM UsuarioDanna r WHERE r.nombre = ?1")
    void deleteByNombre(String nombreUsuario);
}
