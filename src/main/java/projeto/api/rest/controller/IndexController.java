package projeto.api.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.api.rest.model.Usuario;
import projeto.api.rest.repository.UsuarioRepository;

@RestController/*Arquitetura REST*/
@RequestMapping(value="/usuario")
public class IndexController {
	
	@Autowired // Se fosse CDI seria @Inject
	private UsuarioRepository usuarioRepository;
	
	/*Serviço RESTful*/
	@GetMapping(value="/{id}/codigovenda/{venda}", produces="application/pdf")
	public ResponseEntity <Usuario>relatorio(@PathVariable(value="id") Long id,
			                                 @PathVariable(value="venda")Long Venda) {
		
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		
		//O retorno seria um relatorio
		return new  ResponseEntity<Usuario>(usuario.get(), HttpStatus.OK);
	}
	
/*Serviço RESTful*/
	@GetMapping(value="/{id}", produces="application/json")
	public ResponseEntity <Usuario>init(@PathVariable(value="id") Long id) {
		
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		
		return new  ResponseEntity<Usuario>(usuario.get(), HttpStatus.OK);
	}
	
	@GetMapping(value="/", produces="application/json")
	public ResponseEntity<List<Usuario>> usuario (){
		
		List<Usuario> list = (List<Usuario>) usuarioRepository.findAll();
		
		return new ResponseEntity<List<Usuario>> (list, HttpStatus.OK);
	}
	
	
}
