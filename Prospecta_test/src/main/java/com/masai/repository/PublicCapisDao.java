package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.PublicCapis;
@Repository
public interface PublicCapisDao extends JpaRepository<PublicCapis, Integer> {
	
	public List<PublicCapis> findByCategory(String category);
}
