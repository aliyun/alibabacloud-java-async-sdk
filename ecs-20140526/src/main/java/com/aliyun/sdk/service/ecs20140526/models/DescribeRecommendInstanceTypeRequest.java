// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecommendInstanceTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecommendInstanceTypeRequest</p>
 */
public class DescribeRecommendInstanceTypeRequest extends Request {
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
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("InstanceTypeFamily")
    private java.util.List < String > instanceTypeFamily;

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
    @NameInMap("PriorityStrategy")
    private String priorityStrategy;

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
    @NameInMap("Scene")
    private String scene;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("SystemDiskCategory")
    private String systemDiskCategory;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("ZoneMatchMode")
    private String zoneMatchMode;

    private DescribeRecommendInstanceTypeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.cores = builder.cores;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.instanceType = builder.instanceType;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.ioOptimized = builder.ioOptimized;
        this.maxPrice = builder.maxPrice;
        this.memory = builder.memory;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.priorityStrategy = builder.priorityStrategy;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scene = builder.scene;
        this.spotStrategy = builder.spotStrategy;
        this.systemDiskCategory = builder.systemDiskCategory;
        this.zoneId = builder.zoneId;
        this.zoneMatchMode = builder.zoneMatchMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecommendInstanceTypeRequest create() {
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
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceTypeFamily
     */
    public java.util.List < String > getInstanceTypeFamily() {
        return this.instanceTypeFamily;
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
     * @return scene
     */
    public String getScene() {
        return this.scene;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return zoneMatchMode
     */
    public String getZoneMatchMode() {
        return this.zoneMatchMode;
    }

    public static final class Builder extends Request.Builder<DescribeRecommendInstanceTypeRequest, Builder> {
        private String sourceRegionId; 
        private Integer cores; 
        private String instanceChargeType; 
        private String instanceFamilyLevel; 
        private String instanceType; 
        private java.util.List < String > instanceTypeFamily; 
        private String ioOptimized; 
        private Float maxPrice; 
        private Float memory; 
        private String networkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String priorityStrategy; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scene; 
        private String spotStrategy; 
        private String systemDiskCategory; 
        private String zoneId; 
        private String zoneMatchMode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecommendInstanceTypeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.cores = request.cores;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceFamilyLevel = request.instanceFamilyLevel;
            this.instanceType = request.instanceType;
            this.instanceTypeFamily = request.instanceTypeFamily;
            this.ioOptimized = request.ioOptimized;
            this.maxPrice = request.maxPrice;
            this.memory = request.memory;
            this.networkType = request.networkType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.priorityStrategy = request.priorityStrategy;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scene = request.scene;
            this.spotStrategy = request.spotStrategy;
            this.systemDiskCategory = request.systemDiskCategory;
            this.zoneId = request.zoneId;
            this.zoneMatchMode = request.zoneMatchMode;
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
         * The number of vCPUs of the instance.
         * <p>
         * 
         * >  If the `Cores` and `Memory` parameters are both specified, all instance types that offer the vCPUs and memory size specified by the parameters are matched.
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * The billing method of the instances of the instance type. For more information, see [Billing overview](~~25398~~). Valid values:
         * <p>
         * 
         * * PrePaid: subscription
         * * PostPaid: pay-as-you-go
         * 
         * Default value: PostPaid.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The level of the instance family. Valid values:
         * <p>
         * 
         * * EntryLevel
         * * EnterpriseLevel.
         * * CreditEntryLevel. For more information, see [Burstable instance families](~~59977~~).
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * The specified instance type. For more information, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent instance type list.
         * <p>
         * 
         * >  If the `InstanceType` parameter is specified, none of the `Cores` and `Memory` parameters can be specified.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Instance families to be filtered out. You can specify up to 10 instance families.
         */
        public Builder instanceTypeFamily(java.util.List < String > instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * Specifies whether to match I/O optimized instances. The IoOptimized parameter cannot be specified when the instance is not I/O optimized. Valid values:
         * <p>
         * 
         * * optimized: matches I/O optimized instances.
         * * none: matches non-I/O optimized instances.
         * 
         * Default value: optimized.
         * 
         * If you query alternative instance types for retired instance types, this parameter is set to none by default. Default value: none.
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * The maximum hourly price for pay-as-you-go instances or preemptible instances.
         * <p>
         * 
         * >  If this parameter is specified, the `SpotStrategy` parameter must be set to `SpotWithPriceLimit`.
         */
        public Builder maxPrice(Float maxPrice) {
            this.putQueryParameter("MaxPrice", maxPrice);
            this.maxPrice = maxPrice;
            return this;
        }

        /**
         * The memory size of the instance. Unit: GiB.
         * <p>
         * 
         * >  If the `Cores` and `Memory` parameters are both specified, all instance types that offer the vCPUs and memory size specified by the parameters are matched.
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * The network type of the ECS instance. Valid values:
         * <p>
         * 
         * *   classic: classic network
         * *   vpc: VPC
         * 
         * Default value: vpc.
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
         * The policy for recommending instance types. Valid values:
         * <p>
         * 
         * * InventoryFirst: Instance types are recommended in descending order based on resource availability.
         * * PriceFirst: Instance types are recommended in ascending order based on hourly price per vCPU.
         * * NewProductFirst: The latest instance types are recommended first.
         * 
         * Default value: InventoryFirst.
         */
        public Builder priorityStrategy(String priorityStrategy) {
            this.putQueryParameter("PriorityStrategy", priorityStrategy);
            this.priorityStrategy = priorityStrategy;
            return this;
        }

        /**
         * The region ID of the alternative instance types. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
         * Specifies the scenario in which the instance type is recommended. Valid values:
         * <p>
         * 
         * * UPGRADE: instance type upgrade or downgrade
         * * CREATE: instance creation
         * 
         * Default value: CREATE.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * The bidding policy of preemptible instances. Valid values:
         * <p>
         * 
         * * NoSpot: applies to regular pay-as-you-go instances.
         * * SpotWithPriceLimit: applies to preemptible instances that have user-defined maximum hourly prices.
         * * SpotAsPriceGo: applies to preemptible instances that are of the market price at the time of purchase.
         * 
         * > If the `SpotStrategy` parameter is specified, the `InstanceChargeType` parameter must be set to `PostPaid`.
         * 
         * Default value: NoSpot.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The category of the system disk. Valid values:
         * <p>
         * 
         * * cloud_efficiency: ultra disk
         * * cloud_ssd: standard SSD
         * * cloud_essd: enhanced SSD (ESSD)
         * * cloud: basic disk
         * 
         * For non-I/O optimized instances, the default value is cloud.
         * 
         * For I/O optimized instances, the default value is cloud_efficiency.
         */
        public Builder systemDiskCategory(String systemDiskCategory) {
            this.putQueryParameter("SystemDiskCategory", systemDiskCategory);
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }

        /**
         * The zone ID of the alternative instance types. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.
         * <p>
         * 
         * When you specify this parameter, we recommend that you set ZoneMatchMode to the default value Include. This value indicates that instance types in the zone specified by ZoneId are preferentially recommended, and instance types in other zones in the same region are also listed.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * Specifies which alternative instance types are recommended. Valid values:
         * <p>
         * 
         * * Strict: recommends only alternative instance types in the zone specified by ZoneId.
         * * Include: recommends all instance types in all the zones in the same region as the specified instance type.
         * 
         * When `ZoneId` is specified, the default value of this parameter is Strict. This value indicates that only alternative instance types in the zone specified by ZoneId are recommended.
         */
        public Builder zoneMatchMode(String zoneMatchMode) {
            this.putQueryParameter("ZoneMatchMode", zoneMatchMode);
            this.zoneMatchMode = zoneMatchMode;
            return this;
        }

        @Override
        public DescribeRecommendInstanceTypeRequest build() {
            return new DescribeRecommendInstanceTypeRequest(this);
        } 

    } 

}
