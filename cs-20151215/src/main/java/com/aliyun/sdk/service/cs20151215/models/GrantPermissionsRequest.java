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
    private java.util.List<GrantPermissionsRequestBody> body;

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
    public java.util.List<GrantPermissionsRequestBody> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<GrantPermissionsRequest, Builder> {
        private String uid; 
        private java.util.List<GrantPermissionsRequestBody> body; 

        private Builder() {
            super();
        } 

        private Builder(GrantPermissionsRequest request) {
            super(request);
            this.uid = request.uid;
            this.body = request.body;
        } 

        /**
         * <p>The ID of the Resource Access Management (RAM) user or RAM role.</p>
         * <p>This parameter is required.</p>
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
        public Builder body(java.util.List<GrantPermissionsRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public GrantPermissionsRequest build() {
            return new GrantPermissionsRequest(this);
        } 

    } 

    /**
     * 
     * {@link GrantPermissionsRequest} extends {@link TeaModel}
     *
     * <p>GrantPermissionsRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(GrantPermissionsRequestBody model) {
                this.cluster = model.cluster;
                this.isCustom = model.isCustom;
                this.isRamRole = model.isRamRole;
                this.namespace = model.namespace;
                this.roleName = model.roleName;
                this.roleType = model.roleType;
            } 

            /**
             * <p>The ID of the target cluster for authorization.</p>
             * <ul>
             * <li>If the <code>role_type</code> parameter is set to <code>all-clusters</code>, set this parameter to an empty string.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>c796c60***</p>
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * <p>Specifies whether the authorization is a custom authorization (the <code>role_name</code> parameter uses a custom ClusterRole name).</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCustom(Boolean isCustom) {
                this.isCustom = isCustom;
                return this;
            }

            /**
             * <p>Specifies whether the authorization is for a RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isRamRole(Boolean isRamRole) {
                this.isRamRole = isRamRole;
                return this;
            }

            /**
             * <p>The namespace name. This parameter is empty by default for cluster-level authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The preset role name. Valid values:</p>
             * <ul>
             * <li><code>admin</code>: administrator.</li>
             * <li><code>admin-view</code>: read-only administrator.</li>
             * <li><code>ops</code>: O&amp;M engineer.</li>
             * <li><code>dev</code>: developer.</li>
             * <li><code>restricted</code>: restricted user.</li>
             * <li>Custom ClusterRole name.</li>
             * </ul>
             * <blockquote>
             * <p>Notice: </p>
             * </blockquote>
             * <ul>
             * <li><code>admin</code>, <code>admin-view</code>, <code>ops</code>: cannot be granted at the namespace level.</li>
             * <li><code>admin-view</code>: cannot be granted at the all-clusters level.</li>
             * </ul>
             * <p>This parameter is required.</p>
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
             * <li><code>cluster</code>: cluster level.</li>
             * <li><code>namespace</code>: namespace level.</li>
             * <li><code>all-clusters</code>: all-clusters level.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
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
