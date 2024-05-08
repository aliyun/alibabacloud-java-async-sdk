// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkInterfacePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkInterfacePermissionResponseBody</p>
 */
public class CreateNetworkInterfacePermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkInterfacePermission")
    private NetworkInterfacePermission networkInterfacePermission;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNetworkInterfacePermissionResponseBody(Builder builder) {
        this.networkInterfacePermission = builder.networkInterfacePermission;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkInterfacePermissionResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkInterfacePermission
     */
    public NetworkInterfacePermission getNetworkInterfacePermission() {
        return this.networkInterfacePermission;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NetworkInterfacePermission networkInterfacePermission; 
        private String requestId; 

        /**
         * The permission on the ENI.
         */
        public Builder networkInterfacePermission(NetworkInterfacePermission networkInterfacePermission) {
            this.networkInterfacePermission = networkInterfacePermission;
            return this;
        }

        /**
         * Details about permissions on ENIs.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNetworkInterfacePermissionResponseBody build() {
            return new CreateNetworkInterfacePermissionResponseBody(this);
        } 

    } 

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
             * The ID of the permission on the ENI.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud partner (a certified ISV).
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * The name of the Alibaba Cloud service.
             */
            public Builder networkInterfacePermissionId(String networkInterfacePermissionId) {
                this.networkInterfacePermissionId = networkInterfacePermissionId;
                return this;
            }

            /**
             * The ID of the ENI.
             */
            public Builder permission(String permission) {
                this.permission = permission;
                return this;
            }

            /**
             * PermissionState.
             */
            public Builder permissionState(String permissionState) {
                this.permissionState = permissionState;
                return this;
            }

            /**
             * The state of the permission on the ENI. Valid values:
             * <p>
             * 
             * *   Pending: The permission is being granted.
             * *   Granted: The permission is granted.
             * *   Revoking: The permission is being revoked.
             * *   Revoked: The permission is revoked.
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
}
