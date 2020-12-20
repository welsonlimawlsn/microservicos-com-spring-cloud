package br.com.escovandobit.microservicos.fornecedor.service;

import br.com.escovandobit.microservicos.fornecedor.entity.InfoFornecedor;
import br.com.escovandobit.microservicos.fornecedor.exception.NotFoundException;
import br.com.escovandobit.microservicos.fornecedor.repository.InfoRepository;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    private final InfoRepository infoRepository;

    public InfoService(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public InfoFornecedor getInfoPorEstado(String estado) throws NotFoundException {
        return infoRepository.findByEstado(estado).orElseThrow(() -> new NotFoundException("Info não encontrado!"));
    }

}
