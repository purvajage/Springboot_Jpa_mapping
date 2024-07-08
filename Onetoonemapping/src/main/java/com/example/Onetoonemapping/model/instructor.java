package com.example.Onetoonemapping.model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="instructor")
public class instructor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private Long id;

@Column(name="first_name")
private String first_name;
@Column(name="last_name")
private String last_name;
@Column(name="email")
private String email;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="instructor_detail_id")
private instructordetail instructordetail;
public instructor() {
	
}
public instructor(String firstName, String lastName, String email) {
    this.first_name = firstName;
    this.last_name = lastName;
    this.email = email;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public instructordetail getInstructordetail() {
	return instructordetail;
}
public void setInstructordetail(instructordetail instructordetail) {
	this.instructordetail = instructordetail;
}
}
