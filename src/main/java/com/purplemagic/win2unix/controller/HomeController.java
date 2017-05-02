package com.purplemagic.win2unix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.purplemagic.win2unix.model.Path;
import com.purplemagic.win2unix.service.PathService;

@Controller
public class HomeController {

	@Autowired
	PathService pathService;

	@RequestMapping(value = "/")
	public String showHome() {
		return "home";
	}

	@RequestMapping(value = "/convert", method = RequestMethod.POST)
	@ResponseBody
	public Path convertWinToUnixPost(Model model, Path address) {
		Path unixPath = new Path();
		unixPath.setUnixPath(pathService.convertToUnix(address.getWinPath()));
		return unixPath;
	}

	@RequestMapping(value = "/convert")
	@ResponseBody
	public Path convertWinToUnixGet(Model model, @RequestParam("dosAddress") String winPath) {
		Path unixPath = new Path();
		unixPath.setUnixPath(pathService.convertToUnix(winPath));
		return unixPath;
	}

}
