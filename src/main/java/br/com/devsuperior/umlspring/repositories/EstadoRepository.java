package br.com.devsuperior.umlspring.repositories;

import br.com.devsuperior.umlspring.entities.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
