package com.zyy.gmall.service;

import com.zyy.gmall.bean.UmsMember;
import com.zyy.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    // ums_member增删改查
    List<UmsMember> getAll();



    // ums_member_receive_address增删改查
    List<UmsMemberReceiveAddress> getReceiveAddressByMember(String memberId);
}
