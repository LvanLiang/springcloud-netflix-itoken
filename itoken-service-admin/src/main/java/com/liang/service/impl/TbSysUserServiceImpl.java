package com.liang.service.impl;

import com.liang.entity.TbSysUser;
import com.liang.mapper.TbSysUserMapper;
import com.liang.service.TbSysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * @author Liangxp
 * @date 2019/12/20 11:40
 */
@Service
public class TbSysUserServiceImpl implements TbSysUserService{

    @Resource
    private TbSysUserMapper tbSysUserMapper;

    @Override
    public int deleteById(String userCode) {
        return tbSysUserMapper.deleteById(userCode);
    }

    @Override
    public int insert(TbSysUser record) {
        return tbSysUserMapper.insert(record);
    }

    @Override
    public TbSysUser getById(String userCode) {
        return tbSysUserMapper.getById(userCode);
    }

    @Override
    public int updateById(TbSysUser record) {
        return tbSysUserMapper.updateById(record);
    }

}
