package com.zyy.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zyy.gmall.bean.UmsMember;
import com.zyy.gmall.bean.UmsMemberReceiveAddress;
import com.zyy.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    UserService userService;

    // 通过用mapper的条件查询，通过memberId查询用户的收获地址信息集合
    @RequestMapping("getReceiveAddressByMember")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMember(String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = userService.getReceiveAddressByMember(memberId);
        return umsMemberReceiveAddressList;

    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userService.getAll();
        return umsMemberList;
    }

}
