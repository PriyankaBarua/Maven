package com.lti.finance.test;

import java.util.Random;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.lti.finance.dao.LoginDAO;
import com.lti.finance.dto.EmiCard;
import com.lti.finance.dto.LoginDTO;
import com.lti.finance.entity.Register;
import com.lti.finance.service.EmiCardService;

public class EmiCardTest {

	@Test
	public void test() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
		EmiCardService s = ctx.getBean(EmiCardService.class);
		LoginDAO loginDAO = ctx.getBean(LoginDAO.class);
		
		LoginDTO l = new LoginDTO();
		l.setusername("megha_123");
		l.setpassword("megha123A2");
		Register r = loginDAO.login(l);
		
		EmiCard emicard = new EmiCard();
		Random random = new Random();
		int cvv = random.nextInt(900) + 100;
		for(int i = 0; i <=1; i++)
        {
            System.out.println("Random Doubles : "+random.nextDouble());
        }
		int cno = 1000000000 + new Random().nextInt(900000000);
		System.out.println(cvv);
		System.out.println(cno);

		emicard.setCvv(cvv);
		emicard.setMin_limit(60000);
		emicard.setRegister(r);
		emicard.setCard_id(cno);
		s.emicardDetail(emicard, null);
	}

}
