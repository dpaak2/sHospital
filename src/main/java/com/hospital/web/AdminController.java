package com.hospital.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(PatientController.class);
@RequestMapping("/login")
	public String goLogin() {
	logger.info("AdminController -goLogin() {}","ENTER"); /*최소한 여기까진 들어왔다 라는걸 보여줌 */
	return "public:common/loginForm";
	}
}
