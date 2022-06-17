package com.joaogabriel.cursomc.repository;

import com.joaogabriel.cursomc.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
