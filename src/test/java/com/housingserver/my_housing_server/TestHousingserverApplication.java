package com.housingserver.my_housing_server;

import org.springframework.boot.SpringApplication;

public class TestHousingserverApplication {

	public static void main(String[] args) {
		SpringApplication.from(HousingserverApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
