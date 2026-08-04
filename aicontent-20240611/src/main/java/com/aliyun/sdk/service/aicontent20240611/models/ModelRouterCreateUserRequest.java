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
 * {@link ModelRouterCreateUserRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterCreateUserRequest</p>
 */
public class ModelRouterCreateUserRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("departmentRoles")
    private java.util.List<DepartmentRoleCmd> departmentRoles;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("loginName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    private ModelRouterCreateUserRequest(Builder builder) {
        super(builder);
        this.departmentRoles = builder.departmentRoles;
        this.loginName = builder.loginName;
        this.name = builder.name;
        this.phone = builder.phone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterCreateUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return departmentRoles
     */
    public java.util.List<DepartmentRoleCmd> getDepartmentRoles() {
        return this.departmentRoles;
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

    public static final class Builder extends Request.Builder<ModelRouterCreateUserRequest, Builder> {
        private java.util.List<DepartmentRoleCmd> departmentRoles; 
        private String loginName; 
        private String name; 
        private String phone; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterCreateUserRequest request) {
            super(request);
            this.departmentRoles = request.departmentRoles;
            this.loginName = request.loginName;
            this.name = request.name;
            this.phone = request.phone;
        } 

        /**
         * departmentRoles.
         */
        public Builder departmentRoles(java.util.List<DepartmentRoleCmd> departmentRoles) {
            this.putBodyParameter("departmentRoles", departmentRoles);
            this.departmentRoles = departmentRoles;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        public Builder loginName(String loginName) {
            this.putBodyParameter("loginName", loginName);
            this.loginName = loginName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * phone.
         */
        public Builder phone(String phone) {
            this.putBodyParameter("phone", phone);
            this.phone = phone;
            return this;
        }

        @Override
        public ModelRouterCreateUserRequest build() {
            return new ModelRouterCreateUserRequest(this);
        } 

    } 

}
