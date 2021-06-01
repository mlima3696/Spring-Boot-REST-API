package projeto.api.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController/*Arquitetura REST*/
@RequestMapping(value="/usuario")
public class IndexController {
	

/*Serviço RESTful*/
	//Necessario passar o parametro no navegador ?nome=milton
	//inti(@RequestParam(value = "nome", defaultValue = "Lima") Quando não for passado nenhum parametro
	@GetMapping(value="/", produces="application/json")
	public ResponseEntity inti(@RequestParam(value = "nome", required = true, defaultValue = "Nome nao informado") String nome,@RequestParam("salario") Long salario) {
		System.out.println("Olá Mundo, Paramento recebido " +nome);
		return new ResponseEntity("Hello World, User SpringBoot seu nome é:" + nome + " e o"+" salario é:" +salario, HttpStatus.OK);
	}
}
