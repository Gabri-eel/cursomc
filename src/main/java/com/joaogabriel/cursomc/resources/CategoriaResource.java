package com.joaogabriel.cursomc.resources;


import com.joaogabriel.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

    @RequestMapping(method=RequestMethod.GET)
    public List<Categoria> listar() {

        Categoria cat1 = new Categoria(1, "Informatica");
        Categoria cat2 = new Categoria(1,"Escritorio");

        List<Categoria> Lista = new ArrayList<>();
        Lista.add(cat1);
        Lista.add(cat2);

        return Lista;
    }

}
