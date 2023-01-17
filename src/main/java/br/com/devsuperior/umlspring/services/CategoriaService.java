package br.com.devsuperior.umlspring.services;

import br.com.devsuperior.umlspring.dto.CategoriaDTO;
import br.com.devsuperior.umlspring.entities.Categoria;
import br.com.devsuperior.umlspring.repositories.CategoriaRepository;
import br.com.devsuperior.umlspring.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    public Page<CategoriaDTO> findAll(Pageable pageable){
        return categoriaRepository.findAll(pageable).map(CategoriaDTO::new);
    }

    public CategoriaDTO findById(Long id){
        Optional<Categoria> cat= categoriaRepository.findById(id).orElseThrow(() -> ResourceNotFoundException("Entity Not Found"));
        Categoria categoria = cat.get();
        return new CategoriaDTO(categoria);
    }
}
