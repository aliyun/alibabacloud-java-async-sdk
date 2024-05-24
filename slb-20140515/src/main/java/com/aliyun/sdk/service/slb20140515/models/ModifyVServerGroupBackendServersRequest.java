// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVServerGroupBackendServersRequest} extends {@link RequestModel}
 *
 * <p>ModifyVServerGroupBackendServersRequest</p>
 */
public class ModifyVServerGroupBackendServersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewBackendServers")
    private String newBackendServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OldBackendServers")
    private String oldBackendServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vServerGroupId;

    private ModifyVServerGroupBackendServersRequest(Builder builder) {
        super(builder);
        this.newBackendServers = builder.newBackendServers;
        this.oldBackendServers = builder.oldBackendServers;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vServerGroupId = builder.vServerGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVServerGroupBackendServersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newBackendServers
     */
    public String getNewBackendServers() {
        return this.newBackendServers;
    }

    /**
     * @return oldBackendServers
     */
    public String getOldBackendServers() {
        return this.oldBackendServers;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return vServerGroupId
     */
    public String getVServerGroupId() {
        return this.vServerGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyVServerGroupBackendServersRequest, Builder> {
        private String newBackendServers; 
        private String oldBackendServers; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vServerGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVServerGroupBackendServersRequest request) {
            super(request);
            this.newBackendServers = request.newBackendServers;
            this.oldBackendServers = request.oldBackendServers;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vServerGroupId = request.vServerGroupId;
        } 

        /**
         * The list of new backend servers that you want to use to replace those in the vServer group. You can specify at most 20 backend servers for a vServer group in each call.
         * <p>
         * 
         * *   **ServerId**: required. The ID of the ECS instance or ENI that serves as a backend server. This parameter must be of the STRING type.
         * 
         * *   **Port**: required. The port that is used by the backend server. This parameter must be of the INTEGER type. Valid values: **1 to 65535**.
         * 
         * *   **Weight**: required. The weight of the backend server. This parameter must be of the INTEGER type. Valid values: **0 to 100**.
         * 
         * *   **Description**: optional. The description of the backend server. This parameter must be of the STRING type. The description can contain letters, digits, hyphens (-), forward slashes (/), periods (.),and underscores (\_).
         * 
         * *   **Type**: the type of backend server. This parameter must be of the STRING type. Valid values:
         * 
         *     *   **ecs**: an ECS instance. This is the default value.
         *     *   **eni**: an ENI.
         * 
         * *   **ServerIp**: the IP address of the ECS instance or ENI.
         * 
         * Examples:
         * 
         * *   An ECS instance: `[{ "ServerId": "i-xxxxxxxxx", "Weight": "100", "Type": "ecs", "Port":"80","Description":"test-112" }]`
         * *   An ENI: `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.**.**", "Port":"80","Description":"test-112" }]`
         * *   An ENI with multiple IP addresses: `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.**.**", "Port":"80","Description":"test-112" },{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "172.166.**.**", "Port":"80","Description":"test-113" }]`
         */
        public Builder newBackendServers(String newBackendServers) {
            this.putQueryParameter("NewBackendServers", newBackendServers);
            this.newBackendServers = newBackendServers;
            return this;
        }

        /**
         * The list of backend servers that you want to replace in the vServer group. You can specify at most 20 backend servers for a vServer group in each call.
         * <p>
         * 
         * *   **ServerId**: required. The ID of the Elastic Compute Service (ECS) instance or elastic network interface (ENI) that serves as a backend server. This parameter must be of the STRING type.
         * 
         * *   **Port**: required. The port that is used by the backend server. This parameter must be of the INTEGER type. Valid values: **1 to 65535**.
         * 
         * *   **Weight**: required. The weight of the backend server. This parameter must be of the INTEGER type. Valid values: **0 to 100**.
         * 
         * *   **Description**: optional. The description of the backend server. This parameter must be of the STRING type. The description must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.),and underscores (\_).
         * 
         * *   **Type**: the type of backend server. This parameter must be of the STRING type. Valid values:
         * 
         *     *   **ecs**: an ECS instance. This is the default value.
         *     *   **eni**: an ENI.
         * 
         * *   **ServerIp**: the IP address of the ECS instance or ENI.
         * 
         * Examples:
         * 
         * *   An ECS instance: `[{ "ServerId": "i-xxxxxxxxx", "Weight": "100", "Type": "ecs", "Port":"80","Description":"test-112" }]`
         * *   An ENI: `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.**.**", "Port":"80","Description":"test-112" }]`
         * *   An ENI with multiple IP addresses: `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.**.**", "Port":"80","Description":"test-112" },{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "172.166.**.**", "Port":"80","Description":"test-113" }]`
         */
        public Builder oldBackendServers(String oldBackendServers) {
            this.putQueryParameter("OldBackendServers", oldBackendServers);
            this.oldBackendServers = oldBackendServers;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The ID of the region where the Classic Load Balancer (CLB) instance is deployed.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the vServer group.
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.putQueryParameter("VServerGroupId", vServerGroupId);
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        @Override
        public ModifyVServerGroupBackendServersRequest build() {
            return new ModifyVServerGroupBackendServersRequest(this);
        } 

    } 

}
