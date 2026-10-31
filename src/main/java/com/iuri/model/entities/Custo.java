package com.iuri.model.entities;

public class Custo {
    private Integer custoEmCarne;
    private Integer custoEmMadeira;
    private  Integer custoEmOuro;
    private Integer custoEmAzeite;
    private Integer custoEmPedra;

    public Custo(Integer custoEmCarne, Integer custoEmMadeira, Integer custoEmOuro) {
        this.custoEmCarne = custoEmCarne;
        this.custoEmMadeira = custoEmMadeira;
        this.custoEmOuro = custoEmOuro;
    }


    public Custo(){

    }

    public Integer getCustoEmCarne() {
        return custoEmCarne;
    }

    public void setCustoEmCarne(Integer custoEmCarne) {
        this.custoEmCarne = custoEmCarne;
    }

    public Integer getCustoEmMadeira() {
        return custoEmMadeira;
    }

    public void setCustoEmMadeira(Integer custoEmMadeira) {
        this.custoEmMadeira = custoEmMadeira;
    }

    public Integer getCustoEmOuro() {
        return custoEmOuro;
    }

    public void setCustoEmOuro(Integer custoEmOuro) {
        this.custoEmOuro = custoEmOuro;
    }

    public Integer getCustoEmAzeite() {
        return custoEmAzeite;
    }

    public void setCustoEmAzeite(Integer custoEmAzeite) {
        this.custoEmAzeite = custoEmAzeite;
    }

    public Integer getCustoEmPedra() {
        return custoEmPedra;
    }

    public void setCustoEmPedra(Integer custoEmPedra) {
        this.custoEmPedra = custoEmPedra;
    }

    @Override
    public String toString() {
        return "DadosDeCusto{" +
                "custoEmCarne=" + custoEmCarne +
                ", custoEmMadeira=" + custoEmMadeira +
                ", custoEmOuro=" + custoEmOuro +
                ", custoEmAzeite=" + custoEmAzeite +
                ", custoEmPedra=" + custoEmPedra +
                '}';
    }
}
