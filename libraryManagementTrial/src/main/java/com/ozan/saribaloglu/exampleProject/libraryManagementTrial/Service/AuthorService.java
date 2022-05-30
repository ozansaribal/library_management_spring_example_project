package com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Service;

import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Entity.Author;
import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAllAuthors(){

        return authorRepository.findAll();

    }

    public Author findAuthorById(Long id){

        return authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found!"));

    }

    public void createAuthor(Author author){

        authorRepository.save(author);

    }

    public void updateAuthor(Author author){

        authorRepository.save(author);

    }

    public void deleteAuthor(Long id){

        if(!authorRepository.existsById(id)){

            throw new RuntimeException("there is no author with this id");

        }

        authorRepository.deleteById(id);

    }

}
