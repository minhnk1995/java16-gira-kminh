package cybersoft.javabackend.java16girakminh;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@GetMapping("/welcome")
	public Object welcome() {
		return new ResponseEntity<>("hello", HttpStatus.OK);
	}
}
