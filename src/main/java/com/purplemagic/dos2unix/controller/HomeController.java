package com.purplemagic.dos2unix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.purplemagic.dos2unix.model.Address;
import com.purplemagic.dos2unix.service.AddressService;

@Controller
public class HomeController {

	@Autowired
	AddressService addressService;

	@RequestMapping(value = "/")
	public String showHome() {
		return "home";
	}

	@RequestMapping(value = "/convert", method = RequestMethod.POST)
	@ResponseBody
	public Address convertDosToUnixPost(Model model, Address address) {
		Address unixAddress = new Address();
		unixAddress.setUnixAddress(addressService.convertToUnix(address.getDosAddress()));
		return unixAddress;
	}

	@RequestMapping(value = "/convert")
	@ResponseBody
	public Address convertDosToUnixGet(Model model, @RequestParam("dosAddress") String dosAddress) {
		Address unixAddress = new Address();
		unixAddress.setUnixAddress(addressService.convertToUnix(dosAddress));
		return unixAddress;
	}

}
