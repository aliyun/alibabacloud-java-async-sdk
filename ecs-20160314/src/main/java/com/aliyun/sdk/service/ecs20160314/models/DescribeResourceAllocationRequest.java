// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceAllocationRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceAllocationRequest</p>
 */
public class DescribeResourceAllocationRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("Cores")
    private Integer cores;

    @Query
    @NameInMap("DataDiskCategory")
    private java.util.List < String > dataDiskCategory;

    @Query
    @NameInMap("DefaultTargetCapacityType")
    private String defaultTargetCapacityType;

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
    @NameInMap("IoOptimized")
    private String ioOptimized;

    @Query
    @NameInMap("MaxPrice")
    private Float maxPrice;

    @Query
    @NameInMap("Memory")
    private Float memory;

    @Query
    @NameInMap("NetworkType")
    @Validation(required = true)
    private String networkType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PostPaidBaseCapacity")
    private Integer postPaidBaseCapacity;

    @Query
    @NameInMap("PriorityStrategy")
    private String priorityStrategy;

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
    @NameInMap("SpotBaseCapacity")
    private Integer spotBaseCapacity;

    @Query
    @NameInMap("SpotInstancePools")
    private Integer spotInstancePools;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("StrictSatisfiedTargetCapacity")
    private Boolean strictSatisfiedTargetCapacity;

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

    private DescribeResourceAllocationRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.cores = builder.cores;
        this.dataDiskCategory = builder.dataDiskCategory;
        this.defaultTargetCapacityType = builder.defaultTargetCapacityType;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.instanceTypeModel = builder.instanceTypeModel;
        this.instanceTypeSupportIPv6 = builder.instanceTypeSupportIPv6;
        this.ioOptimized = builder.ioOptimized;
        this.maxPrice = builder.maxPrice;
        this.memory = builder.memory;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.postPaidBaseCapacity = builder.postPaidBaseCapacity;
        this.priorityStrategy = builder.priorityStrategy;
        this.regionId = builder.regionId;
        this.resourceAmountType = builder.resourceAmountType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.spotBaseCapacity = builder.spotBaseCapacity;
        this.spotInstancePools = builder.spotInstancePools;
        this.spotStrategy = builder.spotStrategy;
        this.strictSatisfiedTargetCapacity = builder.strictSatisfiedTargetCapacity;
        this.systemDiskCategory = builder.systemDiskCategory;
        this.targetCapacity = builder.targetCapacity;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceAllocationRequest create() {
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
     * @return dataDiskCategory
     */
    public java.util.List < String > getDataDiskCategory() {
        return this.dataDiskCategory;
    }

    /**
     * @return defaultTargetCapacityType
     */
    public String getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
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
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
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
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
     * @return postPaidBaseCapacity
     */
    public Integer getPostPaidBaseCapacity() {
        return this.postPaidBaseCapacity;
    }

    /**
     * @return priorityStrategy
     */
    public String getPriorityStrategy() {
        return this.priorityStrategy;
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
     * @return spotBaseCapacity
     */
    public Integer getSpotBaseCapacity() {
        return this.spotBaseCapacity;
    }

    /**
     * @return spotInstancePools
     */
    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return strictSatisfiedTargetCapacity
     */
    public Boolean getStrictSatisfiedTargetCapacity() {
        return this.strictSatisfiedTargetCapacity;
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

    public static final class Builder extends Request.Builder<DescribeResourceAllocationRequest, Builder> {
        private String sourceRegionId; 
        private Integer cores; 
        private java.util.List < String > dataDiskCategory; 
        private String defaultTargetCapacityType; 
        private String instanceFamilyLevel; 
        private java.util.List < InstanceTypeModel> instanceTypeModel; 
        private Boolean instanceTypeSupportIPv6; 
        private String ioOptimized; 
        private Float maxPrice; 
        private Float memory; 
        private String networkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer postPaidBaseCapacity; 
        private String priorityStrategy; 
        private String regionId; 
        private String resourceAmountType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer spotBaseCapacity; 
        private Integer spotInstancePools; 
        private String spotStrategy; 
        private Boolean strictSatisfiedTargetCapacity; 
        private String systemDiskCategory; 
        private Integer targetCapacity; 
        private java.util.List < String > zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceAllocationRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.cores = request.cores;
            this.dataDiskCategory = request.dataDiskCategory;
            this.defaultTargetCapacityType = request.defaultTargetCapacityType;
            this.instanceFamilyLevel = request.instanceFamilyLevel;
            this.instanceTypeModel = request.instanceTypeModel;
            this.instanceTypeSupportIPv6 = request.instanceTypeSupportIPv6;
            this.ioOptimized = request.ioOptimized;
            this.maxPrice = request.maxPrice;
            this.memory = request.memory;
            this.networkType = request.networkType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.postPaidBaseCapacity = request.postPaidBaseCapacity;
            this.priorityStrategy = request.priorityStrategy;
            this.regionId = request.regionId;
            this.resourceAmountType = request.resourceAmountType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.spotBaseCapacity = request.spotBaseCapacity;
            this.spotInstancePools = request.spotInstancePools;
            this.spotStrategy = request.spotStrategy;
            this.strictSatisfiedTargetCapacity = request.strictSatisfiedTargetCapacity;
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
         * DataDiskCategory.
         */
        public Builder dataDiskCategory(java.util.List < String > dataDiskCategory) {
            this.putQueryParameter("DataDiskCategory", dataDiskCategory);
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }

        /**
         * DefaultTargetCapacityType.
         */
        public Builder defaultTargetCapacityType(String defaultTargetCapacityType) {
            this.putQueryParameter("DefaultTargetCapacityType", defaultTargetCapacityType);
            this.defaultTargetCapacityType = defaultTargetCapacityType;
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
         * IoOptimized.
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
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
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
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
         * PostPaidBaseCapacity.
         */
        public Builder postPaidBaseCapacity(Integer postPaidBaseCapacity) {
            this.putQueryParameter("PostPaidBaseCapacity", postPaidBaseCapacity);
            this.postPaidBaseCapacity = postPaidBaseCapacity;
            return this;
        }

        /**
         * PriorityStrategy.
         */
        public Builder priorityStrategy(String priorityStrategy) {
            this.putQueryParameter("PriorityStrategy", priorityStrategy);
            this.priorityStrategy = priorityStrategy;
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
         * SpotBaseCapacity.
         */
        public Builder spotBaseCapacity(Integer spotBaseCapacity) {
            this.putQueryParameter("SpotBaseCapacity", spotBaseCapacity);
            this.spotBaseCapacity = spotBaseCapacity;
            return this;
        }

        /**
         * SpotInstancePools.
         */
        public Builder spotInstancePools(Integer spotInstancePools) {
            this.putQueryParameter("SpotInstancePools", spotInstancePools);
            this.spotInstancePools = spotInstancePools;
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
         * StrictSatisfiedTargetCapacity.
         */
        public Builder strictSatisfiedTargetCapacity(Boolean strictSatisfiedTargetCapacity) {
            this.putQueryParameter("StrictSatisfiedTargetCapacity", strictSatisfiedTargetCapacity);
            this.strictSatisfiedTargetCapacity = strictSatisfiedTargetCapacity;
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
        public DescribeResourceAllocationRequest build() {
            return new DescribeResourceAllocationRequest(this);
        } 

    } 

    public static class InstanceTypeModel extends TeaModel {
        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        @NameInMap("MaxPrice")
        private Float maxPrice;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("WeightedCapacity")
        private Float weightedCapacity;

        private InstanceTypeModel(Builder builder) {
            this.instanceType = builder.instanceType;
            this.maxPrice = builder.maxPrice;
            this.spotStrategy = builder.spotStrategy;
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
         * @return maxPrice
         */
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return weightedCapacity
         */
        public Float getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public static final class Builder {
            private String instanceType; 
            private Float maxPrice; 
            private String spotStrategy; 
            private Float weightedCapacity; 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * MaxPrice.
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
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
