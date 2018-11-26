package com.shortest.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shortestpath")
public class ShortestPath {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    public long getId() {
        return id;
    }

	private String orgin;
	private String numberOfCities;
	private String edgeWeights;
	private String result;
	public String getOrgin() {
		return orgin;
	}
	public void setOrgin(String orgin) {
		this.orgin = orgin;
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
