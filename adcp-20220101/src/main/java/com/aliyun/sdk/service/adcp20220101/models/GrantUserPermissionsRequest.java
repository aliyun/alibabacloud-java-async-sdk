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
         * Permissions.
         */
        public Builder permissions(java.util.List < Permissions> permissions) {
            String permissionsShrink = shrink(permissions, "Permissions", "json");
            this.putQueryParameter("Permissions", permissionsShrink);
            this.permissions = permissions;
            return this;
        }

        /**
         * UserId.
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
            private String namespace; 
            private String roleName; 
            private String roleType; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * RoleType.
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
