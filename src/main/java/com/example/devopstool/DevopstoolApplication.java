package com.example.devopstool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DevopstoolApplication extends SpringBootServletInitializer {
	
	@GetMapping("/AWS")
	public String HelloAWS()
	{
		return "Hello AWS Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopstoolApplication.class, args);
	}

}

















// @SpringBootApplication
// public class DevopstoolApplication extends SpringBootServletInitializer {
// 	public static void main(String[] args) {
// 		SpringApplication.run(DevopstoolApplication.class, args);
// 	}
	
// 	@Override
// 	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
// 		return application.source(DevopstoolApplication.class);
// 	}
// 	private static  Class DevopstoolApplication application.class = DevopstoolApplication.class;
// }
	
// 	@GetMapping("/AWS")
// 	public String HelloAWS()
// 	{
// 		return "Hello AWS Application";
// 	}

	

// }
