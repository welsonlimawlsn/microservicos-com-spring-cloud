package br.com.escovandobit.microservicos.fornecedor.controller;

import br.com.escovandobit.microservicos.fornecedor.entity.InfoFornecedor;
import br.com.escovandobit.microservicos.fornecedor.exception.NotFoundException;
import br.com.escovandobit.microservicos.fornecedor.service.InfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    private final InfoService infoService;

    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping("/{estado}")
    public InfoFornecedor getInfoPorEstado(@PathVariable String estado) throws NotFoundException {
        return infoService.getInfoPorEstado(estado);
    }

}
