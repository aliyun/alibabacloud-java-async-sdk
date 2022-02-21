// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OfferingType")
    private String offeringType;

    @Query
    @NameInMap("InstanceAmount")
    private Integer instanceAmount;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("Capacity")
    private Integer capacity;

    @Query
    @NameInMap("InstanceCpuCoreCount")
    private Integer instanceCpuCoreCount;

    @Query
    @NameInMap("Isp")
    private String isp;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("SpotDuration")
    private Integer spotDuration;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("AssuranceTimes")
    private String assuranceTimes;

    @Query
    @NameInMap("InstanceTypeList")
    private java.util.List < String > instanceTypeList;

    @Query
    @NameInMap("DedicatedHostType")
    private String dedicatedHostType;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("IoOptimized")
    private String ioOptimized;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("Amount")
    private Integer amount;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PriceUnit")
    private String priceUnit;

    @Query
    @NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    private DescribePriceRequest(Builder builder) {
        super(builder);
        this.systemDisk = builder.systemDisk;
        this.dataDisk = builder.dataDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.offeringType = builder.offeringType;
        this.instanceAmount = builder.instanceAmount;
        this.scope = builder.scope;
        this.platform = builder.platform;
        this.capacity = builder.capacity;
        this.instanceCpuCoreCount = builder.instanceCpuCoreCount;
        this.isp = builder.isp;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.instanceType = builder.instanceType;
        this.spotDuration = builder.spotDuration;
        this.zoneId = builder.zoneId;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.assuranceTimes = builder.assuranceTimes;
        this.instanceTypeList = builder.instanceTypeList;
        this.dedicatedHostType = builder.dedicatedHostType;
        this.spotStrategy = builder.spotStrategy;
        this.ioOptimized = builder.ioOptimized;
        this.imageId = builder.imageId;
        this.amount = builder.amount;
        this.period = builder.period;
        this.priceUnit = builder.priceUnit;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.internetChargeType = builder.internetChargeType;
        this.resourceType = builder.resourceType;
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
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return dataDisk
     */
    public java.util.List < DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return offeringType
     */
    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * @return instanceAmount
     */
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return capacity
     */
    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * @return instanceCpuCoreCount
     */
    public Integer getInstanceCpuCoreCount() {
        return this.instanceCpuCoreCount;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
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
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return spotDuration
     */
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return assuranceTimes
     */
    public String getAssuranceTimes() {
        return this.assuranceTimes;
    }

    /**
     * @return instanceTypeList
     */
    public java.util.List < String > getInstanceTypeList() {
        return this.instanceTypeList;
    }

    /**
     * @return dedicatedHostType
     */
    public String getDedicatedHostType() {
        return this.dedicatedHostType;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return priceUnit
     */
    public String getPriceUnit() {
        return this.priceUnit;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DescribePriceRequest, Builder> {
        private SystemDisk systemDisk; 
        private java.util.List < DataDisk> dataDisk; 
        private String sourceRegionId; 
        private String offeringType; 
        private Integer instanceAmount; 
        private String scope; 
        private String platform; 
        private Integer capacity; 
        private Integer instanceCpuCoreCount; 
        private String isp; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String instanceType; 
        private Integer spotDuration; 
        private String zoneId; 
        private Integer internetMaxBandwidthOut; 
        private String assuranceTimes; 
        private java.util.List < String > instanceTypeList; 
        private String dedicatedHostType; 
        private String spotStrategy; 
        private String ioOptimized; 
        private String imageId; 
        private Integer amount; 
        private Integer period; 
        private String priceUnit; 
        private String instanceNetworkType; 
        private String internetChargeType; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribePriceRequest response) {
            super(response);
            this.systemDisk = response.systemDisk;
            this.dataDisk = response.dataDisk;
            this.sourceRegionId = response.sourceRegionId;
            this.offeringType = response.offeringType;
            this.instanceAmount = response.instanceAmount;
            this.scope = response.scope;
            this.platform = response.platform;
            this.capacity = response.capacity;
            this.instanceCpuCoreCount = response.instanceCpuCoreCount;
            this.isp = response.isp;
            this.resourceOwnerId = response.resourceOwnerId;
            this.regionId = response.regionId;
            this.instanceType = response.instanceType;
            this.spotDuration = response.spotDuration;
            this.zoneId = response.zoneId;
            this.internetMaxBandwidthOut = response.internetMaxBandwidthOut;
            this.assuranceTimes = response.assuranceTimes;
            this.instanceTypeList = response.instanceTypeList;
            this.dedicatedHostType = response.dedicatedHostType;
            this.spotStrategy = response.spotStrategy;
            this.ioOptimized = response.ioOptimized;
            this.imageId = response.imageId;
            this.amount = response.amount;
            this.period = response.period;
            this.priceUnit = response.priceUnit;
            this.instanceNetworkType = response.instanceNetworkType;
            this.internetChargeType = response.internetChargeType;
            this.resourceType = response.resourceType;
        } 

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * DataDisk.
         */
        public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
            this.dataDisk = dataDisk;
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
         * OfferingType.
         */
        public Builder offeringType(String offeringType) {
            this.putQueryParameter("OfferingType", offeringType);
            this.offeringType = offeringType;
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
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
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
         * Capacity.
         */
        public Builder capacity(Integer capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
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
         * Isp.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
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
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the instance. When the value of "ResourceType" is "instance", you must specify this parameter at the same time. For more information, see [instance type family](~~ 25378 ~~), or call [DescribeInstanceTypes](~~ 25620 ~~) to obtain the latest specification.
         * <p>
         * 
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The retention period of a preemptible instance. Unit: hours. Valid values: 0 to 6.
         * <p>
         * 
         * -The retention period is 2 to 6 and is being invited for testing. If you want to activate the service, submit a ticket.
         * -If the value is 0, the mode is not protected.
         * 
         * Default value: 1.
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * The ID of the zone.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The maximum outbound Internet bandwidth. Unit: Mbit/s(Megabit per second). Valid values: 0 to 100.
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
         * The total number of elastic guarantees. Set the value to Unlimited. Currently, the Unlimited mode is supported only when the service takes effect.
         * <p>
         * 
         * Default value: Unlimited
         */
        public Builder assuranceTimes(String assuranceTimes) {
            this.putQueryParameter("AssuranceTimes", assuranceTimes);
            this.assuranceTimes = assuranceTimes;
            return this;
        }

        /**
         * The instance type. Currently, you can only set a single instance type for unlimited guarantee services.
         */
        public Builder instanceTypeList(java.util.List < String > instanceTypeList) {
            this.putQueryParameter("InstanceTypeList", instanceTypeList);
            this.instanceTypeList = instanceTypeList;
            return this;
        }

        /**
         * The specification of the dedicated host. You can call the [DescribeDedicatedHostTypes](~~ 134240 ~~) API to obtain the latest DDH specifications.
         */
        public Builder dedicatedHostType(String dedicatedHostType) {
            this.putQueryParameter("DedicatedHostType", dedicatedHostType);
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }

        /**
         * The preemptible policy of the pay-as-you-go instance. Valid values:
         * <p>
         * -NoSpot: a pay-as-you-go instance.
         * -SpotWithPriceLimit: sets the maximum price for preemptible instances.
         * -SpotAsPriceGo: The system automatically bids at the highest pay-as-you-go price.
         * 
         * Default value: NoSpot
         * 
         * > When "priceunit = hour", "period = 1" when the parameter to be effective. Because "priceunit" default value for "hour", "period" default value for "1", so you set the parameter value, do not need to set "priceunit" and "period" parameter value.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * Query whether an instance of for the I/O optimization instance. Valid values:
         * <p>
         * 
         * -none: Non-I/O optimized
         * -optimized:I/O optimized
         * 
         * When InstanceType is [series I](~~ 55263 ~~) specification, the default value is none.
         * 
         * When InstanceType non-[series I](~~ 55263 ~~) dimension when the default is optimized.
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * Mirror ID, said when launching an instance hope loading operating environment. You can call the [DescribeImages](~~ 25534 ~~) query your available mirroring resources. If you do not specify, default query Linux system Image price.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * Query bulk buy a configured cloud server ECS price. Valid values: 1 to 1000.
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
         * Cloud server ECS billing length. Valid values:
         * <p>
         * 
         * <props="china">
         * -Valid values: 1 to 9 when the PriceUnit parameter is set to Month.
         * -Valid values: 1 to 5 when the PriceUnit parameter is set to Year.
         * -1 when the PriceUnit parameter is set to Hour
         * -If the PriceUnit parameter is set to Week, valid values: 1 to 4.
         * 
         * </props>
         * 
         * <props="intl">
         * -Valid values: 1 to 9 when the PriceUnit parameter is set to Month.
         * -Valid values: 1 to 5 when the PriceUnit parameter is set to Year.
         * -1 when the PriceUnit parameter is set to Hour
         * 
         * </props>
         * 
         * Default value: 1.
         * 
         * 
         * 
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * Query cloud server ECS different billing cycle prices. Valid values:
         * <p>
         * 
         * <props="china">
         * -Month: monthly billing price unit.
         * -Year: annual billing price unit.
         * -Hour (default): charging by the Hour price unit.
         * -Week: by Week billing price unit.
         * 
         * </props>
         * 
         * <props="intl">
         * -Month: monthly billing price unit.
         * -Year: annual billing price unit.
         * -Hour (default): charging by the Hour price unit.
         * 
         * </props>
         * 
         */
        public Builder priceUnit(String priceUnit) {
            this.putQueryParameter("PriceUnit", priceUnit);
            this.priceUnit = priceUnit;
            return this;
        }

        /**
         * Instance network type. Valid values:
         * <p>
         * 
         * -classic: instance type of network for Classic network (classic).
         * -vpc: instance type of network for proprietary network (VPC).
         * 
         * Default: vpc
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * Network bandwidth billing. Valid values:
         * <p>
         * 
         * -PayByBandwidth: pay-by-bandwidth.
         * -PayByTraffic: bandwidth flowmeter fee.
         * 
         * Default: PayByTraffic
         * 
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * Target type of resource. Valid values:
         * <p>
         * -instance: query ECS instance the latest price list. When value for "instance" when parameter must also be specified "instancetype ".
         * -disk: query cloud the latest price list. When value for "disk" when parameter must also be specified "datadisk. 1. category" and "datadisk. 1.size ".
         * -bandwidth: query bandwidth the latest price list.
         * -ddh: query proprietary host the latest price list.
         * -ElasticityAssurance: query elastic security services price information. When value for "elasticityassurance" when parameter must also be specified "instancetype ".
         * -CapacityReservation: query capacity reservation service price information. When value for "capacityreservation" when parameter must also be specified "instancetype ".
         * 
         * Default value: instance
         * 
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DescribePriceRequest build() {
            return new DescribePriceRequest(this);
        } 

    } 

    public static class SystemDisk extends TeaModel {
        @NameInMap("Size")
        private Integer size;

        @NameInMap("Category")
        private String category;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        private SystemDisk(Builder builder) {
            this.size = builder.size;
            this.category = builder.category;
            this.performanceLevel = builder.performanceLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
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

        public static final class Builder {
            private Integer size; 
            private String category; 
            private String performanceLevel; 

            /**
             * The size of the system disk. Unit: GiB. Valid values: 20 to 500.
             * <p>
             * 
             * Default value: max{40. The size of the image corresponding to the parameter ImageId}.
             * 
             * > the value of this parameter must be greater than or equal to max{20, ImageSize}.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The type of the system disk. Valid values:
             * <p>
             * 
             * -cloud: basic cloud disk
             * -cloud_efficiency: Ultra disk
             * -cloud_ssd:SSD cloud disk
             * -ephemeral_ssd: local SSD
             * -cloud_essd:ESSD
             * 
             * Parameter default value description:
             * 
             * -If the InstanceType is a phased-out instance type and the value of "IoOptimized" is "none", the default value of this parameter is "cloud ".
             * -In other cases, the default value of this parameter is cloud_efficiency ".
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * System disk type ESSD cloud when distinguish performance level. Only when "systemdiskcategory = cloud_essd when the parameter is valid. Valid values:
             * <p>
             * 
             * -PL0
             * -PL1 (default)
             * -PL2
             * -PL3
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    public static class DataDisk extends TeaModel {
        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Category")
        private String category;

        @NameInMap("Size")
        private Integer size;

        private DataDisk(Builder builder) {
            this.performanceLevel = builder.performanceLevel;
            this.category = builder.category;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String performanceLevel; 
            private String category; 
            private Integer size; 

            /**
             * When the first data disk type is ESSD, the performance level is distinguished. This parameter is valid only when "DataDisk.1.Category = cloud_essd. Valid values:
             * <p>
             * 
             * -PL0
             * -PL1 (default)
             * -PL2
             * -PL3
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The first block of data plate the cloud species. Valid values:
             * <p>
             * 
             * -cloud: basic cloud disk
             * -cloud_efficiency: Ultra disk
             * -cloud_ssd:SSD cloud disk
             * -ephemeral_ssd: local SSD
             * -cloud_essd:ESSD
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The first block of data disk capacity size, memory units for GiB. Valid values:
             * <p>
             * 
             * -cloud:5~2000
             * -cloud_efficiency:20~32768
             * -cloud_ssd:20~32768
             * -cloud_essd:20~32768
             * -ephemeral_ssd:5~800
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
}
