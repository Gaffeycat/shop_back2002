package com.aishang.shop_back2002.service;

import com.aishang.shop_back2002.po.Adminuser;

import java.util.List;

/**
 * @author admin
 */
public interface AdminUserService {
    /**
     * 获取全部admin记录
     * @return
     */
    List<Adminuser> getAll();
}
