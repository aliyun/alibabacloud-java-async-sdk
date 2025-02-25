// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeNetworkInterfacePermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkInterfacePermissionsResponseBody</p>
 */
public class DescribeNetworkInterfacePermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkInterfacePermissions")
    private NetworkInterfacePermissions networkInterfacePermissions;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>Details about the ENI permissions.</p>
         */
        public Builder networkInterfacePermissions(NetworkInterfacePermissions networkInterfacePermissions) {
            this.networkInterfacePermissions = networkInterfacePermissions;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0FCD3DEF-63D3-4605-A818-805C8BD7DB87</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNetworkInterfacePermissionsResponseBody build() {
            return new DescribeNetworkInterfacePermissionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkInterfacePermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacePermissionsResponseBody</p>
     */
    public static class NetworkInterfacePermission extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfacePermissionId")
        private String networkInterfacePermissionId;

        @com.aliyun.core.annotation.NameInMap("Permission")
        private String permission;

        @com.aliyun.core.annotation.NameInMap("PermissionState")
        private String permissionState;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
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
             * <p>The ID of the Alibaba Cloud partner (a certified ISV) or individual user.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of ENI N.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-bp14v2sdd3v8htln****</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>The ID of the ENI permission.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-perm-bp1cs4lwn56lfb****</p>
             */
            public Builder networkInterfacePermissionId(String networkInterfacePermissionId) {
                this.networkInterfacePermissionId = networkInterfacePermissionId;
                return this;
            }

            /**
             * <p>The ENI permission.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceAttach</p>
             */
            public Builder permission(String permission) {
                this.permission = permission;
                return this;
            }

            /**
             * <p>The status of the ENI permission. Valid values:</p>
             * <ul>
             * <li>Pending: The permission is being granted.</li>
             * <li>Granted: The permission is granted.</li>
             * <li>Revoking: The permission is being revoked.</li>
             * <li>Revoked: The permission is revoked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Granted</p>
             */
            public Builder permissionState(String permissionState) {
                this.permissionState = permissionState;
                return this;
            }

            /**
             * <p>The name of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>Elastic Compute Service</p>
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
    /**
     * 
     * {@link DescribeNetworkInterfacePermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInterfacePermissionsResponseBody</p>
     */
    public static class NetworkInterfacePermissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterfacePermission")
        private java.util.List<NetworkInterfacePermission> networkInterfacePermission;

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
        public java.util.List<NetworkInterfacePermission> getNetworkInterfacePermission() {
            return this.networkInterfacePermission;
        }

        public static final class Builder {
            private java.util.List<NetworkInterfacePermission> networkInterfacePermission; 

            /**
             * NetworkInterfacePermission.
             */
            public Builder networkInterfacePermission(java.util.List<NetworkInterfacePermission> networkInterfacePermission) {
                this.networkInterfacePermission = networkInterfacePermission;
                return this;
            }

            public NetworkInterfacePermissions build() {
                return new NetworkInterfacePermissions(this);
            } 

        } 

    }
}
