package com.iuri.model.entities;

public class Tropa {
    String nome;
    Civilizacao civilizacao;
    Integer era;
    String tipo;

    public enum Era{
        IDADE_DAS_TREVAS,
        IDADE_FEUDAL,
        IDADE_DOS_CASTELOS,
        IDADE_IMPERIAL
    }

    public Tropa(String nome, Civilizacao civilizacao, Integer era, String tipo) {
        this.nome = nome;
        this.civilizacao = civilizacao;
        this.era = era;
        this.tipo = tipo;
    }
    public Tropa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Civilizacao getCivilizacao() {
        return civilizacao;
    }

    public void setCivilizacao(Civilizacao civilizacao) {
        this.civilizacao = civilizacao;
    }

    public Integer getEra() {
        return era;
    }

    public void setEra(Integer era) {
        this.era = era;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tropa{" +
                "nome='" + nome + '\'' +
                ", civilizacao=" + civilizacao +
                ", era=" + era +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
