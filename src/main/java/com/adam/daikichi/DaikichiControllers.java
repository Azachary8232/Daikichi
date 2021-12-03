package com.adam.daikichi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DaikichiControllers {

	@RequestMapping("/daikichi")
	public String welcome() {
		return "Welcome!";
	}
	
	
	
	
	
	
	
}
