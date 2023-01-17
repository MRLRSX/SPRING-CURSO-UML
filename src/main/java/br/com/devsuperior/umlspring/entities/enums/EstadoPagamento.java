package br.com.devsuperior.umlspring.entities.enums;

public enum EstadoPagamento {

    PEDENNTE(1, "PEDENTE"),
    QUITADO(2, "QUITADO"),
    CANELADO(3, "CANCELADO");

    private int cod;
    private String descricao;

    private EstadoPagamento(int cod, String descricao){
        this.cod = cod;
        this.descricao= descricao;
    }

    public int getCod(){
        return this.cod;
    }

    public String getDescricao(){
        return this.descricao;
    }
    public static EstadoPagamento toEnum(Integer cod){
        if(cod == null){
            return null;
        }
        for(EstadoPagamento x : EstadoPagamento.values()){
            if(cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("Id invalid");
    }
}
