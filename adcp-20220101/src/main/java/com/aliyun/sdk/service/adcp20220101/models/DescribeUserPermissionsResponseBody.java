// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

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
         * Permissions.
         */
        public Builder permissions(java.util.List < Permissions> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * Id of the request
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
        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("RoleType")
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
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * RoleType.
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
