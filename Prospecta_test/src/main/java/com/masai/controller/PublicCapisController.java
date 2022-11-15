package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Dto.PublicCapisDTO;
import com.masai.model.PublicCapis;
import com.masai.service.PublicCapisServiceIntr;

@RestController
public class PublicCapisController {

	@Autowired
	private PublicCapisServiceIntr pService;
	
	
	@GetMapping(value = "/publicCapis")
	public ResponseEntity<List<PublicCapis>>  getPublicCapisByCategory(@RequestParam String category){
		List<PublicCapis> plist = pService.getListByCateory(category);
		return new ResponseEntity<List<PublicCapis>>(plist,HttpStatus.ACCEPTED);
	}
	
	@PostMapping(value = "/publicCapis")
	public ResponseEntity<PublicCapis>  savePublicCapis(@RequestBody PublicCapisDTO publicCapis){
		PublicCapis p = pService.saveTheData(publicCapis);
		return new ResponseEntity<PublicCapis>(p,HttpStatus.ACCEPTED);
	}
}
