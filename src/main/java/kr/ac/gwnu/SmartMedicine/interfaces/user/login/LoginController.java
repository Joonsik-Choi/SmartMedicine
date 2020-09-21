package kr.ac.gwnu.SmartMedicine.interfaces.user.login;

import kr.ac.gwnu.SmartMedicine.application.user.login.LoginService;
import kr.ac.gwnu.SmartMedicine.dao.user.join.UserIdPwDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/user/login")
    public String login(@RequestBody UserIdPwDao userIdPwDao){
        String s=loginService.login(userIdPwDao);
        return s;
    }
    @GetMapping("user/findId")
    public String findId(@RequestParam String findUserId){
        return loginService.findById(findUserId);
    }
}
