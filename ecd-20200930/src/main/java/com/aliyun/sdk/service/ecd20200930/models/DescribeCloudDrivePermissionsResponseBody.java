// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCloudDrivePermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudDrivePermissionsResponseBody</p>
 */
public class DescribeCloudDrivePermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudDrivePermissionModels")
    private java.util.List < CloudDrivePermissionModels> cloudDrivePermissionModels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCloudDrivePermissionsResponseBody(Builder builder) {
        this.cloudDrivePermissionModels = builder.cloudDrivePermissionModels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudDrivePermissionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return cloudDrivePermissionModels
     */
    public java.util.List < CloudDrivePermissionModels> getCloudDrivePermissionModels() {
        return this.cloudDrivePermissionModels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CloudDrivePermissionModels> cloudDrivePermissionModels; 
        private String requestId; 

        /**
         * CloudDrivePermissionModels.
         */
        public Builder cloudDrivePermissionModels(java.util.List < CloudDrivePermissionModels> cloudDrivePermissionModels) {
            this.cloudDrivePermissionModels = cloudDrivePermissionModels;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudDrivePermissionsResponseBody build() {
            return new DescribeCloudDrivePermissionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudDrivePermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudDrivePermissionsResponseBody</p>
     */
    public static class CloudDrivePermissionModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndUsers")
        private java.util.List < String > endUsers;

        @com.aliyun.core.annotation.NameInMap("Permission")
        private String permission;

        private CloudDrivePermissionModels(Builder builder) {
            this.endUsers = builder.endUsers;
            this.permission = builder.permission;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudDrivePermissionModels create() {
            return builder().build();
        }

        /**
         * @return endUsers
         */
        public java.util.List < String > getEndUsers() {
            return this.endUsers;
        }

        /**
         * @return permission
         */
        public String getPermission() {
            return this.permission;
        }

        public static final class Builder {
            private java.util.List < String > endUsers; 
            private String permission; 

            /**
             * EndUsers.
             */
            public Builder endUsers(java.util.List < String > endUsers) {
                this.endUsers = endUsers;
                return this;
            }

            /**
             * Permission.
             */
            public Builder permission(String permission) {
                this.permission = permission;
                return this;
            }

            public CloudDrivePermissionModels build() {
                return new CloudDrivePermissionModels(this);
            } 

        } 

    }
}
