package br.com.devsuperior.umlspring.repositories;

import br.com.devsuperior.umlspring.entities.PagamentoComBoleto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoComBoletoRepository extends JpaRepository<PagamentoComBoleto, Long> {
}
