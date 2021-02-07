package io.erehsawsaltul.springcoreadvanced.interfaces;

import org.springframework.stereotype.Component;

@Component("oderDAOImpl2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAOImpl2 Create Order");
	}

}
