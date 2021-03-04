package com.youcode.youcodePlatforme.controller;

import com.youcode.youcodePlatforme.DAO.UserDAO;
import com.youcode.youcodePlatforme.DAOImpl.UserDAOImlp;
import com.youcode.youcodePlatforme.HibernateUtil;
import com.youcode.youcodePlatforme.entity.Role;
import com.youcode.youcodePlatforme.entity.Speciality;
import com.youcode.youcodePlatforme.entity.User;
import org.hibernate.Session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet(name = "ServletCrud", value = "/ServletCrud")
public class ServletCrud extends HttpServlet {

    UserDAO userDAO = new UserDAOImlp();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        /*if(action == "/delete"){
            delete(request, response);
        }*/
        /*switch (action) {
            case "/delete":
                delete(request, response);
                break;
            default:
                break;
        }*/
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        long speciality = Long.parseLong(request.getParameter("speciality"));
        long role = Long.parseLong(request.getParameter("role"));

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user = new User();
        user.setEmail(email);
        user.setEmail(email);
        user.setPassword(password);
        user.setNom(nom);
        user.setPrenom(prenom);
        Speciality speciality1 = session.get(Speciality.class, speciality);
        Role role1 = session.get(Role.class, role);

        role1.add(user);
        speciality1.add(user);
        session.save(user);

       // delete(request,response);

        session.getTransaction().commit();


        response.sendRedirect("admin.jsp");

    }

   /* public void createFormateur(User user) throws SQLException{

    } *//*
   private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {

       try {
           User user = null;
           userDAO.delete(user.getId());
       } catch (SQLException throwables) {
           throwables.printStackTrace();
       }*/
       /*Session session = HibernateUtil.getSessionFactory().openSession();
       User user = new User();
       session.beginTransaction();
       user = (User) session.createQuery("FROM User U WHERE U.id = :id").setParameter("id", user.getId()).uniqueResult();
       session.getTransaction().commit();*/



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


  /*  private void delete(HttpServletRequest request, HttpServletResponse response) {
        try {
            User user = null;
            userDAO.delete(user.getId());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }*/}
