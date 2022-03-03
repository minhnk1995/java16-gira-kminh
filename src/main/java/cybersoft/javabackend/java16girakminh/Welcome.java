package cybersoft.javabackend.java16girakminh;

import org.springframework.web.bind.annotation.GetMapping;

public class Welcome {
	@GetMapping
	public Oject welcome() {
		return "hello";
	}
}
