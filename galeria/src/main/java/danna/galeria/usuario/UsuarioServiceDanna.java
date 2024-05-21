package danna.galeria.usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceDanna {
    @Autowired
    private UsuarioRepositoryDanna usuarioRepository;

    public List<UsuarioDanna> findAllDanna() {
        Iterable<UsuarioDanna> iterable = usuarioRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }

    public UsuarioDanna save(UsuarioDanna entity) {
        return usuarioRepository.save(entity);
    }

    public void deleteByNombre(String nombreUsuario) {
        usuarioRepository.deleteByNombre(nombreUsuario);
    }
}
