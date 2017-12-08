package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vladimir Glinskikh on 04.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
@Entity
@Table(name = "client")
public class User extends Model {

    @Column(name = "age")
    private int age;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @ManyToMany
    @JoinTable(name = "client_role", joinColumns = {@JoinColumn(name = "client_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles = new HashSet<>();

    public User() {
        super();
    }

    public User(long id) {
        super(id);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
