package com.ecommerce.sb_ecom.controller;

import com.ecommerce.sb_ecom.model.Category;
import com.ecommerce.sb_ecom.payload.CategoryResponseDTO;
import com.ecommerce.sb_ecom.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class CategoryController {

    private CategoryService categoryService;
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }
    @GetMapping("/api/public/categories")
    public ResponseEntity<CategoryResponseDTO> getAllCategories(){
        CategoryResponseDTO categoryResponseDTO = categoryService.getAllCategories();
        return new ResponseEntity<>(categoryResponseDTO,HttpStatus.OK);
    }

    @PostMapping("/api/admin/categories")
    public ResponseEntity<String> addNewCategory(@Valid @RequestBody Category category){
        categoryService.createCategory(category);
        return ResponseEntity.status(HttpStatus.CREATED).body("category add successfully");
    }

    @DeleteMapping("/api/admin/categories/{categoryId}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long categoryId){
        String status = categoryService.deleteCategory(categoryId);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @PutMapping("/api/admin/categories/{categoryId}")
    public ResponseEntity<String> updateCategory(@RequestBody Category category,@PathVariable Long categoryId){
        Category newCategory = categoryService.updateCategory(category,categoryId);
        return new ResponseEntity<>(("category with category Id "+categoryId+" is successfully updates"),HttpStatus.OK);
    }
}
