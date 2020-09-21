package kr.ac.gwnu.SmartMedicine.domain.regMedicne;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@ToString
public class RegMedicine {
    @Id
    @GeneratedValue
    private Long registerId;
    private boolean check;
    private String userId;
    private Long medicineId;
}
