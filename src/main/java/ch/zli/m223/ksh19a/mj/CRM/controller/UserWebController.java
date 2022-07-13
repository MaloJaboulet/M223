package ch.zli.m223.ksh19a.mj.CRM.controller;

import ch.zli.m223.ksh19a.mj.CRM.model.AppUser;
import ch.zli.m223.ksh19a.mj.CRM.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserWebController {

    @Autowired
    private UserService userService;

    @GetMapping("/userlist")
    String getUserList(Model model) {
        List<AppUser> userList = userService.getAllUsers();
        model.addAttribute("users", userList);

        return "userList";
    }

    @GetMapping("/admin")
    String getToAdminPage() {
        return "admin_page";
    }

    @GetMapping("/user")
    String getToUserPage() {
        return "user_page";
    }


    @GetMapping("/login")
    String getToLoginPage() {
        return "login_page";
    }

}
