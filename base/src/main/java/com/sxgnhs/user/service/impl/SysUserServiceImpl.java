package com.sxgnhs.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sxgnhs.user.entity.SysUser;
import com.sxgnhs.user.mapper.SysUserMapper;
import com.sxgnhs.user.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author sxgn
 * @since 2020-12-08
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> selectAll() {
        QueryWrapper<SysUser> wrapper = new QueryWrapper();
        wrapper.ge("id", 100);
        return sysUserMapper.selectList(wrapper);
    }

    @Override
    public SysUser selectByName(String loginName) {
        QueryWrapper<SysUser> wrapper = new QueryWrapper();
        wrapper.eq("login_name", loginName);
        return sysUserMapper.selectOne(wrapper);
    }

    @Override
    public SysUser selectById(Long id) {
        QueryWrapper<SysUser> wrapper = new QueryWrapper();
        wrapper.eq("id", id);
        return sysUserMapper.selectOne(wrapper);
    }
}
