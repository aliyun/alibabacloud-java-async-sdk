// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandwidthLimitationRequest} extends {@link RequestModel}
 *
 * <p>DescribeBandwidthLimitationRequest</p>
 */
public class DescribeBandwidthLimitationRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("OperationType")
    private String operationType;

    private DescribeBandwidthLimitationRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.spotStrategy = builder.spotStrategy;
        this.instanceType = builder.instanceType;
        this.resourceId = builder.resourceId;
        this.instanceChargeType = builder.instanceChargeType;
        this.operationType = builder.operationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBandwidthLimitationRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    public static final class Builder extends Request.Builder<DescribeBandwidthLimitationRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String spotStrategy; 
        private String instanceType; 
        private String resourceId; 
        private String instanceChargeType; 
        private String operationType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBandwidthLimitationRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.spotStrategy = request.spotStrategy;
            this.instanceType = request.instanceType;
            this.resourceId = request.resourceId;
            this.instanceChargeType = request.instanceChargeType;
            this.operationType = request.operationType;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the destination region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The preemptible policy of the pay-as-you-go instance. Valid values:
         * <p>
         * 
         * -NoSpot: a pay-as-you-go instance.
         * -SpotWithPriceLimit: sets the maximum price for preemptible instances.
         * -SpotAsPriceGo: The system automatically bids at the highest pay-as-you-go price.
         * 
         * Default value: NoSpot
         * 
         * > The parameter InstanceChargeType is valid only when the parameter PostPaid is set to SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The instance type. For more information, see [instance type family](~~ 25378 ~~).
         * <p>
         * 
         * > This parameter is required.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The ID of the resource.
         * <p>
         * 
         * > If you set the parameter OperationType to Upgrade or Downgrade, the parameter ResourceId is required.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The billing method of the instance. For more information, see [billing Overview](~~ 25398 ~~). Valid values:
         * <p>
         * 
         * -PrePaid: Subscription
         * -PostPaid: pay-as-you-go
         * 
         * Default value: PostPaid
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * You can call this operation to query the limits of public network bandwidth. Valid values:
         * <p>
         * 
         * -Upgrade: upgrades the internet bandwidth.
         * -Downgrade: Downgrade the internet bandwidth.
         * -Create: Create an ECS instance.
         * 
         * Default value: Create
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        @Override
        public DescribeBandwidthLimitationRequest build() {
            return new DescribeBandwidthLimitationRequest(this);
        } 

    } 

}
