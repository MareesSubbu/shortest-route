package com.shortest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shortest.dao.ShortestPath;
import com.shortest.model.Shortest;
import com.shortest.service.ShortestPathService;

@RestController


public class ShortestPathController {
	@Autowired
	ShortestPathService shortestPathService;	
	
	@RequestMapping(value="/short" ,method = RequestMethod.POST)
	public Shortest shortestPath(@RequestBody Shortest input) {
		//Shortest shortest =new Shortest();
		//
		Shortest test = shortestPathService.shortestPath(input);
		
		return test;
		
	}


	@RequestMapping(value="/short" ,method = RequestMethod.GET)
	public List<ShortestPath> shortestPath() {
		//Shortest shortest =new Shortest();
		//
		return shortestPathService.findAll();
		
	}
}
