package com.agencia.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.agencia.model.entity.Cliente;
import com.agencia.repositories.clienteRepository;
import com.agencia.service.ClienteService;

import antlr.collections.List;

@Service

public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private clienteRepository clienterepository;

	public ClienteServiceImpl(clienteRepository clienterepository) {
		super();
		this.clienterepository = clienterepository;
	}

	@Override
	public Cliente autenticar(String email, String senha) {

		return null;
	}

	@Override
	@Transactional
	public Cliente salvarCliente(Cliente Cliente) {
		return clienterepository.save(Cliente);

	}

	public List getAllCliente() {
		return (List) clienterepository.findAll();
	}

	@Override
	public void validaEmail(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Cliente> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	public MultiValueMap getclienteById(Object clienteRepository2) {
		// TODO Auto-generated method stub
		return null;
	}

	public MultiValueMap updateCliente(String cliente, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteCliente(Long id) {
		// TODO Auto-generated method stub
		
	}

}
