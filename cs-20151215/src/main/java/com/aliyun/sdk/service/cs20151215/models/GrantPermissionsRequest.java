// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantPermissionsRequest} extends {@link RequestModel}
 *
 * <p>GrantPermissionsRequest</p>
 */
public class GrantPermissionsRequest extends Request {
    @Body
    @NameInMap("body")
    private java.util.List < GrantPermissionsRequestBody> body;

    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    private GrantPermissionsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.uid = builder.uid;
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
     * @return body
     */
    public java.util.List < GrantPermissionsRequestBody> getBody() {
        return this.body;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GrantPermissionsRequest, Builder> {
        private java.util.List < GrantPermissionsRequestBody> body; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(GrantPermissionsRequest request) {
            super(request);
            this.body = request.body;
            this.uid = request.uid;
        } 

        /**
         * Request body parameters
         */
        public Builder body(java.util.List < GrantPermissionsRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GrantPermissionsRequest build() {
            return new GrantPermissionsRequest(this);
        } 

    } 

    public static class GrantPermissionsRequestBody extends TeaModel {
        @NameInMap("cluster")
        @Validation(required = true)
        private String cluster;

        @NameInMap("is_custom")
        private Boolean isCustom;

        @NameInMap("role_name")
        @Validation(required = true)
        private String roleName;

        @NameInMap("role_type")
        @Validation(required = true)
        private String roleType;

        @NameInMap("namespace")
        private String namespace;

        @NameInMap("is_ram_role")
        private Boolean isRamRole;

        private GrantPermissionsRequestBody(Builder builder) {
            this.cluster = builder.cluster;
            this.isCustom = builder.isCustom;
            this.roleName = builder.roleName;
            this.roleType = builder.roleType;
            this.namespace = builder.namespace;
            this.isRamRole = builder.isRamRole;
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
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return isRamRole
         */
        public Boolean getIsRamRole() {
            return this.isRamRole;
        }

        public static final class Builder {
            private String cluster; 
            private Boolean isCustom; 
            private String roleName; 
            private String roleType; 
            private String namespace; 
            private Boolean isRamRole; 

            /**
             * 授权目标集群ID。
             * <p>
             * 
             * - 当`role_type`参数的值是`all-clusters`时，此参数的值传空字符串。
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * 该授权是否是自定义授权（`role_name`使用自定义的ClusterRole名称）。
             */
            public Builder isCustom(Boolean isCustom) {
                this.isCustom = isCustom;
                return this;
            }

            /**
             * 预置的角色名称，取值：
             * <p>
             * 
             * - `admin`: 管理员。
             * - `ops`：运维人员。
             * - `dev`：开发人员。
             * - `restricted`: 受限用户。
             * - 自定义的ClusterRole名称。
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * 授权类型，取值：
             * <p>
             * 
             * - `cluster`：集群维度。
             * - `namespace`: 命名空间维度。
             * - `all-clusters`: 所有集群维度。
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * 命名空间名称，集群维度授权时默认为空。
             * <p>
             * 
             * 
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * 是否是RAM角色授权。
             */
            public Builder isRamRole(Boolean isRamRole) {
                this.isRamRole = isRamRole;
                return this;
            }

            public GrantPermissionsRequestBody build() {
                return new GrantPermissionsRequestBody(this);
            } 

        } 

    }
}
