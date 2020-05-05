package com.infydemo.Sales.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.infydemo.Sales.Repository.SalesRepository;
import com.infydemo.Sales.entity.SaleOrders;

@Service
public class SalesOrderService
{
	@Autowired
	SalesRepository salesRepository;
	
	public SaleOrders getSales(Integer id)
	{
        return  salesRepository.findById(id).get();
    }

	public String addSalesOrder(SaleOrders sales)
	{
		SaleOrders addsales=salesRepository.save(sales);
		return "Successfully inserted";
	}
	public SaleOrders updatesalesOrder(SaleOrders sales){

	        salesRepository.save(sales);
	        return sales;
	    }
		public List<SaleOrders> getAllOrders(){
	        return (List<SaleOrders>) salesRepository.findAll();
	    }

		
	    public String addAllsalesOrders(@RequestBody List<SaleOrders> salesList){
	        salesRepository.saveAll(salesList);
	        return "SUCCESS";
	    }
		
	 public String deleteSalesOrder(Integer id){
	       salesRepository.deleteById(id);
	       return "row deleted";
	    }
}