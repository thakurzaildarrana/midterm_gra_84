package com.csis3275.Doa_gra_84;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.csis3275.Model_gra_84.PizzaMapper_gra_84;
import com.csis3275.Model_gra_84.Pizza_gra_84;



@Component
public class PizzaDAOImpl_gra_84 {

	JdbcTemplate jdbcTemplate;
	
	private final String SQL_GET_ALL = "SELECT * FROM order_gra_84";
	private final String SQL_CREATE_Pizza = 
			"insert into order_gra_84 (id, size, firstname, lastname, discount, numberOfToppings ) values (?,?,?,?,?,?)";
	//insert into order_gra_84 (id, size, firstname, lastname, discount, numberOfToppings ) values (?,?,?,?,?,?);
	//id, size, firstname, lastname, discount, numberOfToppings
	@Autowired
	public PizzaDAOImpl_gra_84(DataSource dataSource)	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<Pizza_gra_84> getAllOrders()	{
		return jdbcTemplate.query(SQL_GET_ALL, new PizzaMapper_gra_84());
		
	}
	
	public boolean createStudent(Pizza_gra_84 newPizza) {
		return jdbcTemplate.update(SQL_CREATE_Pizza, newPizza.getId(), newPizza.getSize(),newPizza.getFirstname()
				,newPizza.getLastname(),newPizza.getDiscount(),newPizza.getNumberOfToppings()) > 0;
	}
	
	
	
	
	
	
}
