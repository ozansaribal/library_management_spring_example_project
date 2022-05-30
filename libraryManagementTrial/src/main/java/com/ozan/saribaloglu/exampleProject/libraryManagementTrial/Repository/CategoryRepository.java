package com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Repository;

import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
