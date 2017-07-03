package org.uflingo.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Type(type = "org.hibernate.type.BooleanType")
    @Column(name = "isAdmin")
    private boolean isAdmin;

    @Column(name = "createdDate")
    private Timestamp createDate;

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

    public void setCreateDate(Timestamp  createDate) {
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

    public Timestamp getCreateDate() {
        return createDate;
    }
}
