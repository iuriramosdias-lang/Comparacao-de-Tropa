package com.iuri.dao;

import com.iuri.model.entities.BonusCivilizacao;

import java.util.List;

public interface BonusCivilizacaoDAO{
    BonusCivilizacao salvar(BonusCivilizacao bonus);

    void deletar(Integer id);

    BonusCivilizacao atualizar(BonusCivilizacao bonus);

    BonusCivilizacao buscarPorId(Integer id);

    List<BonusCivilizacao> listar();

}
