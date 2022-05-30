package com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Repository;

import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
