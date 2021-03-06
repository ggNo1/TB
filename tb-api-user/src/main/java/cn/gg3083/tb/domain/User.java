package cn.gg3083.tb.domain;

import cn.gg3083.tb.common.domain.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "user")
@Data
public class User extends BaseEntity {
    /**
     * 用户编号
     */
    @Id
    @Column(name = "pk_user_id")
    private String pkUserId;

    /**
     * 登录姓名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 用户密码
     */
    @Column(name = "login_pwd")
    private String loginPwd;

    /**
     * 用户姓名
     */
    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_img")
    private String userImg;

    /**
     * 邮件
     */
    @Column(name = "user_email")
    private String userEmail;

    /**
     * 电话
     */
    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后修改时间(自动更新)
     */
    @Column(name = "update_time")
    private Date updateTime;

}