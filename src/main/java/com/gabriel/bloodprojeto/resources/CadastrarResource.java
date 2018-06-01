package com.gabriel.bloodprojeto.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/cadastrarU")
public class CadastrarResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String cadastrarU() {
		return "Rest cadastrar";
		}	
}
