package com.shortest.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shortest.dao.ShortestPath;
 
@Repository
public interface ShortestPathRepository extends CrudRepository<ShortestPath, String> {
     
	List<ShortestPath> findAll();
}