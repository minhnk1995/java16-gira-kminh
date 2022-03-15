package cybersoft.javabackend.java16girakminh.repository;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import cybersoft.javabackend.java16girakminh.role.model.GiraRole;
import cybersoft.javabackend.java16girakminh.role.repository.GiraRoleRepository;

@SpringBootTest
@Transactional
public class GiraRoleRepositoryTest {

	@Autowired
	private GiraRoleRepository repository;
	
	@Test
	public void shouldNotInsertRole() {
		GiraRole role = GiraRole.builder()
							.code("FIVEH")
							.description("Description")
							.build();
		
		assertDoesNotThrow(() -> repository.save(role));
	}
}
