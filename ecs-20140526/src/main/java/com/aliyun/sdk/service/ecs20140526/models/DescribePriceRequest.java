// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePriceRequest} extends {@link RequestModel}
 *
 * <p>DescribePriceRequest</p>
 */
public class DescribePriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDisk")
    private java.util.List<DataDisk> dataDisk;

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
    private java.util.List<String> instanceTypeList;

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
    @com.aliyun.core.annotation.NameInMap("RecurrenceRules")
    private java.util.List<RecurrenceRules> recurrenceRules;

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
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

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
        this.recurrenceRules = builder.recurrenceRules;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
        this.scope = builder.scope;
        this.spotDuration = builder.spotDuration;
        this.spotStrategy = builder.spotStrategy;
        this.startTime = builder.startTime;
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
    public java.util.List<DataDisk> getDataDisk() {
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
    public java.util.List<String> getInstanceTypeList() {
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
     * @return recurrenceRules
     */
    public java.util.List<RecurrenceRules> getRecurrenceRules() {
        return this.recurrenceRules;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribePriceRequest, Builder> {
        private java.util.List<DataDisk> dataDisk; 
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
        private java.util.List<String> instanceTypeList; 
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
        private java.util.List<RecurrenceRules> recurrenceRules; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourceType; 
        private String scope; 
        private Integer spotDuration; 
        private String spotStrategy; 
        private String startTime; 
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
            this.recurrenceRules = request.recurrenceRules;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceType = request.resourceType;
            this.scope = request.scope;
            this.spotDuration = request.spotDuration;
            this.spotStrategy = request.spotStrategy;
            this.startTime = request.startTime;
            this.zoneId = request.zoneId;
        } 

        /**
         * DataDisk.
         */
        public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
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
         * <p>The number of ECS instances. You can specify this parameter when you want to query the prices of multiple instances that have specific specifications. Valid values: 1 to 1000.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>The total number of times that the elasticity assurance can be applied. Set the value to Unlimited. This value indicates that the elasticity assurance can be applied an unlimited number of times within its effective period.</p>
         * <p>Default value: Unlimited.</p>
         * 
         * <strong>example:</strong>
         * <p>Unlimited</p>
         */
        public Builder assuranceTimes(String assuranceTimes) {
            this.putQueryParameter("AssuranceTimes", assuranceTimes);
            this.assuranceTimes = assuranceTimes;
            return this;
        }

        /**
         * <p>The storage capacity. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder capacity(Integer capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * <p>The type of the dedicated host. You can call the <a href="https://help.aliyun.com/document_detail/134240.html">DescribeDedicatedHostTypes</a> operation to query the most recent list of dedicated host types.</p>
         * 
         * <strong>example:</strong>
         * <p>ddh.c5</p>
         */
        public Builder dedicatedHostType(String dedicatedHostType) {
            this.putQueryParameter("DedicatedHostType", dedicatedHostType);
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }

        /**
         * <p>This parameter takes effect only when ResourceType is set to instance.</p>
         * <p>The image ID. Images contain the runtime environments to load when instances start. You can call the <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> operation to query available images. If you do not specify this parameter, the system queries the prices of Linux images.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_7_05_64_20G_alibase_20181212.vhd</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The total number of reserved instances for an instance type.</p>
         * <p>Valid values: 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder instanceAmount(Integer instanceAmount) {
            this.putQueryParameter("InstanceAmount", instanceAmount);
            this.instanceAmount = instanceAmount;
            return this;
        }

        /**
         * <p>The total number of vCPUs supported by the elasticity assurance. When you call this API operation, the system calculates the number of instances that an elasticity assurance must support based on the specified value of InstanceType. The calculated value is rounded up to the nearest integer.</p>
         * <blockquote>
         * <p>When you call this API operation to query the price of an elasticity assurance, you can only specify either InstanceCoreCpuCount or InstanceAmount.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder instanceCpuCoreCount(Integer instanceCpuCoreCount) {
            this.putQueryParameter("InstanceCpuCoreCount", instanceCpuCoreCount);
            this.instanceCpuCoreCount = instanceCpuCoreCount;
            return this;
        }

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li>classic: classic network</li>
         * <li>vpc: Virtual Private Cloud (VPC)</li>
         * </ul>
         * <p>Default value: vpc.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * <p>The instance type. When <code>ResourceType</code> is set to <code>instance</code>, you must specify this parameter. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the most recent list of instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The instance types. You can select only a single instance type when you configure an elasticity assurance in unlimited mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.xlarge</p>
         */
        public Builder instanceTypeList(java.util.List<String> instanceTypeList) {
            this.putQueryParameter("InstanceTypeList", instanceTypeList);
            this.instanceTypeList = instanceTypeList;
            return this;
        }

        /**
         * <p>The billing method for network usage. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth</li>
         * <li>PayByTraffic: pay-by-traffic</li>
         * </ul>
         * <p>Default value: PayByTraffic</p>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
         * <p>Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * <p>Specifies whether the instance is I/O optimized. Valid values:</p>
         * <ul>
         * <li>none: The instance is not I/O optimized.</li>
         * <li>optimized: The instance is I/O optimized.</li>
         * </ul>
         * <p>When the instance type specified by the InstanceType parameter belongs to <a href="https://help.aliyun.com/document_detail/55263.html">Generation I instance families</a>, the default value of this parameter is none.</p>
         * <p>When the instance type specified by the InstanceType parameter does not belong to <a href="https://help.aliyun.com/document_detail/55263.html">Generation I instance families</a>, the default value of this parameter is optimized.</p>
         * 
         * <strong>example:</strong>
         * <p>optimized</p>
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * <p>The Internet service provider (ISP). Valid values:</p>
         * <ul>
         * <li>cmcc: China Mobile</li>
         * <li>telecom: China Telecom</li>
         * <li>unicom: China Unicom</li>
         * <li>multiCarrier: multi-line ISP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cmcc</p>
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * <p>The payment option of the reserved instance. Valid values:</p>
         * <ul>
         * <li>No Upfront</li>
         * <li>Partial Upfront</li>
         * <li>All Upfront</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All Upfront</p>
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
         * <p>The billing cycle of the ECS instance. Valid values:</p>
         * <ul>
         * <li>Valid values when PriceUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
         * <li>Valid values when PriceUnit is set to Year: 1, 2, 3, 4, and 5.</li>
         * <li>Set the value to 1 when PriceUnit is set to Hour.</li>
         * </ul>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The operating system of the image that is used by the instance. Valid values:</p>
         * <ul>
         * <li>Windows: Windows Server operating system</li>
         * <li>Linux: Linux and UNIX-like operating system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The pricing unit of the ECS resource. Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Year</li>
         * <li>Hour (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        public Builder priceUnit(String priceUnit) {
            this.putQueryParameter("PriceUnit", priceUnit);
            this.priceUnit = priceUnit;
            return this;
        }

        /**
         * <p>Recurrence rules for the time-segmented assurance of the elasticity assurance.</p>
         * <blockquote>
         * <p> The time-segmented assurance of the elasticity assurance is available only in specific regions and to specific users. To use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
         * </blockquote>
         */
        public Builder recurrenceRules(java.util.List<RecurrenceRules> recurrenceRules) {
            this.putQueryParameter("RecurrenceRules", recurrenceRules);
            this.recurrenceRules = recurrenceRules;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent list of regions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The type of the resource. Valid values:</p>
         * <ul>
         * <li>instance: queries the most recent prices of ECS instances. If you set this parameter to <code>instance</code>, specify <code>InstanceType</code>.</li>
         * <li>disk: queries the most recent prices of cloud disks. If you set this parameter to <code>disk</code>, specify <code>DataDisk.1.Category</code> and <code>DataDisk.1.Size</code>.</li>
         * <li>diskperformance: Queries the most recent prices of the provioned performance of the Enterprise SSD (ESSD) AutoPL disk. You must also specify <code>DataDisk.1.Category</code> and <code>DataDisk.1.ProvisionedIops</code>.</li>
         * <li>bandwidth: queries the most recent prices for network usage.</li>
         * <li>ddh: queries the most recent prices of dedicated hosts.</li>
         * <li>ElasticityAssurance: queries the most recent prices of elasticity assurances. If you set this parameter to <code>ElasticityAssurance</code>, specify <code>InstanceType</code>.</li>
         * <li>CapacityReservation: queries the most recent prices of capacity reservations. If you set this parameter to <code>CapacityReservation</code>, specify <code>InstanceType</code>.</li>
         * </ul>
         * <p>Default value: instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The scope of the reserved instance. Valid values:</p>
         * <ul>
         * <li>Region: regional</li>
         * <li>Zone: zonal</li>
         * </ul>
         * <p>Default value: Region.</p>
         * 
         * <strong>example:</strong>
         * <p>Zone</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The protection period of the preemptible instance. Unit: hours. Default value: 1. Valid values:</p>
         * <ul>
         * <li>1: After a preemptible instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
         * <li>0: After a preemptible instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
         * </ul>
         * <p>Alibaba Cloud sends an ECS system event to notify you 5 minutes before the instance is released. Preemptible instances are billed by second. We recommend that you specify a protection period based on your business requirements.</p>
         * <blockquote>
         * <p> This parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit or SpotAsPriceGo.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * <p>The bidding policy for the pay-as-you-go instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instance is a regular pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The instance is created as a preemptible instance that has a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is created as a preemptible instance whose bid price is based on the market price at the time of purchase. The market price can be up to the pay-as-you-go price.</li>
         * </ul>
         * <p>Default value: NoSpot.</p>
         * <blockquote>
         * <p> This parameter takes effect only when <code>PriceUnit</code> is set to Hour and <code>Period</code> is set to 1. The default value of <code>PriceUnit</code> is <code>Hour</code> and the default value of <code>Period</code> is <code>1</code>. Therefore, you do not need to set <code>PriceUnit</code> or <code>Period</code> when you set SpotStrategy.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * <p>The time when the time-segmented assurance of the elasticity assurance takes effect. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-30T06:32:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * <blockquote>
         * <p>Prices of preemptible instances vary based on zones. When you query the price of a preemptible instance, specify ZoneId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hagzhou-i</p>
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

    /**
     * 
     * {@link DescribePriceRequest} extends {@link TeaModel}
     *
     * <p>DescribePriceRequest</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
        private Long provisionedIops;

        private DataDisk(Builder builder) {
            this.category = builder.category;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
            this.provisionedIops = builder.provisionedIops;
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

        /**
         * @return provisionedIops
         */
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public static final class Builder {
            private String category; 
            private String performanceLevel; 
            private Long size; 
            private Long provisionedIops; 

            /**
             * <p>The category of data disk N. Valid values:</p>
             * <ul>
             * <li>cloud: basic disk.</li>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>ephemeral_ssd: local SSD.</li>
             * <li>cloud_essd: ESSD.</li>
             * <li>cloud_auto: ESSD AutoPL disk.</li>
             * </ul>
             * <p>Valid values of N: 1 to 16.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The performance level of data disk N when the disk is an ESSD. This parameter takes effect only when <code>DataDisk.N.Category</code> is set to cloud_essd. Valid values:</p>
             * <ul>
             * <li>PL0</li>
             * <li>PL1 (default)</li>
             * <li>PL2</li>
             * <li>PL3</li>
             * </ul>
             * <p>Valid values of N: 1 to 16.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The size of data disk N. Unit: GiB. Valid values:</p>
             * <ul>
             * <li><p>Valid values if DataDisk.N.Category is set to cloud: 5 to 2000.</p>
             * </li>
             * <li><p>Valid values if DataDisk.N.Category is set to cloud_efficiency: 20 to 32768.</p>
             * </li>
             * <li><p>Valid values if DataDisk.N.Category is set to cloud_ssd: 20 to 32768.</p>
             * </li>
             * <li><p>Valid values if DataDisk.N.Category is set to cloud_auto: 1 to 32768.</p>
             * </li>
             * <li><p>Valid values if DataDisk.N.Category is set to cloud_essd: vary based on the <code>DataDisk.N.PerformanceLevel</code> value.</p>
             * <ul>
             * <li>Valid values if DataDisk.N.PerformanceLevel is set to PL0: 1 to 32768.</li>
             * <li>Valid values if DataDisk.N.PerformanceLevel is set to PL1: 20 to 32768.</li>
             * <li>Valid values if DataDisk.N.PerformanceLevel is set to PL2: 461 to 32768.</li>
             * <li>Valid values if DataDisk.N.PerformanceLevel is set to PL3: 1261 to 32768.</li>
             * </ul>
             * </li>
             * <li><p>Valid values if DataDisk.N.Category is set to ephemeral_ssd: 5 to 800.</p>
             * </li>
             * </ul>
             * <p>Valid values of N: 1 to 16.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL disk to use as data disk N. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
             * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
             * <blockquote>
             * <p> This parameter is available only if you set <code>DataDisk.N.Category</code> to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>40000</p>
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePriceRequest} extends {@link TeaModel}
     *
     * <p>DescribePriceRequest</p>
     */
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
             * <p>This parameter takes effect only when ResourceType is set to instance.</p>
             * <p>The ID of the dedicated host. You can call the <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> operation to query the dedicated host list.</p>
             * 
             * <strong>example:</strong>
             * <p>dh-bp67acfmxazb4p****</p>
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
    /**
     * 
     * {@link DescribePriceRequest} extends {@link TeaModel}
     *
     * <p>DescribePriceRequest</p>
     */
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
             * <p>The category of the system disk. Valid values:</p>
             * <ul>
             * <li>cloud: basic disk</li>
             * <li>cloud_efficiency: ultra disk</li>
             * <li>cloud_ssd: standard SSD</li>
             * <li>ephemeral_ssd: local SSD</li>
             * <li>cloud_essd: Enterprise SSD (ESSD)</li>
             * <li>cloud_auto: ESSD AutoPL disk</li>
             * </ul>
             * <p>Default value:</p>
             * <ul>
             * <li>When InstanceType is set to a retired instance type and <code>IoOptimized</code> is set to <code>none</code>, the default value is <code>cloud</code>.</li>
             * <li>In other cases, the default value is <code>cloud_efficiency</code>.</li>
             * </ul>
             * <blockquote>
             * <p> If you want to query the price of a system disk, you must also specify <code>ImageId</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The performance level of the system disk when the disk is an ESSD. This parameter is valid only when <code>SystemDiskCategory</code> is set to cloud_essd. Valid values:</p>
             * <p>PL0, PL1 (default), PL2, PL3.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The size of the system disk. Unit: GiB. Valid values:</p>
             * <ul>
             * <li><p>Basic disk (cloud): 20 to 500.</p>
             * </li>
             * <li><p>ESSD (cloud_essd): Valid values vary based on the SystemDisk.PerformanceLevel value.</p>
             * <ul>
             * <li>Valid values when SystemDisk.PerformanceLevel is set to PL0: 1 to 2048.</li>
             * <li>Valid values when SystemDisk.PerformanceLevel is set to PL1: 20 to 2048.</li>
             * <li>Valid values when SystemDisk.PerformanceLevel is set to PL2: 461 to 2048.</li>
             * <li>Valid values when SystemDisk.PerformanceLevel is set to PL3: 1261 to 2048.</li>
             * </ul>
             * </li>
             * <li><p>ESSD AutoPL disk (cloud_auto): 1 to 2048.</p>
             * </li>
             * <li><p>Other disk categories: 20 to 2048.</p>
             * </li>
             * </ul>
             * <p>Default value: 20 or the size of the image specified by ImageId, whichever is greater.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
    /**
     * 
     * {@link DescribePriceRequest} extends {@link TeaModel}
     *
     * <p>DescribePriceRequest</p>
     */
    public static class RecurrenceRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndHour")
        @com.aliyun.core.annotation.Validation(maximum = 24)
        private Integer endHour;

        @com.aliyun.core.annotation.NameInMap("RecurrenceType")
        private String recurrenceType;

        @com.aliyun.core.annotation.NameInMap("RecurrenceValue")
        private String recurrenceValue;

        @com.aliyun.core.annotation.NameInMap("StartHour")
        @com.aliyun.core.annotation.Validation(maximum = 24)
        private Integer startHour;

        private RecurrenceRules(Builder builder) {
            this.endHour = builder.endHour;
            this.recurrenceType = builder.recurrenceType;
            this.recurrenceValue = builder.recurrenceValue;
            this.startHour = builder.startHour;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecurrenceRules create() {
            return builder().build();
        }

        /**
         * @return endHour
         */
        public Integer getEndHour() {
            return this.endHour;
        }

        /**
         * @return recurrenceType
         */
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        /**
         * @return recurrenceValue
         */
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        /**
         * @return startHour
         */
        public Integer getStartHour() {
            return this.startHour;
        }

        public static final class Builder {
            private Integer endHour; 
            private String recurrenceType; 
            private String recurrenceValue; 
            private Integer startHour; 

            /**
             * <p>The time when the time-segmented assurance ends. The value must be on the hour.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder endHour(Integer endHour) {
                this.endHour = endHour;
                return this;
            }

            /**
             * <p>The type of the recurrence rule. Valid values:</p>
             * <ul>
             * <li>Daily</li>
             * <li>Weekly</li>
             * <li>Monthly</li>
             * </ul>
             * <blockquote>
             * <p> If this parameter is specified, specify <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Daily</p>
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * <p>The recurrency value of the time-segmented assurance.</p>
             * <ul>
             * <li>If you set <code>RecurrenceType</code> to <code>Daily</code>, you can set RecurrenceValue to only one value. Valid values: 1 to 31. The time-segmented assurance is performed every few days.</li>
             * <li>If you set <code>RecurrenceType</code> to <code>Weekly</code>, you can set RecurrenceValue to one or more values. Separate the values with commas (,). The values that correspond to Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday are 0, 1, 2, 3, 4, 5, and 6. For example, <code>1,2</code> indicates that the time-segmented assurance is performed on Monday and Tuesday of every week.</li>
             * <li>If you set <code>RecurrenceType</code> to <code>Monthly</code>, you can set RecurrenceValue to two values in the <code>A-B</code> format. Valid values of A and B: 1 to 31. B must be greater than or equal to A. For example, <code>1-5</code> indicates that the time-segmented assurance is performed from the 1st to the 5th of each month.</li>
             * </ul>
             * <blockquote>
             * <p> If this parameter is specified, you must specify <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder recurrenceValue(String recurrenceValue) {
                this.recurrenceValue = recurrenceValue;
                return this;
            }

            /**
             * <p>The time when the time-segmented assurance takes effect. The value must be on the hour.</p>
             * <blockquote>
             * <p> You must specify both StartHour and EndHour. The EndHour time must be at least 4 hours later than the StartHour time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder startHour(Integer startHour) {
                this.startHour = startHour;
                return this;
            }

            public RecurrenceRules build() {
                return new RecurrenceRules(this);
            } 

        } 

    }
}
