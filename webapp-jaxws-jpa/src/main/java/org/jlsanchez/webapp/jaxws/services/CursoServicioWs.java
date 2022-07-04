package org.jlsanchez.webapp.jaxws.services;

import jakarta.jws.WebService;
import org.jlsanchez.webapp.jaxws.models.Curso;

import java.util.List;

@WebService
public interface CursoServicioWs {
    List<Curso> listar();
    Curso crear(Curso curso);
}
