package com.kyp.memories.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PictureController {
	
	@RequestMapping("/picture/main")
	public String videoMain() {
		
		return "board/pictureMain";
	}
}
