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
    @NameInMap("Cores")
    private Integer cores;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("SystemDiskCategory")
    private String systemDiskCategory;

    @Query
    @NameInMap("IoOptimized")
    private String ioOptimized;

    @Query
    @NameInMap("PriorityStrategy")
    private String priorityStrategy;

    @Query
    @NameInMap("NetworkType")
    @Validation(required = true)
    private String networkType;

    @Query
    @NameInMap("ZoneMatchMode")
    private String zoneMatchMode;

    @Query
    @NameInMap("MaxPrice")
    private Float maxPrice;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("Memory")
    private Float memory;

    @Query
    @NameInMap("InstanceTypeFamily")
    private java.util.List < String > instanceTypeFamily;

    @Query
    @NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @Query
    @NameInMap("Scene")
    private String scene;

    private DescribeRecommendInstanceTypeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.cores = builder.cores;
        this.regionId = builder.regionId;
        this.zoneId = builder.zoneId;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceType = builder.instanceType;
        this.systemDiskCategory = builder.systemDiskCategory;
        this.ioOptimized = builder.ioOptimized;
        this.priorityStrategy = builder.priorityStrategy;
        this.networkType = builder.networkType;
        this.zoneMatchMode = builder.zoneMatchMode;
        this.maxPrice = builder.maxPrice;
        this.spotStrategy = builder.spotStrategy;
        this.memory = builder.memory;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.scene = builder.scene;
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
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return systemDiskCategory
     */
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return priorityStrategy
     */
    public String getPriorityStrategy() {
        return this.priorityStrategy;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return zoneMatchMode
     */
    public String getZoneMatchMode() {
        return this.zoneMatchMode;
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
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
    }

    /**
     * @return instanceTypeFamily
     */
    public java.util.List < String > getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return instanceFamilyLevel
     */
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<DescribeRecommendInstanceTypeRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer cores; 
        private String regionId; 
        private String zoneId; 
        private String instanceChargeType; 
        private String instanceType; 
        private String systemDiskCategory; 
        private String ioOptimized; 
        private String priorityStrategy; 
        private String networkType; 
        private String zoneMatchMode; 
        private Float maxPrice; 
        private String spotStrategy; 
        private Float memory; 
        private java.util.List < String > instanceTypeFamily; 
        private String instanceFamilyLevel; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecommendInstanceTypeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.cores = request.cores;
            this.regionId = request.regionId;
            this.zoneId = request.zoneId;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceType = request.instanceType;
            this.systemDiskCategory = request.systemDiskCategory;
            this.ioOptimized = request.ioOptimized;
            this.priorityStrategy = request.priorityStrategy;
            this.networkType = request.networkType;
            this.zoneMatchMode = request.zoneMatchMode;
            this.maxPrice = request.maxPrice;
            this.spotStrategy = request.spotStrategy;
            this.memory = request.memory;
            this.instanceTypeFamily = request.instanceTypeFamily;
            this.instanceFamilyLevel = request.instanceFamilyLevel;
            this.scene = request.scene;
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
         * The number of vCPU cores of the ECS instance.
         * <p>
         * 
         * > If both the "Cores" and "memore" parameters are specified, all instance types that meet the vCPU cores and memory size are matched.
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the zone. You can call [DescribeZones](~~ 25610 ~~) to view the latest list of Alibaba Cloud zones.
         * <p>
         * 
         * We recommend that you set the value to ZoneMatchMode (default) at the same time. We recommend that you select the instance types in the zone specified by ZoneId and list the instance types in other zones in the same region.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The billing method of the ECS instance. For more information, see [billing Overview](~~ 25398 ~~). Valid values:
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
         * The type of the instance. For more information, see [instance type family](~~ 25378 ~~), or call [DescribeInstanceTypes](~~ 25620 ~~) to obtain the latest specification.
         * <p>
         * 
         * > If you specify "InstanceType", you cannot specify "Cores" or "memore ".
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The type of the system disk. Valid values:
         * <p>
         * 
         * -cloud_efficiency: Ultra disk
         * -cloud_ssd:SSD cloud disk
         * -cloud_essd:ESSD
         * -cloud: basic cloud disk
         * 
         * Default value for non-I/O optimized instances: cloud
         * 
         * Default value for I/O optimized instances: cloud_efficiency
         */
        public Builder systemDiskCategory(String systemDiskCategory) {
            this.putQueryParameter("SystemDiskCategory", systemDiskCategory);
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }

        /**
         * Indicates whether the instance is I/O optimized. The instance type only supports non-I/O optimization and cannot be IoOptimized. Valid values:
         * <p>
         * 
         * -optimized:I/O optimized
         * -none: Non-IO optimization
         * 
         * Default value: optimized
         * 
         * If you set the phased-out instance type. Default value: none
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * The recommended policy is preferred. Valid values:
         * <p>
         * 
         * -InventoryFirst: Inventory takes precedence.
         * -PriceFirst: The price takes precedence, which is sorted by the unit price of vCPU per hour from low to high.
         * -NewProductFirst: the latest product is preferred.
         * 
         * Default value: InventoryFirst
         */
        public Builder priorityStrategy(String priorityStrategy) {
            this.putQueryParameter("PriorityStrategy", priorityStrategy);
            this.priorityStrategy = priorityStrategy;
            return this;
        }

        /**
         * The network type of the ECS instance. Valid values:
         * <p>
         * 
         * -classic: classic Network
         * -vpc: VPC
         * 
         * Default value: vpc
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * Indicates whether to recommend only the instance types in the zone specified by ZoneId. Valid values:
         * <p>
         * 
         * -Strict: only the instance types in the zone specified by ZoneId are recommended.
         * 
         * -Include: We recommend that you use instance types in other zones in the same region.
         * 
         * 
         * When "ZoneId" is specified, the default value of this parameter is Strict, which indicates that only the instance types in the zone specified by ZoneId are recommended.
         */
        public Builder zoneMatchMode(String zoneMatchMode) {
            this.putQueryParameter("ZoneMatchMode", zoneMatchMode);
            this.zoneMatchMode = zoneMatchMode;
            return this;
        }

        /**
         * The maximum hourly price for a pay-as-you-go or preemptible instance.
         * <p>
         * 
         * > when you set the maximum unit price for a preemptible instance, you must set "spotstratege" to "spotwithpricelime ".
         */
        public Builder maxPrice(Float maxPrice) {
            this.putQueryParameter("MaxPrice", maxPrice);
            this.maxPrice = maxPrice;
            return this;
        }

        /**
         * The bidding policy for preemptible instances. Valid values:
         * <p>
         * 
         * -NoSpot: a pay-as-you-go instance.
         * -SpotWithPriceLimit: sets the maximum price for preemptible instances.
         * -SpotAsPriceGo: the system automatically bids at the highest pay-as-you-go price.
         * 
         * > when "SpotStrategy" is used, "InstanceChargerType" must be set to "PostPaid ".
         * 
         * Default value: NoSpot
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The memory size of the ECS instance. Unit: GiB.
         * <p>
         * 
         * > if both the "Cores" and "memore" parameters are specified, all instance types that meet the vCPU cores and memory size are matched.
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * You can call this operation to filter instances that are not accepted. Valid values of N: 1 to 10. For more information, see [instance type family](~~ 25378 ~~). You can also call [DescribeInstanceTypeFamilys](~~ 25620 ~~) to query the list of instance families.
         */
        public Builder instanceTypeFamily(java.util.List < String > instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * The instance type family. Valid values:
         * <p>
         * 
         * -EntryLevel: entry-level.
         * -EnterpriseLevel: enterprise-level.
         * -CreditEntryLevel: the entry level of points. For more information, see [burstable instances](~~ 59977 ~~).
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * The recommended instance type. Valid values:
         * <p>
         * 
         * -UPGRADE: UPGRADE or downgrade the instance type.
         * -CREATE: creates an instance.
         * 
         * Default value: CREATE
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public DescribeRecommendInstanceTypeRequest build() {
            return new DescribeRecommendInstanceTypeRequest(this);
        } 

    } 

}
