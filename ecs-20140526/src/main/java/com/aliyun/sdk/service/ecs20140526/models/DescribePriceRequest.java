// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceRequest} extends {@link RequestModel}
 *
 * <p>DescribePriceRequest</p>
 */
public class DescribePriceRequest extends Request {
    @Query
    @NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @Query
    @NameInMap("SchedulerOptions")
    private SchedulerOptions schedulerOptions;

    @Query
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("Amount")
    private Integer amount;

    @Query
    @NameInMap("AssuranceTimes")
    private String assuranceTimes;

    @Query
    @NameInMap("Capacity")
    private Integer capacity;

    @Query
    @NameInMap("DedicatedHostType")
    private String dedicatedHostType;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("InstanceAmount")
    private Integer instanceAmount;

    @Query
    @NameInMap("InstanceCpuCoreCount")
    private Integer instanceCpuCoreCount;

    @Query
    @NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("InstanceTypeList")
    private java.util.List < String > instanceTypeList;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("IoOptimized")
    private String ioOptimized;

    @Query
    @NameInMap("Isp")
    private String isp;

    @Query
    @NameInMap("OfferingType")
    private String offeringType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("PriceUnit")
    private String priceUnit;

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
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("SpotDuration")
    private Integer spotDuration;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("ZoneId")
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
         * The total number of times that the elasticity assurance can be applied. Set the value to Unlimited. This value indicates that the elasticity assurance can be applied an unlimited number of times within its effective duration.
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
         * Capacity.
         */
        public Builder capacity(Integer capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * The dedicated host type. You can call the [DescribeDedicatedHostTypes](~~134240~~) operation to obtain the most recent list of dedicated host types.
         */
        public Builder dedicatedHostType(String dedicatedHostType) {
            this.putQueryParameter("DedicatedHostType", dedicatedHostType);
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }

        /**
         * The ID of the image. Images contain the runtime environment to load when instances start. You can call the [DescribeImages](~~25534~~) operation to query the available images. If you do not specify this parameter, the system queries the prices of Linux images.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * InstanceAmount.
         */
        public Builder instanceAmount(Integer instanceAmount) {
            this.putQueryParameter("InstanceAmount", instanceAmount);
            this.instanceAmount = instanceAmount;
            return this;
        }

        /**
         * InstanceCpuCoreCount.
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
         * The instance type. When the `ResourceType` parameter is set to `instance`, you must specify the InstanceType parameter. For more information, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent instance type list.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * InstanceTypeList.
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
         * Default value: PayByTraffic.
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
         * If the instance type specified by the InstanceType parameter belongs to [Generation I instance families](~~55263~~), the default value is none.
         * 
         * If the instance type specified by the InstanceType parameter does not belong to [Generation I instance families](~~55263~~), the default value is optimized.
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * Isp.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * OfferingType.
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
         * Default value: 1
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * The pricing unit of the ECS resource. Default value: Hour. Valid values:
         * <p>
         * 
         * *   Month
         * *   Year
         * *   Hour
         */
        public Builder priceUnit(String priceUnit) {
            this.putQueryParameter("PriceUnit", priceUnit);
            this.priceUnit = priceUnit;
            return this;
        }

        /**
         * The region ID of the ECS resource. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
         * The type of the resource. Valid values:
         * <p>
         * 
         * *   instance: queries the most recent prices of ECS instances. When this parameter is set to `instance`, you must specify the `InstanceType` parameter.
         * *   disk: queries the most recent prices of disks. When this parameter is set to `disk`, you must specify both the `DataDisk.1.Category` and `DataDisk.1.Size` parameters.
         * *   bandwidth: queries the most recent prices for network usage.
         * *   ddh: queries the most recent prices of dedicated hosts.
         * *   ElasticityAssurance: queries the most recent prices of elasticity assurances. When this parameter is set to `ElasticityAssurance`, you must specify the `InstanceType` parameter.
         * *   ElasticityAssurance: queries the most recent prices of capacity reservations. When this parameter is set to `CapacityReservation`, you must specify the `InstanceType` parameter.
         * 
         * Default value: instance.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * The protection period of the preemptible instance. Unit: hours. Valid values: 0, 1, 2, 3, 4, 5, and 6.
         * <p>
         * 
         * *   Protection periods of 2, 3, 4, 5, and 6 hours are in invitational preview. If you want to set this parameter to one of these values, submit a ticket.
         * *   If this parameter is set to 0, no protection period is configured for the preemptible instance.
         * 
         * Default value: 1.
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * The preemption policy for the pay-as-you-go instance. Valid values:
         * <p>
         * 
         * *   NoSpot: The instance is a regular pay-as-you-go instance.
         * *   SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.
         * *   SpotAsPriceGo: The instance is a preemptible instance for which the market price is automatically used as the bid price. The market price can be up to the pay-as-you-go price.
         * 
         * Default value: NoSpot.
         * 
         * >  This parameter is valid only when the `PriceUnit` parameter is set to Hour and the `Period` parameter is set to 1. The default value of the `PriceUnit` parameter is `Hour` and the default value of the `Period` parameter is `1`. Therefore, you do not need to set the `PriceUnit` and `Period` parameters when you set the SpotStrategy parameter.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The zone ID of the ECS resource.
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
        @NameInMap("Category")
        private String category;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Size")
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
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * Size.
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
        @NameInMap("DedicatedHostId")
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
             * DedicatedHostId.
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
        @NameInMap("Category")
        private String category;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Size")
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
             * *   cloud_essd: enhanced SSD (ESSD)
             * 
             * Description of the default values:
             * 
             * *   When the InstanceType parameter is set to a retired instance type and the `IoOptimized` parameter is set to `none`, the default value of this parameter is `cloud`.
             * *   In other cases, the default value of this parameter is `cloud_efficiency`.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The performance level of the system disk when it is an ESSD. This parameter is valid only when the `SystemDiskCategory` parameter is set to cloud_essd. Default value: PL1. Valid values:
             * <p>
             * 
             * *   PL0
             * *   PL1
             * *   PL2
             * *   PL3
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The size of the system disk. Unit: GiB. Valid values: 20 to 500.
             * <p>
             * 
             * Default value: 40 or the image size, whichever is greater.
             * 
             * >  The value of this parameter must be at least 20 and greater than or equal to the image size.
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
