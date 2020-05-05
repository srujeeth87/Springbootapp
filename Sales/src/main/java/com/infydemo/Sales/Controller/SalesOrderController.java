package com.infydemo.Sales.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.infydemo.Sales.Repository.SalesRepository;
import com.infydemo.Sales.Service.SalesOrderService;
import com.infydemo.Sales.entity.SaleOrders;

//@RequestMapping(value="/sales")
@RestController
public class SalesOrderController
{
	@Autowired
	private SalesOrderService salesService;
	@GetMapping("/salesinfo/{id}")
	SaleOrders getSales(@PathVariable Integer id)
	{
        return  salesService.getSales(id);
    }
	
	@PostMapping("/salesinfo")
	String addSalesOrder(@RequestBody SaleOrders sales)
	{
	
		return salesService.addSalesOrder(sales);
		
	}
	

	 @PutMapping("/salesinfo/update")
	SaleOrders updatesalesOrder(@RequestBody SaleOrders sales){

	        return salesService.updatesalesOrder(sales);
	    }

	 @GetMapping("/salesinfo")
	 List<SaleOrders> getAllOrders(){
	        return salesService.getAllOrders();
	    }
	@DeleteMapping("/salesinfo/{id}")
	 public String deleteSalesOrder(@PathVariable Integer id){
	       return salesService.deleteSalesOrder(id);
	    }
	@PostMapping("/salesorder/all")
    String addAllSalesOrder(@RequestBody List<SaleOrders> salesList){
        salesService.addAllsalesOrders(salesList);
        return "SUCCESS";
    }
	
	
}