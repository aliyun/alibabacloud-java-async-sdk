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
 * {@link ModelRouterSetUserRolesRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterSetUserRolesRequest</p>
 */
public class ModelRouterSetUserRolesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("departmentRoles")
    private java.util.List<DepartmentRoleCmd> departmentRoles;

    private ModelRouterSetUserRolesRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.departmentRoles = builder.departmentRoles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterSetUserRolesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return departmentRoles
     */
    public java.util.List<DepartmentRoleCmd> getDepartmentRoles() {
        return this.departmentRoles;
    }

    public static final class Builder extends Request.Builder<ModelRouterSetUserRolesRequest, Builder> {
        private Long id; 
        private java.util.List<DepartmentRoleCmd> departmentRoles; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterSetUserRolesRequest request) {
            super(request);
            this.id = request.id;
            this.departmentRoles = request.departmentRoles;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * departmentRoles.
         */
        public Builder departmentRoles(java.util.List<DepartmentRoleCmd> departmentRoles) {
            this.putBodyParameter("departmentRoles", departmentRoles);
            this.departmentRoles = departmentRoles;
            return this;
        }

        @Override
        public ModelRouterSetUserRolesRequest build() {
            return new ModelRouterSetUserRolesRequest(this);
        } 

    } 

}
