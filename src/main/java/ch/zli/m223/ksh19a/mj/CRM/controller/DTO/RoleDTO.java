package ch.zli.m223.ksh19a.mj.CRM.controller.DTO;

import ch.zli.m223.ksh19a.mj.CRM.model.Role;

public class RoleDTO {
    public String roleName;

    public RoleDTO(Role role) {
        this.roleName = role.getRole();
    }
}
