package com.kyp.memories.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kyp.memories.VO.UserVO;
import com.kyp.memories.service.UserService;

/*
 * ���� ��Ʈ�ѷ�
 * ������ �̵�
 * �α��� ����
 * 
*/
@Controller
@RequestMapping("/")
public class MainController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String main() {
		
		/*
		 * UserVO userVO = new UserVO();
		 * 
		 * List<UserVO> results = userService.getUsers();
		 * 
		 * for(UserVO vo : results) { System.out.println("����� : "+vo.getNM()); }
		 */
		
		return "main";
	}

}
