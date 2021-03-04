package com.youcode.youcodePlatforme.DAOImpl;


import com.youcode.youcodePlatforme.DAO.UserDAO;
import com.youcode.youcodePlatforme.HibernateUtil;
import com.youcode.youcodePlatforme.entity.Role;
import com.youcode.youcodePlatforme.entity.Speciality;
import com.youcode.youcodePlatforme.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImlp implements UserDAO {




    @Override
    public void updateUser(User user) throws SQLException {

    }

    @Override
    public void delete(long id) throws SQLException {
       /* Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
       User user =session.get(User.class, id);;
        session.delete(user);
        session.getTransaction().commit();*/
        Transaction transaction = null;
        User user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            user = session.get(User.class, id);

            session.delete(user);
            // commit transaction
            transaction.commit();

        } catch (Exception e) {

            e.printStackTrace();
        }


    }

    @Override
    public List<User> listStudent() throws SQLException {


        List<User> list = new ArrayList<User>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from User WHERE role = 3").list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        return  list;
    }

    @Override
    public List<User> listFormateur() throws SQLException {
        List<User> list = new ArrayList<User>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from User WHERE role = 4").list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        return  list;
    }

    @Override
    public String authenticateUser(String email, String password) {

        Transaction transaction = null;
        User user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            user = (User) session.createQuery("FROM User U WHERE U.email = :email").setParameter("email", email).uniqueResult();
            if(user.getEmail().equals(email) && user.getPassword().equals(password) && user.getRole().getRoleName().equals("admin"))
                return "Admin_Role";
            else if(user.getEmail().equals(email) && user.getPassword().equals(password) && user.getRole().getRoleName().equals("student"))
                return "Student_Role";
            else if(user.getEmail().equals(email) && user.getPassword().equals(password) && user.getRole().getRoleName().equals("formateur"))
                return "Formateur_Role";
            // commit transaction
            transaction.commit();

        } catch (Exception e) {

            e.printStackTrace();
        }
        return "false";
    }

    public List<User> getListOfUsers() {
        List<User> list = new ArrayList<User>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from User").list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        return list;
    }



    }



