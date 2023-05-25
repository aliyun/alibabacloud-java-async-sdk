// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachNetworkInterfaceRequest} extends {@link RequestModel}
 *
 * <p>AttachNetworkInterfaceRequest</p>
 */
public class AttachNetworkInterfaceRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NetworkCardIndex")
    private Integer networkCardIndex;

    @Query
    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    private String networkInterfaceId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TrunkNetworkInstanceId")
    private String trunkNetworkInstanceId;

    @Query
    @NameInMap("WaitForNetworkConfigurationReady")
    private Boolean waitForNetworkConfigurationReady;

    private AttachNetworkInterfaceRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.instanceId = builder.instanceId;
        this.networkCardIndex = builder.networkCardIndex;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trunkNetworkInstanceId = builder.trunkNetworkInstanceId;
        this.waitForNetworkConfigurationReady = builder.waitForNetworkConfigurationReady;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachNetworkInterfaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networkCardIndex
     */
    public Integer getNetworkCardIndex() {
        return this.networkCardIndex;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
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
     * @return trunkNetworkInstanceId
     */
    public String getTrunkNetworkInstanceId() {
        return this.trunkNetworkInstanceId;
    }

    /**
     * @return waitForNetworkConfigurationReady
     */
    public Boolean getWaitForNetworkConfigurationReady() {
        return this.waitForNetworkConfigurationReady;
    }

    public static final class Builder extends Request.Builder<AttachNetworkInterfaceRequest, Builder> {
        private String sourceRegionId; 
        private String instanceId; 
        private Integer networkCardIndex; 
        private String networkInterfaceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trunkNetworkInstanceId; 
        private Boolean waitForNetworkConfigurationReady; 

        private Builder() {
            super();
        } 

        private Builder(AttachNetworkInterfaceRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.instanceId = request.instanceId;
            this.networkCardIndex = request.networkCardIndex;
            this.networkInterfaceId = request.networkInterfaceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trunkNetworkInstanceId = request.trunkNetworkInstanceId;
            this.waitForNetworkConfigurationReady = request.waitForNetworkConfigurationReady;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The index of the network interface controller (NIC).
         * <p>
         * 
         * > The value of this parameter varies based on the instance family of the specified instance. If the instance type of the specified instance does not support NICs, leave this parameter empty. If the instance type of the specified instance supports NICs, set this parameter to a valid value. For information about the valid values of this parameter, see [Instance families](~~25378~~).
         */
        public Builder networkCardIndex(Integer networkCardIndex) {
            this.putQueryParameter("NetworkCardIndex", networkCardIndex);
            this.networkCardIndex = networkCardIndex;
            return this;
        }

        /**
         * The ID of the ENI.
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
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
         * The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
         * The ID of the trunk ENI.
         * <p>
         * 
         * > This parameter is unavailable.
         */
        public Builder trunkNetworkInstanceId(String trunkNetworkInstanceId) {
            this.putQueryParameter("TrunkNetworkInstanceId", trunkNetworkInstanceId);
            this.trunkNetworkInstanceId = trunkNetworkInstanceId;
            return this;
        }

        /**
         * > This parameter is no longer supported.
         */
        public Builder waitForNetworkConfigurationReady(Boolean waitForNetworkConfigurationReady) {
            this.putQueryParameter("WaitForNetworkConfigurationReady", waitForNetworkConfigurationReady);
            this.waitForNetworkConfigurationReady = waitForNetworkConfigurationReady;
            return this;
        }

        @Override
        public AttachNetworkInterfaceRequest build() {
            return new AttachNetworkInterfaceRequest(this);
        } 

    } 

}
