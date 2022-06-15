package com.joaogabriel.cursomc.repository;

import com.joaogabriel.cursomc.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
