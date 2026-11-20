// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UserListItemDTO} extends {@link TeaModel}
 *
 * <p>UserListItemDTO</p>
 */
public class UserListItemDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("departments")
    private java.util.List<UserDepartmentDTO> departments;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("loginName")
    private String loginName;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    private UserListItemDTO(Builder builder) {
        this.departments = builder.departments;
        this.gmtCreate = builder.gmtCreate;
        this.id = builder.id;
        this.loginName = builder.loginName;
        this.name = builder.name;
        this.phone = builder.phone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserListItemDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return departments
     */
    public java.util.List<UserDepartmentDTO> getDepartments() {
        return this.departments;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return loginName
     */
    public String getLoginName() {
        return this.loginName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    public static final class Builder {
        private java.util.List<UserDepartmentDTO> departments; 
        private String gmtCreate; 
        private Long id; 
        private String loginName; 
        private String name; 
        private String phone; 

        private Builder() {
        } 

        private Builder(UserListItemDTO model) {
            this.departments = model.departments;
            this.gmtCreate = model.gmtCreate;
            this.id = model.id;
            this.loginName = model.loginName;
            this.name = model.name;
            this.phone = model.phone;
        } 

        /**
         * <p>The list of departments and roles to which the user belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder departments(java.util.List<UserDepartmentDTO> departments) {
            this.departments = departments;
            return this;
        }

        /**
         * <p>The creation time in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-01 10:00:00</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The logon name.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        public Builder loginName(String loginName) {
            this.loginName = loginName;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>13800000000</p>
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserListItemDTO build() {
            return new UserListItemDTO(this);
        } 

    } 

}
