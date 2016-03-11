package com.maiquan.aladdin_supplier.service.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.maiquan.aladdin_supplier.domain.Supplier;
import com.maiquan.aladdin_supplier.mapper.SupplierMapper;
import com.maiquan.aladdin_supplier.service.ISupplierService;
import com.maiquan.aladdin_supplier.util.LogUtil;

public class SupplierServiceImpl implements ISupplierService{

	@Autowired
	private SupplierMapper supplierMapper;
	
	@Override
	public Supplier getSupplier(Integer supplierID, String requestID) {
		
		LogUtil.logInput("供应商微服务", "getSupplier", requestID, supplierID);
		
		Supplier supplier = supplierMapper.selectByPrimaryKey(supplierID);
		System.out.println("supplierID:--"+supplierID+"       "+supplier);
		
		LogUtil.logOutput("供应商微服务", "getSupplier", requestID, supplier);
		
		return supplier;
	}

}
