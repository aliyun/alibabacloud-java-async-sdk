// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNetworkInterfaceAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyNetworkInterfaceAttributeRequest</p>
 */
public class ModifyNetworkInterfaceAttributeRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("DeleteOnRelease")
    private Boolean deleteOnRelease;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    private String networkInterfaceId;

    @Query
    @NameInMap("NetworkInterfaceName")
    private String networkInterfaceName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("QueueNumber")
    private Integer queueNumber;

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
    @NameInMap("RxQueueSize")
    private Integer rxQueueSize;

    @Query
    @NameInMap("SecurityGroupId")
    private java.util.List < String > securityGroupId;

    @Query
    @NameInMap("TxQueueSize")
    private Integer txQueueSize;

    private ModifyNetworkInterfaceAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.deleteOnRelease = builder.deleteOnRelease;
        this.description = builder.description;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.networkInterfaceName = builder.networkInterfaceName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.queueNumber = builder.queueNumber;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.rxQueueSize = builder.rxQueueSize;
        this.securityGroupId = builder.securityGroupId;
        this.txQueueSize = builder.txQueueSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNetworkInterfaceAttributeRequest create() {
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
     * @return deleteOnRelease
     */
    public Boolean getDeleteOnRelease() {
        return this.deleteOnRelease;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return networkInterfaceName
     */
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
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
     * @return queueNumber
     */
    public Integer getQueueNumber() {
        return this.queueNumber;
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
     * @return rxQueueSize
     */
    public Integer getRxQueueSize() {
        return this.rxQueueSize;
    }

    /**
     * @return securityGroupId
     */
    public java.util.List < String > getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return txQueueSize
     */
    public Integer getTxQueueSize() {
        return this.txQueueSize;
    }

    public static final class Builder extends Request.Builder<ModifyNetworkInterfaceAttributeRequest, Builder> {
        private String sourceRegionId; 
        private Boolean deleteOnRelease; 
        private String description; 
        private String networkInterfaceId; 
        private String networkInterfaceName; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer queueNumber; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer rxQueueSize; 
        private java.util.List < String > securityGroupId; 
        private Integer txQueueSize; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNetworkInterfaceAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.deleteOnRelease = request.deleteOnRelease;
            this.description = request.description;
            this.networkInterfaceId = request.networkInterfaceId;
            this.networkInterfaceName = request.networkInterfaceName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.queueNumber = request.queueNumber;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.rxQueueSize = request.rxQueueSize;
            this.securityGroupId = request.securityGroupId;
            this.txQueueSize = request.txQueueSize;
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
         * Specifies whether to release the ENI when the associated instance is released. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder deleteOnRelease(Boolean deleteOnRelease) {
            this.putQueryParameter("DeleteOnRelease", deleteOnRelease);
            this.deleteOnRelease = deleteOnRelease;
            return this;
        }

        /**
         * The description of the ENI. The description must be 2 to 255 characters in length and cannot start with [http:// or https://](http://https://。).
         * <p>
         * 
         * This parameter is left empty by default.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * The name of the ENI. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         * <p>
         * 
         * This parameter is empty by default.
         */
        public Builder networkInterfaceName(String networkInterfaceName) {
            this.putQueryParameter("NetworkInterfaceName", networkInterfaceName);
            this.networkInterfaceName = networkInterfaceName;
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
         * The number of queues supported by the ENI. Valid values: 1 to 2048.
         * <p>
         * 
         * *   You can change only the number of queues supported by the secondary ENI.
         * *   You can change the number of queues supported by the secondary ENI only when the ENI is in the `Available` state or the ENI is attached (`InUse`) to an instance that is in the `Stopped` state.
         * *   The number of queues supported by the secondary ENI cannot exceed the maximum number of queues that the instance allows for each ENI. The total number of queues for all ENIs on the instance cannot exceed the queue quota that the instance allows. To query the maximum number of queues per ENI and the queue quota for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation and check the values of `MaximumQueueNumberPerEni` and `TotalEniQueueQuantity` in the response.
         */
        public Builder queueNumber(Integer queueNumber) {
            this.putQueryParameter("QueueNumber", queueNumber);
            this.queueNumber = queueNumber;
            return this;
        }

        /**
         * The region ID of the ENI. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
         * RxQueueSize.
         */
        public Builder rxQueueSize(Integer rxQueueSize) {
            this.putQueryParameter("RxQueueSize", rxQueueSize);
            this.rxQueueSize = rxQueueSize;
            return this;
        }

        /**
         * The IDs of the security groups to which to add the secondary ENI. The secondary ENI is added to the specified security groups and are removed from its original security groups.
         * <p>
         * 
         * *   The valid value range of N varies based on the number of security groups to which an ENI can be added. For more information, see [Limits](~~25412#SecurityGroupQuota~~).
         * *   The new security groups take effect after a short delay.
         */
        public Builder securityGroupId(java.util.List < String > securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * TxQueueSize.
         */
        public Builder txQueueSize(Integer txQueueSize) {
            this.putQueryParameter("TxQueueSize", txQueueSize);
            this.txQueueSize = txQueueSize;
            return this;
        }

        @Override
        public ModifyNetworkInterfaceAttributeRequest build() {
            return new ModifyNetworkInterfaceAttributeRequest(this);
        } 

    } 

}
