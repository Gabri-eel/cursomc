package com.joaogabriel.cursomc.resources;


import com.joaogabriel.cursomc.domain.Categoria;
import com.joaogabriel.cursomc.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/categorias/")
public class CategoriaResource {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping(value = "total")
    public List<Categoria> listar() {

//        Categoria cat1 = new Categoria(1, "Informatica");
//        Categoria cat2 = new Categoria(2,"Escritorio");
//        List<Categoria> categoriaList = new ArrayList<>();
//        categoriaList.add(cat1);
//        categoriaList.add(cat2);
        return categoriaRepository.findAll();
    }

    @GetMapping("busca-categoria/{id}")
    public Optional<Categoria> getByCategoriaId(@PathVariable Integer id) {
        return categoriaRepository.findById(id);
    }

    @PostMapping(value = "salvar-categoria")
    public Categoria salvarCategoria(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @DeleteMapping("deleta-categoria/{id}")
    public void deleteCategoria(@PathVariable Integer id) {
        categoriaRepository.deleteById(id);
    }

    @PutMapping("atualiza-categoria/{id}")
    public Categoria updateCategoria(@PathVariable Integer id, @RequestBody Categoria categoria) {

        Optional<Categoria> cat = categoriaRepository.findById(id);

        cat.orElseThrow().setNome(categoria.getNome());
        return categoriaRepository.save(cat.get());
    }

}
