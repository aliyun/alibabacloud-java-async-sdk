// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPermissionResponseBody} extends {@link TeaModel}
 *
 * <p>GetPermissionResponseBody</p>
 */
public class GetPermissionResponseBody extends TeaModel {
    @NameInMap("Permission")
    private Permission permission;

    @NameInMap("RequestId")
    private String requestId;

    private GetPermissionResponseBody(Builder builder) {
        this.permission = builder.permission;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPermissionResponseBody create() {
        return builder().build();
    }

    /**
     * @return permission
     */
    public Permission getPermission() {
        return this.permission;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Permission permission; 
        private String requestId; 

        /**
         * The information about the permission.
         */
        public Builder permission(Permission permission) {
            this.permission = permission;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPermissionResponseBody build() {
            return new GetPermissionResponseBody(this);
        } 

    } 

    public static class Permission extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DefaultPermission")
        private Boolean defaultPermission;

        @NameInMap("DefaultVersion")
        private Boolean defaultVersion;

        @NameInMap("Permission")
        private String permission;

        @NameInMap("PermissionName")
        private String permissionName;

        @NameInMap("PermissionVersion")
        private String permissionVersion;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Permission(Builder builder) {
            this.createTime = builder.createTime;
            this.defaultPermission = builder.defaultPermission;
            this.defaultVersion = builder.defaultVersion;
            this.permission = builder.permission;
            this.permissionName = builder.permissionName;
            this.permissionVersion = builder.permissionVersion;
            this.resourceType = builder.resourceType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permission create() {
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
         * @return permission
         */
        public String getPermission() {
            return this.permission;
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
            private String permission; 
            private String permissionName; 
            private String permissionVersion; 
            private String resourceType; 
            private String updateTime; 

            /**
             * The creation time.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Indicates whether the permission is the default permission. Valid values:
             * <p>
             * 
             * *   false: The permission is not the default permission.
             * *   true: The permission is the default permission.
             */
            public Builder defaultPermission(Boolean defaultPermission) {
                this.defaultPermission = defaultPermission;
                return this;
            }

            /**
             * Indicates whether the version is the default version. Valid values:
             * <p>
             * 
             * *   false: The version is not the default version.
             * *   true: The version is the default version.
             */
            public Builder defaultVersion(Boolean defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * The document of the policy related to the permission.
             */
            public Builder permission(String permission) {
                this.permission = permission;
                return this;
            }

            /**
             * The name of the permission.
             */
            public Builder permissionName(String permissionName) {
                this.permissionName = permissionName;
                return this;
            }

            /**
             * The version of the permission.
             */
            public Builder permissionVersion(String permissionVersion) {
                this.permissionVersion = permissionVersion;
                return this;
            }

            /**
             * The type of the shared resources.
             * <p>
             * 
             * For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](~~450526~~).
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The update time.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Permission build() {
                return new Permission(this);
            } 

        } 

    }
}
