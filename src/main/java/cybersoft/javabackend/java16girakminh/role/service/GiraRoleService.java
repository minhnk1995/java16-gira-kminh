package cybersoft.javabackend.java16girakminh.role.service;

import java.util.List;

import cybersoft.javabackend.java16girakminh.role.dto.GiraRoleDTO;
import cybersoft.javabackend.java16girakminh.role.model.GiraRole;

public interface GiraRoleService {
	List<GiraRole> findAllEntity();
	GiraRole save(GiraRoleDTO dto);
}
