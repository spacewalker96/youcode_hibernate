package com.youcode.youcodePlatforme.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name ="role_table")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private long idRole;
    @Column(name = "role_name",length = 20,nullable = false)
    private  String roleName;

/*    @OneToMany(mappedBy="role_table",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})*/
    @OneToMany(mappedBy="role",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    private List<User> users;
    //private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Role() {

    }

    public Role(long idRole, String roleName, List<User> users) {
        this.idRole = idRole;
        this.roleName = roleName;
        this.users = users;
    }

    public long getIdRole() {
        return idRole;
    }

    public void setIdRole(long idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }





    public Role(long idRole, String roleName) {
        this.idRole = idRole;
        this.roleName = roleName;
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public void add(User tempCourse) {

        if (users == null) {
            users = new ArrayList<>();
        }

        users.add(tempCourse);

        tempCourse.setRole(this);
    }
}
