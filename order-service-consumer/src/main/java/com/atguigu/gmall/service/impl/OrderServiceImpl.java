package com.atguigu.gmall.service.impl;


import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;

import java.util.List;

/**
 * @author HongYi
 * @version 1.0
 * @date 2022/7/3 23:03
 * @description: TODO
 */
public class OrderServiceImpl implements OrderService {


    UserService userService;

    @Override
    public void initOrder(String userId) {
        // TODO Auto-generated method stub
        //1、查询用户的收货地址
        final List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println("userAddressList = " + userAddressList);
    }
}
