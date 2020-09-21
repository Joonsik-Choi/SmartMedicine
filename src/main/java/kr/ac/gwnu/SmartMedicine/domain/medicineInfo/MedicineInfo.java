package kr.ac.gwnu.SmartMedicine.domain.medicineInfo;

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
public class MedicineInfo {
    @Id
    @GeneratedValue
    private Long medicineId;
    private String itemSeq; //품목 일련번호
    private String itemName; //품목명
    private String entpSeq; //업체 일련번호
    private String entpName; //업체명
    private String chart; //성상
    private String itemImage; //제품이미지
    private String printFront; //표시(앞)
    private String printBack; //표시(뒤)
    private String drugShape; //의약품 모양
    private String colorClass1; //색깔(앞)
    private String colorClass2; //색깔(뒤)
    private String lineFront; //분할선(앞)
    private String lineBack; //분할선(뒤)
    private String classNo; //분류 번호
    private String className; //분류명
    private String etcOtcName; //전문/일반
    private String formCodeName; //제형코드이름
    private String formula;//모양
}
