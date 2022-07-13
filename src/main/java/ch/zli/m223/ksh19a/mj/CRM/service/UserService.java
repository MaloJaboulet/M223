package ch.zli.m223.ksh19a.mj.CRM.service;

import ch.zli.m223.ksh19a.mj.CRM.model.AppUser;

import java.util.List;

public interface UserService {
    List<AppUser> getAllUsers();

    AppUser getUser(Long id);

    AppUser insertUser(String name, String password);

    Long deleteUser(String name);
}
