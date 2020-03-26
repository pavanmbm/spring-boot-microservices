package com.ms.studentinfo.rest.branch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.studentinfo.model.branch.StudentBranch;

@RestController
public class StudentBranchResource {

	@GetMapping
	@RequestMapping(value="students/student/branch/{id}",produces="application/json")
	public StudentBranch getStudentInfo(@PathVariable("id") String id){
		List<StudentBranch> students  = new ArrayList<>();
		StudentBranch student = new StudentBranch(1, "IT");
		students.add(student);
		StudentBranch student1 = new StudentBranch(2, "EC");
		students.add(student1);
		return students.stream().filter(p -> p.getId()==Integer.valueOf(id)).findAny().get();
	}
}
