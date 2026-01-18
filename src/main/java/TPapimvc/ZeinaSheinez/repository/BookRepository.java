package TPapimvc.ZeinaSheinez.repository;

import TPapimvc.ZeinaSheinez.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    long countByCategory(Book.Category category);
}