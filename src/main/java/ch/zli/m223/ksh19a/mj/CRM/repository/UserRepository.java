package ch.zli.m223.ksh19a.mj.CRM.repository;

import ch.zli.m223.ksh19a.mj.CRM.model.AppUser;
import ch.zli.m223.ksh19a.mj.CRM.model.AppUserImpl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUserImpl, Long> {


    default AppUser insert(String email, String password) {
        AppUserImpl user = new AppUserImpl(email, password);
        return save(user);
    }

    Optional<AppUserImpl> findUserByEmail(String email);

    Long deleteByEmail(String name);
}
