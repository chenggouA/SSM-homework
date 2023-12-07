package com.chenggou.ssm.homework.controller;

import com.chenggou.ssm.homework.dao.BuyerOrdersDao;
import com.chenggou.ssm.homework.entity.BuyerOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BuyerOrdersController {
    @Autowired
    BuyerOrdersDao buyerOrdersDao;

    @RequestMapping("/buyerOrders")
    @ResponseBody
    public List<BuyerOrders> getAllOrders(){
        List<BuyerOrders> buyerOrders = buyerOrdersDao.selectAll();
        return buyerOrders;

    }
}
