package danna.galeria.foto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FotoServiceDanna {
    @Autowired
    private FotoRepositoryDanna fotoRepository;

    public List<FotoDanna> findAllDanna() {
        Iterable<FotoDanna> iterable = fotoRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }
    public FotoDanna insert(FotoDanna foto) {
        return fotoRepository.save(foto);
    }
}
