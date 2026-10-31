package com.iuri.model.entities;

import java.util.List;

public class BonusCivilizacao {
    private String nome;
    private String descricao;
    private Civilizacao civilizacao;
    private List<EfeitoBonus> efeitos;
    private boolean ativo;

    public BonusCivilizacao(String nome, String descricao, Civilizacao civilizacao, List<EfeitoBonus> efeitos) {
        this.nome = nome;
        this.descricao = descricao;
        this.civilizacao = civilizacao;
        this.efeitos = efeitos;
    }

    public BonusCivilizacao(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Civilizacao getCivilizacao() {
        return civilizacao;
    }

    public void setCivilizacao(Civilizacao civilizacao) {
        this.civilizacao = civilizacao;
    }

    public List<EfeitoBonus> getEfeitos() {
        return efeitos;
    }

    public void setEfeitos(List<EfeitoBonus> efeitos) {
        this.efeitos = efeitos;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "BonusCivilizacao{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", civilizacao=" + civilizacao +
                ", efeitos=" + efeitos +
                ", ativo=" + ativo +
                '}';
    }
}
