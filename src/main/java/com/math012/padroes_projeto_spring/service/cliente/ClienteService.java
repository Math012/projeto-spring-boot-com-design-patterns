package com.math012.padroes_projeto_spring.service.cliente;

import com.math012.padroes_projeto_spring.model.Cliente;


public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
