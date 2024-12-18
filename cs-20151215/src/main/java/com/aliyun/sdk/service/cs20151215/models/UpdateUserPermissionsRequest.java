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
         * <p>The ID of the RAM user or RAM role whose permissions you want to update.</p>
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
         * <p>The request body.</p>
         */
        public Builder body(java.util.List<UpdateUserPermissionsRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The authorization method. Valid values:</p>
         * <ul>
         * <li><code>apply</code>: updates all permissions of the RAM user or RAM role. If you use this method, the existing permissions of the RAM user or RAM role on the cluster are overwritten. You must specify all the permissions that you want to grant to the RAM user or RAM role in the request parameters when you call the operation.</li>
         * <li><code>delete</code>: revokes the specified permissions from the RAM user or RAM role. If you use this method, only the permissions that you specify are revoked, other permissions of the RAM user or RAM role on the cluster are not affected.</li>
         * <li><code>patch</code>: grants the specified permissions to the RAM user or role. If you use this method, only the permissions that you specify are granted, other permissions of the RAM user or RAM role on the cluster are not affected.</li>
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

            /**
             * <p>The ID of the cluster on which you want to grant permissions to the RAM role or RAM role.</p>
             * <ul>
             * <li>Set this parameter to an empty string if <code>role_type</code> is set to <code>all-clusters</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>c796c60***</p>
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * <p>Specifies whether to assign a custom role to the RAM user or RAM role. If you want to assign a custom role to the RAM user or RAM role, set <code>role_name</code> to the name of the custom role.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCustom(Boolean isCustom) {
                this.isCustom = isCustom;
                return this;
            }

            /**
             * <p>Specifies whether to use a RAM role to grant permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isRamRole(Boolean isRamRole) {
                this.isRamRole = isRamRole;
                return this;
            }

            /**
             * <p>The namespace that you want to authorize the RAM user or RAM role to manage. This parameter is required only if you set role_type to namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The predefined role. Valid values:</p>
             * <ul>
             * <li><code>admin</code>: administrator</li>
             * <li><code>ops</code>: O&amp;M engineer</li>
             * <li><code>dev</code>: developer</li>
             * <li><code>restricted</code>: restricted user</li>
             * <li>Custom role</li>
             * </ul>
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
             * <li><code>cluster</code>: authorizes the RAM user or RAM role to manage the specified clusters.</li>
             * <li><code>namespace</code>: authorizes the RAM user or RAM role to manage the specified namepsaces.</li>
             * <li><code>all-clusters</code>: authorizes the RAM user or RAM role to manage all clusters.</li>
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
