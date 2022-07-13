package ch.zli.m223.ksh19a.mj.CRM.init;

import ch.zli.m223.ksh19a.mj.CRM.model.AppUser;
import ch.zli.m223.ksh19a.mj.CRM.repository.RoleRepository;
import ch.zli.m223.ksh19a.mj.CRM.repository.UserRepository;
import ch.zli.m223.ksh19a.mj.CRM.roles.AppRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class ServerInitializer implements ApplicationRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        AppUser hans = userRepository.insert("hans", "123");
        roleRepository.insert(AppRoles.USER, hans);
        roleRepository.insert(AppRoles.ADMIN, hans);

        AppUser peter = userRepository.insert("peter", "123");
        roleRepository.insert(AppRoles.USER, peter);
    }
}
