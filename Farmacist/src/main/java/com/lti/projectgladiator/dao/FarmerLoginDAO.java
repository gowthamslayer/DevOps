package com.lti.projectgladiator.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.projectgladiator.dto.BidderLoginDTO;
import com.lti.projectgladiator.dto.FarmerLoginDTO;
import com.lti.projectgladiator.entity.BidderInfo;
import com.lti.projectgladiator.entity.FarmerInfo;

@Repository
public class FarmerLoginDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

public String fetchByUsername(FarmerLoginDTO loginDTO) {
		
		try {
		Query q = entityManager.createQuery("select a from FarmerInfo as a where a.fname=:em and a.password=:pwd");
		q.setParameter("em", loginDTO.getUsername());
		q.setParameter("pwd", loginDTO.getPassword());
		
		FarmerInfo farmer = (FarmerInfo)q.getSingleResult();
		return farmer.getFname();
		}
		catch(Exception e) {
			return "fail";
		}
		
		//return (AdminInfo) q.getSingleResult();
		
		
	}
}
