package com.apap.tugasakhir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apap.tugasakhir.service.PasienService;
import com.apap.tugasakhir.service.StatusService;

import com.apap.tugasakhir.model.*;

@RestController
@RequestMapping("/api")
public class StatusRestController {
	@Autowired
	private StatusService statusService;
	
	@Autowired
	private PasienService pasienService;
	
	@GetMapping("/rujukan")
	private List<PasienModel> viewPasien(Model model) {
		return pasienService.getAll();
	}
}
