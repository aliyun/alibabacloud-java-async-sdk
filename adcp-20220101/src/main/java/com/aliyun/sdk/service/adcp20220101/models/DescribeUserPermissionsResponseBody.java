// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserPermissionsResponseBody</p>
 */
public class DescribeUserPermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Permissions")
    private java.util.List < Permissions> permissions;

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
         * The details about the permissions of the RAM user.
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
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        private String roleType;

        private Permissions(Builder builder) {
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
            private String resourceId; 
            private String resourceType; 
            private String roleName; 
            private String roleType; 

            /**
             * The authorization setting. Valid values:
             * <p>
             * 
             * *   {cluster_id} is returned if the permissions are scoped to a cluster.
             * *   {cluster_id}/{namespace} is returned if the permissions are scoped to a namespace of a cluster.
             * *   all-clusters is returned if the permissions are scoped to all clusters.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The authorization type. Valid values:
             * <p>
             * 
             * *   cluster: indicates that the permissions are scoped to a cluster.
             * *   namespace: indicates that the permissions are scoped to a namespace of a cluster.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The name of the custom role. If a custom role is assigned, the value is the name of the assigned custom role.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The type of predefined role. Valid values:
             * <p>
             * 
             * *   admin: administrator
             * *   dev: developer
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
