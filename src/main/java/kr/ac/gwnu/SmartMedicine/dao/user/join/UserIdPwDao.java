package kr.ac.gwnu.SmartMedicine.dao.user.join;

import kr.ac.gwnu.SmartMedicine.domain.user.userIdPw.UserIdPw;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserIdPwDao {
    String userId;
    String passWord;
    public UserIdPw toEntity(){
        return UserIdPw.builder()
                .userId(userId)
                .passWord(passWord)
                .build();
    }
}
