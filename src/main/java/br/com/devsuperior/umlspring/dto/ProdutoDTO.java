package br.com.devsuperior.umlspring.dto;

import br.com.devsuperior.umlspring.entities.Categoria;
import br.com.devsuperior.umlspring.entities.Produto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDTO implements Serializable {
    private static final long serialVersionUID = 1l;

    private Long id;
    private String nome:

    private Double preco;

    private List<CategoriaDTO> categorias = new ArrayList<>();/

    public ProdutoDTO() {}

    public ProdutoDTO(Long id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public ProdutoDTO(Produto produto){
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.preco = produto.getPreco();
    }

    public ProdutoDTO(Produto produto, List<Categoria> categoria){
        categoria.forEach(c-> this.categorias.add(new CategoriaDTO(C)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List<CategoriaDTO> getCategorias() {
        return categorias;
    }
}
