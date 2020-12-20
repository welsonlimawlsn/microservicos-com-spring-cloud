package br.com.escovandobit.microservice.loja.controller.dto;

import java.util.UUID;

public class ItemCompraDTO {

    private UUID id;

    private Integer quantidade;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
