package com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Controller;

import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Entity.Book;
import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Service.AuthorService;
import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Service.BookService;
import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Service.CategoryService;
import com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private PublisherService publisherService;

    @Autowired
    private AuthorService authorService;

    @GetMapping("/books")
    private String findAllBooks(Model model){

        List<Book> bookList = bookService.findAllBooks();

        model.addAttribute("books", bookList);

        return "books";

    }

    @GetMapping("/book/{id}")
    public String findBook(@PathVariable Long id, Model model){

        Book book = bookService.findBookById(id);

        model.addAttribute("book",book);

        return "list-book";

    }

    @GetMapping("remove-book/{id}")
    public String deleteBooks(@PathVariable Long id, Model model){

        bookService.deleteBook(id);

        model.addAttribute("books", bookService.findAllBooks());

        return "books";

    }

    @GetMapping("/update-book/{id}")
    public String updateBook(@PathVariable Long id, Model model){

        Book book = bookService.findBookById(id);

        model.addAttribute("book", book);

        model.addAttribute("categories",categoryService.findAllCategories());

        model.addAttribute("publishers",publisherService.findAllPublishers());

        model.addAttribute("authors",authorService.findAllAuthors());

        return "update-book";

    }

    @PostMapping("/save-update/{id}")
    public String updateBook(@PathVariable Long id, Book book, BindingResult result, Model model){

        if(result.hasErrors()){

            return "update-book";

        }

        bookService.updateBook(book);

        model.addAttribute("books",bookService.findAllBooks());

        return "redirect:/books";

    }

    @GetMapping("/add-book")
    public String addBook(Book book, Model model){

        model.addAttribute("categories",categoryService.findAllCategories());

        model.addAttribute("publishers",publisherService.findAllPublishers());

        model.addAttribute("authors",authorService.findAllAuthors());

        return "add-book";

    }

    @PostMapping("/save-book")
    public String saveBook(Book book, BindingResult result, Model model){

        if(result.hasErrors()){

            return "add-book";

        }

        bookService.createBook(book);

        model.addAttribute("books",bookService.findAllBooks());

        return "redirect:/books";

    }

}
