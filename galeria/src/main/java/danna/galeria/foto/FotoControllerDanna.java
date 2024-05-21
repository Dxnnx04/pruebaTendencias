package danna.galeria.foto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fotos")
public class FotoControllerDanna {
    @Autowired
    private FotoServiceDanna fotoService;

    @GetMapping("/")
    public ResponseEntity<List<FotoDanna>> getAllProyectos() {
        List<FotoDanna> fotos = fotoService.findAllDanna();
        return new ResponseEntity<>(fotos, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<FotoDanna> createFoto(@RequestBody FotoDanna foto) {
        FotoDanna createFoto = fotoService.insert(foto);
        return new ResponseEntity<>(createFoto, HttpStatus.CREATED);
    }
}
