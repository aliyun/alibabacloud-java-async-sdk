// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPermissionVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPermissionVersionsResponseBody</p>
 */
public class ListPermissionVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Permissions")
    private java.util.List < Permissions> permissions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPermissionVersionsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.permissions = builder.permissions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPermissionVersionsResponseBody create() {
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
         * <p>The token that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The information about the permission.</p>
         */
        public Builder permissions(java.util.List < Permissions> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04677DCA-7C33-464B-8811-1B1DA3C3D197</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPermissionVersionsResponseBody build() {
            return new ListPermissionVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPermissionVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPermissionVersionsResponseBody</p>
     */
    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultPermission")
        private Boolean defaultPermission;

        @com.aliyun.core.annotation.NameInMap("DefaultVersion")
        private Boolean defaultVersion;

        @com.aliyun.core.annotation.NameInMap("PermissionName")
        private String permissionName;

        @com.aliyun.core.annotation.NameInMap("PermissionVersion")
        private String permissionVersion;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
}
