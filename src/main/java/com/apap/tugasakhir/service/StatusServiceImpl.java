package com.apap.tugasakhir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apap.tugasakhir.model.StatusModel;
import com.apap.tugasakhir.repository.StatusDb;

@Service
public class StatusServiceImpl implements StatusService{
	@Autowired
	private StatusDb statusDb;
	
	@Override
	public List<StatusModel> getAll() {
		// TODO Auto-generated method stub
		return statusDb.findAll();
	}
	
}
