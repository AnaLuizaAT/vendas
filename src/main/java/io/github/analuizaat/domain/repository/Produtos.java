package io.github.analuizaat.domain.repository;

import io.github.analuizaat.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}