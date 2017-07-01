package org.uflingo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Алексей on 19.05.2017.
 */
@Entity
@Table(name = "USER")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private boolean isAdmin;

    @Column
    private Date createDate;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public Date getCreateDate() {
        return createDate;
    }
}
