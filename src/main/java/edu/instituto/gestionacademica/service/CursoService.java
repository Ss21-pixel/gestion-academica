package edu.instituto.gestionacademica.service;

import edu.instituto.gestionacademica.model.Curso;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    public List<Curso> listar() {

        return List.of(
                new Curso(1L, "Programacion IV", 64),
                new Curso(2L, "Spring MVC", 32)
        );
    }
}