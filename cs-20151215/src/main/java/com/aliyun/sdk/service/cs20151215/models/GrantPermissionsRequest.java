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
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Body
    @NameInMap("body")
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
         * 指定 RAM 用户的 UID
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * 请求体参数
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
        @NameInMap("cluster")
        @Validation(required = true)
        private String cluster;

        @NameInMap("is_custom")
        private Boolean isCustom;

        @NameInMap("is_ram_role")
        private Boolean isRamRole;

        @NameInMap("namespace")
        private String namespace;

        @NameInMap("role_name")
        @Validation(required = true)
        private String roleName;

        @NameInMap("role_type")
        @Validation(required = true)
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
             * 授权目标集群id
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * 该授权是否是自定义授权
             */
            public Builder isCustom(Boolean isCustom) {
                this.isCustom = isCustom;
                return this;
            }

            /**
             * 是否是 RAM 角色授权
             */
            public Builder isRamRole(Boolean isRamRole) {
                this.isRamRole = isRamRole;
                return this;
            }

            /**
             * 命名空间名称
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * 预置的角色名称
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * 授权类型
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
