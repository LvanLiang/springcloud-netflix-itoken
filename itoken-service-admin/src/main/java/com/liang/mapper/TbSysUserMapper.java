package com.liang.mapper;

import com.liang.entity.TbSysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Liangxp
 * @date 2019/12/20 11:40
 */
@Mapper
public interface TbSysUserMapper {
    int deleteById(String userCode);

    int insert(TbSysUser record);

    TbSysUser getById(String userCode);

    int updateById(TbSysUser record);

}