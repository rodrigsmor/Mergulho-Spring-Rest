package com.algaworks.algalog.api.controller;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClientController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var client1 = new Cliente();
		client1.setId(1L);
		client1.setName("João");
		client1.setPhone("(34) 99999-1111");
		client1.setEmail("joaodascouves@gmail.com");
		
		var client2 = new Cliente();
		client2.setId(2L);
		client2.setName("Maria");
		client2.setPhone("(11) 97777-2222");
		client2.setEmail("Maria.ss@gmail.com");
		
		return Arrays.asList(client1, client2);
	}
}
