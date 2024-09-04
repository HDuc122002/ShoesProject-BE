package com.project.ShoesProject_BE.service;

import com.project.ShoesProject_BE.model.dto.CategoryDTO;
import com.project.ShoesProject_BE.model.Category;

import java.util.List;

public interface ICategoryService {
    Category createCategory(CategoryDTO category);
    Category getCategoryById(long id);
    List<Category> getAllCategories();
    Category updateCategory(long categoryId, CategoryDTO category);
    void deleteCategory(long id);
}
