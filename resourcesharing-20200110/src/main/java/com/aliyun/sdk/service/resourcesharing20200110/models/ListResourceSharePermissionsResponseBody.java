// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceSharePermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceSharePermissionsResponseBody</p>
 */
public class ListResourceSharePermissionsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("Permissions")
    private java.util.List < Permissions> permissions;

    @NameInMap("RequestId")
    private String requestId;

    private ListResourceSharePermissionsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.permissions = builder.permissions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceSharePermissionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private String nextToken; 
        private java.util.List < Permissions> permissions; 
        private String requestId; 

        /**
         * The version of the permission.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The creation time.
         */
        public Builder permissions(java.util.List < Permissions> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * Indicates whether the version is the default version. Valid values:
         * <p>
         * 
         * *   false: The version is not the default version.
         * *   true: The version is the default version.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListResourceSharePermissionsResponseBody build() {
            return new ListResourceSharePermissionsResponseBody(this);
        } 

    } 

    public static class Permissions extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DefaultPermission")
        private Boolean defaultPermission;

        @NameInMap("DefaultVersion")
        private Boolean defaultVersion;

        @NameInMap("PermissionName")
        private String permissionName;

        @NameInMap("PermissionVersion")
        private String permissionVersion;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Permissions(Builder builder) {
            this.createTime = builder.createTime;
            this.defaultPermission = builder.defaultPermission;
            this.defaultVersion = builder.defaultVersion;
            this.permissionName = builder.permissionName;
            this.permissionVersion = builder.permissionVersion;
            this.resourceType = builder.resourceType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permissions create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defaultPermission
         */
        public Boolean getDefaultPermission() {
            return this.defaultPermission;
        }

        /**
         * @return defaultVersion
         */
        public Boolean getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return permissionName
         */
        public String getPermissionName() {
            return this.permissionName;
        }

        /**
         * @return permissionVersion
         */
        public String getPermissionVersion() {
            return this.permissionVersion;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private Boolean defaultPermission; 
            private Boolean defaultVersion; 
            private String permissionName; 
            private String permissionVersion; 
            private String resourceType; 
            private String updateTime; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DefaultPermission.
             */
            public Builder defaultPermission(Boolean defaultPermission) {
                this.defaultPermission = defaultPermission;
                return this;
            }

            /**
             * Indicates whether the permission is the default permission. Valid values:
             * <p>
             * 
             * *   false: The permission is not the default permission.
             * *   true: The permission is the default permission.
             */
            public Builder defaultVersion(Boolean defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * The update time.
             */
            public Builder permissionName(String permissionName) {
                this.permissionName = permissionName;
                return this;
            }

            /**
             * The type of the shared resources.
             * <p>
             * 
             * For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](~~450526~~).
             */
            public Builder permissionVersion(String permissionVersion) {
                this.permissionVersion = permissionVersion;
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
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
}
