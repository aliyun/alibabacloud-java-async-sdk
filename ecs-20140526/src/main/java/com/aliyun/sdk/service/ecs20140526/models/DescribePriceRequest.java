// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceRequest} extends {@link RequestModel}
 *
 * <p>DescribePriceRequest</p>
 */
public class DescribePriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchedulerOptions")
    private SchedulerOptions schedulerOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssuranceTimes")
    private String assuranceTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Capacity")
    private Integer capacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostType")
    private String dedicatedHostType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceAmount")
    private Integer instanceAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceCpuCoreCount")
    private Integer instanceCpuCoreCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeList")
    private java.util.List < String > instanceTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoOptimized")
    private String ioOptimized;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfferingType")
    private String offeringType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PriceUnit")
    private String priceUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotDuration")
    private Integer spotDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribePriceRequest(Builder builder) {
        super(builder);
        this.dataDisk = builder.dataDisk;
        this.schedulerOptions = builder.schedulerOptions;
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.amount = builder.amount;
        this.assuranceTimes = builder.assuranceTimes;
        this.capacity = builder.capacity;
        this.dedicatedHostType = builder.dedicatedHostType;
        this.imageId = builder.imageId;
        this.instanceAmount = builder.instanceAmount;
        this.instanceCpuCoreCount = builder.instanceCpuCoreCount;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.instanceType = builder.instanceType;
        this.instanceTypeList = builder.instanceTypeList;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.ioOptimized = builder.ioOptimized;
        this.isp = builder.isp;
        this.offeringType = builder.offeringType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.platform = builder.platform;
        this.priceUnit = builder.priceUnit;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
        this.scope = builder.scope;
        this.spotDuration = builder.spotDuration;
        this.spotStrategy = builder.spotStrategy;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataDisk
     */
    public java.util.List < DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return schedulerOptions
     */
    public SchedulerOptions getSchedulerOptions() {
        return this.schedulerOptions;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return assuranceTimes
     */
    public String getAssuranceTimes() {
        return this.assuranceTimes;
    }

    /**
     * @return capacity
     */
    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * @return dedicatedHostType
     */
    public String getDedicatedHostType() {
        return this.dedicatedHostType;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceAmount
     */
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    /**
     * @return instanceCpuCoreCount
     */
    public Integer getInstanceCpuCoreCount() {
        return this.instanceCpuCoreCount;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceTypeList
     */
    public java.util.List < String > getInstanceTypeList() {
        return this.instanceTypeList;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return offeringType
     */
    public String getOfferingType() {
        return this.offeringType;
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
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return priceUnit
     */
    public String getPriceUnit() {
        return this.priceUnit;
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return spotDuration
     */
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribePriceRequest, Builder> {
        private java.util.List < DataDisk> dataDisk; 
        private SchedulerOptions schedulerOptions; 
        private SystemDisk systemDisk; 
        private String sourceRegionId; 
        private Integer amount; 
        private String assuranceTimes; 
        private Integer capacity; 
        private String dedicatedHostType; 
        private String imageId; 
        private Integer instanceAmount; 
        private Integer instanceCpuCoreCount; 
        private String instanceNetworkType; 
        private String instanceType; 
        private java.util.List < String > instanceTypeList; 
        private String internetChargeType; 
        private Integer internetMaxBandwidthOut; 
        private String ioOptimized; 
        private String isp; 
        private String offeringType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String platform; 
        private String priceUnit; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourceType; 
        private String scope; 
        private Integer spotDuration; 
        private String spotStrategy; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePriceRequest request) {
            super(request);
            this.dataDisk = request.dataDisk;
            this.schedulerOptions = request.schedulerOptions;
            this.systemDisk = request.systemDisk;
            this.sourceRegionId = request.sourceRegionId;
            this.amount = request.amount;
            this.assuranceTimes = request.assuranceTimes;
            this.capacity = request.capacity;
            this.dedicatedHostType = request.dedicatedHostType;
            this.imageId = request.imageId;
            this.instanceAmount = request.instanceAmount;
            this.instanceCpuCoreCount = request.instanceCpuCoreCount;
            this.instanceNetworkType = request.instanceNetworkType;
            this.instanceType = request.instanceType;
            this.instanceTypeList = request.instanceTypeList;
            this.internetChargeType = request.internetChargeType;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.ioOptimized = request.ioOptimized;
            this.isp = request.isp;
            this.offeringType = request.offeringType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.platform = request.platform;
            this.priceUnit = request.priceUnit;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceType = request.resourceType;
            this.scope = request.scope;
            this.spotDuration = request.spotDuration;
            this.spotStrategy = request.spotStrategy;
            this.zoneId = request.zoneId;
        } 

        /**
         * DataDisk.
         */
        public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
            this.putQueryParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * SchedulerOptions.
         */
        public Builder schedulerOptions(SchedulerOptions schedulerOptions) {
            this.putQueryParameter("SchedulerOptions", schedulerOptions);
            this.schedulerOptions = schedulerOptions;
            return this;
        }

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.putQueryParameter("SystemDisk", systemDisk);
            this.systemDisk = systemDisk;
            return this;
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
         * The number of ECS instances. You can specify this parameter when you want to query the prices of multiple instances that have specific specifications. Valid values: 1 to 1000.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * The total number of times that the elasticity assurance can be applied. Set the value to Unlimited. This value indicates that the elasticity assurance can be applied an unlimited number of times within its effective period.
         * <p>
         * 
         * Default value: Unlimited.
         */
        public Builder assuranceTimes(String assuranceTimes) {
            this.putQueryParameter("AssuranceTimes", assuranceTimes);
            this.assuranceTimes = assuranceTimes;
            return this;
        }

        /**
         * The storage capacity. Unit: GiB.
         */
        public Builder capacity(Integer capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * The type of the dedicated host. You can call the [DescribeDedicatedHostTypes](~~134240~~) operation to query the most recent list of dedicated host types.
         */
        public Builder dedicatedHostType(String dedicatedHostType) {
            this.putQueryParameter("DedicatedHostType", dedicatedHostType);
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }

        /**
         * This parameter takes effect only when ResourceType is set to instance.
         * <p>
         * 
         * The image ID. Images contain the runtime environments to load when instances start. You can call the [DescribeImages](~~25534~~) operation to query available images. If you do not specify this parameter, the system queries the prices of Linux images.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The total number of reserved instances for an instance type.
         * <p>
         * 
         * Valid values: 1 to 1000.
         */
        public Builder instanceAmount(Integer instanceAmount) {
            this.putQueryParameter("InstanceAmount", instanceAmount);
            this.instanceAmount = instanceAmount;
            return this;
        }

        /**
         * The total number of vCPUs supported by the elasticity assurance. When you call this API operation, the system calculates the number of instances that an elasticity assurance must support based on the specified value of InstanceType. The calculated value is rounded up to the nearest integer.
         * <p>
         * 
         * > When you call this API operation to query the price of an elasticity assurance, you can only specify either InstanceCoreCpuCount or InstanceAmount.
         */
        public Builder instanceCpuCoreCount(Integer instanceCpuCoreCount) {
            this.putQueryParameter("InstanceCpuCoreCount", instanceCpuCoreCount);
            this.instanceCpuCoreCount = instanceCpuCoreCount;
            return this;
        }

        /**
         * The network type of the instance. Valid values:
         * <p>
         * 
         * *   classic: classic network
         * *   vpc: Virtual Private Cloud (VPC)
         * 
         * Default value: vpc.
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * The instance type. When `ResourceType` is set to `instance`, you must specify this parameter. For more information, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent list of instance types.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The instance types. You can select only a single instance type when you configure an elasticity assurance in unlimited mode.
         */
        public Builder instanceTypeList(java.util.List < String > instanceTypeList) {
            this.putQueryParameter("InstanceTypeList", instanceTypeList);
            this.instanceTypeList = instanceTypeList;
            return this;
        }

        /**
         * The billing method for network usage. Valid values:
         * <p>
         * 
         * *   PayByBandwidth: pay-by-bandwidth
         * *   PayByTraffic: pay-by-traffic
         * 
         * Default value: PayByTraffic
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
         * <p>
         * 
         * Default value: 0.
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * Specifies whether the instance is I/O optimized. Valid values:
         * <p>
         * 
         * *   none: The instance is not I/O optimized.
         * *   optimized: The instance is I/O optimized.
         * 
         * When the instance type specified by the InstanceType parameter belongs to [Generation I instance families](~~55263~~), the default value of this parameter is none.
         * 
         * When the instance type specified by the InstanceType parameter does not belong to [Generation I instance families](~~55263~~), the default value of this parameter is optimized.
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * The Internet service provider (ISP). Valid values:
         * <p>
         * 
         * *   cmcc: China Mobile
         * *   telecom: China Telecom
         * *   unicom: China Unicom
         * *   multiCarrier: multi-line ISP
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * The payment option of the reserved instance. Valid values:
         * <p>
         * 
         * *   No Upfront
         * *   Partial Upfront
         * *   All Upfront
         */
        public Builder offeringType(String offeringType) {
            this.putQueryParameter("OfferingType", offeringType);
            this.offeringType = offeringType;
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
         * The billing cycle of the ECS instance. Valid values:
         * <p>
         * 
         * *   Valid values when PriceUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, and 9.
         * *   Valid values when PriceUnit is set to Year: 1, 2, 3, 4, and 5.
         * *   Set the value to 1 when PriceUnit is set to Hour.
         * 
         * Default value: 1.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The operating system of the image that is used by the instance. Valid values:
         * <p>
         * 
         * *   Windows: Windows Server operating system
         * *   Linux: Linux and UNIX-like operating system
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * The pricing unit of the ECS resource. Valid values:
         * <p>
         * 
         * *   Month
         * *   Year
         * *   Hour (default)
         */
        public Builder priceUnit(String priceUnit) {
            this.putQueryParameter("PriceUnit", priceUnit);
            this.priceUnit = priceUnit;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.
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
         * The resource type. Valid values:
         * <p>
         * 
         * *   instance: queries the most recent prices of ECS instances. When this parameter is set to `instance`, you must specify `InstanceType`.
         * *   disk: queries the most recent prices of cloud disks. When this parameter is set to `disk`, you must specify `DataDisk.1.Category` and `DataDisk.1.Size`.
         * *   bandwidth: queries the most recent prices of network usage.
         * *   ddh: queries the most recent prices of dedicated hosts.
         * *   ElasticityAssurance: queries the most recent prices of elasticity assurances. When this parameter is set to `ElasticityAssurance`, you must specify `InstanceType`.
         * *   CapacityReservation: queries the most recent prices of capacity reservations. When this parameter is set to `CapacityReservation`, you must specify `InstanceType`.
         * 
         * Default value: instance.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The scope of the reserved instance. Valid values:
         * <p>
         * 
         * *   Region: regional
         * *   Zone: zonal
         * 
         * Default value: Region.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * The protection period of the preemptible instance. Unit: hours. Default value: 1. Valid values:
         * <p>
         * 
         * *   1: After a preemptible instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.
         * *   0: After a preemptible instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.
         * 
         * Alibaba Cloud sends an ECS system event to notify you 5 minutes before the instance is released. Preemptible instances are billed by second. We recommend that you specify a protection period based on your business requirements.
         * 
         * >  This parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit or SpotAsPriceGo.
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * The bidding policy for the pay-as-you-go instance. Valid values:
         * <p>
         * 
         * *   NoSpot: The instance is a regular pay-as-you-go instance.
         * *   SpotWithPriceLimit: The instance is created as a preemptible instance that has a user-defined maximum hourly price.
         * *   SpotAsPriceGo: The instance is created as a preemptible instance whose bid price is based on the market price at the time of purchase. The market price can be up to the pay-as-you-go price.
         * 
         * Default value: NoSpot.
         * 
         * >  This parameter takes effect only when `PriceUnit` is set to Hour and `Period` is set to 1. The default value of `PriceUnit` is `Hour` and the default value of `Period` is `1`. Therefore, you do not need to set `PriceUnit` or `Period` when you set SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The zone ID.
         * <p>
         * 
         * > Prices of preemptible instances vary based on zones. When you query the price of a preemptible instance, specify ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribePriceRequest build() {
            return new DescribePriceRequest(this);
        } 

    } 

    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private DataDisk(Builder builder) {
            this.category = builder.category;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private String performanceLevel; 
            private Long size; 

            /**
             * The category of data disk N. Valid values:
             * <p>
             * 
             * *   cloud: basic disk
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
             * *   ephemeral_ssd: local SSD
             * *   cloud_essd: ESSD
             * *   cloud_auto: ESSD AutoPL disk
             * 
             * Valid values of N: 1 to 16.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The performance level of data disk N when the disk is an ESSD. This parameter takes effect only when `DataDisk.N.Category` is set to cloud_essd. Valid values:
             * <p>
             * 
             * *   PL0
             * *   PL1 (default)
             * *   PL2
             * *   PL3
             * 
             * Valid values of N: 1 to 16.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The size of data disk N. Unit: GiB. Valid values:
             * <p>
             * 
             * *   Valid values when DataDisk.N.Category is set to cloud: 5 to 2000.
             * 
             * *   Valid values when DataDisk.N.Category is set to cloud_efficiency: 20 to 32768.
             * 
             * *   Valid values when DataDisk.N.Category is set to cloud_ssd: 20 to 32768.
             * 
             * *   Valid values when DataDisk.N.Category is set to cloud_auto: 1 to 32768.
             * 
             * *   Valid values when DataDisk.N.Category is set to cloud_essd: vary based on the value of `DataDisk.N.PerformanceLevel`.
             * 
             *     *   Valid values when DataDisk.N.PerformanceLevel is set to PL0: 1 to 32768.
             *     *   Valid values when DataDisk.N.PerformanceLevel is set to PL1: 20 to 32768.
             *     *   Valid values when DataDisk.N.PerformanceLevel is set to PL2: 461 to 32768.
             *     *   Valid values when DataDisk.N.PerformanceLevel is set to PL3: 1261 to 32768.
             * 
             * *   Valid values when DataDisk.N.Category is set to ephemeral_ssd: 5 to 800.
             * 
             * Valid values of N: 1 to 16.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    public static class SchedulerOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        private SchedulerOptions(Builder builder) {
            this.dedicatedHostId = builder.dedicatedHostId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulerOptions create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostId
         */
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public static final class Builder {
            private String dedicatedHostId; 

            /**
             * This parameter takes effect only when ResourceType is set to instance.
             * <p>
             * 
             * The ID of the dedicated host. You can call the [DescribeDedicatedHosts](~~134242~~) operation to query the dedicated host list.
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            public SchedulerOptions build() {
                return new SchedulerOptions(this);
            } 

        } 

    }
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private String performanceLevel; 
            private Integer size; 

            /**
             * The category of the system disk. Valid values:
             * <p>
             * 
             * *   cloud: basic disk
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
             * *   ephemeral_ssd: local SSD
             * *   cloud_essd: Enterprise SSD (ESSD)
             * *   cloud_auto: ESSD AutoPL disk
             * 
             * Default value:
             * 
             * *   When InstanceType is set to a retired instance type and `IoOptimized` is set to `none`, the default value is `cloud`.
             * *   In other cases, the default value is `cloud_efficiency`.
             * 
             * >  If you want to query the price of a system disk, you must also specify `ImageId`.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The performance level of the system disk when the disk is an ESSD. This parameter is valid only when `SystemDiskCategory` is set to cloud_essd. Valid values:
             * <p>
             * 
             * PL0, PL1 (default), PL2, PL3.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The size of the system disk. Unit: GiB. Valid values:
             * <p>
             * 
             * *   Basic disk (cloud): 20 to 500.
             * 
             * *   ESSD (cloud_essd): Valid values vary based on the SystemDisk.PerformanceLevel value.
             * 
             *     *   Valid values when SystemDisk.PerformanceLevel is set to PL0: 1 to 2048.
             *     *   Valid values when SystemDisk.PerformanceLevel is set to PL1: 20 to 2048.
             *     *   Valid values when SystemDisk.PerformanceLevel is set to PL2: 461 to 2048.
             *     *   Valid values when SystemDisk.PerformanceLevel is set to PL3: 1261 to 2048.
             * 
             * *   ESSD AutoPL disk (cloud_auto): 1 to 2048.
             * 
             * *   Other disk categories: 20 to 2048.
             * 
             * Default value: 20 or the size of the image specified by ImageId, whichever is greater.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
}
