package kr.ac.gwnu.SmartMedicine.application.user.join;
import kr.ac.gwnu.SmartMedicine.dao.user.join.JoinUserDao;
import kr.ac.gwnu.SmartMedicine.dao.user.join.UserIdPwDao;
import kr.ac.gwnu.SmartMedicine.domain.user.userIdPw.UserIdPwRepository;
import kr.ac.gwnu.SmartMedicine.domain.user.userInfo.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinUserService {
    private UserInfoRepository userInfoRepository;  //회원 목록
    private UserIdPwRepository userIdPwRepository;  // 아이디_패스워드 목록
    @Autowired
    JoinUserService(UserInfoRepository userInfoRepository, UserIdPwRepository userIdPwRepository) {
        this.userInfoRepository = userInfoRepository;
        this.userIdPwRepository = userIdPwRepository;
    }

    public void add(JoinUserDao joinUserDao) { //회원가입
      userInfoRepository.save(joinUserDao.toEntity());
      UserIdPwDao userIdPwDao = UserIdPwDao.builder()
                .userId(joinUserDao.getId())
                .passWord(joinUserDao.getPassword())
                .build();
        userIdPwRepository.save(userIdPwDao.toEntity());
    }
}
