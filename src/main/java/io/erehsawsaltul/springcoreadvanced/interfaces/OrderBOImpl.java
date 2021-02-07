package io.erehsawsaltul.springcoreadvanced.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderBOImpl implements OrderBO {

	@Autowired
	@Qualifier("oderDAOImpl")
	private OrderDAO dao;
	
	@Override
	public void placeOrder() {
		System.out.println("Inside Order BO");
		dao.createOrder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
