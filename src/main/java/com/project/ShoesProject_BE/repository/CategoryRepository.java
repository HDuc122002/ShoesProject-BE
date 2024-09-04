package com.project.ShoesProject_BE.repository;

import com.project.ShoesProject_BE.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

