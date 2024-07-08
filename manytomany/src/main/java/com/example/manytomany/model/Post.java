package com.example.manytomany.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
@Entity
@Table(name="Post")
public class Post {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@Column(name="title")
private String title;
@Column(name="description")
private String description;
@Column(name="content")
private String content;
@Column(name="posted at")
private Date postedAt=new Date();
@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
@JoinTable(name = "post_tags",
	joinColumns = { @JoinColumn(name = "post_id")},
	inverseJoinColumns = { @JoinColumn (name = "tag_id")})
private Set<Tag> tags=new HashSet<>();
public Post() {
	super();
	// TODO Auto-generated constructor stub
}
public Post(Long id, String title, String description, String content, Date postedAt, Set<Tag> tags) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
	this.content = content;
	this.postedAt = postedAt;
	this.tags = tags;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getPostedAt() {
	return postedAt;
}
public void setPostedAt(Date postedAt) {
	this.postedAt = postedAt;
}
public Set<Tag> getTags() {
	return tags;
}
public void setTags(Set<Tag> tags) {
	this.tags = tags;
}



}
