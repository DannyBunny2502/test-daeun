package com.home.uhd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "�̰Ž� ���� daeun local branch���� �����ϴ� controller�Դϴ�.";
	}
}