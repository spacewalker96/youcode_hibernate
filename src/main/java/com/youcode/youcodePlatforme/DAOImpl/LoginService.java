package com.youcode.youcodePlatforme.DAOImpl;

import java.util.ArrayList;
import java.util.List;
import com.youcode.youcodePlatforme.HibernateUtil;
import com.youcode.youcodePlatforme.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;

public class LoginService {

    public boolean authenticateUser(String email, String password) {
        User user = getUserByUserId(email);
        if(user!=null && user.getEmail().equals(email) && user.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }
    public User getUserByUserId(String email) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        User user;
        try {
            session.beginTransaction();
            Query query = session.createQuery("from User where email='"+email+"'");
            user = (User)query.uniqueResult();
            session.getTransaction().commit();
        } finally {
            /*session.close();*/
        }
        return user;
    }
    
    public List<User> getListOfUsers(){
        List<User> list = new ArrayList<User>();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            session.beginTransaction();

            list = session.createQuery("from User").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            /*session.close();*/
        }
        return list;
    }
}
