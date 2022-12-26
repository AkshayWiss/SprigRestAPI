package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Get.Books;

@RestController
public class MyController {

	@GetMapping("/hello")
	public  String main() {
		return "Hello, Im here";
	}

	@GetMapping("/Books")
	public List<Books> getBooks(){
		return Books.Getdata();
	}
}
