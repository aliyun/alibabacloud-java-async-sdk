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
         * departments.
         */
        public Builder departments(java.util.List<UserDepartmentDTO> departments) {
            this.departments = departments;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * loginName.
         */
        public Builder loginName(String loginName) {
            this.loginName = loginName;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * phone.
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
