// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPermissionResponseBody} extends {@link TeaModel}
 *
 * <p>GetPermissionResponseBody</p>
 */
public class GetPermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Permission")
    private Permission permission;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the permission.</p>
         */
        public Builder permission(Permission permission) {
            this.permission = permission;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2F23CFB6-A721-4E90-AC1E-0E30FA8B45DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPermissionResponseBody build() {
            return new GetPermissionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPermissionResponseBody} extends {@link TeaModel}
     *
     * <p>GetPermissionResponseBody</p>
     */
    public static class Permission extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultPermission")
        private Boolean defaultPermission;

        @com.aliyun.core.annotation.NameInMap("DefaultVersion")
        private Boolean defaultVersion;

        @com.aliyun.core.annotation.NameInMap("Permission")
        private String permission;

        @com.aliyun.core.annotation.NameInMap("PermissionName")
        private String permissionName;

        @com.aliyun.core.annotation.NameInMap("PermissionVersion")
        private String permissionVersion;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-07T07:39:01.818Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the permission is the default permission. Valid values:</p>
             * <ul>
             * <li>false: The permission is not the default permission.</li>
             * <li>true: The permission is the default permission.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultPermission(Boolean defaultPermission) {
                this.defaultPermission = defaultPermission;
                return this;
            }

            /**
             * <p>Indicates whether the version is the default version. Valid values:</p>
             * <ul>
             * <li>false: The version is not the default version.</li>
             * <li>true: The version is the default version.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultVersion(Boolean defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * <p>The document of the policy related to the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Effect&quot;:&quot;Allow&quot;,&quot;Action&quot;:[&quot;vpc:DescribeVSwitches&quot;,&quot;vpc:DescribeVSwitchAttributes&quot;]}</p>
             */
            public Builder permission(String permission) {
                this.permission = permission;
                return this;
            }

            /**
             * <p>The name of the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunRSDefaultPermissionVSwitch</p>
             */
            public Builder permissionName(String permissionName) {
                this.permissionName = permissionName;
                return this;
            }

            /**
             * <p>The version of the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder permissionVersion(String permissionVersion) {
                this.permissionVersion = permissionVersion;
                return this;
            }

            /**
             * <p>The type of the shared resources.</p>
             * <p>For more information about the types of resources that can be shared, see <a href="https://help.aliyun.com/document_detail/450526.html">Services that work with Resource Sharing</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>VSwitch</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-07T07:39:01.818Z</p>
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
