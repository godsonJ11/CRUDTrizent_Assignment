package com.createteble.mysql.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class TableCreating {
	
	private String eName;
	@Id
	private String eEmail;
	
    private String cAddress;
	
	private String pAddress;

	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteEmail() {
		return eEmail;
	}
	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	@Override
	public String toString() {
		return "TableCreating [eName=" + eName + ", eEmail=" + eEmail + ", cAddress=" + cAddress + ", pAddress="
				+ pAddress + "]";
	}
	

	}

