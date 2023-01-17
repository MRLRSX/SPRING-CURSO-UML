package br.com.devsuperior.umlspring.dto;

import br.com.devsuperior.umlspring.entities.Categoria;
import br.com.devsuperior.umlspring.entities.Produto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDTO implements Serializable {
    private static final long serialVersionUID = 1l;

    private Long id;

    private String name;

    private List<Produto> produtos = new ArrayList<>();
    public CategoriaDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoriaDTO(){}
    public CategoriaDTO(Categoria categoria){
        this.id = categoria.getId();
        this.name = categoria.getName();;
    }
    public CategoriaDTO(Categoria categoria, List<Produto> produto){
        this(categoria);
        produto.forEach(p -> this.produtos.add(ProdutoDTO(p)));
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
