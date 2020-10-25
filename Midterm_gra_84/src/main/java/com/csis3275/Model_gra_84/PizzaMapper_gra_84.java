package com.csis3275.Model_gra_84;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PizzaMapper_gra_84 implements RowMapper<Pizza_gra_84> {
	
	public Pizza_gra_84 mapRow(ResultSet resultSet, int i) throws SQLException	{
	//id, size, firstname, lastname, discount, numberOfToppings
		Pizza_gra_84 pizza = new Pizza_gra_84();
		pizza.setId(resultSet.getInt("id"));
		pizza.setSize(resultSet.getString("size"));
		pizza.setFirstName(resultSet.getString("firstName"));
		pizza.setLastName(resultSet.getString("lastName"));
		pizza.setDiscount(resultSet.getDouble("discount"));
		pizza.setNumberOfToppings(resultSet.getInt("numberOfToppings"));

		
		
		return pizza;
		

}
}