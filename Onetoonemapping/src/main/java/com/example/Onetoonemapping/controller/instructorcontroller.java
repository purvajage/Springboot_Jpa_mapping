package com.example.Onetoonemapping.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Onetoonemapping.model.instructor;
import com.example.Onetoonemapping.repository.instructorrepository;

@RestController
@RequestMapping("/api")
public class instructorcontroller {
	@Autowired
	private instructorrepository instructorrepository;
	@GetMapping("/instructor")
	public List<instructor>  getinstructors(){
		return instructorrepository.findAll();
	}
	@GetMapping("/instructors/{id}")
	public ResponseEntity<instructor> getInstructorById(
			@PathVariable(value = "id") Long instructorId) throws ResourceNotFoundException {
		instructor user = instructorrepository.findById(instructorId)
        .orElseThrow(() -> new ResourceNotFoundException("Instructor not found :: " + instructorId));
		return ResponseEntity.ok().body(user);
	}
    @PostMapping("/instructor")
    public instructor createuser(@Valid @RequestBody instructor instructor) {
    	return instructorrepository.save(instructor);
    }

	@PutMapping("/instructors/{id}")
	public ResponseEntity<instructor> updateUser(
			@PathVariable(value = "id") Long instructorId,
			@Valid @RequestBody instructor userDetails) throws ResourceNotFoundException {
		instructor user = instructorrepository.findById(instructorId)
		        .orElseThrow(() -> new ResourceNotFoundException("Instructor not found :: " + instructorId));
		user.setEmail(userDetails.getEmail());
		final instructor updatedUser = instructorrepository.save(user);
		return ResponseEntity.ok(updatedUser);
	}

	@DeleteMapping("/instructors/{id}")
	public Map<String, Boolean> deleteUser(
			@PathVariable(value = "id") Long instructorId) throws ResourceNotFoundException {
		instructor instructor = instructorrepository.findById(instructorId)
		        .orElseThrow(() -> new ResourceNotFoundException("Instructor not found :: " + instructorId));

		instructorrepository.delete(instructor);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    