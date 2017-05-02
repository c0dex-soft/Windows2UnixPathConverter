package com.purplemagic.win2unix.service;

import org.springframework.stereotype.Service;

@Service
public class PathService {
	
	public String convertToUnix (String winPath) {
		String unixPath = winPath.replace("\\", "/").replace(" ", "\\ ");
		return unixPath;
	}

}
