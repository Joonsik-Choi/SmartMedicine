package kr.ac.gwnu.SmartMedicine.domain.user.userIdPw;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserIdPwRepository extends JpaRepository<UserIdPw, String> {
    Optional<UserIdPw> findByUserIdAndPassWord(String userId, String passWord);
}
