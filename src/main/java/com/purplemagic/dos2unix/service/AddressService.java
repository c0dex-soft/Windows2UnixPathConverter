package com.purplemagic.dos2unix.service;

import org.springframework.stereotype.Service;

@Service
public class AddressService {
	
	public String convertToUnix (String dosAddress) {
		String unixAddress = dosAddress.replace("\\", "/").replace(" ", "\\ ");
		return unixAddress;
	}

}
