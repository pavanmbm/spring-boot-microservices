package com.ms.studentinfo.rest.studentinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ms.studentinfo.model.student.Student;
import com.ms.studentinfo.model.student.StudentBranch;
import com.ms.studentinfo.model.student.StudentScore;

@RestController
public class StudentInfoResource {
	
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	@RequestMapping(value="students/info",produces="application/json")
	public List<Student> getStudentInfo(){
		List<Student> students  = new ArrayList<>();
		Student student = new Student(1, "pavan", 0, null);
		students.add(student);
		Student student1 = new Student(2, "manish", 0, null);
		students.add(student1);
		
		return students.stream().map(sc -> {
			StudentScore score = restTemplate.getForObject("http://student-score/students/student/"+sc.getId(), StudentScore.class);
			StudentBranch branch = restTemplate.getForObject("http://student-branch/students/student/branch/"+sc.getId(), StudentBranch.class);
			return new Student(sc.getId(),sc.getName(),score.getScore(),branch.getBranch());
		}).collect(Collectors.toList());
	}
}
