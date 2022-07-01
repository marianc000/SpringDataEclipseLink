package sample.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.entities.Country;
 
import sample.repositories.CountryRepository;

@CrossOrigin
@RestController
class CountryController {

    @Autowired
    CountryRepository rep;

    @GetMapping("/queryWithHint")
    public List<Country> queryWithHint() {
        return rep.queryWithHint();
    }
}
