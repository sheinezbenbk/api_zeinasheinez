package TPapimvc.ZeinaSheinez.controller;

import TPapimvc.ZeinaSheinez.model.Author;
import TPapimvc.ZeinaSheinez.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public Iterable<Author> getAllAuthor() {
        return authorService.getAllAuthor();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable Long id, @RequestBody Author author) {
        author.setId(id);
        return authorService.saveAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthorById(id);
    }
}