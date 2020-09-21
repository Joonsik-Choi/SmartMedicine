package kr.ac.gwnu.SmartMedicine.domain.medicineInfo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@ToString
public class MedicineEffect {
    @Id
    String itemSeq;
    @Lob
    String effect;
    @Lob
    String usageCapacity;
    @Lob
    String precautions;
}
