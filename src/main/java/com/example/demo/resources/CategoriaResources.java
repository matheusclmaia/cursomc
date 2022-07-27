package com.example.demo.resources;

import java.util.List;
import java.util.ArrayList;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<categoria> listar() {
		
	
		categoria cat1 = new categoria(1,"Informática");
		categoria cat2 = new categoria(2,"Escritorio");
		
		
		List<categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		 return lista;
	}
	
}
