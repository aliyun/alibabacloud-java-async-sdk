// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkInterfacePermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkInterfacePermissionsResponseBody</p>
 */
public class DescribeNetworkInterfacePermissionsResponseBody extends TeaModel {
    @NameInMap("NetworkInterfacePermissions")
    private NetworkInterfacePermissions networkInterfacePermissions;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNetworkInterfacePermissionsResponseBody(Builder builder) {
        this.networkInterfacePermissions = builder.networkInterfacePermissions;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInterfacePermissionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkInterfacePermissions
     */
    public NetworkInterfacePermissions getNetworkInterfacePermissions() {
        return this.networkInterfacePermissions;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private NetworkInterfacePermissions networkInterfacePermissions; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the ENI permissions.
         */
        public Builder networkInterfacePermissions(NetworkInterfacePermissions networkInterfacePermissions) {
            this.networkInterfacePermissions = networkInterfacePermissions;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNetworkInterfacePermissionsResponseBody build() {
            return new DescribeNetworkInterfacePermissionsResponseBody(this);
        } 

    } 

    public static class NetworkInterfacePermission extends TeaModel {
        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @NameInMap("NetworkInterfacePermissionId")
        private String networkInterfacePermissionId;

        @NameInMap("Permission")
        private String permission;

        @NameInMap("PermissionState")
        private String permissionState;

        @NameInMap("ServiceName")
        private String serviceName;

        private NetworkInterfacePermission(Builder builder) {
            this.accountId = builder.accountId;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.networkInterfacePermissionId = builder.networkInterfacePermissionId;
            this.permission = builder.permission;
            this.permissionState = builder.permissionState;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfacePermission create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return networkInterfacePermissionId
         */
        public String getNetworkInterfacePermissionId() {
            return this.networkInterfacePermissionId;
        }

        /**
         * @return permission
         */
        public String getPermission() {
            return this.permission;
        }

        /**
         * @return permissionState
         */
        public String getPermissionState() {
            return this.permissionState;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private Long accountId; 
            private String networkInterfaceId; 
            private String networkInterfacePermissionId; 
            private String permission; 
            private String permissionState; 
            private String serviceName; 

            /**
             * The ID of the Alibaba Cloud partner (a certified ISV) or individual user.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The ID of ENI N.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * The ID of the ENI permission.
             */
            public Builder networkInterfacePermissionId(String networkInterfacePermissionId) {
                this.networkInterfacePermissionId = networkInterfacePermissionId;
                return this;
            }

            /**
             * The ENI permission.
             */
            public Builder permission(String permission) {
                this.permission = permission;
                return this;
            }

            /**
             * The status of the ENI permission. Valid values:
             * <p>
             * 
             * *   Pending: The permission is being granted.
             * *   Granted: The permission is granted.
             * *   Revoking: The permission is being revoked.
             * *   Revoked: The permission is revoked.
             */
            public Builder permissionState(String permissionState) {
                this.permissionState = permissionState;
                return this;
            }

            /**
             * The name of the Alibaba Cloud service.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public NetworkInterfacePermission build() {
                return new NetworkInterfacePermission(this);
            } 

        } 

    }
    public static class NetworkInterfacePermissions extends TeaModel {
        @NameInMap("NetworkInterfacePermission")
        private java.util.List < NetworkInterfacePermission> networkInterfacePermission;

        private NetworkInterfacePermissions(Builder builder) {
            this.networkInterfacePermission = builder.networkInterfacePermission;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfacePermissions create() {
            return builder().build();
        }

        /**
         * @return networkInterfacePermission
         */
        public java.util.List < NetworkInterfacePermission> getNetworkInterfacePermission() {
            return this.networkInterfacePermission;
        }

        public static final class Builder {
            private java.util.List < NetworkInterfacePermission> networkInterfacePermission; 

            /**
             * NetworkInterfacePermission.
             */
            public Builder networkInterfacePermission(java.util.List < NetworkInterfacePermission> networkInterfacePermission) {
                this.networkInterfacePermission = networkInterfacePermission;
                return this;
            }

            public NetworkInterfacePermissions build() {
                return new NetworkInterfacePermissions(this);
            } 

        } 

    }
}
