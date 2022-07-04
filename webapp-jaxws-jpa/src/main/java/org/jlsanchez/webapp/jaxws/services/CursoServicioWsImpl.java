package org.jlsanchez.webapp.jaxws.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.jlsanchez.webapp.jaxws.models.Curso;
import org.jlsanchez.webapp.jaxws.repository.CursoRepositorio;


import java.util.List;

@Stateless
@WebService(endpointInterface = "org.jlsanchez.webapp.jaxws.services.CursoServicioWs")
public class CursoServicioWsImpl implements CursoServicioWs {

    @Inject
    private CursoRepositorio repositorio;


    @WebMethod
    @Override
    public List<Curso> listar() {
      return  repositorio.listar();
    }

    @Override
    @WebMethod
    public Curso crear(Curso curso) {
    return repositorio.crear(curso);
    }
}
