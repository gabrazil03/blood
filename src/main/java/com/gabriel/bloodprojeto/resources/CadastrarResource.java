package com.gabriel.bloodprojeto.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.bloodprojeto.domain.CadastrarUsuario;



@RestController
@RequestMapping(value="/cadastrarU")
public class CadastrarResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<CadastrarUsuario> cadastrarU() {
		
		CadastrarUsuario Usu1 = new CadastrarUsuario("teste1@hotmail.com", "1234", "Teste1", "00000000", "Taqua", "rua 1", "Taquaral", "13", "11111111", "A+" );
		CadastrarUsuario Usu2 = new CadastrarUsuario("teste2@hotmail.com", "1235", "Teste2", "11111111", "Monte Alto", "rua 2", "Curvinha", "14", "22222222", "O+");
		
		List<CadastrarUsuario> lista = new ArrayList<>();
		lista.add(Usu1);
		lista.add(Usu2);
		
		return lista;
		}	
}
