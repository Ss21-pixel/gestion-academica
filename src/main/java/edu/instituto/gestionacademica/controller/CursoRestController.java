package edu.instituto.gestionacademica.controller;

import edu.instituto.gestionacademica.model.Curso;
import edu.instituto.gestionacademica.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CursoRestController {

    private final CursoService cursoService;

    public CursoRestController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/saludo")
    public String saludo() {
        return "Proyecto Spring funcionando";
    }

    @GetMapping("/cursos")
    public List<Curso> cursos() {
        return cursoService.listar();
    }
}