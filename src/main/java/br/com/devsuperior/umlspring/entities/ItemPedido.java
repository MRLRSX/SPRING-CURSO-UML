package br.com.devsuperior.umlspring.entities;

import br.com.devsuperior.umlspring.entities.ItemPedidoPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="tb_itempedido")
public class ItemPedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();

    private Double desconto;

    private Integer quantidade;

    private Date instante;

    public ItemPedido(Produto produto, Pedido pedido, Double desconto, Integer quantidade, Date instante) {
        this.id.setProduto(produto);
        this.id.setPedido(pedido);
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.instante = instante;
    }

    public Pedido getPedido(){
        return this.id.getPedido();
    }

    public Produto getProduto(){
        return this.id.getProduto();
    }
    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Date getInstante() {
        return instante;
    }

    public void setInstante(Date instante) {
        this.instante = instante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPedido that = (ItemPedido) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
