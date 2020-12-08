package com.sxgnhs.user.controller;


import com.sun.deploy.net.HttpResponse;
import com.sxgnhs.user.service.SysUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author sxgn
 * @since 2020-12-08
 */
@RestController
@RequestMapping("/user/sys-user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;



}

