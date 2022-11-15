package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Dto.PublicCapisDTO;
import com.masai.model.PublicCapis;
@Service
public interface PublicCapisServiceIntr {

	public List<PublicCapis> getListByCateory(String category);
	
	public PublicCapis saveTheData(PublicCapisDTO publicCapis);
}
