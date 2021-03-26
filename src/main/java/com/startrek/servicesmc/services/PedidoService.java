package com.startrek.servicesmc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startrek.servicesmc.domain.Pedido;
import com.startrek.servicesmc.repositories.PedidoRepository;
import com.startrek.servicesmc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repp;
	
	public Pedido search(Integer id) {
		Optional<Pedido> obj = repp.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException
		("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));	
	}
}
