package io.erehsawsaltul.springcoreadvanced.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Muyoba Lutlas
 *
 */
public class MainProductsList {

	@SuppressWarnings("resource")
	public static void MainProductsListFunc() {
		ApplicationContext cfx = new ClassPathXmlApplicationContext("io/erehsawsaltul/springcoreadvanced/collections/collections_config.xml");
		ProductsList productsList = (ProductsList) cfx.getBean("productslist");
		System.out.println(productsList);
	}
}
 