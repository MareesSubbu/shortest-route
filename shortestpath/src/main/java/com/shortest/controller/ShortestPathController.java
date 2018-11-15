package com.shortest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShortestPathController {
	@RequestMapping(value="/short" ,method = RequestMethod.POST)
	public String shortestPath() {
		return null;
		
	}

}
