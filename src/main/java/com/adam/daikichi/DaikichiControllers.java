package com.adam.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/daikichi")
public class DaikichiControllers {

	@RequestMapping("")
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all yor endeavors!";
	}

	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}

	@RequestMapping("/travel/{location}")
	public String vacation(@PathVariable("location") String location) {
		return "Congratulations! You will soon travel to " + location; 
	}
	
	@RequestMapping("/lotto/{lotto}")
	public String lotto(@PathVariable("lotto") Integer lotto) {
		if( lotto %2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend with your family and friends."; 
		}
	}

	
	
	
	
}
