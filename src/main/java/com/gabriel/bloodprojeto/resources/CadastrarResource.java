package com.gabriel.bloodprojeto.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.bloodprojeto.domain.CadastrarUsuario;
import com.gabriel.bloodprojeto.services.CadastrarUService;



@RestController
@RequestMapping(value="/cadastrarU")
public class CadastrarResource {
	
	@Autowired
	private CadastrarUService service;
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		CadastrarUsuario obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		}	
}
