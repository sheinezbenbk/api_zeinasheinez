package TPapimvc.ZeinaSheinez.service;

import TPapimvc.ZeinaSheinez.model.Author;
import TPapimvc.ZeinaSheinez.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Iterable<Author> getAllAuthor() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public void deleteAuthorById(Long id) {
        authorRepository.deleteById(id);
    }
}