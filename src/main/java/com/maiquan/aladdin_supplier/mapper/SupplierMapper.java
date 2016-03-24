package com.maiquan.aladdin_supplier.mapper;

import java.util.List;

import com.maiquan.aladdin_supplier.domain.Supplier;

public interface SupplierMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
    
    List<Supplier> selectSupplierListByIDs(Integer... ids);
    
}