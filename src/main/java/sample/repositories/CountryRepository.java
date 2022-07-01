package sample.repositories;

import java.util.List;
import javax.persistence.QueryHint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import sample.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

    @Query("SELECT c FROM Country c left join c.authors a left join a.posts p "
            + " order by c.name,a.name,p.name")
    @QueryHints({
        @QueryHint(name = "eclipselink.left-join-fetch", value = "c.authors.posts")})
    List<Country> queryWithHint();
}
