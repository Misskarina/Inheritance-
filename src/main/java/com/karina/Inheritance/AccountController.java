package com.karina.Inheritance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@Autowired
	AccountRepository arepo;
	
	@RequestMapping("/test")
	public String test()
	{
		return"program tested";
	}
	
	@RequestMapping("/save")
	public String save()
	{
		Account a=new Account();
		CreditCard c=new CreditCard();
		DebitCard d=new DebitCard();
		
		a.setHoldername("Shreya kumari");
		a.setGender("Female");
		a.setAccountno(56372892396d);
		
		c.setAccountno(63546274125126d);
		c.setHoldername("Aditi Sinha");
		c.setGender("Female");
		c.setCardno(765327842369725d);
		c.setCreditlimit("234k");
		
		d.setAccountno(6236128718297d);
		d.setHoldername("Akshat Sharma");
		d.setGender("Male");
		d.setDebitno(4237672387812d);
		d.setOverdraft(982649821d);
		
		arepo.save(a);
		arepo.save(c);
		arepo.save(d);
		
		return"data inserted";
	}
}
