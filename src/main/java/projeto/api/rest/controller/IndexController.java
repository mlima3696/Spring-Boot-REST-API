package projeto.api.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/usuario")
public class IndexController {

	@GetMapping(value="/", produces="application/json")
	public ResponseEntity inti() {
		return new ResponseEntity("Hello World, User", HttpStatus.OK);
	}
}
