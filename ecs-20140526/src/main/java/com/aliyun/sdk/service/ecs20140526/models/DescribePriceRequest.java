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
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Query
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
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("AssuranceTimes")
    private String assuranceTimes;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("SpotDuration")
    private Integer spotDuration;

    @Query
    @NameInMap("IoOptimized")
    private String ioOptimized;

    @Query
    @NameInMap("Amount")
    private Integer amount;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("DedicatedHostType")
    private String dedicatedHostType;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @Query
    @NameInMap("PriceUnit")
    private String priceUnit;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("InstanceTypeList")
    private java.util.List < String > instanceTypeList;

    @Query
    @NameInMap("ImageId")
    private String imageId;

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
        this.assuranceTimes = builder.assuranceTimes;
        this.zoneId = builder.zoneId;
        this.spotDuration = builder.spotDuration;
        this.ioOptimized = builder.ioOptimized;
        this.amount = builder.amount;
        this.spotStrategy = builder.spotStrategy;
        this.resourceType = builder.resourceType;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.dedicatedHostType = builder.dedicatedHostType;
        this.period = builder.period;
        this.instanceType = builder.instanceType;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.priceUnit = builder.priceUnit;
        this.internetChargeType = builder.internetChargeType;
        this.instanceTypeList = builder.instanceTypeList;
        this.imageId = builder.imageId;
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
     * @return assuranceTimes
     */
    public String getAssuranceTimes() {
        return this.assuranceTimes;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return spotDuration
     */
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return dedicatedHostType
     */
    public String getDedicatedHostType() {
        return this.dedicatedHostType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return priceUnit
     */
    public String getPriceUnit() {
        return this.priceUnit;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return instanceTypeList
     */
    public java.util.List < String > getInstanceTypeList() {
        return this.instanceTypeList;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
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
        private String assuranceTimes; 
        private String zoneId; 
        private Integer spotDuration; 
        private String ioOptimized; 
        private Integer amount; 
        private String spotStrategy; 
        private String resourceType; 
        private Integer internetMaxBandwidthOut; 
        private String dedicatedHostType; 
        private Integer period; 
        private String instanceType; 
        private String instanceNetworkType; 
        private String priceUnit; 
        private String internetChargeType; 
        private java.util.List < String > instanceTypeList; 
        private String imageId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePriceRequest request) {
            super(request);
            this.systemDisk = request.systemDisk;
            this.dataDisk = request.dataDisk;
            this.sourceRegionId = request.sourceRegionId;
            this.offeringType = request.offeringType;
            this.instanceAmount = request.instanceAmount;
            this.scope = request.scope;
            this.platform = request.platform;
            this.capacity = request.capacity;
            this.instanceCpuCoreCount = request.instanceCpuCoreCount;
            this.isp = request.isp;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.assuranceTimes = request.assuranceTimes;
            this.zoneId = request.zoneId;
            this.spotDuration = request.spotDuration;
            this.ioOptimized = request.ioOptimized;
            this.amount = request.amount;
            this.spotStrategy = request.spotStrategy;
            this.resourceType = request.resourceType;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.dedicatedHostType = request.dedicatedHostType;
            this.period = request.period;
            this.instanceType = request.instanceType;
            this.instanceNetworkType = request.instanceNetworkType;
            this.priceUnit = request.priceUnit;
            this.internetChargeType = request.internetChargeType;
            this.instanceTypeList = request.instanceTypeList;
            this.imageId = request.imageId;
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
         * DataDisk.
         */
        public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
            this.putQueryParameter("DataDisk", dataDisk);
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
         * The ID of the zone.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
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
         * Indicates whether the instance is I/O optimized. Valid values:
         * <p>
         * 
         * -none: Non-I/O optimized
         * -optimized:I/O optimized
         * 
         * If the InstanceType is set to [series I](~~ 55263 ~~), the default value is none.
         * 
         * If the InstanceType is not a [series I](~~ 55263 ~~) specification, the default value is optimized.
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * You can call this operation to query the prices of ECS instances with a specific configuration. Valid values: 1 to 1000.
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
         * The preemptible policy of the pay-as-you-go instance. Valid values:
         * <p>
         * -NoSpot: a pay-as-you-go instance.
         * -SpotWithPriceLimit: sets the maximum price for preemptible instances.
         * -SpotAsPriceGo: The system automatically bids at the highest pay-as-you-go price.
         * 
         * Default value: NoSpot
         * 
         * > This parameter is valid only when "PriceUnit = Hour" and "Period =. Because the default value of "PriceUnit" is "Hour", and the default value of "1" is "1", you do not need to set the "PriceUnit" and "1" parameter values when Setting this parameter value.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The type of the target resource. Valid values:
         * <p>
         * -instance: queries the latest prices of ECS instances. When the value is "instance", you must specify the "InstanceType" parameter at the same time ".
         * -disk: queries the latest price list of disks. When the value is "disk", you must specify both the "DataDisk.1. Categore" and "DataDisk.1.Size" parameters ".
         * -bandwidth: queries the latest bandwidth price list.
         * -ddh: queries the latest prices of dedicated hosts.
         * -ElasticityAssurance: queries the price information of the elastic protection service. When the value is "elasticitylifecance", you must specify the "InstanceType" parameter at the same time ".
         * -CapacityReservation: queries the price of the capacity reservation service. When the value is "CapacityReservation", you must specify the "InstanceType" parameter at the same time ".
         * 
         * Default value: instance
         * 
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
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
         * The specification of the dedicated host. You can call the [DescribeDedicatedHostTypes](~~ 134240 ~~) API to obtain the latest DDH specifications.
         */
        public Builder dedicatedHostType(String dedicatedHostType) {
            this.putQueryParameter("DedicatedHostType", dedicatedHostType);
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }

        /**
         * The billing duration of the ECS instance. Valid values:
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
         * The network type of the instance. Valid values:
         * <p>
         * 
         * -classic: the network type of the instance is Classic network (classic).
         * -vpc: the network type of the instance is VPC.
         * 
         * Default value: vpc
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * Queries the prices of ECS instances in different billing cycles. Valid values:
         * <p>
         * 
         * <props="china">
         * -Month: the unit of the Month.
         * -Year: the unit of the price that is billed on a yearly basis.
         * -Hour (default): the unit of the price that is billed on an hourly basis.
         * -Week: the unit of the price that is billed on a weekly basis.
         * 
         * </props>
         * 
         * <props="intl">
         * -Month: the unit of the Month.
         * -Year: the unit of the price that is billed on a yearly basis.
         * -Hour (default): the unit of the price that is billed on an hourly basis.
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
         * The billing method of the network bandwidth. Valid values:
         * <p>
         * 
         * -PayByBandwidth: pay-by-bandwidth.
         * -PayByTraffic: pay by bandwidth traffic.
         * 
         * Default value: PayByTraffic
         * 
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
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
         * The ID of the image that you want to load when you start the instance. You can call [DescribeImages](~~ 25534 ~~) to query the available image resources. If this parameter is not specified, the price of the Linux image is queried by default.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        @Override
        public DescribePriceRequest build() {
            return new DescribePriceRequest(this);
        } 

    } 

    public static class SystemDisk extends TeaModel {
        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Category")
        private String category;

        private SystemDisk(Builder builder) {
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
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

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        public static final class Builder {
            private String performanceLevel; 
            private Integer size; 
            private String category; 

            /**
             * When the system disk type is ESSD, the performance level is distinguished. This parameter is valid only when "SystemDiskCategory = cloud_essd. Valid values:
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
             * Parameter defaults:
             * 
             * -If the InstanceType is a phased-out instance type and the value of "IoOptimized" is "none", the default value of this parameter is "cloud ".
             * -In other cases, the default value of this parameter is cloud_efficiency ".
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    public static class DataDisk extends TeaModel {
        @NameInMap("Size")
        private Integer size;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Category")
        private String category;

        private DataDisk(Builder builder) {
            this.size = builder.size;
            this.performanceLevel = builder.performanceLevel;
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
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

        public static final class Builder {
            private Integer size; 
            private String performanceLevel; 
            private String category; 

            /**
             * The capacity of the first data disk. Unit: GiB. Valid values:
             * <p>
             * 
             * -cloud:5~2000
             * -cloud_efficiency:20 to 32768
             * -cloud_ssd:20 to 32768
             * -cloud_essd:20 to 32768
             * -ephemeral_ssd:5 to 800
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

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
             * The category of the first data disk. Valid values:
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

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
}
