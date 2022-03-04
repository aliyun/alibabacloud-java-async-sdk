// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRenewalPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeRenewalPriceRequest</p>
 */
public class DescribeRenewalPriceRequest extends Request {
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
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("PriceUnit")
    private String priceUnit;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ExpectedRenewDay")
    private Integer expectedRenewDay;

    private DescribeRenewalPriceRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.period = builder.period;
        this.resourceType = builder.resourceType;
        this.priceUnit = builder.priceUnit;
        this.resourceId = builder.resourceId;
        this.expectedRenewDay = builder.expectedRenewDay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRenewalPriceRequest create() {
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
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return priceUnit
     */
    public String getPriceUnit() {
        return this.priceUnit;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return expectedRenewDay
     */
    public Integer getExpectedRenewDay() {
        return this.expectedRenewDay;
    }

    public static final class Builder extends Request.Builder<DescribeRenewalPriceRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String regionId; 
        private Integer period; 
        private String resourceType; 
        private String priceUnit; 
        private String resourceId; 
        private Integer expectedRenewDay; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRenewalPriceRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.period = request.period;
            this.resourceType = request.resourceType;
            this.priceUnit = request.priceUnit;
            this.resourceId = request.resourceId;
            this.expectedRenewDay = request.expectedRenewDay;
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
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The renewal duration. Valid values:
         * <p>
         * 
         * -If the value of "PriceUnit" is "Month", valid values: 1 to 9.
         * -If the value of "PriceUnit" is "Year", valid values: 1 to 3.
         * 
         * Default value: 1.
         * 
         * > you cannot set the renewal duration parameter ("1", "1" Dune") and the unified expiration date parameter ("ExpectedRenewDay") at the same time.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * Query the resource type of the renewal price. Value: instance
         * <p>
         * 
         * Default value: instance
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The renewal period. Valid values:
         * <p>
         * 
         * -Month: the renewal period is one Month.
         * -Year: the renewal period is one Year.
         * 
         * Default value: Month
         */
        public Builder priceUnit(String priceUnit) {
            this.putQueryParameter("PriceUnit", priceUnit);
            this.priceUnit = priceUnit;
            return this;
        }

        /**
         * The ID of the resource to query the renewal price. When the value of "ResourceType" is "instance", "ResourceId" can be interpreted as "InstanceId ".
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Unified expiration date. If this parameter is specified, the price of the instance to the unified expiration date is queried. Valid values: 1 to 28.
         * <p>
         * 
         * For more information about the unified expiration date feature, see [unified instance expiration date](~~ 108486 ~~).
         * 
         * > you cannot set the renewal duration parameter ("1", "1" dune") and the unified expiration date parameter ("ExpectedRenewDay") at the same time.
         */
        public Builder expectedRenewDay(Integer expectedRenewDay) {
            this.putQueryParameter("ExpectedRenewDay", expectedRenewDay);
            this.expectedRenewDay = expectedRenewDay;
            return this;
        }

        @Override
        public DescribeRenewalPriceRequest build() {
            return new DescribeRenewalPriceRequest(this);
        } 

    } 

}
