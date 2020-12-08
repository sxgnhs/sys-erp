package com.sxgnhs.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author sxgn
 * @since 2020-12-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysUser对象", description="用户表")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户姓名--例如张三")
    private String username;

    @ApiModelProperty(value = "登录用户名")
    private String loginName;

    @ApiModelProperty(value = "登陆密码")
    private String password;

    @ApiModelProperty(value = "职位")
    private String position;

    @ApiModelProperty(value = "所属部门")
    private String department;

    @ApiModelProperty(value = "电子邮箱")
    private String email;

    @ApiModelProperty(value = "手机号码")
    private String phonenum;

    @ApiModelProperty(value = "是否为管理者 0==管理者 1==员工")
    private Integer ismanager;

    @ApiModelProperty(value = "是否系统自带数据 ")
    private Integer isystem;

    @ApiModelProperty(value = "状态，0：正常，1：删除，2封禁")
    @TableField("Status")
    private Integer Status;

    @ApiModelProperty(value = "用户描述信息")
    private String description;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "租户id")
    private Long tenantId;


}
