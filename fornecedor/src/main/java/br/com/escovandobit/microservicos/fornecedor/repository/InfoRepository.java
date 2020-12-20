package br.com.escovandobit.microservicos.fornecedor.repository;

import br.com.escovandobit.microservicos.fornecedor.entity.InfoFornecedor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface InfoRepository extends PagingAndSortingRepository<InfoFornecedor, UUID> {

    Optional<InfoFornecedor> findByEstado(String estado);

}
