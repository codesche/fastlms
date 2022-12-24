package com.zerobase.fastlms.member.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity

public class Member implements MemberCode {

    @Id
    private String userId;

    private String userName;
    private String phone;
    private String password;
    private LocalDateTime regDt;
    private LocalDateTime udtDt;                    // 회원정보 수정일

    private boolean emailAuthYn;                    // 메일 인증 여부 확인
    private LocalDateTime emailAuthDt;              // 이메일 인증한 날짜 확인
    private String emailAuthKey;                    // 이메일 인증키

    private String resetPasswordKey;                // 패스워드 초기화
    private LocalDateTime resetPasswordLimitDt;     // 패스워드 초기화 가능 날짜

    private boolean adminYn;                        // 관리자 여부 확인

    private String userStatus;                      // 이용가능한 상태, 정지상태

    private String zipcode;
    private String addr;
    private String addrDetail;

    // 마지막 로그인 일자
    private LocalDateTime lastLoginDt;

}
