package com.iuri.dao;

import com.iuri.model.entities.Tropa;

import java.util.List;

public interface TropaDAO {
    Tropa salvar(Tropa tropa);

    void deletar(Integer id);

    Tropa atualizar(Tropa tropa);

    Tropa buscarPorId(Integer id);

    List<Tropa> listar();
}
