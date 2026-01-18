package TPapimvc.ZeinaSheinez.controller;

import TPapimvc.ZeinaSheinez.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api/stats")
public class StatsController {

    @Autowired
    private StatsService statsService;

    @GetMapping("/books-per-category")
    public Map<String, Long> getBooksByCategory() {
        return statsService.getBooksByCategory();
    }
}