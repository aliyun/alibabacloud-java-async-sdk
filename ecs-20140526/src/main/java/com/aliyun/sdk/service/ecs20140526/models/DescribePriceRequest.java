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
         * <p>The number of Elastic Compute Service (ECS) instances that you want to purchase. You can use this parameter to query the price of batch purchases. Valid values: 1 to 1000.</p>
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
         * <p>The total number of times that the elasticity assurance can be applied. Set the value to Unlimited. Only the unlimited mode within the service effective period is supported.</p>
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
         * <p>The capacity. Unit: GiB.</p>
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
         * <p>The dedicated host type. You can call <a href="https://help.aliyun.com/document_detail/134240.html">DescribeDedicatedHostTypes</a> to query the most recent list of dedicated host types.</p>
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
         * <p>The image ID, which specifies the runtime environment to be loaded when the instance starts. You can call <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> to query available image resources. If you do not specify this parameter, the price of a Linux image is queried by default.</p>
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
         * <p>The total number of instances to reserve within an instance type.</p>
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
         * <p>The total number of vCPUs supported by the elasticity assurance. When you call the API, the system calculates the number of instances to be covered by the elasticity assurance based on the specified InstanceType (rounded up).</p>
         * <blockquote>
         * <p>When you call the API to query the price of an elasticity assurance, you can specify only one of the InstanceCoreCpuCount and InstanceAmount parameters.</p>
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
         * <li>vpc: Virtual Private Cloud (VPC).</li>
         * <li>classic: classic network. The classic network is no longer available. For more information, see <a href="https://help.aliyun.com/document_detail/2833134.html">Discontinuation notice</a>.</li>
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
         * <p>The instance type. You must specify this parameter when the <code>ResourceType</code> parameter is set to <code>instance</code>. For more details, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>. You can also invoke <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the most recent instance type list.</p>
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
         * <p>The instance type. Only a single instance type can be specified for the unlimited elasticity assurance.</p>
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
         * <p>The billing method for network bandwidth. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth.</li>
         * <li>PayByTraffic: pay-by-traffic.</li>
         * </ul>
         * <p>Default value: PayByTraffic.</p>
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
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s (Megabit per second). Valid values: 0 to 100.</p>
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
         * <p>Specifies whether the queried instance is an I/O optimized instance. Valid values:</p>
         * <ul>
         * <li>none: non-I/O optimization.</li>
         * <li>optimized: I/O optimization.</li>
         * </ul>
         * <p>If InstanceType is set to a <a href="https://help.aliyun.com/document_detail/55263.html">Series I</a> instance type, the default value is none.</p>
         * <p>If InstanceType is set to a non-<a href="https://help.aliyun.com/document_detail/55263.html">Series I</a> instance type, the default value is optimized.</p>
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
         * <p>The Internet Service Provider (ISP). Valid values: </p>
         * <ul>
         * <li>cmcc: China Mobile.</li>
         * <li>telecom: China Telecom.</li>
         * <li>unicom: China Unicom.</li>
         * <li>multiCarrier: multi-ISP.</li>
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
         * <li>No Upfront: no upfront.</li>
         * <li>Partial Upfront: partial upfront.</li>
         * <li>All Upfront: all upfront.</li>
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
         * <p>The billing duration of Elastic Compute Service (ECS). Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>If the PriceUnit parameter is set to Month: 1 to 9.</li>
         * <li>If the PriceUnit parameter is set to Year: 1 to 5.</li>
         * <li>If the PriceUnit parameter is set to Hour: 1.</li>
         * <li>If the PriceUnit parameter is set to Week: 1 to 4.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>If the PriceUnit parameter is set to Month: 1 to 9.</li>
         * <li>If the PriceUnit parameter is set to Year: 1 to 5.</li>
         * <li>If the PriceUnit parameter is set to Hour: 1.</li>
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
         * <p>The operating system type of the image used by the instance. Valid values: </p>
         * <ul>
         * <li>Windows: Windows Server operating system.</li>
         * <li>Linux: Linux and Unix-like operating systems.</li>
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
         * <p>Queries the prices of Elastic Compute Service (ECS) for different billing cycles. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>Month: the monthly price.</li>
         * <li>Year: the yearly price.</li>
         * <li>Hour (default): the hourly price.</li>
         * <li>Week: the weekly price.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>Month: the monthly price.</li>
         * <li>Year: the yearly price.</li>
         * <li>Hour (default): the hourly price.</li>
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
         * <p>The list of recurrence rules for the time-sharing elasticity assurance.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>The time-sharing elasticity assurance feature is available only in specific regions and to specific users. To use this feature, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>The time-sharing elasticity assurance feature is available only in specific regions and to specific users. To use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
         * </blockquote>
         */
        public Builder recurrenceRules(java.util.List<RecurrenceRules> recurrenceRules) {
            this.putQueryParameter("RecurrenceRules", recurrenceRules);
            this.recurrenceRules = recurrenceRules;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <li>instance: queries the most recent price list of ECS instances. If you set this parameter to <code>instance</code>, you must also specify the <code>InstanceType</code> parameter.</li>
         * <li>disk: queries the most recent price list of disks. If you set this parameter to <code>disk</code>, you must also specify the <code>DataDisk.1.Category</code> and <code>DataDisk.1.Size</code> parameters.</li>
         * <li>diskperformance: queries the most recent price list of provisioned performance for ESSD AutoPL disks. You must also specify the <code>DataDisk.1.Category</code> and <code>DataDisk.1.ProvisionedIops</code> parameters.</li>
         * <li>bandwidth: queries the most recent price list of bandwidth.</li>
         * <li>ddh: queries the most recent price list of dedicated hosts.</li>
         * <li>ElasticityAssurance: queries the price of elasticity assurance services. If you set this parameter to <code>ElasticityAssurance</code>, you must also specify the <code>InstanceType</code> parameter.</li>
         * <li>CapacityReservation: queries the price of capacity reservation services. If you set this parameter to <code>CapacityReservation</code>, you must also specify the <code>InstanceType</code> parameter.</li>
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
         * <p>The scope of the reserved instance. Valid values: </p>
         * <ul>
         * <li>Region: regional. </li>
         * <li>Zone: zonal.</li>
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
         * <p>The protection period of the spot instance. Unit: hours. Default value: 1. Valid values:</p>
         * <ul>
         * <li>1: After a spot instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After 1 hour, the system automatically compares the bid price with the market price and checks the resource inventory to determine whether to retain automatic release the instance.</li>
         * <li>0: After a spot instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system automatically compares the bid price with the market price and checks the resource inventory to determine whether to retain automatic release the instance.</li>
         * </ul>
         * <p>Alibaba Cloud sends a notification through an ECS system event 5 minutes before the instance is released. Spot instances are billed by second. Select an appropriate protection period based on the expected task execution duration.</p>
         * <blockquote>
         * <p>This parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit or SpotAsPriceGo.</p>
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
         * <li>NoSpot: a regular pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: a spot instance with a maximum price limit.</li>
         * <li>SpotAsPriceGo: a spot instance priced at the market price with the pay-as-you-go price as the upper limit.</li>
         * </ul>
         * <p>Default value: NoSpot.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <code>PriceUnit=Hour</code> and <code>Period=1</code>. Because the default value of <code>PriceUnit</code> is <code>Hour</code> and the default value of <code>Period</code> is <code>1</code>, you do not need to set the <code>PriceUnit</code> and <code>Period</code> parameters when you specify this parameter.</p>
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
         * <p>The effective period of the time-sharing elasticity assurance. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
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
         * <p>Spot instance prices may vary across zones. When you query spot instance prices, specify ZoneId to query the spot instance price in a specific zone.</p>
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

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.category = model.category;
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
                this.provisionedIops = model.provisionedIops;
            } 

            /**
             * <p>The category of data disk N. Valid values:</p>
             * <ul>
             * <li>cloud: basic disk.</li>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>ephemeral_ssd: local SSD.</li>
             * <li>cloud_essd: enterprise SSD (ESSD).</li>
             * <li>cloud_auto: ESSD AutoPL disk.
             * &lt;props=&quot;china&quot;&gt;</li>
             * <li>cloud_essd_entry: ESSD Entry disk.</li>
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
             * <p>The performance level of data disk N when the disk is an enterprise SSD (ESSD). This parameter is valid only when <code>DataDisk.N.Category=cloud_essd</code>. Valid values:</p>
             * <ul>
             * <li>PL0.</li>
             * <li>PL1 (default).</li>
             * <li>PL2.</li>
             * <li>PL3.</li>
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
             * <li><p>cloud: 5 to 2000.</p>
             * </li>
             * <li><p>cloud_efficiency: 20 to 32768.</p>
             * </li>
             * <li><p>cloud_ssd: 20 to 32768.</p>
             * </li>
             * <li><p>cloud_auto: 1 to 32768.
             * &lt;props=&quot;china&quot;&gt;</p>
             * </li>
             * <li><p>cloud_essd_entry: 10 to 32768.</p>
             * </li>
             * <li><p>cloud_essd: The valid values depend on the value of <code>DataDisk.N.PerformanceLevel</code>.	</p>
             * <ul>
             * <li>PL0: 1 to 32768.</li>
             * <li>PL1: 20 to 32768.</li>
             * <li>PL2: 461 to 32768.</li>
             * <li>PL3: 1261 to 32768.</li>
             * </ul>
             * </li>
             * <li><p>ephemeral_ssd: 5 to 800.</p>
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
             * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1000 × Capacity - Baseline performance}.</p>
             * <p>Baseline performance = min{1,800 + 50 × Capacity, 50,000}.</p>
             * <blockquote>
             * <p>This parameter is supported only when <code>DiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disk</a>.</p>
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

        @com.aliyun.core.annotation.NameInMap("DeploymentSetStrategy")
        private String deploymentSetStrategy;

        private SchedulerOptions(Builder builder) {
            this.dedicatedHostId = builder.dedicatedHostId;
            this.deploymentSetStrategy = builder.deploymentSetStrategy;
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

        /**
         * @return deploymentSetStrategy
         */
        public String getDeploymentSetStrategy() {
            return this.deploymentSetStrategy;
        }

        public static final class Builder {
            private String dedicatedHostId; 
            private String deploymentSetStrategy; 

            private Builder() {
            } 

            private Builder(SchedulerOptions model) {
                this.dedicatedHostId = model.dedicatedHostId;
                this.deploymentSetStrategy = model.deploymentSetStrategy;
            } 

            /**
             * <p>This parameter takes effect only when the ResourceType parameter is set to instance.</p>
             * <p>The ID of the dedicated host. You can call <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query the list of dedicated host IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>dh-bp67acfmxazb4p****</p>
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * <p>The deployment set strategy. Valid values:</p>
             * <ul>
             * <li>Availability: high availability strategy.</li>
             * <li>AvailabilityGroup: high availability group strategy.</li>
             * <li>LowLatency: low network latency strategy.</li>
             * <li>ProximityLooseDispersion: proximity loose dispersion strategy.</li>
             * </ul>
             * <blockquote>
             * <p>Only when the strategy is set to ProximityLooseDispersion, the API response includes the price details for &quot;Resource&quot;: &quot;deploymentSet&quot;. Other deployment set strategies are free of charge, so the API response does not include price information for &quot;Resource&quot;: &quot;deploymentSet&quot;.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ProximityLooseDispersion</p>
             */
            public Builder deploymentSetStrategy(String deploymentSetStrategy) {
                this.deploymentSetStrategy = deploymentSetStrategy;
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

            private Builder() {
            } 

            private Builder(SystemDisk model) {
                this.category = model.category;
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
            } 

            /**
             * <p>The category of the system disk. When you query the system disk price, you must also specify <code>ImageId</code>. Valid values:</p>
             * <ul>
             * <li>cloud: basic disk.</li>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>ephemeral_ssd: local SSD.</li>
             * <li>cloud_essd: enterprise SSD (ESSD).</li>
             * <li>cloud_auto: ESSD AutoPL disk.
             * &lt;props=&quot;china&quot;&gt;</li>
             * <li>cloud_essd_entry: ESSD Entry disk.</li>
             * </ul>
             * <p>Default value description:</p>
             * <ul>
             * <li>If InstanceType is set to a retired instance type and the <code>IoOptimized</code> parameter is set to <code>none</code>, the default value is <code>cloud</code>.</li>
             * <li>In other cases, the default value is <code>cloud_efficiency</code>.&lt;props=&quot;china&quot;&gt;After January 30, 2026, for instance types that support only cloud_essd, the default value is changed from cloud_efficiency to cloud_essd PL0. For more information, see <a href="https://www.aliyun.com/notice/117844">Change notice</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The performance level of the system disk when the system disk type is enterprise SSD. This parameter is valid only when <code>SystemDiskCategory=cloud_essd</code>. Valid values:</p>
             * <p>PL0.
             * PL1 (default).
             * PL2.
             * PL3.</p>
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
             * <li>Basic disk: 20 to 500.</li>
             * <li>Enterprise SSD:<ul>
             * <li>PL0: 1 to 2048.</li>
             * <li>PL1: 20 to 2048.</li>
             * <li>PL2: 461 to 2048.</li>
             * <li>PL3: 1261 to 2048.</li>
             * </ul>
             * </li>
             * <li>ESSD AutoPL disk: 1 to 2048.</li>
             * <li>Other disk categories: 20 to 2048.</li>
             * </ul>
             * <p>Default value: max{20, image size of the specified ImageId parameter}.</p>
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
        private Integer endHour;

        @com.aliyun.core.annotation.NameInMap("RecurrenceType")
        private String recurrenceType;

        @com.aliyun.core.annotation.NameInMap("RecurrenceValue")
        private String recurrenceValue;

        @com.aliyun.core.annotation.NameInMap("StartHour")
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

            private Builder() {
            } 

            private Builder(RecurrenceRules model) {
                this.endHour = model.endHour;
                this.recurrenceType = model.recurrenceType;
                this.recurrenceValue = model.recurrenceValue;
                this.startHour = model.startHour;
            } 

            /**
             * <p>The end time of the time-sharing assurance. The value must be on the hour.</p>
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
             * <li>Daily: repeats daily.</li>
             * <li>Weekly: repeats weekly.</li>
             * <li>Monthly: repeats monthly.</li>
             * </ul>
             * <blockquote>
             * <p>You must specify both <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
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
             * <p>The value of the recurrence rule.</p>
             * <ul>
             * <li>If <code>RecurrenceType</code> is set to <code>Daily</code>, you can specify only one value. Valid values: 1 to 31. The value indicates the interval in days between recurrences.</li>
             * <li>If <code>RecurrenceType</code> is set to <code>Weekly</code>, you can specify multiple values separated by commas (,). The values for Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday are 0, 1, 2, 3, 4, 5, and 6. For example, <code>1,2</code> indicates Monday and Tuesday.</li>
             * <li>If <code>RecurrenceType</code> is set to <code>Monthly</code>, the format is <code>A-B</code>. Valid values of A and B: 1 to 31. B must be greater than or equal to A. For example, <code>1-5</code> indicates the 1st through 5th day of each month.</li>
             * </ul>
             * <blockquote>
             * <p>You must specify both <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
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
             * <p>The effective period start time of the time-sharing assurance. The value must be on the hour.</p>
             * <blockquote>
             * <p>You must specify both StartHour and EndHour, and the difference between them must be at least 4 hours.</p>
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
