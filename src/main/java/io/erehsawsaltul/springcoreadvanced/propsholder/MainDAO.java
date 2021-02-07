package io.erehsawsaltul.springcoreadvanced.propsholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Muyoba LutLas
 *
 */
public class MainDAO {

	@SuppressWarnings("resource")
	public static void myDAO() {
		ApplicationContext cfx = new ClassPathXmlApplicationContext("io/erehsawsaltul/springcoreadvanced/propsholder/propsholder_config.xml");
		MyDAO myDAO = (MyDAO) cfx.getBean("myDAO");
		System.out.println(myDAO);
	}

}
