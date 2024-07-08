package com.example.manytomany.model;

import java.util.HashSet;
import java.util.Set;



import jakarta.persistence.*;

@Entity
@Table(name="tags")
public class Tag {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="tags")
private Set<Post>posts=new HashSet<>();
public Tag() {
	super();
	// TODO Auto-generated constructor stub
}
public Tag(Long id, String name, Set<Post> posts) {
	super();
	this.id = id;
	this.name = name;
	this.posts = posts;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<Post> getPosts() {
	return posts;
}
public void setPosts(Set<Post> posts) {
	this.posts = posts;
}

}
