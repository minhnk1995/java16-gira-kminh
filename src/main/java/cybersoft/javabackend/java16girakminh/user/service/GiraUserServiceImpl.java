package cybersoft.javabackend.java16girakminh.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cybersoft.javabackend.java16girakminh.user.dto.GiraUserDTO;
import cybersoft.javabackend.java16girakminh.user.mapper.GiraUserMapper;
import cybersoft.javabackend.java16girakminh.user.model.GiraUser;
import cybersoft.javabackend.java16girakminh.user.repository.GiraUserRepository;

@Service
public class GiraUserServiceImpl implements GiraUserService {
	@Autowired
	private GiraUserRepository repository;

	@Override
	public GiraUserDTO createNewUser(GiraUserDTO dto) {
		GiraUser user = GiraUserMapper.INSTANCE.toModel(dto);
		GiraUser newUser = repository.save(user);
		return GiraUserMapper.INSTANCE.toDto(newUser);
	}

}
