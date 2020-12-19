package com.test.pw.shibernate.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysUser extends BaseBean{

    private static final long serialVersionUID = -4428080917233935351L;
    private int userId;
    private String username;
    private String createdBy;
    private Date createdDate;

}
