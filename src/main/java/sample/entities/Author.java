package sample.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.LinkedList;
import java.util.List;
 

@Entity
@Table(name = "AUTHOR")
public class Author  {

    @Id
    Integer id;
    String name;

    @OneToMany
    @JoinColumn(name = "AUTHOR_ID")
    List< Post> posts = new LinkedList<>();

    public Author() {

    }

    public Author(int id, String name) { // for jdbc
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Post> getPosts() {
        return posts;
    }

}
