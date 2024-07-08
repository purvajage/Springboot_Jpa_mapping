package com.example.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.manytomany.model.Post;
import com.example.manytomany.model.Tag;
import com.example.manytomany.repository.PostRepository;

@SpringBootApplication
public class ManytomanyApplication implements CommandLineRunner {
	@Autowired
	private PostRepository postRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ManytomanyApplication.class, args);
	}
	public void run(String... args) throws Exception {
		Post post = new Post();
        post.setTitle("First Post");

        Tag tag1 = new Tag();
        tag1.setName("Spring Boot");

        Tag tag2 = new Tag();
        tag2.setName("Hibernate");

        post.getTags().add(tag1);
        post.getTags().add(tag2);

        postRepository.save(post);
	}	
}
