// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceSolutionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceSolutionsRequest</p>
 */
public class DescribeResourceSolutionsRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("Cores")
    private Integer cores;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @Query
    @NameInMap("InstanceTypeModel")
    private java.util.List < InstanceTypeModel> instanceTypeModel;

    @Query
    @NameInMap("InstanceTypeSupportIPv6")
    private Boolean instanceTypeSupportIPv6;

    @Query
    @NameInMap("MatchOpenInstances")
    private Boolean matchOpenInstances;

    @Query
    @NameInMap("MaxPrice")
    private Float maxPrice;

    @Query
    @NameInMap("Memory")
    private Float memory;

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
    @NameInMap("ResourceAmountType")
    private String resourceAmountType;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("SystemDiskCategory")
    private String systemDiskCategory;

    @Query
    @NameInMap("TargetCapacity")
    @Validation(required = true)
    private Integer targetCapacity;

    @Query
    @NameInMap("ZoneId")
    private java.util.List < String > zoneId;

    private DescribeResourceSolutionsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.cores = builder.cores;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.instanceTypeModel = builder.instanceTypeModel;
        this.instanceTypeSupportIPv6 = builder.instanceTypeSupportIPv6;
        this.matchOpenInstances = builder.matchOpenInstances;
        this.maxPrice = builder.maxPrice;
        this.memory = builder.memory;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceAmountType = builder.resourceAmountType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.spotStrategy = builder.spotStrategy;
        this.systemDiskCategory = builder.systemDiskCategory;
        this.targetCapacity = builder.targetCapacity;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceSolutionsRequest create() {
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
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceFamilyLevel
     */
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    /**
     * @return instanceTypeModel
     */
    public java.util.List < InstanceTypeModel> getInstanceTypeModel() {
        return this.instanceTypeModel;
    }

    /**
     * @return instanceTypeSupportIPv6
     */
    public Boolean getInstanceTypeSupportIPv6() {
        return this.instanceTypeSupportIPv6;
    }

    /**
     * @return matchOpenInstances
     */
    public Boolean getMatchOpenInstances() {
        return this.matchOpenInstances;
    }

    /**
     * @return maxPrice
     */
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
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
     * @return resourceAmountType
     */
    public String getResourceAmountType() {
        return this.resourceAmountType;
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
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return systemDiskCategory
     */
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    /**
     * @return targetCapacity
     */
    public Integer getTargetCapacity() {
        return this.targetCapacity;
    }

    /**
     * @return zoneId
     */
    public java.util.List < String > getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeResourceSolutionsRequest, Builder> {
        private String sourceRegionId; 
        private Integer cores; 
        private String instanceChargeType; 
        private String instanceFamilyLevel; 
        private java.util.List < InstanceTypeModel> instanceTypeModel; 
        private Boolean instanceTypeSupportIPv6; 
        private Boolean matchOpenInstances; 
        private Float maxPrice; 
        private Float memory; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceAmountType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String spotStrategy; 
        private String systemDiskCategory; 
        private Integer targetCapacity; 
        private java.util.List < String > zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceSolutionsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.cores = request.cores;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceFamilyLevel = request.instanceFamilyLevel;
            this.instanceTypeModel = request.instanceTypeModel;
            this.instanceTypeSupportIPv6 = request.instanceTypeSupportIPv6;
            this.matchOpenInstances = request.matchOpenInstances;
            this.maxPrice = request.maxPrice;
            this.memory = request.memory;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceAmountType = request.resourceAmountType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.spotStrategy = request.spotStrategy;
            this.systemDiskCategory = request.systemDiskCategory;
            this.targetCapacity = request.targetCapacity;
            this.zoneId = request.zoneId;
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
         * Cores.
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * InstanceChargeType.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * InstanceFamilyLevel.
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * InstanceTypeModel.
         */
        public Builder instanceTypeModel(java.util.List < InstanceTypeModel> instanceTypeModel) {
            this.putQueryParameter("InstanceTypeModel", instanceTypeModel);
            this.instanceTypeModel = instanceTypeModel;
            return this;
        }

        /**
         * InstanceTypeSupportIPv6.
         */
        public Builder instanceTypeSupportIPv6(Boolean instanceTypeSupportIPv6) {
            this.putQueryParameter("InstanceTypeSupportIPv6", instanceTypeSupportIPv6);
            this.instanceTypeSupportIPv6 = instanceTypeSupportIPv6;
            return this;
        }

        /**
         * MatchOpenInstances.
         */
        public Builder matchOpenInstances(Boolean matchOpenInstances) {
            this.putQueryParameter("MatchOpenInstances", matchOpenInstances);
            this.matchOpenInstances = matchOpenInstances;
            return this;
        }

        /**
         * MaxPrice.
         */
        public Builder maxPrice(Float maxPrice) {
            this.putQueryParameter("MaxPrice", maxPrice);
            this.maxPrice = maxPrice;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
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
         * ResourceAmountType.
         */
        public Builder resourceAmountType(String resourceAmountType) {
            this.putQueryParameter("ResourceAmountType", resourceAmountType);
            this.resourceAmountType = resourceAmountType;
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
         * SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * SystemDiskCategory.
         */
        public Builder systemDiskCategory(String systemDiskCategory) {
            this.putQueryParameter("SystemDiskCategory", systemDiskCategory);
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }

        /**
         * TargetCapacity.
         */
        public Builder targetCapacity(Integer targetCapacity) {
            this.putQueryParameter("TargetCapacity", targetCapacity);
            this.targetCapacity = targetCapacity;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(java.util.List < String > zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeResourceSolutionsRequest build() {
            return new DescribeResourceSolutionsRequest(this);
        } 

    } 

    public static class InstanceTypeModel extends TeaModel {
        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        @NameInMap("WeightedCapacity")
        private Float weightedCapacity;

        private InstanceTypeModel(Builder builder) {
            this.instanceType = builder.instanceType;
            this.weightedCapacity = builder.weightedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeModel create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return weightedCapacity
         */
        public Float getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public static final class Builder {
            private String instanceType; 
            private Float weightedCapacity; 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * WeightedCapacity.
             */
            public Builder weightedCapacity(Float weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            public InstanceTypeModel build() {
                return new InstanceTypeModel(this);
            } 

        } 

    }
}
