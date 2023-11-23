package br.com.alurafood.pedidos.dto.response;

import br.com.alurafood.pedidos.model.ItemDoPedido;
import br.com.alurafood.pedidos.model.Pedido;
import br.com.alurafood.pedidos.model.Status;

import java.time.LocalDateTime;
import java.util.List;

public record DadosDetalhamentoPedido(Long id, LocalDateTime dataHora, Status status, List<ItemDoPedido> itens) {
    public DadosDetalhamentoPedido(Pedido pedido) {
        this(pedido.getId(), pedido.getDataHora(), pedido.getStatus(), pedido.getItens());
    }
}
