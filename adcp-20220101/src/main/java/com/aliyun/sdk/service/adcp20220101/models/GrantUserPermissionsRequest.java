// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantUserPermissionsRequest} extends {@link RequestModel}
 *
 * <p>GrantUserPermissionsRequest</p>
 */
public class GrantUserPermissionsRequest extends Request {
    @Query
    @NameInMap("Permissions")
    private java.util.List < Permissions> permissions;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private GrantUserPermissionsRequest(Builder builder) {
        super(builder);
        this.permissions = builder.permissions;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantUserPermissionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return permissions
     */
    public java.util.List < Permissions> getPermissions() {
        return this.permissions;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GrantUserPermissionsRequest, Builder> {
        private java.util.List < Permissions> permissions; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GrantUserPermissionsRequest request) {
            super(request);
            this.permissions = request.permissions;
            this.userId = request.userId;
        } 

        /**
         * The list of permissions that you want to grant to the RAM user.
         */
        public Builder permissions(java.util.List < Permissions> permissions) {
            String permissionsShrink = shrink(permissions, "Permissions", "json");
            this.putQueryParameter("Permissions", permissionsShrink);
            this.permissions = permissions;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GrantUserPermissionsRequest build() {
            return new GrantUserPermissionsRequest(this);
        } 

    } 

    public static class Permissions extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("IsRamRole")
        private Boolean isRamRole;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("RoleName")
        @Validation(required = true)
        private String roleName;

        @NameInMap("RoleType")
        @Validation(required = true)
        private String roleType;

        private Permissions(Builder builder) {
            this.clusterId = builder.clusterId;
            this.isRamRole = builder.isRamRole;
            this.namespace = builder.namespace;
            this.roleName = builder.roleName;
            this.roleType = builder.roleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permissions create() {
            return builder().build();
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

        public static final class Builder {
            private String clusterId; 
            private Boolean isRamRole; 
            private String namespace; 
            private String roleName; 
            private String roleType; 

            /**
             * The master instance ID.
             * <p>
             * 
             * *   When the role_type parameter is set to all-clusters, set the parameter to an empty string.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The entity to which the permissions are granted. A value of `true` indicates that the permissions are granted to a RAM user. A value of `false` indicates that the permissions are granted to a RAM role.
             */
            public Builder isRamRole(Boolean isRamRole) {
                this.isRamRole = isRamRole;
                return this;
            }

            /**
             * The namespace to which the permissions are scoped. By default, this parameter is empty when you set RoleType to cluster.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The predefined role that you want to assign. Valid values:
             * <p>
             * 
             * *   admin: the administrator role.
             * *   dev: the developer role.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The authorization type. Valid values:
             * <p>
             * 
             * *   cluster: specifies that the permissions are scoped to a master instance.
             * *   namespace: specifies that the permissions are scoped to a namespace of a cluster.
             * *   all-clusters: specifies that the permissions are scoped to all master instances.
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
}
