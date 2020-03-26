package com.ms.student.StudentBranch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages={"com.ms.studentinfo.*"})
public class StudentBranchApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentBranchApplication.class, args);
	}

}
