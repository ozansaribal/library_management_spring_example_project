package com.ozan.saribaloglu.exampleProject.libraryManagementTrial;

import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Entity.Author;
import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Entity.Book;
import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Entity.Category;
import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Entity.Publisher;
import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryManagementTrialApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementTrialApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookService){

		return (args) -> {

			Book book1 = new Book("ABC", "Book Name", "My first book");

			Author author1 = new Author("Test name1", "Test Description");

			Category category1 = new Category("Business Books");

			Publisher publisher1 = new Publisher("First Publisher");

			book1.addAuthor(author1);

			book1.addCategory(category1);

			book1.addPublisher(publisher1);

			bookService.createBook(book1);

			Book book2 = new Book("ABC1", "Book Name", "My first book");

			Author author2 = new Author("Test name2", "Test Description");

			Category category2 = new Category("Science Books");

			Publisher publisher2 = new Publisher("Second Publisher");

			book2.addAuthor(author2);

			book2.addCategory(category2);

			book2.addPublisher(publisher2);

			bookService.createBook(book2);

			Book book3 = new Book("ABC21", "Book Name", "My first book");

			Author author3 = new Author("Test name3", "Test Description");

			Category category3 = new Category("Fiction Books");

			Publisher publisher3 = new Publisher("Third Publisher");

			book3.addAuthor(author3);

			book3.addCategory(category3);

			book3.addPublisher(publisher3);

			bookService.createBook(book3);

		};

	}

}
