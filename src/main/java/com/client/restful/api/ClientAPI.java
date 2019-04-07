package com.client.restful.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.restful.model.Cliente;
import com.client.restful.repository.ClientRepository;

@RestController
@RequestMapping("/api/v1/client")
public class ClientAPI {

	@Autowired
	ClientRepository clientRepository;

	@GetMapping
	@RequestMapping(value = "/api/v1/client/{index}")
	public Cliente getCliente(@PathVariable("index") int index) {
		return clientRepository.getCliente(index);
	}

	@PostMapping
	public Cliente add(Cliente cliente) {
		clientRepository.add(cliente);
		return cliente;
	}

	@GetMapping
	public List<Cliente> findAll() {
		return clientRepository.findAll();
	}

}
