package com.zerobase.fastlms.banner.entity;


import com.zerobase.fastlms.banner.type.TargetStatusType;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;                        // 배너명
    private String url;                         // 클릭시 링크주소

    private Boolean isOpen;                     // 공개 여부

    @Enumerated(EnumType.STRING)
    private TargetStatusType targetStatus;      // 클릭시 타겟정보(새창, 현재창)
    private int sortValue;                      // 정렬 우선순위

    private String fileName;
    private String urlFileName;

    private LocalDateTime regDt;         // 등록일
    private LocalDateTime udtDt;         // 수정일


}
