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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateNetworkInterfacePermissionResponseBody model) {
            this.networkInterfacePermission = model.networkInterfacePermission;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the network interface controller (NIC) permissions.</p>
         */
        public Builder networkInterfacePermission(NetworkInterfacePermission networkInterfacePermission) {
            this.networkInterfacePermission = networkInterfacePermission;
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

        public CreateNetworkInterfacePermissionResponseBody build() {
            return new CreateNetworkInterfacePermissionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateNetworkInterfacePermissionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfacePermissionResponseBody</p>
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

            private Builder() {
            } 

            private Builder(NetworkInterfacePermission model) {
                this.accountId = model.accountId;
                this.networkInterfaceId = model.networkInterfaceId;
                this.networkInterfacePermissionId = model.networkInterfacePermissionId;
                this.permission = model.permission;
                this.permissionState = model.permissionState;
                this.serviceName = model.serviceName;
            } 

            /**
             * <p>The ID of the Alibaba Cloud partner (certified ISV) account.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of the network interface controller (NIC).</p>
             * 
             * <strong>example:</strong>
             * <p>eni-bp14v2sdd3v8htln****</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>The ID of the network interface controller (NIC) permission.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-perm-bp1cs4lwn56lfb****</p>
             */
            public Builder networkInterfacePermissionId(String networkInterfacePermissionId) {
                this.networkInterfacePermissionId = networkInterfacePermissionId;
                return this;
            }

            /**
             * <p>The network interface controller (NIC) permission.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceAttach</p>
             */
            public Builder permission(String permission) {
                this.permission = permission;
                return this;
            }

            /**
             * <p>The status of the network interface controller (NIC) permission. Valid values:</p>
             * <ul>
             * <li>Pending: Authorization in progress.</li>
             * <li>Granted: Authorization granted.</li>
             * <li>Revoking: Authorization being revoked.</li>
             * <li>Revoked: Authorization revoked.</li>
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
             * <p>The Alibaba Cloud service name.</p>
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
}
