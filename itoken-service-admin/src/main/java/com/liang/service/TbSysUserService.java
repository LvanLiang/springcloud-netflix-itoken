package com.liang.service;

import com.liang.entity.TbSysUser;
    /**
 * @author Liangxp
 * @date 2019/12/20 11:40
 */
public interface TbSysUserService{

    int deleteById(String userCode);

    int insert(TbSysUser record);

    TbSysUser getById(String userCode);

    int updateById(TbSysUser record);

}
