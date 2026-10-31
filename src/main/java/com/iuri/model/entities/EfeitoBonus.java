package com.iuri.model.entities;

public class EfeitoBonus {
    private String descricao;
    private AtributoTropa atributoAfetado;
    private Double valor;
    private TipoEfeito tipoEfeito;

    public enum AtributoTropa{
        VIDA,
        ATAQUE_CORPO_A_CORPO,
        ATAQUE_A_DISTANCIA,
        ARMADURA_CORPO_A_CORPO,
        ARMADURA_A_DISTANCIA,
        VELOCIDADE_MOVIMENTO,
        VELOCIDADE_ATAQUE
    }
    public enum TipoEfeito{
        ADITIVO,
        MULTIPLICADOR
    }

    public EfeitoBonus(String descricao, AtributoTropa atributoAfetado, Double valor, TipoEfeito tipoEfeito) {
        this.descricao = descricao;
        this.atributoAfetado = atributoAfetado;
        this.valor = valor;
        this.tipoEfeito = tipoEfeito;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public AtributoTropa getAtributoAfetado() {
        return atributoAfetado;
    }

    public void setAtributoAfetado(AtributoTropa atributoAfetado) {
        this.atributoAfetado = atributoAfetado;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoEfeito getTipoEfeito() {
        return tipoEfeito;
    }

    public void setTipoEfeito(TipoEfeito tipoEfeito) {
        this.tipoEfeito = tipoEfeito;
    }

    @Override
    public String toString() {
        return "EfeitoBonus{" +
                "descricao='" + descricao + '\'' +
                ", atributoAfetado=" + atributoAfetado +
                ", valor=" + valor +
                ", tipoEfeito=" + tipoEfeito +
                '}';
    }
}
