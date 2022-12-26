package com.zerobase.fastlms.banner.model;

import com.zerobase.fastlms.banner.entity.Banner;
import com.zerobase.fastlms.banner.type.TargetStatusType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BannerInput {

    long id;

    private String name;                        // 배너명
    private String url;                         // 클릭시 링크주소
    private Boolean isOpen;                     // 공개 여부
    private TargetStatusType targetStatus;      // 클릭시 타겟정보(새창, 현재창)
    private int sortValue;                      // 정렬 우선순위

    // 삭제 고려
    private String idList;

    private String fileName;
    private String urlFileName;


}
