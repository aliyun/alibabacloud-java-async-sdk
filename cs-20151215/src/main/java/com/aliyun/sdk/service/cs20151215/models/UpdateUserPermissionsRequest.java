// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserPermissionsRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserPermissionsRequest</p>
 */
public class UpdateUserPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List < UpdateUserPermissionsRequestBody> body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    private UpdateUserPermissionsRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.body = builder.body;
        this.mode = builder.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserPermissionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return body
     */
    public java.util.List < UpdateUserPermissionsRequestBody> getBody() {
        return this.body;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    public static final class Builder extends Request.Builder<UpdateUserPermissionsRequest, Builder> {
        private String uid; 
        private java.util.List < UpdateUserPermissionsRequestBody> body; 
        private String mode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserPermissionsRequest request) {
            super(request);
            this.uid = request.uid;
            this.body = request.body;
            this.mode = request.mode;
        } 

        /**
         * The ID of the RAM user or RAM role whose permissions you want to update.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * The request body.
         */
        public Builder body(java.util.List < UpdateUserPermissionsRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * The authorization method. Valid values:
         * <p>
         * 
         * *   `apply`: updates all permissions of the RAM user or RAM role. If you use this method, the existing permissions of the RAM user or RAM role on the cluster are overwritten. You must specify all the permissions that you want to grant to the RAM user or RAM role in the request parameters when you call the operation.
         * *   `delete`: revokes the specified permissions from the RAM user or RAM role. If you use this method, only the permissions that you specify are revoked, other permissions of the RAM user or RAM role on the cluster are not affected.
         * *   `patch`: grants the specified permissions to the RAM user or role. If you use this method, only the permissions that you specify are granted, other permissions of the RAM user or RAM role on the cluster are not affected.
         * 
         * Default value: `apply`
         */
        public Builder mode(String mode) {
            this.putQueryParameter("mode", mode);
            this.mode = mode;
            return this;
        }

        @Override
        public UpdateUserPermissionsRequest build() {
            return new UpdateUserPermissionsRequest(this);
        } 

    } 

    public static class UpdateUserPermissionsRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("is_custom")
        private Boolean isCustom;

        @com.aliyun.core.annotation.NameInMap("is_ram_role")
        private Boolean isRamRole;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("role_name")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("role_type")
        private String roleType;

        private UpdateUserPermissionsRequestBody(Builder builder) {
            this.cluster = builder.cluster;
            this.isCustom = builder.isCustom;
            this.isRamRole = builder.isRamRole;
            this.namespace = builder.namespace;
            this.roleName = builder.roleName;
            this.roleType = builder.roleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateUserPermissionsRequestBody create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return isCustom
         */
        public Boolean getIsCustom() {
            return this.isCustom;
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
            private String cluster; 
            private Boolean isCustom; 
            private Boolean isRamRole; 
            private String namespace; 
            private String roleName; 
            private String roleType; 

            /**
             * The ID of the cluster on which you want to grant permissions to the RAM role or RAM role.
             * <p>
             * 
             * *   Set this parameter to an empty string if `role_type` is set to `all-clusters`.
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * Specifies whether to assign a custom role to the RAM user or RAM role. If you want to assign a custom role to the RAM user or RAM role, set `role_name` to the name of the custom role.
             */
            public Builder isCustom(Boolean isCustom) {
                this.isCustom = isCustom;
                return this;
            }

            /**
             * Specifies whether to use a RAM role to grant permissions.
             */
            public Builder isRamRole(Boolean isRamRole) {
                this.isRamRole = isRamRole;
                return this;
            }

            /**
             * The namespace that you want to authorize the RAM user or RAM role to manage. This parameter is required only if you set role_type to namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The predefined role. Valid values:
             * <p>
             * 
             * *   `admin`: administrator
             * *   `ops`: O\&M engineer
             * *   `dev`: developer
             * *   `restricted`: restricted user
             * *   Custom role
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The authorization type. Valid values:
             * <p>
             * 
             * *   `cluster`: authorizes the RAM user or RAM role to manage the specified clusters.
             * *   `namespace`: authorizes the RAM user or RAM role to manage the specified namepsaces.
             * *   `all-clusters`: authorizes the RAM user or RAM role to manage all clusters.
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            public UpdateUserPermissionsRequestBody build() {
                return new UpdateUserPermissionsRequestBody(this);
            } 

        } 

    }
}
