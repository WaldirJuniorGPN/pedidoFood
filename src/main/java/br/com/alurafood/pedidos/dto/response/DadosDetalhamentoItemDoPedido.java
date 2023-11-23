package br.com.alurafood.pedidos.dto.response;

import br.com.alurafood.pedidos.model.ItemDoPedido;

public record DadosDetalhamentoItemDoPedido(Long id, Integer quantidade, String descricao) {
    public DadosDetalhamentoItemDoPedido(ItemDoPedido itemDoPedido){
        this(itemDoPedido.getId(), itemDoPedido.getQuantidade(), itemDoPedido.getDescricao());
    }
}
