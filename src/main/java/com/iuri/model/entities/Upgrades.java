package com.iuri.model.entities;

public class Upgrades {
    private Integer aumentoAtaqueMelee;
    private Integer aumentoAtaqueRanged;
    private Integer aumentoDeVida;
    private Integer aumentoDeArmaduraMelee;
    private Integer aumentoDeArmaduraRanged;
    private Custo custoDoUpgrade;
    private Tropa.Era era;

    public Upgrades(
            Integer aumentoAtaqueMelee,
            Integer aumentoAtaqueRanged,
            Integer aumentoDeVida,
            Integer aumentoDeArmaduraMelee,
            Integer aumentoDeArmaduraRanged,
            Custo custoDoUpgrade,
            Tropa.Era era) {
        this.aumentoAtaqueMelee = aumentoAtaqueMelee;
        this.aumentoAtaqueRanged = aumentoAtaqueRanged;
        this.aumentoDeVida = aumentoDeVida;
        this.aumentoDeArmaduraMelee = aumentoDeArmaduraMelee;
        this.aumentoDeArmaduraRanged = aumentoDeArmaduraRanged;
        this.custoDoUpgrade = custoDoUpgrade;
        this.era = era;
    }
    public Upgrades(){

    }

    public Integer getAumentoAtaqueMelee() {
        return aumentoAtaqueMelee;
    }

    public void setAumentoAtaqueMelee(Integer aumentoAtaqueMelee) {
        this.aumentoAtaqueMelee = aumentoAtaqueMelee;
    }

    public Integer getAumentoAtaqueRanged() {
        return aumentoAtaqueRanged;
    }

    public void setAumentoAtaqueRanged(Integer aumentoAtaqueRanged) {
        this.aumentoAtaqueRanged = aumentoAtaqueRanged;
    }

    public Integer getAumentoDeVida() {
        return aumentoDeVida;
    }

    public void setAumentoDeVida(Integer aumentoDeVida) {
        this.aumentoDeVida = aumentoDeVida;
    }

    public Integer getAumentoDeArmaduraMelee() {
        return aumentoDeArmaduraMelee;
    }

    public void setAumentoDeArmaduraMelee(Integer aumentoDeArmaduraMelee) {
        this.aumentoDeArmaduraMelee = aumentoDeArmaduraMelee;
    }

    public Integer getAumentoDeArmaduraRanged() {
        return aumentoDeArmaduraRanged;
    }

    public void setAumentoDeArmaduraRanged(Integer aumentoDeArmaduraRanged) {
        this.aumentoDeArmaduraRanged = aumentoDeArmaduraRanged;
    }

    public Custo getCustoDoUpgrade() {
        return custoDoUpgrade;
    }

    public void setCustoDoUpgrade(Custo custoDoUpgrade) {
        this.custoDoUpgrade = custoDoUpgrade;
    }

    public Tropa.Era getEra() {
        return era;
    }

    public void setEra(Tropa.Era era) {
        this.era = era;
    }

    @Override
    public String toString() {
        return "Upgrades{" +
                "aumentoAtaqueMelee=" + aumentoAtaqueMelee +
                ", aumentoAtaqueRanged=" + aumentoAtaqueRanged +
                ", aumentoDeVida=" + aumentoDeVida +
                ", aumentoDeArmaduraMelee=" + aumentoDeArmaduraMelee +
                ", aumentoDeArmaduraRanged=" + aumentoDeArmaduraRanged +
                ", custoDoUpgrade=" + custoDoUpgrade +
                ", era=" + era +
                '}';
    }
}
