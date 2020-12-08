package com.sxgnhs.user.controller;


import com.sxgnhs.api.ApiResult;
import com.sxgnhs.user.entity.SysUser;
import com.sxgnhs.user.service.SysUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @ApiOperation(value = "获取全部用户")
    @GetMapping("selectAll")
    public ApiResult selectAll() {
        List<SysUser> sysUserList = sysUserService.selectAll();
        return ApiResult.ok(sysUserList);
    }

    @ApiOperation(value = "根据loginName获取用户")
    @GetMapping("selectByName/{loginName}")
    public ApiResult selectByName(@PathVariable("loginName") String loginName) {
        SysUser sysUser = sysUserService.selectByName(loginName);
        return ApiResult.ok(sysUser);
    }

    @ApiOperation(value = "根据id获取用户")
    @GetMapping("selectById/{id}")
    public ApiResult selectById(@PathVariable("id") Long id) {
        SysUser sysUser = sysUserService.selectById(id);
        return ApiResult.ok(sysUser);
    }


}

