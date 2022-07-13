package ch.zli.m223.ksh19a.mj.CRM.model;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;


public interface AppUser extends UserDetails {
    public Long getID();

    public String getEmail();


    public List<Role> getRoles();

    void addRoleToList(RoleImpl role);
}
