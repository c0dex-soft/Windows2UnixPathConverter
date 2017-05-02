package com.purplemagic.dos2unix.model;

public class Address {

	private String dosAddress;
	private String unixAddress;

	public String getDosAddress() {
		return dosAddress;
	}

	public void setDosAddress(String dosAddress) {
		this.dosAddress = dosAddress;
	}

	public String getUnixAddress() {
		return unixAddress;
	}

	public void setUnixAddress(String unixAddress) {
		this.unixAddress = unixAddress;
	}

}
