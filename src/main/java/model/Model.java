package model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Vladimir Glinskikh on 08.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
@MappedSuperclass
public abstract class Model implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    public Model() {
    }

    public Model(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
