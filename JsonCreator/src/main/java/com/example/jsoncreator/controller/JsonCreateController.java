package com.example.jsoncreator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsoncreator.callcreator.JsonCreatorService;

@RestController
@RequestMapping("/create")
public class JsonCreateController {

	@Autowired
	JsonCreatorService creatorService;
	
	@GetMapping("/getJson")
	public ResponseEntity<String> getJsonString(@RequestBody String map){
		String json = creatorService.callJsonCreator(map);
		return new ResponseEntity<String>(json, HttpStatus.OK);
	}
}
