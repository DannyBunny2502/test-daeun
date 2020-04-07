package com.home.uhd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "이거슨 제가 daeun local branch에서 수정하는 controller입니다.";
	}
}