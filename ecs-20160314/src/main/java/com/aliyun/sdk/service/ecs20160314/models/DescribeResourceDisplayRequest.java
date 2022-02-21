// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceDisplayRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceDisplayRequest</p>
 */
public class DescribeResourceDisplayRequest extends Request {
    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("FirstBizLevel")
    @Validation(required = true)
    private String firstBizLevel;

    @Query
    @NameInMap("InstanceCategoryType")
    private java.util.List < String > instanceCategoryType;

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
    @NameInMap("SecondBizLevel")
    private String secondBizLevel;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("TemplateTag")
    private java.util.List < TemplateTag> templateTag;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeResourceDisplayRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.firstBizLevel = builder.firstBizLevel;
        this.instanceCategoryType = builder.instanceCategoryType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secondBizLevel = builder.secondBizLevel;
        this.spotStrategy = builder.spotStrategy;
        this.templateTag = builder.templateTag;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceDisplayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return firstBizLevel
     */
    public String getFirstBizLevel() {
        return this.firstBizLevel;
    }

    /**
     * @return instanceCategoryType
     */
    public java.util.List < String > getInstanceCategoryType() {
        return this.instanceCategoryType;
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
     * @return secondBizLevel
     */
    public String getSecondBizLevel() {
        return this.secondBizLevel;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return templateTag
     */
    public java.util.List < TemplateTag> getTemplateTag() {
        return this.templateTag;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeResourceDisplayRequest, Builder> {
        private String chargeType; 
        private String firstBizLevel; 
        private java.util.List < String > instanceCategoryType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String secondBizLevel; 
        private String spotStrategy; 
        private java.util.List < TemplateTag> templateTag; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceDisplayRequest response) {
            super(response);
            this.chargeType = response.chargeType;
            this.firstBizLevel = response.firstBizLevel;
            this.instanceCategoryType = response.instanceCategoryType;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.secondBizLevel = response.secondBizLevel;
            this.spotStrategy = response.spotStrategy;
            this.templateTag = response.templateTag;
            this.zoneId = response.zoneId;
        } 

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * FirstBizLevel.
         */
        public Builder firstBizLevel(String firstBizLevel) {
            this.putQueryParameter("FirstBizLevel", firstBizLevel);
            this.firstBizLevel = firstBizLevel;
            return this;
        }

        /**
         * InstanceCategoryType.
         */
        public Builder instanceCategoryType(java.util.List < String > instanceCategoryType) {
            this.putQueryParameter("InstanceCategoryType", instanceCategoryType);
            this.instanceCategoryType = instanceCategoryType;
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
         * RegionId.
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
         * SecondBizLevel.
         */
        public Builder secondBizLevel(String secondBizLevel) {
            this.putQueryParameter("SecondBizLevel", secondBizLevel);
            this.secondBizLevel = secondBizLevel;
            return this;
        }

        /**
         * SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * TemplateTag.
         */
        public Builder templateTag(java.util.List < TemplateTag> templateTag) {
            this.putQueryParameter("TemplateTag", templateTag);
            this.templateTag = templateTag;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeResourceDisplayRequest build() {
            return new DescribeResourceDisplayRequest(this);
        } 

    } 

    public static class TemplateTag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private TemplateTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateTag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TemplateTag build() {
                return new TemplateTag(this);
            } 

        } 

    }
}
