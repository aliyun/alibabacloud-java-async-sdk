// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantUserPermissionRequest} extends {@link RequestModel}
 *
 * <p>GrantUserPermissionRequest</p>
 */
public class GrantUserPermissionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsRamRole")
    private Boolean isRamRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The cluster ID.
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
         * The name of the namespace.
         * <p>
         * 
         * *   If **RoleType** is set to **cluster**, you do not need to specify this parameter.
         * *   This parameter is required if **RoleType** is set to **namespace**.
         * *   If **RoleType** is set to **namespace** and **RoleName** is set to **gitops-dev**, this parameter is required and must be set to **argocd**.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The predefined role. Valid values:
         * <p>
         * 
         * *   admin: administrator
         * *   dev: developer
         * *   gitops-dev: GitOps developer. The parameter is available only for Fleet instances.
         * 
         * The value of RoleName and that of RoleType must meet the following requirements:
         * 
         * *   If **RoleType** is set to **cluster**, this parameter must be set to **admin**.
         * *   If **RoleType** is set to **namespace**, this parameter must be set to **dev** or **gitops-dev**.
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * The authorization type. Valid values:
         * <p>
         * 
         * *   cluster: The permissions are granted to a cluster.
         * *   namespace: The permissions are granted to a namespace of a cluster.
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
