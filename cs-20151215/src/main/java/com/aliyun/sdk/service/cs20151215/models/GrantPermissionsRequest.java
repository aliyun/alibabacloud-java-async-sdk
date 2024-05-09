// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantPermissionsRequest} extends {@link RequestModel}
 *
 * <p>GrantPermissionsRequest</p>
 */
public class GrantPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("uid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List < GrantPermissionsRequestBody> body;

    private GrantPermissionsRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantPermissionsRequest create() {
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
    public java.util.List < GrantPermissionsRequestBody> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<GrantPermissionsRequest, Builder> {
        private String uid; 
        private java.util.List < GrantPermissionsRequestBody> body; 

        private Builder() {
            super();
        } 

        private Builder(GrantPermissionsRequest request) {
            super(request);
            this.uid = request.uid;
            this.body = request.body;
        } 

        /**
         * The ID of the RAM user.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * The request body.
         */
        public Builder body(java.util.List < GrantPermissionsRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public GrantPermissionsRequest build() {
            return new GrantPermissionsRequest(this);
        } 

    } 

    public static class GrantPermissionsRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("is_custom")
        private Boolean isCustom;

        @com.aliyun.core.annotation.NameInMap("is_ram_role")
        private Boolean isRamRole;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("role_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("role_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String roleType;

        private GrantPermissionsRequestBody(Builder builder) {
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

        public static GrantPermissionsRequestBody create() {
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
             * The ID of the cluster that you want to manage.
             * <p>
             * 
             * *   When the `role_type` parameter is set to `all-clusters`, this parameter is set to an empty string.
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * Specifies whether to perform a custom authorization. To perform a custom authorization, set `role_name` to a custom cluster role.
             */
            public Builder isCustom(Boolean isCustom) {
                this.isCustom = isCustom;
                return this;
            }

            /**
             * Specifies whether the permissions are granted to a RAM role.
             */
            public Builder isRamRole(Boolean isRamRole) {
                this.isRamRole = isRamRole;
                return this;
            }

            /**
             * The namespace to which the permissions are scoped. This parameter is required only if you set role_type to namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The predefined role name. Valid values:
             * <p>
             * 
             * *   `admin`: administrator
             * *   `ops`: O\&M engineer
             * *   `dev`: developer
             * *   `restricted`: restricted user
             * *   The custom cluster role.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The authorization type. Valid values:
             * <p>
             * 
             * *   `cluster`: indicates that the permissions are scoped to a cluster.
             * *   `namespace`: specifies that the permissions are scoped to a namespace of a cluster.
             * *   `all-clusters`: specifies that the permissions are scoped to all clusters.
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            public GrantPermissionsRequestBody build() {
                return new GrantPermissionsRequestBody(this);
            } 

        } 

    }
}
