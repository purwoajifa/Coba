package com.apap.tugasakhir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apap.tugasakhir.service.PasienService;
import com.apap.tugasakhir.service.StatusService;

@Controller
public class StatusController {
	@Autowired
	private StatusService statusService;
	
	@Autowired
	private PasienService pasienService;
	
	@RequestMapping("/")
	private String home(Model model) {
		System.out.println(pasienService.getAll());
		return "home";
	}
	
	@RequestMapping("pasien/ubah-status")
	private String ubahStatus(Model model) {
		model.addAttribute("listStatus", statusService.getAll());
		return "ubah-status";
	}
	
	@RequestMapping(value = "pasien/ubah-status", method=RequestMethod.POST)
	private String ubahStatusSubmit() {
		return "beloman";
	}
}
