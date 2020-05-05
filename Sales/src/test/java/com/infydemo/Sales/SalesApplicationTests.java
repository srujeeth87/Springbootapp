package com.infydemo.Sales;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.infydemo.Sales.Repository.SalesRepository;
import com.infydemo.Sales.entity.SaleOrders;


//@RunWith(SpringRunner.class)
@SpringBootTest
class SalesApplicationTests {

	@Autowired
	private SalesRepository salesRepository;
	
	@Test
	void getsalestest() throws ParseException
	{
		SaleOrders sales=new SaleOrders(2,8, new Date(), 100, "on the way",new SimpleDateFormat("dd/MM/yyyy").parse("25/04/2020"),"clothes");
		salesRepository.save(sales);
		assertEquals(8, sales.getstore_id());
		SaleOrders sales1 =new SaleOrders(2,10,new Date(),150,"order delayed",new SimpleDateFormat("dd/MM/yyyy").parse("15/06/2020"),"toys");
		salesRepository.save(sales1);
		salesRepository.delete(sales);
		salesRepository.delete(sales1);
		assertFalse(salesRepository.existsById(sales.getOrder_id()));
		assertFalse(salesRepository.existsById(sales1.getOrder_id()));
		
	}

	
	
	
	
	
	
	
	
	
	
//	@Test
//	public void testAllOrders() 
//    {
//        assertTrue(
//                this.salesRepository
//                    .count() == 2);
//       
//    }
// 

}
