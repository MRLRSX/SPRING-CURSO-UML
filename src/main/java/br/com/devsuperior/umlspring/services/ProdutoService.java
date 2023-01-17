package br.com.devsuperior.umlspring.services;

import br.com.devsuperior.umlspring.dto.CategoriaDTO;
import br.com.devsuperior.umlspring.dto.ProdutoDTO;
import br.com.devsuperior.umlspring.entities.Categoria;
import br.com.devsuperior.umlspring.entities.Produto;
import br.com.devsuperior.umlspring.repositories.ProdutoRepository;
import br.com.devsuperior.umlspring.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Page<ProdutoDTO> findAll(Pageable pageable){
        return produtoRepository.findAll(pageable).map(ProdutoDTO::new);
    }

    public ProdutoDTO findById(Long id){
        Optional<Produto> prod= produtoRepository.findById(id).orElseThrow(() -> ResourceNotFoundException("Entity Not Found"));
        Produto produto  = prod.get();
        return new CategoriaDTO(produto);
    }
}
