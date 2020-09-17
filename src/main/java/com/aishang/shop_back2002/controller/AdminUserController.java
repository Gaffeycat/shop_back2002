package com.aishang.shop_back2002.controller;

import com.aishang.shop_back2002.po.Adminuser;
import com.aishang.shop_back2002.service.AdminUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author admin
 */
@RestController
@RequestMapping("/admin")
public class AdminUserController {
    @Resource
    private AdminUserService adminUserService;

    @RequestMapping("/getAll")
    public List<Adminuser> getAll(){
        return adminUserService.getAll();
    }
}
