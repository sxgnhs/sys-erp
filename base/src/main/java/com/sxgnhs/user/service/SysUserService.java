package com.sxgnhs.user.service;

import com.sxgnhs.user.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author sxgn
 * @since 2020-12-08
 */
public interface SysUserService extends IService<SysUser> {

    List<SysUser> selectAll();

}
