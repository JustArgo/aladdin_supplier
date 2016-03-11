package com.maiquan.aladdin_supplier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Start 
{
	public static void main(String[] args) throws Exception{
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		context.start();
		System.out.println("供应商微服务启动");
		while(true){
			Thread.sleep(1000);
		}
		
	}
}
