package com.liang.test;

import com.liang.ServiceAdminApplication;
import com.liang.entity.TbSysUser;
import com.liang.service.TbSysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

/**
 * @author Liangxp
 * @date 2019/12/20 15:28
 */
@SpringBootTest(classes = ServiceAdminApplication.class)
@RunWith(SpringRunner.class)
@ActiveProfiles(value = "dev")
public class TbSysUserServiceTest {
    @Autowired
    private TbSysUserService tbSysUserService;

    @Test
    public void login() {
        TbSysUser tbSysUser = new TbSysUser();
        tbSysUser.setUserCode(UUID.randomUUID().toString().replaceAll("-",""));
        tbSysUser.setLoginCode("liang");
        tbSysUser.setUserName("梁效平");
        tbSysUser.setPassword("111111");
        tbSysUser.setUserType("系统管理员");
        tbSysUser.setMgrType("1");
        tbSysUserService.insert(tbSysUser);
    }


    @Test
    public void insert(){

    }
}
