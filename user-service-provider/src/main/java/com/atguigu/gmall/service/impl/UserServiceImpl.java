package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author HongYi
 * @version 1.0
 * @date 2022/7/3 22:41
 * @description: TODO
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // todo
        UserAddress address1 = new UserAddress(1,"北京市昌平区宏福科技园综合楼3层","1","李老师","010-6003","Yes");
        UserAddress address2 = new UserAddress(2,"上海市青浦区重固镇中心小学","1","王老师","010-6103","Yes");
        return Arrays.asList(address1,address2);
    }
}
