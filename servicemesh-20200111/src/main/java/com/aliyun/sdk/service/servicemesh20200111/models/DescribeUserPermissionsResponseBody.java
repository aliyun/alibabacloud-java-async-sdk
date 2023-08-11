// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserPermissionsResponseBody</p>
 */
public class DescribeUserPermissionsResponseBody extends TeaModel {
    @NameInMap("Permissions")
    private java.util.List < Permissions> permissions;

    @NameInMap("RequestId")
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

    /**
     * @return permissions
     */
    public java.util.List < Permissions> getPermissions() {
        return this.permissions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Permissions> permissions; 
        private String requestId; 

        /**
         * The permissions that are granted to an entity.
         */
        public Builder permissions(java.util.List < Permissions> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserPermissionsResponseBody build() {
            return new DescribeUserPermissionsResponseBody(this);
        } 

    } 

    public static class Permissions extends TeaModel {
        @NameInMap("IsRamRole")
        private String isRamRole;

        @NameInMap("ParentId")
        private String parentId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("RoleType")
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

            /**
             * The entity to which the permissions are granted. A value of `true` indicates that the permissions are granted to a RAM user. A value of `false` indicates that the permissions are granted to a RAM role.
             */
            public Builder isRamRole(String isRamRole) {
                this.isRamRole = isRamRole;
                return this;
            }

            /**
             * This parameter is required by the system. The return value is fixed to `0`.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The ID of the ASM instance.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * This parameter is required by the system. The return value is fixed to `cluster`.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The name of the permissions. Valid values:
             * <p>
             * 
             * *   `istio-admin`: the permissions of Alibaba Cloud Service Mesh (ASM) administrators.
             * *   `istio-ops`: the permissions of ASM restricted users.
             * *   `istio-readonly`: the read-only permissions.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * This parameter is required by the system. The return value is fixed to `custom`.
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
