package sample.entities;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY")
public class Country  {

    @Id
    Integer id;
    String name;

    @OneToMany
    @JoinColumn(name = "COUNTRY_ID")
    List<Author> authors = new LinkedList<>();

    public Country() {
    }

    public Country(int id, String name) { // for JDBC
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) { //convenience for jdbc
        this.authors = authors;
    }
}
