package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Dto.PublicCapisDTO;
import com.masai.exception.NotFoundException;
import com.masai.model.PublicCapis;
import com.masai.repository.PublicCapisDao;
@Service
public class PublicCapisServiceImpl implements PublicCapisServiceIntr {

	
	@Autowired
	private PublicCapisDao pDao;
	@Override
	public List<PublicCapis> getListByCateory(String category) {
		// TODO Auto-generated method stub
		
		List<PublicCapis> plist = pDao.findByCategory(category);
		
		if(plist.isEmpty()) {
			throw new NotFoundException("Data Not Found With This Category");
			
		}
		
		return plist;
	}
	@Override
	public PublicCapis saveTheData(PublicCapisDTO publicCapis) {
		// TODO Auto-generated method stub
		
		PublicCapis pc = new PublicCapis();
		pc.setAuth(publicCapis.getAuth());
		pc.setCategory(publicCapis.getCategory());
		pc.setCors(publicCapis.getCors());
		pc.setDescription(publicCapis.getDescription());
		pc.setHttps(publicCapis.isHttps());
		pc.setTitle(publicCapis.getTitle());
		
		return pDao.save(pc);
	}

}
