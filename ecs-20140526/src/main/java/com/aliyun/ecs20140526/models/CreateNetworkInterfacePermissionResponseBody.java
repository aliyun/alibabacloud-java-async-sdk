// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkInterfacePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkInterfacePermissionResponseBody</p>
 */
public class CreateNetworkInterfacePermissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("NetworkInterfacePermission")
    private NetworkInterfacePermission networkInterfacePermission;

    private CreateNetworkInterfacePermissionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.networkInterfacePermission = builder.networkInterfacePermission;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkInterfacePermissionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return networkInterfacePermission
     */
    public NetworkInterfacePermission getNetworkInterfacePermission() {
        return this.networkInterfacePermission;
    }

    public static final class Builder {
        private String requestId; 
        private NetworkInterfacePermission networkInterfacePermission; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of Eni permissions.
         */
        public Builder networkInterfacePermission(NetworkInterfacePermission networkInterfacePermission) {
            this.networkInterfacePermission = networkInterfacePermission;
            return this;
        }

        public CreateNetworkInterfacePermissionResponseBody build() {
            return new CreateNetworkInterfacePermissionResponseBody(this);
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
             * The ID of the Alibaba Cloud Partner (Certified ISV) account.
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
             * Elastic network card State of the permission. Possible values:
             * <p>
             * 
             * -Pending: authorization in
             * -Granted: Authorized
             * -Revoking: Revocation in
             * -Revoked: Revoked authorization
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
}
