package com.zerobase.fastlms.course.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class TakeCourse implements TakeCourseCode {

    public static String STATUS_REQ = "REQ";                // 수강신청
    public static String STATUS_COMPLETE = "COMPLETE";      // 결제완료
    public static String STATUS_CANCEL = "CANCEL";          // 수강취소

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    long courseId;
    String userId;

    long payPrice;          // 결제금액
    String status;          // 상태(수강신청, 결재완료, 수강취소)

    LocalDateTime regDt;    // 신청일

}
