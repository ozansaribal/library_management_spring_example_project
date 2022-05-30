package com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Repository;

import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
