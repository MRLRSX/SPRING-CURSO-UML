package br.com.devsuperior.umlspring.repositories;

import br.com.devsuperior.umlspring.entities.ItemPedido;
import br.com.devsuperior.umlspring.entities.ItemPedidoPK;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPK> {
}
