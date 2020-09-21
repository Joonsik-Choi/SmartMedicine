package kr.ac.gwnu.SmartMedicine.application.user.login;

import kr.ac.gwnu.SmartMedicine.dao.user.join.UserIdPwDao;
import kr.ac.gwnu.SmartMedicine.domain.user.userIdPw.UserIdPw;
import kr.ac.gwnu.SmartMedicine.domain.user.userIdPw.UserIdPwRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    private UserIdPwRepository userIdPwRepository;
    @Autowired
    public LoginService(UserIdPwRepository userIdPwRepository){
        this.userIdPwRepository=userIdPwRepository;
    }
    public String login(UserIdPwDao userIdPwDao) { //로그인 시도
        System.out.println(userIdPwDao);
        Optional<UserIdPw> findUserIdPw1=userIdPwRepository.findByUserIdAndPassWord(userIdPwDao.getUserId(), userIdPwDao.getPassWord());
           if(findUserIdPw1.isPresent()){
               return "ok";
           }
        return "false";
    }

    public String findById(String findUserId) {
        Optional<UserIdPw> userIdPw=userIdPwRepository.findById(findUserId);
        if(userIdPw.isPresent()){
            return userIdPw.get().getUserId();
        }
        return "not fount";
    }
}
