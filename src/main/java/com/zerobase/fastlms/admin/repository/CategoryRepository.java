
package com.zerobase.fastlms.admin.repository;

import com.zerobase.fastlms.admin.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

//        Optional<List<Category>> findAllOrderBySortValueDesc();        챕터 12 말미에 주석처리 해줘야 정상 동작
}
