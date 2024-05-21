package danna.galeria.foto;

import java.sql.Date;

import danna.galeria.usuario.UsuarioDanna;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class FotoDanna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numeroDeFoto;
    private Date fecha;
    private Boolean guardada;

    @ManyToOne
    private UsuarioDanna usuarioDanna;
}
