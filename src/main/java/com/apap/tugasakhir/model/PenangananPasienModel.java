package com.apap.tugasakhir.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "penanganan_pasien")
public class PenangananPasienModel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Column(name = "waktu_masuk", nullable = false)
	private Date waktuMasuk;
	
	@NotNull
	@Column(name = "waktu_update", nullable = false)
	private Date waktuUpdate;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "keterangan", nullable = false)
	private String keterangan;
	
//	@OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id")
//    private DetailPenangananModel detailPenanganan;

	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPasien")
    private PasienModel pasien;
	
//	@OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "idDokter")
//    private DokterModel dokter;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idStatus")
    private StatusModel status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getWaktuMasuk() {
		return waktuMasuk;
	}

	public void setWaktuMasuk(Date waktuMasuk) {
		this.waktuMasuk = waktuMasuk;
	}

	public Date getWaktuUpdate() {
		return waktuUpdate;
	}

	public void setWaktuUpdate(Date waktuUpdate) {
		this.waktuUpdate = waktuUpdate;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	public PasienModel getPasien() {
		return pasien;
	}

	public void setPasien(PasienModel pasien) {
		this.pasien = pasien;
	}

	public StatusModel getStatus() {
		return status;
	}

	public void setStatus(StatusModel status) {
		this.status = status;
	}
	
	
		
}