package br.com.conexaolocal.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.conexaolocal.entidade.Hello;

@RestController
@CrossOrigin
public class ConexaoLocalController {
	 
	
	
	@RequestMapping("/")
	public Hello homePage() {
		Hello hello = new Hello();	
		hello.setTitulo("Hello World");
	    return hello;
    }

}
