package org.jlsanchez.webapp.jaxws.repository;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.jlsanchez.webapp.jaxws.models.Curso;

import java.util.List;

@RequestScoped
public class CursoRepositorioImpl  implements CursoRepositorio{

    @Inject
    private EntityManager em;

    @Override
    public List<Curso> listar() {
        return em.createQuery("from Curso", Curso.class).getResultList();
    }

    @Override
    public Curso crear(Curso curso) {
        em.persist(curso);
        return curso;
    }
}
