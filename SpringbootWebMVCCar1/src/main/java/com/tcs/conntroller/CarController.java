package com.tcs.conntroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcs.entity.Car;
import com.tcs.repo.CarRepo;

@Controller
public class CarController {
	@Autowired
	private CarRepo repo1;
@GetMapping("/car")
	public String getCarDetails(@RequestParam ("id") Integer id,Model model){
		Optional<Car>findById=repo1.findById(id);
		System.out.println(findById.get());
		if(findById.isPresent()) {
			 Car carObj = findById.get();
			model.addAttribute("car", carObj);
		}
		
	
return "index";
}
}