import com.youcode.youcodePlatforme.HibernateUtil;
import com.youcode.youcodePlatforme.entity.Role;
import com.youcode.youcodePlatforme.entity.Speciality;
import com.youcode.youcodePlatforme.entity.User;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {




    public static void main(String[] args) throws SQLException {
        /*User user = new User("hmiyed","hassan","hassan@gmail.com");
        Role role = new Role();
        Role role2 = new Role("apprenant");*/

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Role role2 = new Role("formateur");
        Role role = new Role("admin");
        Role role1= new Role("student");
        Speciality speciality = new Speciality("C#");
        Speciality speciality1 = new Speciality("Full Stack#");
        //Role role3 = session.get(Role.class, 11);;


        session.beginTransaction();
        //session.createQuery("delete from Role where id=10").executeUpdate();
       //session.delete(role3);

       /* int theId = 1;
        Role role = session.get(Role.class, theId);
        User user2 = new User("Hmertgyhiyed","fghj","rtyu@gmail.com","dfghj");
        User user3 = new User("Hmiygoued","dfghjk","dfghj@gmail.com","fghjk");
        session.save(user2);
        session.save(user3);*/
        // get the instructor from db
      /*  long theId = 1;
        Role tempInstructor = session.get(Role.class, theId);
        long theId1 = 3;
        Speciality tempInstructor1 = session.get(Speciality.class, theId1);

        // create some courses
        User tempCourse1 = new User("Hassan","fghj","rtyu@gmail.com","dfghj");
        User tempCourse2 = new User("machi hassan","fghj","rtyu@gmail.com","dfghj");

        // add courses to instructor
        tempInstructor.add(tempCourse1);
        tempInstructor.add(tempCourse2);
        tempInstructor1.add(tempCourse1);
        tempInstructor1.add(tempCourse2);

        // save the courses
        session.save(tempCourse1);
        session.save(tempCourse2);







  *//*      User user2 = new User();
        user2.setId(8);
        user2.setNom("chi wahed");
        session.update(user2);*//*

       *//* }
        User user5 = new User();
        System.out.println("Employee Name : " + user5.getNom());

        for (list:lists) {

        }*//*

      *//*  User user = new User("Hmiyed","Hassan","hassan@gmail.com","azerty");
        UserDAO userDAO = null;
        userDAO.createStudent(user);*/
  //      session.save(user);
        long theId1 = 4;

/*
        User user = new User("Hmiyed","Hassan","admin@gmail.com","123");
*/

        session.save(speciality);
        session.save(speciality1);
        session.getTransaction().commit();
    }


 /*   public static void main(String[] args) throws Exception {
*//*
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
            entityManagerFactory = Persistence.createEntityManagerFactory("youcode_platforme");
            entityManager = entityManagerFactory.createEntityManager();

                Role role = new Role("Admin");
                entityManager.persist(role);
*/

            // create session factory
          /*  SessionFactory factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Role.class)
                    .buildSessionFactory();

            // create session
            Session session = factory.getCurrentSession();
            Role role = new Role("Admin");
            User user = new User("hmiyed","hassan","hassan@gmail.com");
            Speciality speciality = new Speciality("Java","3otla");

            try {
                //Activity activity = new Activity("Competition",10-10-2022,"nzjea hazfazf zfafaozfa");
                // start a transaction
                session.beginTransaction();

                session.save(role);
                session.save(user);
                session.save(speciality);

                // commit transaction
                session.getTransaction().commit();

                System.out.println("Done!");
            }
            finally {
                factory.close();
            }*/

        }



