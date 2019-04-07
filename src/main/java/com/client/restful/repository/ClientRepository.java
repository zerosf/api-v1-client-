package com.client.restful.repository;

import java.util.List;

import com.client.restful.model.Cliente;

public interface ClientRepository {

	public Cliente add(Cliente cte);

	public List<Cliente> findAll();

	public Cliente getCliente(int index);

}
