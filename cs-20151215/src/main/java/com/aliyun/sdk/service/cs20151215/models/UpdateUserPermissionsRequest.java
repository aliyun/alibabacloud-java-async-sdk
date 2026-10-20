// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    private java.util.List<UpdateUserPermissionsRequestBody> body;

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
    public java.util.List<UpdateUserPermissionsRequestBody> getBody() {
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
        private java.util.List<UpdateUserPermissionsRequestBody> body; 
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
         * <p>The ID of the Resource Access Management (RAM) user or RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>2367****</p>
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * <p>The request body parameters.</p>
         */
        public Builder body(java.util.List<UpdateUserPermissionsRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The authorization mode. Valid values:</p>
         * <ul>
         * <li><code>apply</code>: full update. A full update overwrites all existing cluster permissions of the target RAM user or RAM role. The request must include all permission configurations that you want to grant to the target RAM user or RAM role.</li>
         * <li><code>delete</code>: delete permissions. Only the cluster authorization information included in the request is deleted. Other cluster Resource Access Management (RAM) user or RAM role are not affected.</li>
         * <li><code>patch</code>: add permissions. Only the cluster authorization information included in the request is added. Other cluster Resource Access Management (RAM) user or RAM role are not affected.</li>
         * </ul>
         * <p>Default value: <code>apply</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>apply</p>
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

    /**
     * 
     * {@link UpdateUserPermissionsRequest} extends {@link TeaModel}
     *
     * <p>UpdateUserPermissionsRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(UpdateUserPermissionsRequestBody model) {
                this.cluster = model.cluster;
                this.isCustom = model.isCustom;
                this.isRamRole = model.isRamRole;
                this.namespace = model.namespace;
                this.roleName = model.roleName;
                this.roleType = model.roleType;
            } 

            /**
             * <p>The ID of the target cluster for authorization.</p>
             * <p>If the <code>role_type</code> parameter is set to <code>all-clusters</code>, you do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>c796c60***</p>
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * <p>Specifies whether the authorization is a custom authorization (the <code>role_name</code> uses a custom ClusterRole name).</p>
             * <ul>
             * <li><p>true: The authorized role is a custom cluster role.</p>
             * </li>
             * <li><p>false: The authorized role is a cluster preset role.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCustom(Boolean isCustom) {
                this.isCustom = isCustom;
                return this;
            }

            /**
             * <p>Indicates whether the authorization is for a RAM role.</p>
             * <ul>
             * <li><p>true: The authorization is for a RAM role.</p>
             * </li>
             * <li><p>false: The authorization is for a Resource Access Management (RAM) user.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isRamRole(Boolean isRamRole) {
                this.isRamRole = isRamRole;
                return this;
            }

            /**
             * <p>The namespace name. This parameter is empty by default for cluster-scoped authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The name of the preset role. Valid values:</p>
             * <ul>
             * <li><code>admin</code>: administrator.</li>
             * <li><code>admin-view</code>: read-only administrator.</li>
             * <li><code>ops</code>: O&amp;M engineer.</li>
             * <li><code>dev</code>: developer.</li>
             * <li><code>restricted</code>: restricted user.</li>
             * <li>Custom ClusterRole name.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li><code>admin</code>, <code>admin-view</code>, <code>ops</code>: These roles do not support authorization at the <strong>namespace</strong> scope.</li>
             * <li><code>admin-view</code>: This role does not support authorization at the <strong>all-clusters</strong> scope.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ops</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The authorization type. Valid values:</p>
             * <ul>
             * <li><code>cluster</code>: cluster scope.</li>
             * <li><code>namespace</code>: namespace scope.</li>
             * <li><code>all-clusters</code>: all-clusters scope.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
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
