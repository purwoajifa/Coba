package com.apap.tugasakhir.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.tugasakhir.model.StatusModel;

@Repository
public interface StatusDb extends JpaRepository<StatusModel, Long> {
	List<StatusModel> findAll();
}
