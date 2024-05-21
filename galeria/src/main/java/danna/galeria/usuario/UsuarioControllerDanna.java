package danna.galeria.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControllerDanna {
        @Autowired
    private UsuarioServiceDanna usuarioService;

    @GetMapping("/")
    public ResponseEntity<List<UsuarioDanna>> getAllEmpleados() {
        List<UsuarioDanna> usuarios = usuarioService.findAllDanna();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<UsuarioDanna> createUsuario(@RequestBody UsuarioDanna usuario) {
        UsuarioDanna createdUsuario = usuarioService.save(usuario);
        return new ResponseEntity<>(createdUsuario, HttpStatus.CREATED);
    }

    @DeleteMapping("/{nombre}/")
    public ResponseEntity<Void> deleteUsuarioByNombre(@PathVariable String nombre) {
        usuarioService.deleteByNombre(nombre);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
