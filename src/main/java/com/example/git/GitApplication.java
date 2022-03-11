package com.example.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Belajar GIT Springboot";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitApplication.class, args);
	}

	// echo "# baeldung-ci-cd" >> README.md
	// git init
	// git add README.md
	// git commit -m "first commit"
	// git branch -M main
	// git remote add origin https://github.com/ariagaluh02/baeldung-ci-cd.git
	// git push -u origin main

}
