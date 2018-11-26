package com.shortest.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.shortest.dao.ShortestPath;

@Component
public class Shortest {

	
	private String orgin;
	private String numberOfCities;
	private String edgeWeights;
	private String result;
	private List<ShortestPath> shortestResult=new ArrayList<>();
	
	public String getOrgin() {
		return orgin;
	}
	public List<ShortestPath> getShortestResult() {
		return shortestResult;
	}
	public void setShortestResult(List<ShortestPath> shortestResult) {
		this.shortestResult = shortestResult;
	}
	public Shortest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setOrgin(String orgin) {
		this.orgin = orgin;
	}
	public Shortest(String orgin, String numberOfCities, String edgeWeights) {
		super();
		this.orgin = orgin;
		this.numberOfCities = numberOfCities;
		this.edgeWeights = edgeWeights;
	}
	public String getNumberOfCities() {
		return numberOfCities;
	}
	public void setNumberOfCities(String numberOfCities) {
		this.numberOfCities = numberOfCities;
	}
	public String getEdgeWeights() {
		return edgeWeights;
	}
	public void setEdgeWeights(String edgeWeights) {
		this.edgeWeights = edgeWeights;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	 
}
