package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vladimir Glinskikh on 04.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
@Entity
@Table(name = "role")
public class Role extends Model {

    @Column(name = "title")
    private String title;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();

    public Role() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
