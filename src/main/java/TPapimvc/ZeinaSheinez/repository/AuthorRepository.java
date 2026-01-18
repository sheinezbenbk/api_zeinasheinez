package TPapimvc.ZeinaSheinez.repository;

import TPapimvc.ZeinaSheinez.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}