package com.iuri.dao;

import com.iuri.model.entities.Civilizacao;

import java.util.List;

public interface CivilizacaoDAO {
    Civilizacao salvar(Civilizacao civilizacao);

    void deletar(Integer id);

    Civilizacao atualizar(Civilizacao civilizacao);

    Civilizacao buscarPorId(Integer id);

    List<Civilizacao> listar();
}
