package com.math012.padroes_projeto_spring.service;

import com.math012.padroes_projeto_spring.model.Cliente;
import org.springframework.context.annotation.Bean;





public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
