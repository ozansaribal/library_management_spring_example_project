package com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Service;

import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Entity.Category;
import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAllCategories(){

        return categoryRepository.findAll();

    }

    public Category findCategoryById(Long id){

        return categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));

    }

    public void createCategory(Category category){

        categoryRepository.save(category);

    }

    public void updateCategory(Category category){

        categoryRepository.save(category);

    }

    public void deleteCategory(Long id){

        if(!categoryRepository.existsById(id)){

            throw new RuntimeException("there is no category with this id");

        }

        categoryRepository.deleteById(id);

    }

}
