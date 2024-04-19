package com.pdev.springboot.firstWebApp.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;


// want to store these todo  details in database
// static List of todod => Datatbase(H2, mySql)

public class Todo {
	private Integer id;
	private String username;
	private String description;
	private LocalDate targetDate;
	private Boolean done;

	// Constructor
	// Updated constructor
	public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}


	// Getters And Setters

	public boolean getDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// To String Method

	@Override
	public String toString() {
		return "Todo{" + "id=" + id + ", username='" + username + '\'' + ", description='" + description + '\'' + ", targetDate=" + targetDate + ", done=" + done + '}';
	}
}
