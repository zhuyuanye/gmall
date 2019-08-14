package com.zyy.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zyy.gmall.service.UserService;
import com.zyy.gmall.bean.UmsMember;
import com.zyy.gmall.bean.UmsMemberReceiveAddress;
import com.zyy.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.zyy.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    public List<UmsMemberReceiveAddress> getReceiveAddressByMember(String memberId) {
        //封装参数对象
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddressList;
    }

    public List<UmsMember> getAll() {
       List<UmsMember> umsMemberList = userMapper.selectAll();
       return umsMemberList;
    }

}
