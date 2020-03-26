package com.ms.studentinfo.rest.score;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.studentinfo.model.score.StudentScore;

@RestController
public class StudentScoreResource {

	@GetMapping
	@RequestMapping(value="students/student/{id}",produces="application/json")
	public StudentScore getStudentInfo(@PathVariable("id") String id){
		List<StudentScore> students  = new ArrayList<>();
		StudentScore student = new StudentScore(1, 90);
		students.add(student);
		StudentScore student1 = new StudentScore(2, 80);
		students.add(student1);
		return students.stream().filter(p -> p.getId()==Integer.valueOf(id)).findAny().get();
	}
}
