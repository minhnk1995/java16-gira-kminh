package cybersoft.javabackend.java16girakminh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping
	public Object welcome() {
		return new ResponseEntity<>("welcome to spring data JPA demo", HttpStatus.OK);
	}
}
