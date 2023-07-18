package com.javaguides.springbootbackend;

import com.javaguides.springbootbackend.model.Employee;
import com.javaguides.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee=new Employee();
		employee.setFirsName("Nigar");
		employee.setLastName("Orujova");
		employee.setEmailId("nigar.o@yelload.com");
		employeeRepository.save(employee);

		Employee employee2=new Employee();
		employee2.setFirsName("Nigar");
		employee2.setLastName("Orujova");
		employee2.setEmailId("nigar.o@yelload.com");
		employeeRepository.save(employee2);
	}
}
