package com.ivoronline.springboot_db_findermethods_paging.repositories;

import com.ivoronline.springboot_db_findermethods_paging.entities.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
  Page<Person> findByAgeGreaterThan      (Integer age, Pageable pageable);  //Custom
}
