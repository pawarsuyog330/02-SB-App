package com.ashokit.hello.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class EmailBean {

	@Autowired
	ApplicationArguments args;
	
	List<String> blockedGmailList = new ArrayList<>();
	
	public List<String> getBlockedGmailIds()
	{
		args.getNonOptionArgs().forEach(value->
		{
			if(value.endsWith("gmail.com"))
			{
				blockedGmailList.add(value);
			}
		});
		
		return blockedGmailList;
	}
}
