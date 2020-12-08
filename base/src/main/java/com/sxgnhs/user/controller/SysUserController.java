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
    @GetMapping("")
    public ApiResult selectAll() {
        List<SysUser> sysUserList = sysUserService.selectAll();
        return ApiResult.ok(sysUserList);
    }


    @ApiOperation(value = "根据id获取用户")
    @GetMapping("{id}")
    public ApiResult getUser(@PathVariable("id") Long id) {
        SysUser sysUser = sysUserService.getUser(id);
        return ApiResult.ok(sysUser);
    }

    @ApiOperation(value = "根据id修改用户")
    @PutMapping("{id}")
    public ApiResult updateUserById(@PathVariable("id") Long id) {
        SysUser sysUser = sysUserService.updateUserById(id);
        return ApiResult.ok(sysUser);
    }

    @ApiOperation(value = "修改用户")
    @PutMapping()
    public ApiResult updateUser(@RequestBody SysUser sysUser) {
        int re = sysUserService.updateUser(sysUser);
        return ApiResult.ok(re);
    }

    @ApiOperation(value = "新增用户")
    @PostMapping()
    public ApiResult addUser(@RequestBody SysUser sysUser) {
        int re = sysUserService.addUser(sysUser);
        return ApiResult.ok(re);
    }

    @ApiOperation(value = "根据id删除用户")
    @DeleteMapping("{id}")
    public ApiResult delUser(@PathVariable("id") Long id) {
        int sysUser = sysUserService.delUser(id);
        return ApiResult.ok(sysUser);
    }


}

