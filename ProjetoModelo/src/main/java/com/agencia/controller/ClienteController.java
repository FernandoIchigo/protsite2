package com.agencia.controller;

import com.agencia.model.entity.Cliente;
import com.agencia.repositories.clienteRepository;
import com.agencia.service.impl.ClienteServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin({ "*" })
@RequestMapping({ "api/funcionarios" })
public class ClienteController {
	private static final Object ClienteServiceImpl = null;
	private static final String Cliente = null;
	@Autowired
	private ClienteServiceImpl service;

	@GetMapping({ "/home" })
	public String hello() {
		return "oi";
	}

	@GetMapping
	public ResponseEntity<Object> findAll() {
		List<Cliente> funcionarios = (List<Cliente>) this.service.getAllCliente();
		return ResponseEntity.ok().body(ClienteServiceImpl);
	}

	@GetMapping({ "{id}" })
	public ResponseEntity<Cliente> getFuncionarioById(@PathVariable("id") long clienteId) {
		Object clienteRepository = null;
		return new ResponseEntity(this.service.getclienteById(clienteRepository), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Cliente> saveFuncionario(@RequestBody Cliente cliente) {
		return new ResponseEntity(this.service.salvarCliente(cliente), HttpStatus.CREATED);
	}

	@PutMapping({ "{id}" })
	public ResponseEntity<Cliente> updateFuncionario(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
		return new ResponseEntity(this.service.updateCliente(Cliente, id), HttpStatus.OK);
	}

	@DeleteMapping({ "{id}" })
	public ResponseEntity<String> deleteCliente(@PathVariable("id") Long id) {
		this.service.deleteCliente(id);
		return new ResponseEntity<String>("Cliente deletado com sucesso.", HttpStatus.OK);

	}
}
