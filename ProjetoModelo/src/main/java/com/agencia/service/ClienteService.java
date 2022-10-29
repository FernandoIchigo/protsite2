package com.agencia.service;

import java.util.Optional;

import com.agencia.model.entity.Cliente;

public interface ClienteService {
	Cliente autenticar(String email, String senha);

	Cliente salvarCliente(Cliente Cliente);

	void validaEmail(String email);

	Optional<Cliente> buscarPorId(Long id);

}
