// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckRoleRequest} extends {@link RequestModel}
 *
 * <p>CheckRoleRequest</p>
 */
public class CheckRoleRequest extends Request {
    @Query
    @NameInMap("RoleType")
    private String roleType;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private CheckRoleRequest(Builder builder) {
        super(builder);
        this.roleType = builder.roleType;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<CheckRoleRequest, Builder> {
        private String roleType; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CheckRoleRequest request) {
            super(request);
            this.roleType = request.roleType;
            this.securityToken = request.securityToken;
        } 

        /**
         * RoleType.
         */
        public Builder roleType(String roleType) {
            this.putQueryParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public CheckRoleRequest build() {
            return new CheckRoleRequest(this);
        } 

    } 

}
