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

    @ApiOperation(value = "查询购物车商品列表")
    @PostMapping("select")
    public ApiResult select() {
        List<SysUser> dShoppingCartList = sysUserService.selectAll();
        return ApiResult.ok(dShoppingCartList);
    }


}

