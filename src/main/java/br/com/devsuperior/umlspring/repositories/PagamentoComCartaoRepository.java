package br.com.devsuperior.umlspring.repositories;

import br.com.devsuperior.umlspring.entities.PagamentoComCartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoComCartaoRepository extends JpaRepository<PagamentoComCartao, Long> {
}
