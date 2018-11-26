package com.shortest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shortest.dao.ShortestPath;
import com.shortest.model.Shortest;
import com.shortest.repo.ShortestPathRepository;
import com.shortest.utility.DynProgram;

@Service
public class ShortestPathService {
	
@Autowired
ShortestPathRepository shortestPathRepository;
	public Shortest shortestPath(Shortest input) {
		//String[] inputValues = input.   split("-");
		String orgin=input.getOrgin();
		String vertices=input.getNumberOfCities();
		String distanceMatrix= input.getEdgeWeights();
		
		Shortest shortResult = findBestRoute(orgin, vertices, distanceMatrix);
		ShortestPath shortestPath = new ShortestPath();
		shortestPath.setEdgeWeights(input.getEdgeWeights());
		shortestPath.setNumberOfCities(input.getNumberOfCities());
		shortestPath.setOrgin(input.getOrgin());
		shortestPath.setResult(shortResult.getResult());
		input.setResult(shortResult.getResult());
		shortestPathRepository.save(shortestPath);
		
			
		return shortResult;
		
		 
		
	}

	public Shortest findBestRoute(String anyString, String anyString2, String anyString3) {
		DynProgram dy= new DynProgram();
		// TODO Auto-generated method stub
		return dy.findBestRoute(anyString, anyString2, anyString3);
	}
	
	public List<ShortestPath> findAll(){
		List<ShortestPath> list= shortestPathRepository.findAll();
		return list;
		
	}
	
}
