package com.apap.tugasakhir.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.tugasakhir.model.PasienModel;

@Repository
public interface PasienDb extends JpaRepository<PasienModel, Long> {
	List<PasienModel> findAll();
}
