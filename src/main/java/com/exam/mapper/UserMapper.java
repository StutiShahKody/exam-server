package com.exam.mapper;

import org.springframework.beans.BeanUtils;

import com.exam.DTO.UserDTO;
import com.exam.DTO.UserRoleDTO;
import com.exam.model.User;
import com.exam.model.UserRole;

public class UserMapper {

    public static UserDTO toUserDTO(User user) {
        UserDTO dto = new UserDTO();
        BeanUtils.copyProperties(user, dto);

        if (user.getUserRoles() != null) {
            for (UserRole role : user.getUserRoles()) {
                UserRoleDTO roleDTO = new UserRoleDTO();
                BeanUtils.copyProperties(role, roleDTO);
                dto.getUserRoles().add(roleDTO);
            }
        }
        return dto;
    }

    public static User toUserEntity(UserDTO dto) {
        User user = new User();
        BeanUtils.copyProperties(dto, user);

       
        if (dto.getUserRoles() != null) {
            for (UserRoleDTO roleDTO : dto.getUserRoles()) {
                UserRole role = new UserRole();
                BeanUtils.copyProperties(roleDTO, role);
                user.getUserRoles().add(role);
            }
        }

        return user;
    }
}
