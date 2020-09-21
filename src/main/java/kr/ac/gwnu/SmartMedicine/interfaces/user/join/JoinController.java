package kr.ac.gwnu.SmartMedicine.interfaces.user.join;
import kr.ac.gwnu.SmartMedicine.application.user.join.JoinUserService;
import kr.ac.gwnu.SmartMedicine.dao.user.join.JoinUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoinController {
    @Autowired
    JoinUserService joinUserService;
    @PostMapping("/user/join")
    public String join(@RequestBody JoinUserDao joinUserDao){
        joinUserService.add(joinUserDao);
        return  "ok";
    }
}
