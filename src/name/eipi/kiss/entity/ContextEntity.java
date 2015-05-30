package name.eipi.kiss.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Damien on 28/05/2015.
 */
@Entity
@Table(name = "Context", schema = "dbo", catalog = "Home1")
public class ContextEntity implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    @Column
    private String name;

    @Basic
    @Column
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContextEntity that = (ContextEntity) o;

        if (this.getId() != that.getId()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return id;

    }
}
