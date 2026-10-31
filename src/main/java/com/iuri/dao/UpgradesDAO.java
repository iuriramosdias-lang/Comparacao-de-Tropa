package com.iuri.dao;

import com.iuri.model.entities.Upgrades;

import java.util.List;

public interface UpgradesDAO {
    Upgrades salvar(Upgrades upgrades);

    void deletar(Integer id);

    Upgrades atualizar(Upgrades upgrades);

    Upgrades buscarPorId(Integer id);

    List<Upgrades> listar();
}
