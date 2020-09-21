package kr.ac.gwnu.SmartMedicine.domain.user.userIdPw;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@ToString
public class UserIdPw {
    @Id
    String userId;
    String passWord;
}
