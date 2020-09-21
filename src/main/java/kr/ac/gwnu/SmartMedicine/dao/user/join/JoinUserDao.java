package kr.ac.gwnu.SmartMedicine.dao.user.join;
import kr.ac.gwnu.SmartMedicine.domain.user.userInfo.UserInfo;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JoinUserDao {
    private String id;
    private String email;
    private String password;
    private String name;
    private int gender;
    public UserInfo toEntity(){
        return UserInfo.builder()
                .Id(id)
                .email(email)
                .name(name)
                .gender(gender)
                .build();
    }
}
