package io.erehsawsaltul.springcoreadvanced;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.erehsawsaltul.springcoreadvanced.interfaces.OrderBO;
import io.erehsawsaltul.springcoreadvanced.stereotype.Instructor;

//import io.erehsawsaltul.springcoreadvanced.autowiring.MainConstructInjection;
//import io.erehsawsaltul.springcoreadvanced.collections.MainProductsList;
//import io.erehsawsaltul.springcoreadvanced.propsholder.MainDAO;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
//		  MainDAO.myDAO(); 
//		  MainConstructInjection.MainConstructInjectionFunc();
//		  MainProductsList.MainProductsListFunc();
		
		ApplicationContext cfx = new ClassPathXmlApplicationContext("io/erehsawsaltul/springcoreadvanced/global_config.xml");
		Instructor instructor = (Instructor) cfx.getBean("inst");
		System.out.println(instructor);
		
		OrderBO orderBOImpl = (OrderBO) cfx.getBean("orderBOImpl");
		orderBOImpl.placeOrder();
    }
}
