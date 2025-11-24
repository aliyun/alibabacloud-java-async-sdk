// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeUserPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserPermissionsResponseBody</p>
 */
public class DescribeUserPermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Permissions")
    private java.util.List<Permissions> permissions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserPermissionsResponseBody(Builder builder) {
        this.permissions = builder.permissions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserPermissionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return permissions
     */
    public java.util.List<Permissions> getPermissions() {
        return this.permissions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Permissions> permissions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeUserPermissionsResponseBody model) {
            this.permissions = model.permissions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The permissions that are granted to an entity.</p>
         */
        public Builder permissions(java.util.List<Permissions> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5A7C9E37-C171-584F-9A99-869B48C4196D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserPermissionsResponseBody build() {
            return new DescribeUserPermissionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserPermissionsResponseBody</p>
     */
    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsRamRole")
        private String isRamRole;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        private String roleType;

        private Permissions(Builder builder) {
            this.isRamRole = builder.isRamRole;
            this.parentId = builder.parentId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
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
         * @return isRamRole
         */
        public String getIsRamRole() {
            return this.isRamRole;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
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
            private String isRamRole; 
            private String parentId; 
            private String resourceId; 
            private String resourceType; 
            private String roleName; 
            private String roleType; 

            private Builder() {
            } 

            private Builder(Permissions model) {
                this.isRamRole = model.isRamRole;
                this.parentId = model.parentId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.roleName = model.roleName;
                this.roleType = model.roleType;
            } 

            /**
             * <p>The entity to which the permissions are granted. A value of <code>true</code> indicates that the permissions are granted to a RAM user. A value of <code>false</code> indicates that the permissions are granted to a RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isRamRole(String isRamRole) {
                this.isRamRole = isRamRole;
                return this;
            }

            /**
             * <p>The value is fixed as <code>0</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The ID of the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>c57b848115458460583a4260cb713****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The value is fixed as <code>cluster</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The name of the permissions. Valid values:</p>
             * <ul>
             * <li><code>istio-admin</code>: the permissions of ASM administrators.</li>
             * <li><code>istio-ops</code>: the permissions of ASM restricted users.</li>
             * <li><code>istio-readonly</code>: the read-only permissions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>istio-admin</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The value is fixed as <code>custom</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
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
