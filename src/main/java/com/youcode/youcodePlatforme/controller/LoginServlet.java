package com.youcode.youcodePlatforme.controller;

import com.youcode.youcodePlatforme.DAO.UserDAO;
import com.youcode.youcodePlatforme.DAOImpl.UserDAOImlp;
import com.youcode.youcodePlatforme.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO loginDao;

	public void init() {
		loginDao = new UserDAOImlp();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserDAOImlp loginDao = new UserDAOImlp();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		try
		{
			String userValidate = loginDao.authenticateUser(email,password);

			if(userValidate.equals("Admin_Role"))
			{
				request.setAttribute("email", email);

				request.getRequestDispatcher("admin.jsp").forward(request, response);
			}
			else if(userValidate.equals("Student_Role"))
			{
				request.setAttribute("email", email);

				request.getRequestDispatcher("student.jsp").forward(request, response);
			}
			else if(userValidate.equals("Formateur_Role"))
			{
				request.setAttribute("email", email);

				request.getRequestDispatcher("formateur.jsp").forward(request, response);
			}
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		catch (Exception e2)
		{
			e2.printStackTrace();
		}
	}

}
