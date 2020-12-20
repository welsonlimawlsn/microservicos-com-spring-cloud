package br.com.escovandobit.microservice.loja.controller;

import br.com.escovandobit.microservice.loja.controller.dto.CompraDTO;
import br.com.escovandobit.microservice.loja.service.CompraService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraController {

    private final CompraService compraService;

    public CompraController(CompraService compraService) {
        this.compraService = compraService;
    }

    @PostMapping
    public void realizaCompra(@RequestBody CompraDTO compraDTO) {
        compraService.realizaCompra(compraDTO);
    }

}
