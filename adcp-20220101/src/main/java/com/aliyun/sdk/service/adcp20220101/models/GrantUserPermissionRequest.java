// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantUserPermissionRequest} extends {@link RequestModel}
 *
 * <p>GrantUserPermissionRequest</p>
 */
public class GrantUserPermissionRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("IsRamRole")
    private Boolean isRamRole;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("RoleName")
    @Validation(required = true)
    private String roleName;

    @Query
    @NameInMap("RoleType")
    @Validation(required = true)
    private String roleType;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private GrantUserPermissionRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.isRamRole = builder.isRamRole;
        this.namespace = builder.namespace;
        this.roleName = builder.roleName;
        this.roleType = builder.roleType;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantUserPermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return isRamRole
     */
    public Boolean getIsRamRole() {
        return this.isRamRole;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GrantUserPermissionRequest, Builder> {
        private String clusterId; 
        private Boolean isRamRole; 
        private String namespace; 
        private String roleName; 
        private String roleType; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GrantUserPermissionRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.isRamRole = request.isRamRole;
            this.namespace = request.namespace;
            this.roleName = request.roleName;
            this.roleType = request.roleType;
            this.userId = request.userId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The entity to which the permissions are granted. A value of `true` indicates that the permissions are granted to a RAM user. A value of `false` indicates that the permissions are granted to a RAM role.
         */
        public Builder isRamRole(Boolean isRamRole) {
            this.putQueryParameter("IsRamRole", isRamRole);
            this.isRamRole = isRamRole;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The predefined role that you want to assign. Valid values:
         * <p>
         * 
         * *   admin: the administrator role.
         * *   dev: the developer role.
         * 
         * Enumerated values:
         * 
         * *   arms-admin
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   dev
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   admin
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
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
         * The ID of the RAM user or RAM role.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GrantUserPermissionRequest build() {
            return new GrantUserPermissionRequest(this);
        } 

    } 

}
