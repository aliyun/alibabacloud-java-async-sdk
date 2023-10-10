// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeRoleRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeRoleRequest</p>
 */
public class AuthorizeRoleRequest extends Request {
    @Query
    @NameInMap("RoleIds")
    @Validation(required = true)
    private String roleIds;

    @Query
    @NameInMap("TargetUserId")
    @Validation(required = true)
    private String targetUserId;

    private AuthorizeRoleRequest(Builder builder) {
        super(builder);
        this.roleIds = builder.roleIds;
        this.targetUserId = builder.targetUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return roleIds
     */
    public String getRoleIds() {
        return this.roleIds;
    }

    /**
     * @return targetUserId
     */
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public static final class Builder extends Request.Builder<AuthorizeRoleRequest, Builder> {
        private String roleIds; 
        private String targetUserId; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeRoleRequest request) {
            super(request);
            this.roleIds = request.roleIds;
            this.targetUserId = request.targetUserId;
        } 

        /**
         * The ID of the role to be assigned. If you want to assign multiple roles to the specified RAM user, separate the IDs of the roles with semicolons (;). If you leave this parameter empty, the roles assigned to the specified RAM user are revoked.
         */
        public Builder roleIds(String roleIds) {
            this.putQueryParameter("RoleIds", roleIds);
            this.roleIds = roleIds;
            return this;
        }

        /**
         * The ID of the RAM user to which you want to assign the roles.
         */
        public Builder targetUserId(String targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        @Override
        public AuthorizeRoleRequest build() {
            return new AuthorizeRoleRequest(this);
        } 

    } 

}
