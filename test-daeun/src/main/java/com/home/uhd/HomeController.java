package com.home.uhd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
    EmpMapper empMapper;
	
	@RequestMapping("/")
	public String index() {
		return "�̰Ž� ���� daeun local branch���� �����ϴ� controller�Դϴ�.";
	}
	
	@RequestMapping(path = "/test")
    public String show(Model model) {
        DTO dto = empMapper.findAll();
        
        return dto.getEmp();
    }
}