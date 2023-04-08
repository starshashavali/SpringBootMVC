package com.tcs.loader;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tcs.entity.Car;
import com.tcs.repo.CarRepo;

@Component

public class DataLoader  implements ApplicationRunner  {
	
		@Autowired
		
		private CarRepo repo;

		@Override
		public void run(ApplicationArguments args) throws Exception {
		 Car c= new Car();
		 c.setCid(101);
		 c.setCname("Jagur");
		 c.setPrice(1000.0);
		 
		 
		 Car c1= new Car();
		 c1.setCid(101);
		 c1.setCname("Jagur");
		 c1.setPrice(1000.0);
		 
		 Car c2= new Car();
		 c2.setCid(101);
		 c2.setCname("Jagur");
		 c2.setPrice(1000.0);
		 
	List<Car> list = Arrays.asList(c,c1,c2);
	repo.saveAll(list);
			
		}


}
