// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Memory")
    private Float memory;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("Scene")
    private String scene;

    @Query
    @NameInMap("Cores")
    private Integer cores;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("PriorityStrategy")
    private String priorityStrategy;

    @Query
    @NameInMap("MaxPrice")
    private Float maxPrice;

    @Query
    @NameInMap("SystemDiskCategory")
    private String systemDiskCategory;

    @Query
    @NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("InstanceTypeFamily")
    private java.util.List < String > instanceTypeFamily;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("ZoneMatchMode")
    private String zoneMatchMode;

    @Query
    @NameInMap("NetworkType")
    private String networkType;

    @Query
    @NameInMap("IoOptimized")
    private String ioOptimized;

    private DescribeRecommendInstanceTypeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.memory = builder.memory;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scene = builder.scene;
        this.cores = builder.cores;
        this.zoneId = builder.zoneId;
        this.instanceType = builder.instanceType;
        this.regionId = builder.regionId;
        this.priorityStrategy = builder.priorityStrategy;
        this.maxPrice = builder.maxPrice;
        this.systemDiskCategory = builder.systemDiskCategory;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.spotStrategy = builder.spotStrategy;
        this.zoneMatchMode = builder.zoneMatchMode;
        this.networkType = builder.networkType;
        this.ioOptimized = builder.ioOptimized;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
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
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return priorityStrategy
     */
    public String getPriorityStrategy() {
        return this.priorityStrategy;
    }

    /**
     * @return maxPrice
     */
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    /**
     * @return systemDiskCategory
     */
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    /**
     * @return instanceFamilyLevel
     */
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceTypeFamily
     */
    public java.util.List < String > getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return zoneMatchMode
     */
    public String getZoneMatchMode() {
        return this.zoneMatchMode;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public static final class Builder extends Request.Builder<DescribeRecommendInstanceTypeRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private Long resourceOwnerId; 
        private Float memory; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String scene; 
        private Integer cores; 
        private String zoneId; 
        private String instanceType; 
        private String regionId; 
        private String priorityStrategy; 
        private Float maxPrice; 
        private String systemDiskCategory; 
        private String instanceFamilyLevel; 
        private String instanceChargeType; 
        private java.util.List < String > instanceTypeFamily; 
        private String spotStrategy; 
        private String zoneMatchMode; 
        private String networkType; 
        private String ioOptimized; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecommendInstanceTypeRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerAccount = response.ownerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.memory = response.memory;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.scene = response.scene;
            this.cores = response.cores;
            this.zoneId = response.zoneId;
            this.instanceType = response.instanceType;
            this.regionId = response.regionId;
            this.priorityStrategy = response.priorityStrategy;
            this.maxPrice = response.maxPrice;
            this.systemDiskCategory = response.systemDiskCategory;
            this.instanceFamilyLevel = response.instanceFamilyLevel;
            this.instanceChargeType = response.instanceChargeType;
            this.instanceTypeFamily = response.instanceTypeFamily;
            this.spotStrategy = response.spotStrategy;
            this.zoneMatchMode = response.zoneMatchMode;
            this.networkType = response.networkType;
            this.ioOptimized = response.ioOptimized;
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
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The memory size of the ECS instance. Unit: GiB.
         * <p>
         * 
         * > If both the "Cores" and "memore" parameters are specified, all instance types that meet the vCPU cores and memory size are matched.
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
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
         * The ID of the zone. You can call [DescribeZones](~~ 25610 ~~) to view the latest list of Alibaba Cloud zones.
         * <p>
         * 
         * Proposal also ZoneMatchMode value for Include (default), priority recommended ZoneId specified available area the instance in the dimension and lists with geographical lower other available area the instance in the specifications.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
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
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * Quantity pay instance or preemptive instance acceptable per hour highest price.
         * <p>
         * 
         * > settings preemptive instance the highest unit price when "spotstrategy" must be set to "spotwithpricelimit ".
         */
        public Builder maxPrice(Float maxPrice) {
            this.putQueryParameter("MaxPrice", maxPrice);
            this.maxPrice = maxPrice;
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
         * Non-I/O optimized instances default: cloud
         * 
         * I/O optimization default value for instances of the: cloud_efficiency
         */
        public Builder systemDiskCategory(String systemDiskCategory) {
            this.putQueryParameter("SystemDiskCategory", systemDiskCategory);
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }

        /**
         * Instance dimension family level. Valid values:
         * <p>
         * 
         * -EntryLevel: entry-level.
         * -EnterpriseLevel: enterprise-class.
         * -CreditEntryLevel: integral entry-level. Details please see [burst performance instance](~~ 59977 ~~).
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * ECS instance billing. For more details, see [billing Overview](~~ 25398 ~~). Valid values:
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
         * Filter don"t adopt an instance of dimension family collection, N value range is 1~10. For more information, see [instance type family](~~ 25378 ~~). You can also call the [DescribeInstanceTypeFamilys](~~ 25620 ~~) query dimension family list.
         */
        public Builder instanceTypeFamily(java.util.List < String > instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * Preemptive instance bidding strategy. Valid values:
         * <p>
         * 
         * -NoSpot: a pay-as-you-go instance.
         * -SpotWithPriceLimit: sets the maximum price for preemptible instances.
         * -SpotAsPriceGo: The system automatically bids at the highest pay-as-you-go price.
         * 
         * > use "spotstrategy" when "instancechargertype" must be set to "postpaid ".
         * 
         * Default value: NoSpot
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * Whether only recommend ZoneId specified available area the instance in the specifications. Valid values:
         * <p>
         * 
         * -Strict: is only recommended ZoneId specified available area the instance in the specifications.
         * 
         * -Include: Recommended with geographical lower other available area the instance in the specifications.
         * 
         * 
         * When you specify "zoneid" when the default value of the parameter is Strict, only recommend ZoneId specified available area the instance in the specifications.
         */
        public Builder zoneMatchMode(String zoneMatchMode) {
            this.putQueryParameter("ZoneMatchMode", zoneMatchMode);
            this.zoneMatchMode = zoneMatchMode;
            return this;
        }

        /**
         * ECS instance network type. Valid values:
         * <p>
         * 
         * -classic: classic Network
         * -vpc: proprietary network VPC
         * 
         * Default: vpc
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * Indicates whether the instance is I/O optimized. Instance specification only support non-I/O optimization when cannot set IoOptimized parameters. Valid values:
         * <p>
         * 
         * -optimized:I/O optimized
         * -none: Non-IO optimization
         * 
         * Default value: optimized
         * 
         * If you set the IS stop instance specifications. Default value: none
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        @Override
        public DescribeRecommendInstanceTypeRequest build() {
            return new DescribeRecommendInstanceTypeRequest(this);
        } 

    } 

}
