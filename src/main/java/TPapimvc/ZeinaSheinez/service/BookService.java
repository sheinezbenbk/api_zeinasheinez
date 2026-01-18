package TPapimvc.ZeinaSheinez.service;

import TPapimvc.ZeinaSheinez.model.Book;
import TPapimvc.ZeinaSheinez.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public Iterable<Book> getAllBook() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book updateBook(Long id, Book updated) {
        Book existing = bookRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setTitle(updated.getTitle());
            existing.setIsbn(updated.getIsbn());
            existing.setYear(updated.getYear());
            existing.setCategory(updated.getCategory());
            existing.setAuthor(updated.getAuthor());
            return bookRepository.save(existing);
        }
        return null;
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    public long countByCategory(Book.Category category) {
        return bookRepository.countByCategory(category);
    }
}