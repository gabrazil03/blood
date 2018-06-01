package com.gabriel.bloodprojeto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.bloodprojeto.domain.CadastrarUsuario;
import com.gabriel.bloodprojeto.repositories.CadastrarURepository;

@Service
public class CadastrarUService {
	
	@Autowired
	private CadastrarURepository repo;
	
	public CadastrarUsuario buscar(Integer id) {
		Optional<CadastrarUsuario> obj = repo.findById(id);
		return obj.orElse(null); 
	}
}