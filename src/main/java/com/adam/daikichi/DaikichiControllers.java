package com.adam.daikichi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DaikichiControllers {

	@RequestMapping("/daikichi")
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping("/daikichi/today")
	public String today() {
		return "Today you will find luck in all yor endeavors!";
	}

	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}

	
	
	
	
	
	
	
}
