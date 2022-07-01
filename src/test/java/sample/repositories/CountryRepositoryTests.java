package sample.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sample.entities.Country;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
public class CountryRepositoryTests {

    @Autowired
    CountryRepository db;

    @Autowired
    EntityManager em;

    @BeforeEach
    void setUp() {
        em.clear();
    }

    @Test
    void testQuery() {
        List<Country> l = db.queryWithHint();
        accessFields(l);
    }

    public static void accessFields(List<Country> l) {
        System.out.println("Found countries " + l.size());
        l.forEach(c -> c.getAuthors().forEach(d -> d.getPosts().forEach(e -> e.toString())));
    }
}
