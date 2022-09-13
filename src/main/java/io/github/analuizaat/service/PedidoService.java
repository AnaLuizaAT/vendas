package io.github.analuizaat.service;

import io.github.analuizaat.domain.entity.Pedido;
import io.github.analuizaat.domain.enums.StatusPedido;
import io.github.analuizaat.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);
}