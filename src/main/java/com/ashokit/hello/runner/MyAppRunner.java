package com.ashokit.hello.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ashokit.hello.bean.EmailBean;

@Component
public class MyAppRunner implements ApplicationRunner {

	@Autowired
	EmailBean emailBean;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*
		System.out.println("*********Non-option args*********");
		args.getNonOptionArgs().forEach(System.out::println);
		
		System.out.println("******Option Args*******");
		Set<String> optionArgsKeys = args.getOptionNames();
		optionArgsKeys.forEach(key->
		{
			System.out.println("key :" + key);
			System.out.println("value : ");
			args.getOptionValues(key).forEach(System.out::println);
			System.out.println("--------------------------");
		});
		
		*/
		
		System.out.println("******Blocked Gmail Ids*********");
		emailBean.getBlockedGmailIds().forEach(System.out::println);

	}

}
