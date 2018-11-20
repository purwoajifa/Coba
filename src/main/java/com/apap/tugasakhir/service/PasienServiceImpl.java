package com.apap.tugasakhir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apap.tugasakhir.model.PasienModel;
import com.apap.tugasakhir.repository.*;

@Service
public class PasienServiceImpl implements PasienService{
	@Autowired
	private PasienDb pasienDb;

	@Override
	public List<PasienModel> getAll() {
		// TODO Auto-generated method stub
		return pasienDb.findAll();
	}

}
