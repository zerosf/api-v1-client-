package com.client.restful.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.client.restful.model.Cliente;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

	private static List<Cliente> clientes = new ArrayList<>();

	static {
		Cliente cliente = new Cliente();
		cliente.setNombre("Felipe Zuniga");
		cliente.setCorreo("felipe.zus@gmail.com");
		cliente.setDireccion("Cristobal colon # 6");
		cliente.setTelefono("5538968852");
		clientes.add(cliente);
	}

	@Override
	public Cliente add(Cliente cte) {
		// TODO Auto-generated method stub
		clientes.add(cte);
		return cte;
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clientes;
	}

	@Override
	public Cliente getCliente(int index) {
		// TODO Auto-generated method stub

		return clientes.get(index);
	}

}
