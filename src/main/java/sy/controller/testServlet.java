package sy.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import sy.model.User;
import sy.service.UserServiceI;

@Component
public class testServlet extends HttpServlet {
	
	private static final long serialVersionUID = 8621595613760650737L;
	
	@Autowired
	private UserServiceI userServiceI;
	public void init() throws ServletException { 
		//ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		
		//UserServiceI userServiceI=(UserServiceI)context.getBean("userService");
		System.out.println("晚上");
		/*List<User> list = userServiceI.getAll();
		for (User user : list) {
			System.out.println(user+"aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		}*/
	}
}
