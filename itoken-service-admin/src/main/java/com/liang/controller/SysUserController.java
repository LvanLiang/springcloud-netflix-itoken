package com.liang.controller;

import com.liang.entity.TbSysUser;
import com.liang.service.TbSysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Liangxp
 * @date 2019/12/20 15:24
 */
@ResponseBody
@RequestMapping("/user")
public class SysUserController {
    private TbSysUserService tbSysUserService;

    public SysUserController(TbSysUserService tbSysUserService) {
        this.tbSysUserService = tbSysUserService;
    }

    @GetMapping(value = "/getById/{id}")
    public TbSysUser getById(@PathVariable("id") String id){
        return tbSysUserService.getById(id);
    }
}
