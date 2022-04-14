package cybersoft.javabackend.java16girakminh.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import cybersoft.javabackend.java16girakminh.user.dto.GiraUserDTO;
import cybersoft.javabackend.java16girakminh.user.model.GiraUser;

@Mapper
public interface GiraUserMapper {
	GiraUserMapper INSTANCE = Mappers.getMapper(GiraUserMapper.class);
	GiraUser toModel(GiraUserDTO dto);
	GiraUserDTO toDto(GiraUser model);
}
