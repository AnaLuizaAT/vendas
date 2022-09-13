package io.github.analuizaat.domain.repository;

import io.github.analuizaat.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}