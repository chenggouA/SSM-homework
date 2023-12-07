package com.chenggou.ssm.homework.dao;

import com.chenggou.ssm.homework.entity.BuyerOrders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BuyerOrdersDao {

    @Select("select * from buyerorders")
    public List<BuyerOrders> selectAll();
}
