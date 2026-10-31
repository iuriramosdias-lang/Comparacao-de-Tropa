package com.iuri.model.entities;

public class Base {
    private  Integer vida;
    private Double velocidadeDeMovimento;
    private Integer bonusInfMelee;
    private Integer bonusInfRanged;
    private Integer bonusCavMelee;
    private Integer bonusCavRanged;
    private Integer bonusCerco;

    public Base(Integer vida,
                Double velocidadeDeMovimento,
                Integer bonusInfMelee,
                Integer bonusInfRanged,
                Integer bonusCavMelee,
                Integer bonusCavRanged,
                Integer bonusCerco) {
        this.vida = vida;
        this.velocidadeDeMovimento = velocidadeDeMovimento;
        this.bonusInfMelee = bonusInfMelee;
        this.bonusInfRanged = bonusInfRanged;
        this.bonusCavMelee = bonusCavMelee;
        this.bonusCavRanged = bonusCavRanged;
        this.bonusCerco = bonusCerco;
    }

    public Base(){

    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Double getVelocidadeDeMovimento() {
        return velocidadeDeMovimento;
    }

    public void setVelocidadeDeMovimento(Double velocidadeDeMovimento) {
        this.velocidadeDeMovimento = velocidadeDeMovimento;
    }

    public Integer getBonusInfMelee() {
        return bonusInfMelee;
    }

    public void setBonusInfMelee(Integer bonusInfMelee) {
        this.bonusInfMelee = bonusInfMelee;
    }

    public Integer getBonusInfRanged() {
        return bonusInfRanged;
    }

    public void setBonusInfRanged(Integer bonusInfRanged) {
        this.bonusInfRanged = bonusInfRanged;
    }

    public Integer getBonusCavMelee() {
        return bonusCavMelee;
    }

    public void setBonusCavMelee(Integer bonusCavMelee) {
        this.bonusCavMelee = bonusCavMelee;
    }

    public Integer getBonusCavRanged() {
        return bonusCavRanged;
    }

    public void setBonusCavRanged(Integer bonusCavRanged) {
        this.bonusCavRanged = bonusCavRanged;
    }

    public Integer getBonusCerco() {
        return bonusCerco;
    }

    public void setBonusCerco(Integer bonusCerco) {
        this.bonusCerco = bonusCerco;
    }

    @Override
    public String toString() {
        return "DadosDaBase{" +
                "vida=" + vida +
                ", velocidadeDeMovimento=" + velocidadeDeMovimento +
                ", bonusInfMelee=" + bonusInfMelee +
                ", bonusInfRanged=" + bonusInfRanged +
                ", bonusCavMelee=" + bonusCavMelee +
                ", bonusCavRanged=" + bonusCavRanged +
                ", bonusCerco=" + bonusCerco +
                '}';
    }
}

