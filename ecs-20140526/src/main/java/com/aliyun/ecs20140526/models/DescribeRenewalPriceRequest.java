// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ExpectedRenewDay")
    private Integer expectedRenewDay;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("PriceUnit")
    private String priceUnit;

    @Query
    @NameInMap("Period")
    private Integer period;

    private DescribeRenewalPriceRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.ownerId = builder.ownerId;
        this.resourceId = builder.resourceId;
        this.expectedRenewDay = builder.expectedRenewDay;
        this.resourceType = builder.resourceType;
        this.priceUnit = builder.priceUnit;
        this.period = builder.period;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    public static final class Builder extends Request.Builder<DescribeRenewalPriceRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String regionId; 
        private Long ownerId; 
        private String resourceId; 
        private Integer expectedRenewDay; 
        private String resourceType; 
        private String priceUnit; 
        private Integer period; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRenewalPriceRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerAccount = response.ownerAccount;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.regionId = response.regionId;
            this.ownerId = response.ownerId;
            this.resourceId = response.resourceId;
            this.expectedRenewDay = response.expectedRenewDay;
            this.resourceType = response.resourceType;
            this.priceUnit = response.priceUnit;
            this.period = response.period;
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
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Query renewals price the resource ID. When the value of "ResourceType" is "instance", "ResourceId" can be interpreted as "InstanceId ".
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Unified expiration date. Specifies that the parameter after, will query instance renew to unified due date price information. Value range: 1~28.
         * <p>
         * 
         * On Unified due date function for more information, please see [unified instance due date](~~ 108486 ~~).
         * 
         * > renew length parameter ("period", "periodunit") with unified due date parameter ("expectedrenewday") cannot be set at the same time.
         */
        public Builder expectedRenewDay(Integer expectedRenewDay) {
            this.putQueryParameter("ExpectedRenewDay", expectedRenewDay);
            this.expectedRenewDay = expectedRenewDay;
            return this;
        }

        /**
         * Query renewals price resource type. Value: instance
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
         * Specify renewal cycle. Valid values:
         * <p>
         * 
         * -Month: renew cycle for a Month.
         * -Year: renew cycle for one Year.
         * 
         * Default value: Month
         */
        public Builder priceUnit(String priceUnit) {
            this.putQueryParameter("PriceUnit", priceUnit);
            this.priceUnit = priceUnit;
            return this;
        }

        /**
         * Specify renewal length. Valid values:
         * <p>
         * 
         * -When the parameter "priceunit" value for "month" When: 1~9
         * -When the parameter "priceunit" value for "year": 1~3
         * 
         * Default value: 1.
         * 
         * > renew length parameter ("period", "periodunit") with unified due date parameter ("expectedrenewday") cannot be set at the same time.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        @Override
        public DescribeRenewalPriceRequest build() {
            return new DescribeRenewalPriceRequest(this);
        } 

    } 

}
