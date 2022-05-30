package com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Service;

import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Entity.Book;
import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAllBooks(){

        return bookRepository.findAll();

    }

    public Book findBookById(Long id){

        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found!"));

    }

    public void createBook(Book book){

        bookRepository.save(book);

    }

    public void updateBook(Book book){

        bookRepository.save(book);

    }

    public void deleteBook(Long id){

        if(!bookRepository.existsById(id)){

            throw new RuntimeException("there is no book with this id");

        }

        bookRepository.deleteById(id);

    }

}
