package com.exam.DTO;

import java.io.Serializable;

public class UserRoleDTO implements Serializable {
    private Long id;
    private String roleName;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
