package br.com.devsuperior.umlspring.entities;

import br.com.devsuperior.umlspring.entities.enums.EstadoPagamento;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name="tb_pagamento_boleto")
public class PagamentoComBoleto extends Pagamento {
    private static final long serialVersionUID = 1L;
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    public PagamentoComBoleto() {
    }

    public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}



