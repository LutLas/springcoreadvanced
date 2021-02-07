package io.erehsawsaltul.springcoreadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Muyoba Lutlas
 *
 */
public class MainConstructInjection {

	@SuppressWarnings("resource")
	public static void MainConstructInjectionFunc() {
		ApplicationContext cfx = new ClassPathXmlApplicationContext("io/erehsawsaltul/springcoreadvanced/autowiring/constinject_config.xml");
		Employee employee = (Employee) cfx.getBean("employee");
		System.out.println(employee);
	}
}
 