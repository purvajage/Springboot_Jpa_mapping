package com.example.Onetoonemapping.model;


import jakarta.persistence.*;
@Entity
@Table(name="instructor_detail")
public class instructordetail {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private Long id;
@Column(name="youtube_channel")
private String youtubeChannel;
@Column(name="hobby")
private String hobby;
public instructordetail(String youtubeChannel, String hobby) {
    this.youtubeChannel = youtubeChannel;
    this.hobby = hobby;
}
public instructordetail() {
	
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getYoutubeChannel() {
	return youtubeChannel;
}
public void setYoutubeChannel(String youtubeChannel) {
	this.youtubeChannel = youtubeChannel;
}
public String getHobby() {
	return hobby;
}
public void setHobby(String hobby) {
	this.hobby = hobby;
}

}
