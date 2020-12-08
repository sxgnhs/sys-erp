package com.sxgnhs.user.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sxgnhs.user.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author sxgn
 * @since 2020-12-08
 */
@Mapper
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {


    int updateUser(@Param("id") Long id);
}
