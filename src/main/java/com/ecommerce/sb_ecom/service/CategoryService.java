package com.ecommerce.sb_ecom.service;

import com.ecommerce.sb_ecom.model.Category;
import com.ecommerce.sb_ecom.payload.CategoryResponseDTO;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CategoryService {
    CategoryResponseDTO getAllCategories();
    void createCategory(Category category);
    String deleteCategory(Long categoryId);
    Category updateCategory(Category category,Long categoryId);
}
