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
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("NetworkInterfacePermissions")
    private NetworkInterfacePermissions networkInterfacePermissions;

    private DescribeNetworkInterfacePermissionsResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.networkInterfacePermissions = builder.networkInterfacePermissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInterfacePermissionsResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return networkInterfacePermissions
     */
    public NetworkInterfacePermissions getNetworkInterfacePermissions() {
        return this.networkInterfacePermissions;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private NetworkInterfacePermissions networkInterfacePermissions; 

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The page number of the list.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of entries queried.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The list of Eni permissions.
         */
        public Builder networkInterfacePermissions(NetworkInterfacePermissions networkInterfacePermissions) {
            this.networkInterfacePermissions = networkInterfacePermissions;
            return this;
        }

        public DescribeNetworkInterfacePermissionsResponseBody build() {
            return new DescribeNetworkInterfacePermissionsResponseBody(this);
        } 

    } 

    public static class NetworkInterfacePermission extends TeaModel {
        @NameInMap("Permission")
        private String permission;

        @NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("NetworkInterfacePermissionId")
        private String networkInterfacePermissionId;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("PermissionState")
        private String permissionState;

        private NetworkInterfacePermission(Builder builder) {
            this.permission = builder.permission;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.accountId = builder.accountId;
            this.networkInterfacePermissionId = builder.networkInterfacePermissionId;
            this.serviceName = builder.serviceName;
            this.permissionState = builder.permissionState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfacePermission create() {
            return builder().build();
        }

        /**
         * @return permission
         */
        public String getPermission() {
            return this.permission;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return networkInterfacePermissionId
         */
        public String getNetworkInterfacePermissionId() {
            return this.networkInterfacePermissionId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return permissionState
         */
        public String getPermissionState() {
            return this.permissionState;
        }

        public static final class Builder {
            private String permission; 
            private String networkInterfaceId; 
            private Long accountId; 
            private String networkInterfacePermissionId; 
            private String serviceName; 
            private String permissionState; 

            /**
             * The Eni permission.
             */
            public Builder permission(String permission) {
                this.permission = permission;
                return this;
            }

            /**
             * The ID of the Eni.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * The account ID or individual user ID of the Alibaba Cloud Partner (Certified ISV).
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The ID of the Eni permission.
             */
            public Builder networkInterfacePermissionId(String networkInterfacePermissionId) {
                this.networkInterfacePermissionId = networkInterfacePermissionId;
                return this;
            }

            /**
             * The name of the Alibaba Cloud service.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The status of the Eni permission. Possible values:
             * <p>
             * 
             * -Pending: authorization in progress
             * -Granted: Authorized
             * -Revoking: the authorization is being revoked.
             * -Revoked: the authorization has been Revoked.
             */
            public Builder permissionState(String permissionState) {
                this.permissionState = permissionState;
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
