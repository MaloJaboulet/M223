package ch.zli.m223.ksh19a.mj.CRM.controller.DTO;


import ch.zli.m223.ksh19a.mj.CRM.model.AppUser;
import ch.zli.m223.ksh19a.mj.CRM.model.Role;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {

    public Long id;
    public String email;
    public List<String> roles;

    public UserDTO(AppUser appUser) {
        id = appUser.getID();
        email = appUser.getEmail();
        roles = new ArrayList<>();
        for (Role role : appUser.getRoles()) {
            roles.add(role.getRole());
        }
    }
}
