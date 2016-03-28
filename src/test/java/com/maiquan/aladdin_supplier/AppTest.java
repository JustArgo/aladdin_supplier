package com.maiquan.aladdin_supplier;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.maiquan.aladdin_supplier.service.ISupplierService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("applicationContext-supplier.xml")
public class AppTest {
  
	private ISupplierService supplierService;
	
	@Before
	public void setUp(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-supplier.xml");
		supplierService = ctx.getBean(ISupplierService.class);
		
	}
	
	@Test
	public void testGetSupplier(){
		supplierService.getSupplier(2, UUID.randomUUID().toString().replace("-", ""));
	}
	
}
