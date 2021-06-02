package projeto.api.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.api.rest.model.Usuario;

@RestController/*Arquitetura REST*/
@RequestMapping(value="/usuario")
public class IndexController {
	

/*Serviço RESTful*/
	@GetMapping(value="/", produces="application/json")
	public ResponseEntity <Usuario>init() {
		
		Usuario usuario = new Usuario();
		usuario.setId(50L);
		usuario.setLogin("mlima@gmail.com");
		usuario.setNome("Gomes Lima");
		usuario.setSenha("#123456");
		
		Usuario usuario2 = new Usuario();
		usuario2.setId(30L);
		usuario2.setLogin("glima@gmail.com");
		usuario2.setNome("Leo Lago");
		usuario2.setSenha("#12345");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario);
		usuarios.add(usuario2);
		
		return new  ResponseEntity(usuarios, HttpStatus.OK);
	}
}
