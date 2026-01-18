package TPapimvc.ZeinaSheinez.service;

import TPapimvc.ZeinaSheinez.model.Book;
import TPapimvc.ZeinaSheinez.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class StatsService {

    @Autowired
    private BookRepository bookRepository;

    public Map<String, Long> getBooksByCategory() {
        Map<String, Long> stats = new HashMap<>();
        stats.put("NOVEL", bookRepository.countByCategory(Book.Category.NOVEL));
        stats.put("ESSAY", bookRepository.countByCategory(Book.Category.ESSAY));
        stats.put("POETRY", bookRepository.countByCategory(Book.Category.POETRY));
        stats.put("OTHER", bookRepository.countByCategory(Book.Category.OTHER));
        return stats;
    }
}