package br.com.escovandobit.microservice.loja.service;

import br.com.escovandobit.microservice.loja.controller.dto.CompraDTO;
import br.com.escovandobit.microservice.loja.controller.dto.InfoFornecedorDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    public void realizaCompra(CompraDTO compraDTO) {
        RestTemplate client = new RestTemplate();
        ResponseEntity<InfoFornecedorDTO> response = client.exchange(
                String.format("http://localhost:8081/info/%s", compraDTO.getEndereco().getEstado()), HttpMethod.GET, null,
                InfoFornecedorDTO.class);

        System.out.println(response.getBody().getEndereco());
    }

}
