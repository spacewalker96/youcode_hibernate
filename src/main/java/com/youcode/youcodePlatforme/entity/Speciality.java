package com.youcode.youcodePlatforme.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "speciality_table")
public class Speciality {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "speciality_id")
    private long id;
    @Column(name = "specility_nom")
    private String specialityName;

    @OneToMany(mappedBy="speciality",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    private List<User> users;

    public Speciality(long id, String specialityName, List<User> users) {
        this.id = id;
        this.specialityName = specialityName;
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Speciality() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSpecialityName() {
        return specialityName;
    }

    public void setSpecialityName(String specialityName) {
        this.specialityName = specialityName;
    }

    public Speciality(long id, String specialityName) {
        this.id = id;
        this.specialityName = specialityName;
    }

    public Speciality(String specialityName) {
        this.specialityName = specialityName;
    }


    public void add(User tempCourse) {

        if (users == null) {
            users = new ArrayList<>();
        }

        users.add(tempCourse);

        tempCourse.setSpeciality(this);
    }

}
