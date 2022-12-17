package com.zerobase.fastlms.admin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Category {

    // strategy = GenerationType을 IDENTITY에서 AUTO로 바꿔줌 (에러 해결)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Long id;

    String categoryName;
    int sortValue;
    boolean usingYn;

}
