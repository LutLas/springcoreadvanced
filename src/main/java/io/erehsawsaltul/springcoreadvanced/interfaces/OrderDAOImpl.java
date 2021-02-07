package io.erehsawsaltul.springcoreadvanced.interfaces;

import org.springframework.stereotype.Component;

@Component("oderDAOImpl")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside Order DAO");
	}

}
