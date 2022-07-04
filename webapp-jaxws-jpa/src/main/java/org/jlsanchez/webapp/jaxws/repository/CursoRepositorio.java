package org.jlsanchez.webapp.jaxws.repository;

import org.jlsanchez.webapp.jaxws.models.Curso;

import java.util.List;

public interface CursoRepositorio {

    List<Curso> listar();

    Curso crear(Curso c);
}
