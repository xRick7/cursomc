package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) throws ObjectNotFoundException {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		/*
		 * Optional<Categoria> obj = repo.findById(id);
		 * return obj.orElseThrow(() -> new ObjectNotFoundException(
		 * "Objeto não entcontrado! Id: " + id + ", Tipo: " +
		 * Categoria.class.getName()));
		 */
		
	}
}
