package kr.ac.gwnu.SmartMedicine.domain.user.userInfo;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@ToString
public class UserInfo {
    @Id
    @Column( nullable = false)
    private String Id;
    @Email
    private String email;
    private String name;
    private int gender;
}
