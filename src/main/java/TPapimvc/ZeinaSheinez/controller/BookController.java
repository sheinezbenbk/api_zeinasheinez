package TPapimvc.ZeinaSheinez.controller;

import TPapimvc.ZeinaSheinez.model.Book;
import TPapimvc.ZeinaSheinez.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping
    public Iterable<Book> getAllBooks() {
        return bookService.getAllBook();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updated) {
        return bookService.updateBook(id, updated);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
    }
}