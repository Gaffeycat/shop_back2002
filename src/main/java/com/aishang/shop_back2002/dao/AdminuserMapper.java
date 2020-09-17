package com.aishang.shop_back2002.dao;

import com.aishang.shop_back2002.po.Adminuser;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.MyMapper;

import java.util.List;

/**
 * @author admin
 */
@Mapper
public interface AdminuserMapper extends MyMapper<Adminuser> {

    List<Adminuser> getAll();
}