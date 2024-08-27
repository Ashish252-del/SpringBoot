package com.springBoot.leanrSpringBoot.courses.repository;

import com.springBoot.leanrSpringBoot.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
