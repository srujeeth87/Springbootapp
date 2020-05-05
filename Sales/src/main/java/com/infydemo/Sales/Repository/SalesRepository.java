package com.infydemo.Sales.Repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.infydemo.Sales.entity.SaleOrders;

@Repository
public interface SalesRepository extends CrudRepository<SaleOrders,Integer >
{
	
}