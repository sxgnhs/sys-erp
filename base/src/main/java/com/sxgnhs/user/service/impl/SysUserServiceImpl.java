package com.sxgnhs.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sxgnhs.user.entity.SysUser;
import com.sxgnhs.user.mapper.SysUserMapper;
import com.sxgnhs.user.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
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
        return sysUserMapper.selectList(wrapper);
    }



    @Override
    public SysUser getUser(Long id) {
        QueryWrapper<SysUser> wrapper = new QueryWrapper();
        wrapper.eq("id", id);
        return sysUserMapper.selectOne(wrapper);
    }

    @Override
    public SysUser updateUserById(Long id) {
        QueryWrapper<SysUser> wrapper = new QueryWrapper();
        wrapper.eq("id", id);
        SysUser sysUser = sysUserMapper.selectOne(wrapper);
        if (sysUser!=null){
            int res = sysUserMapper.updateUser(id);
        }
        SysUser newUser = sysUserMapper.selectOne(wrapper);

        return newUser;
    }

    @Override
    public int delUser(Long id) {
        QueryWrapper<SysUser> wrapper = new QueryWrapper();
        wrapper.eq("id", id);
        return sysUserMapper.delete( wrapper);
    }

    @Override
    public int updateUser(SysUser sysUser) {
        QueryWrapper<SysUser> wrapper = new QueryWrapper();
        wrapper.eq("id", sysUser.getId());
        return sysUserMapper.update(sysUser, wrapper);
    }

    @Override
    public int addUser(SysUser sysUser) {

        return  sysUserMapper.insert(sysUser);
    }
}
