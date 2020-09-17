package com.aishang.shop_back2002.service.impl;

import com.aishang.shop_back2002.dao.AdminuserMapper;
import com.aishang.shop_back2002.po.Adminuser;
import com.aishang.shop_back2002.service.AdminUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author admin
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Resource
    private AdminuserMapper adminuserMapper;
    @Override
    public List<Adminuser> getAll() {
        return adminuserMapper.getAll() ;
    }
}
