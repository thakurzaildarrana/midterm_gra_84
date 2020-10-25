package com.csis3275.Controller_gra_84;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csis3275.Doa_gra_84.PizzaDAOImpl_gra_84;
import com.csis3275.Model_gra_84.Pizza_gra_84;


//https://github.com/thakurzaildarrana/midterm_gra_84.git
//username = thakurzaildarrana
@Controller
public class PizzaController {

 @Autowired
 PizzaDAOImpl_gra_84 PizzaDaoImpl;


 @ModelAttribute("pizzas")
 public Pizza_gra_84 setupAddForm() {
 return new Pizza_gra_84();
 }


 @GetMapping("/showOrders")
 public String showStudents(HttpSession session, Model model) {

 List<Pizza_gra_84> pizza = PizzaDaoImpl.getAllOrders();
 model.addAttribute("pizza", pizza);
 return "pizza";
 }

 @PostMapping("/createPizza")
 public String createStudent(@ModelAttribute("pizzas") Pizza_gra_84
createPizza, Model model) {
 PizzaDaoImpl.createStudent(createPizza);


 List<Pizza_gra_84> pizza = PizzaDaoImpl.getAllOrders();
 model.addAttribute("pizza", pizza);
 return "pizza";
 }

 
 
 @ModelAttribute("sizes")
	public List<String> size(){
		List<String> sizes = new ArrayList<String>();
		sizes.add("Personal");
		sizes.add("Small");
		sizes.add("Medium");
		sizes.add("Large");
	
		return sizes;
	}

		
	
		
}