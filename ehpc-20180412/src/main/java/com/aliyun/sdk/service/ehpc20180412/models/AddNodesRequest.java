// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddNodesRequest} extends {@link RequestModel}
 *
 * <p>AddNodesRequest</p>
 */
public class AddNodesRequest extends Request {
    @Query
    @NameInMap("AllocatePublicAddress")
    private Boolean allocatePublicAddress;

    @Query
    @NameInMap("AutoRenew")
    private String autoRenew;

    @Query
    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ComputeEnableHt")
    private Boolean computeEnableHt;

    @Query
    @NameInMap("ComputeSpotDuration")
    @Validation(maximum = 6)
    private Integer computeSpotDuration;

    @Query
    @NameInMap("ComputeSpotInterruptionBehavior")
    private String computeSpotInterruptionBehavior;

    @Query
    @NameInMap("ComputeSpotPriceLimit")
    private String computeSpotPriceLimit;

    @Query
    @NameInMap("ComputeSpotStrategy")
    private String computeSpotStrategy;

    @Query
    @NameInMap("Count")
    @Validation(required = true)
    private Integer count;

    @Query
    @NameInMap("CreateMode")
    private String createMode;

    @Query
    @NameInMap("DataDisks")
    private java.util.List < DataDisks> dataDisks;

    @Query
    @NameInMap("DnsConfig")
    private String dnsConfig;

    @Query
    @NameInMap("EcsChargeType")
    private String ecsChargeType;

    @Query
    @NameInMap("HostNamePrefix")
    private String hostNamePrefix;

    @Query
    @NameInMap("HostNameSuffix")
    private String hostNameSuffix;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("InternetMaxBandWidthIn")
    @Validation(maximum = 100)
    private Integer internetMaxBandWidthIn;

    @Query
    @NameInMap("InternetMaxBandWidthOut")
    @Validation(maximum = 100)
    private Integer internetMaxBandWidthOut;

    @Query
    @NameInMap("JobQueue")
    private String jobQueue;

    @Query
    @NameInMap("MinCount")
    private Integer minCount;

    @Query
    @NameInMap("NetworkInterfaceTrafficMode")
    private String networkInterfaceTrafficMode;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("Sync")
    private Boolean sync;

    @Query
    @NameInMap("SystemDiskLevel")
    private String systemDiskLevel;

    @Query
    @NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    @Query
    @NameInMap("SystemDiskType")
    private String systemDiskType;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private AddNodesRequest(Builder builder) {
        super(builder);
        this.allocatePublicAddress = builder.allocatePublicAddress;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.clientToken = builder.clientToken;
        this.clusterId = builder.clusterId;
        this.computeEnableHt = builder.computeEnableHt;
        this.computeSpotDuration = builder.computeSpotDuration;
        this.computeSpotInterruptionBehavior = builder.computeSpotInterruptionBehavior;
        this.computeSpotPriceLimit = builder.computeSpotPriceLimit;
        this.computeSpotStrategy = builder.computeSpotStrategy;
        this.count = builder.count;
        this.createMode = builder.createMode;
        this.dataDisks = builder.dataDisks;
        this.dnsConfig = builder.dnsConfig;
        this.ecsChargeType = builder.ecsChargeType;
        this.hostNamePrefix = builder.hostNamePrefix;
        this.hostNameSuffix = builder.hostNameSuffix;
        this.imageId = builder.imageId;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.instanceType = builder.instanceType;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandWidthIn = builder.internetMaxBandWidthIn;
        this.internetMaxBandWidthOut = builder.internetMaxBandWidthOut;
        this.jobQueue = builder.jobQueue;
        this.minCount = builder.minCount;
        this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.sync = builder.sync;
        this.systemDiskLevel = builder.systemDiskLevel;
        this.systemDiskSize = builder.systemDiskSize;
        this.systemDiskType = builder.systemDiskType;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocatePublicAddress
     */
    public Boolean getAllocatePublicAddress() {
        return this.allocatePublicAddress;
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return computeEnableHt
     */
    public Boolean getComputeEnableHt() {
        return this.computeEnableHt;
    }

    /**
     * @return computeSpotDuration
     */
    public Integer getComputeSpotDuration() {
        return this.computeSpotDuration;
    }

    /**
     * @return computeSpotInterruptionBehavior
     */
    public String getComputeSpotInterruptionBehavior() {
        return this.computeSpotInterruptionBehavior;
    }

    /**
     * @return computeSpotPriceLimit
     */
    public String getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    /**
     * @return computeSpotStrategy
     */
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return createMode
     */
    public String getCreateMode() {
        return this.createMode;
    }

    /**
     * @return dataDisks
     */
    public java.util.List < DataDisks> getDataDisks() {
        return this.dataDisks;
    }

    /**
     * @return dnsConfig
     */
    public String getDnsConfig() {
        return this.dnsConfig;
    }

    /**
     * @return ecsChargeType
     */
    public String getEcsChargeType() {
        return this.ecsChargeType;
    }

    /**
     * @return hostNamePrefix
     */
    public String getHostNamePrefix() {
        return this.hostNamePrefix;
    }

    /**
     * @return hostNameSuffix
     */
    public String getHostNameSuffix() {
        return this.hostNameSuffix;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return internetMaxBandWidthIn
     */
    public Integer getInternetMaxBandWidthIn() {
        return this.internetMaxBandWidthIn;
    }

    /**
     * @return internetMaxBandWidthOut
     */
    public Integer getInternetMaxBandWidthOut() {
        return this.internetMaxBandWidthOut;
    }

    /**
     * @return jobQueue
     */
    public String getJobQueue() {
        return this.jobQueue;
    }

    /**
     * @return minCount
     */
    public Integer getMinCount() {
        return this.minCount;
    }

    /**
     * @return networkInterfaceTrafficMode
     */
    public String getNetworkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return sync
     */
    public Boolean getSync() {
        return this.sync;
    }

    /**
     * @return systemDiskLevel
     */
    public String getSystemDiskLevel() {
        return this.systemDiskLevel;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return systemDiskType
     */
    public String getSystemDiskType() {
        return this.systemDiskType;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<AddNodesRequest, Builder> {
        private Boolean allocatePublicAddress; 
        private String autoRenew; 
        private Integer autoRenewPeriod; 
        private String clientToken; 
        private String clusterId; 
        private Boolean computeEnableHt; 
        private Integer computeSpotDuration; 
        private String computeSpotInterruptionBehavior; 
        private String computeSpotPriceLimit; 
        private String computeSpotStrategy; 
        private Integer count; 
        private String createMode; 
        private java.util.List < DataDisks> dataDisks; 
        private String dnsConfig; 
        private String ecsChargeType; 
        private String hostNamePrefix; 
        private String hostNameSuffix; 
        private String imageId; 
        private String imageOwnerAlias; 
        private String instanceType; 
        private String internetChargeType; 
        private Integer internetMaxBandWidthIn; 
        private Integer internetMaxBandWidthOut; 
        private String jobQueue; 
        private Integer minCount; 
        private String networkInterfaceTrafficMode; 
        private Integer period; 
        private String periodUnit; 
        private Boolean sync; 
        private String systemDiskLevel; 
        private Integer systemDiskSize; 
        private String systemDiskType; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(AddNodesRequest request) {
            super(request);
            this.allocatePublicAddress = request.allocatePublicAddress;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.clientToken = request.clientToken;
            this.clusterId = request.clusterId;
            this.computeEnableHt = request.computeEnableHt;
            this.computeSpotDuration = request.computeSpotDuration;
            this.computeSpotInterruptionBehavior = request.computeSpotInterruptionBehavior;
            this.computeSpotPriceLimit = request.computeSpotPriceLimit;
            this.computeSpotStrategy = request.computeSpotStrategy;
            this.count = request.count;
            this.createMode = request.createMode;
            this.dataDisks = request.dataDisks;
            this.dnsConfig = request.dnsConfig;
            this.ecsChargeType = request.ecsChargeType;
            this.hostNamePrefix = request.hostNamePrefix;
            this.hostNameSuffix = request.hostNameSuffix;
            this.imageId = request.imageId;
            this.imageOwnerAlias = request.imageOwnerAlias;
            this.instanceType = request.instanceType;
            this.internetChargeType = request.internetChargeType;
            this.internetMaxBandWidthIn = request.internetMaxBandWidthIn;
            this.internetMaxBandWidthOut = request.internetMaxBandWidthOut;
            this.jobQueue = request.jobQueue;
            this.minCount = request.minCount;
            this.networkInterfaceTrafficMode = request.networkInterfaceTrafficMode;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.sync = request.sync;
            this.systemDiskLevel = request.systemDiskLevel;
            this.systemDiskSize = request.systemDiskSize;
            this.systemDiskType = request.systemDiskType;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * Specifies whether to allocate a public IP address to the compute nodes. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         */
        public Builder allocatePublicAddress(Boolean allocatePublicAddress) {
            this.putQueryParameter("AllocatePublicAddress", allocatePublicAddress);
            this.allocatePublicAddress = allocatePublicAddress;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal. The parameter takes effect only when EcsChargeType is set to PrePaid. Valid values:
         * <p>
         * 
         * *   true: enables auto-renewal
         * *   false: disables auto-renewal
         * 
         * Default value: true.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal period of the subscription compute nodes. The parameter takes effect when AutoRenew is set to true.
         * <p>
         * 
         * *   Valid values when PeriodUnit is set to Week: 1, 2, and 3.
         * *   Valid values when PeriodUnit is set to Month: 1, 2, 3, 6, and 12.
         * 
         * Default value: 1.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence of a request?](~~25693~~)
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the E-HPC cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Specifies whether to enable hyper-threading for the compute node. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: true.
         */
        public Builder computeEnableHt(Boolean computeEnableHt) {
            this.putQueryParameter("ComputeEnableHt", computeEnableHt);
            this.computeEnableHt = computeEnableHt;
            return this;
        }

        /**
         * The protection period of the preemptible instance. Unit: hours. Valid values: 0 and 1. A value of 0 indicates that the preemptible instance has no protection period.
         */
        public Builder computeSpotDuration(Integer computeSpotDuration) {
            this.putQueryParameter("ComputeSpotDuration", computeSpotDuration);
            this.computeSpotDuration = computeSpotDuration;
            return this;
        }

        /**
         * The interruption mode of the preemptible instance. Default value: Terminate. Set the value to Terminate, which indicates that the instance is released.
         */
        public Builder computeSpotInterruptionBehavior(String computeSpotInterruptionBehavior) {
            this.putQueryParameter("ComputeSpotInterruptionBehavior", computeSpotInterruptionBehavior);
            this.computeSpotInterruptionBehavior = computeSpotInterruptionBehavior;
            return this;
        }

        /**
         * The maximum hourly price of the compute nodes. The value can be accurate to three decimal places. The parameter only takes effect when SpotStrategy is set to SpotWithPriceLimit.
         */
        public Builder computeSpotPriceLimit(String computeSpotPriceLimit) {
            this.putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }

        /**
         * The preemption policy of the compute nodes. The parameter only takes effect when EcsChargeType is set to PostPaid. Valid values:
         * <p>
         * 
         * *   NoSpot: The instance is a regular pay-as-you-go instance.
         * *   SpotWithPriceLimit: The policy applies to preemptible instances for which a maximum hourly price is specified.
         * *   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.
         * 
         * Default value: NoSpot.
         */
        public Builder computeSpotStrategy(String computeSpotStrategy) {
            this.putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }

        /**
         * The number of compute nodes that you want to add. Valid values: 1 to 99. The value of this parameter is greater than that of the MinCount parameter.
         * <p>
         * 
         * *   If the number of available ECS instances is less than the value of the MinCount parameter, the compute nodes cannot be added.
         * *   If the number of available ECS instances is greater than the value of the MinCount parameter and less than that of the Count parameter, the compute nodes are added based on the value of the MinCount parameter.
         * *   If the number of available ECS instances is greater than the value of the Count parameter, the compute nodes are added based on the value of the Count parameter.
         */
        public Builder count(Integer count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * The mode in which the compute nodes are added. Valid values:
         * <p>
         * 
         * *   manual: The compute nodes are manually added.
         * *   autoscale: The compute nodes are automatically added.
         * 
         * Default value: manual.
         */
        public Builder createMode(String createMode) {
            this.putQueryParameter("CreateMode", createMode);
            this.createMode = createMode;
            return this;
        }

        /**
         * The list of data disks.
         */
        public Builder dataDisks(java.util.List < DataDisks> dataDisks) {
            this.putQueryParameter("DataDisks", dataDisks);
            this.dataDisks = dataDisks;
            return this;
        }

        /**
         * DnsConfig.
         */
        public Builder dnsConfig(String dnsConfig) {
            this.putQueryParameter("DnsConfig", dnsConfig);
            this.dnsConfig = dnsConfig;
            return this;
        }

        /**
         * The billing method of the compute nodes. Valid values:
         * <p>
         * 
         * *   PostPaid: pay-as-you-go
         * *   PrePaid: subscription
         * 
         * Default value: PostPaid.
         * 
         * If the parameter is set to PrePaid, auto-renewal is enabled by default. After the E-HPC cluster is released, auto-renewal is disabled.
         */
        public Builder ecsChargeType(String ecsChargeType) {
            this.putQueryParameter("EcsChargeType", ecsChargeType);
            this.ecsChargeType = ecsChargeType;
            return this;
        }

        /**
         * The prefix of the hostname. You can specify the parameter to manage the compute nodes in an efficient manner.
         */
        public Builder hostNamePrefix(String hostNamePrefix) {
            this.putQueryParameter("HostNamePrefix", hostNamePrefix);
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }

        /**
         * The suffix of the hostname. You can specify the parameter to manage the compute nodes in an efficient manner.
         */
        public Builder hostNameSuffix(String hostNameSuffix) {
            this.putQueryParameter("HostNameSuffix", hostNameSuffix);
            this.hostNameSuffix = hostNameSuffix;
            return this;
        }

        /**
         * The ID of the image that is specified for the compute nodes. The image must meet the following requirements:
         * <p>
         * 
         * *   The operating system that is specified by the image must be the same as that of the existing cluster nodes. For example, if the operating system of the cluster nodes is CentOS, you can select only a CentOS image.
         * 
         * > If you add nodes to a hybrid cloud cluster that supports multiple operating systems, you can select a Windows Server image or a CentOS image when the operating system of nodes is Windows.
         * 
         * *   The major version of the image specified for the compute nodes that you want to add is the same as that of the image of the cluster. For example, if the version of the cluster image is CentOS 7.x, the version of the image specified for the compute nodes must be CentOS 7.x.
         * 
         * You can call the [ListImages](~~87213~~) and [ListCustomImages](~~87215~~) operations to query the image ID.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The type of the image. Valid values:
         * <p>
         * 
         * *   system: public image
         * *   self: custom image
         * *   others: shared image
         * *   marketplace: Alibaba Cloud Marketplace image
         * 
         * Default value: system.
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * The instance type of the compute nodes. The default value is the instance type that was specified when you created the E-HPC cluster or the last time when you added compute nodes.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The billing method of the elastic IP address (EIP). Valid values:
         * <p>
         * 
         * *   PayByBandwidth: pay-by-bandwidth
         * *   PayByTraffic: pay-by-traffic
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:
         * <p>
         * 
         * *   If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of the parameter are 1 to 10 and the default value is 10.
         * *   If the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the amount of the outbound bandwidth that is purchased.
         */
        public Builder internetMaxBandWidthIn(Integer internetMaxBandWidthIn) {
            this.putQueryParameter("InternetMaxBandWidthIn", internetMaxBandWidthIn);
            this.internetMaxBandWidthIn = internetMaxBandWidthIn;
            return this;
        }

        /**
         * The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
         * <p>
         * 
         * Default value: 0.
         */
        public Builder internetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
            this.putQueryParameter("InternetMaxBandWidthOut", internetMaxBandWidthOut);
            this.internetMaxBandWidthOut = internetMaxBandWidthOut;
            return this;
        }

        /**
         * The queue to which the compute nodes are added.
         */
        public Builder jobQueue(String jobQueue) {
            this.putQueryParameter("JobQueue", jobQueue);
            this.jobQueue = jobQueue;
            return this;
        }

        /**
         * The minimum number of the compute nodes that you want to add. Valid values: 1 to 99. The value of the parameter is less than that of the Count parameter.
         * <p>
         * 
         * *   If the number of available ECS instances is less than the value of the MinCount parameter, the compute nodes cannot be added.
         * *   If the number of available ECS instances is greater than the value of the MinCount parameter and less than that of the Count parameter, the compute nodes are added based on the value of the MinCount parameter.
         * *   If the number of available ECS instances is greater than the value of the Count parameter, the compute nodes are added based on the value of the Count parameter.
         * 
         * Default value: 1.
         */
        public Builder minCount(Integer minCount) {
            this.putQueryParameter("MinCount", minCount);
            this.minCount = minCount;
            return this;
        }

        /**
         * The communication mode of the ENI. Valid values:
         * <p>
         * 
         * *   Standard: uses the TCP communication mode.
         * *   HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the remote direct memory access (RDMA) communication mode.
         */
        public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.putQueryParameter("NetworkInterfaceTrafficMode", networkInterfaceTrafficMode);
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }

        /**
         * The duration of the subscription. The unit of the duration is specified by the PeriodUnit parameter. The parameter only takes effect when InstanceChargeType is set to PrePaid. Valid values:
         * <p>
         * 
         * *   Valid values when PeriodUnit is set to Week: 1, 2, 3, and 4.
         * *   Valid values when PeriodUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.
         * 
         * Default value: 1.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the subscription period of the resource. Valid values:
         * <p>
         * 
         * *   Week
         * *   Month
         * 
         * Default value: Month.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * Specifies whether to set this operation as a synchronous operation. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         */
        public Builder sync(Boolean sync) {
            this.putQueryParameter("Sync", sync);
            this.sync = sync;
            return this;
        }

        /**
         * The performance level of the ESSD to be used as the system disk. Default value: PL1. Valid values:
         * <p>
         * 
         * *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
         * *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
         * *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
         * *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
         * 
         * Default value: PL1.
         * 
         * For more information about ESSD performance parameters, see [ESSD](~~122389~~).
         */
        public Builder systemDiskLevel(String systemDiskLevel) {
            this.putQueryParameter("SystemDiskLevel", systemDiskLevel);
            this.systemDiskLevel = systemDiskLevel;
            return this;
        }

        /**
         * The size of the system disk. Unit: GiB.
         * <p>
         * 
         * Valid values: 40 to 500.
         * 
         * Default value: 40.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * The type of the system disk. Valid values:
         * <p>
         * 
         * *   cloud_efficiency: ultra disk
         * *   cloud_ssd: SSD
         * *   cloud_essd: enhanced SSD (ESSD)
         * *   cloud: basic disk. Disks of this type are retired.
         * 
         * Default value: cloud_efficiency.
         */
        public Builder systemDiskType(String systemDiskType) {
            this.putQueryParameter("SystemDiskType", systemDiskType);
            this.systemDiskType = systemDiskType;
            return this;
        }

        /**
         * The ID of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
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

        @Override
        public AddNodesRequest build() {
            return new AddNodesRequest(this);
        } 

    } 

    public static class DataDisks extends TeaModel {
        @NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @NameInMap("DataDiskDeleteWithInstance")
        private Boolean dataDiskDeleteWithInstance;

        @NameInMap("DataDiskEncrypted")
        private Boolean dataDiskEncrypted;

        @NameInMap("DataDiskKMSKeyId")
        private String dataDiskKMSKeyId;

        @NameInMap("DataDiskPerformanceLevel")
        private String dataDiskPerformanceLevel;

        @NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        private DataDisks(Builder builder) {
            this.dataDiskCategory = builder.dataDiskCategory;
            this.dataDiskDeleteWithInstance = builder.dataDiskDeleteWithInstance;
            this.dataDiskEncrypted = builder.dataDiskEncrypted;
            this.dataDiskKMSKeyId = builder.dataDiskKMSKeyId;
            this.dataDiskPerformanceLevel = builder.dataDiskPerformanceLevel;
            this.dataDiskSize = builder.dataDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisks create() {
            return builder().build();
        }

        /**
         * @return dataDiskCategory
         */
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        /**
         * @return dataDiskDeleteWithInstance
         */
        public Boolean getDataDiskDeleteWithInstance() {
            return this.dataDiskDeleteWithInstance;
        }

        /**
         * @return dataDiskEncrypted
         */
        public Boolean getDataDiskEncrypted() {
            return this.dataDiskEncrypted;
        }

        /**
         * @return dataDiskKMSKeyId
         */
        public String getDataDiskKMSKeyId() {
            return this.dataDiskKMSKeyId;
        }

        /**
         * @return dataDiskPerformanceLevel
         */
        public String getDataDiskPerformanceLevel() {
            return this.dataDiskPerformanceLevel;
        }

        /**
         * @return dataDiskSize
         */
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public static final class Builder {
            private String dataDiskCategory; 
            private Boolean dataDiskDeleteWithInstance; 
            private Boolean dataDiskEncrypted; 
            private String dataDiskKMSKeyId; 
            private String dataDiskPerformanceLevel; 
            private Integer dataDiskSize; 

            /**
             * The type of the data disk. Valid values:
             * <p>
             * 
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: SSD
             * *   cloud_essd: ESSD
             * *   cloud: basic disk
             * 
             * Default value: cloud_efficiency.
             * 
             * Valid values of N: 0 to 16.
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * Specifies whether the data disk is released when the node is released. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * Default value: true.
             * 
             * Valid values of N: 0 to 16.
             */
            public Builder dataDiskDeleteWithInstance(Boolean dataDiskDeleteWithInstance) {
                this.dataDiskDeleteWithInstance = dataDiskDeleteWithInstance;
                return this;
            }

            /**
             * Specifies whether to encrypt the data disk. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * Default value: false.
             * 
             * Valid values of N: 0 to 16.
             */
            public Builder dataDiskEncrypted(Boolean dataDiskEncrypted) {
                this.dataDiskEncrypted = dataDiskEncrypted;
                return this;
            }

            /**
             * The KMS key ID of the data disk.
             * <p>
             * 
             * Valid values of N: 0 to 16.
             */
            public Builder dataDiskKMSKeyId(String dataDiskKMSKeyId) {
                this.dataDiskKMSKeyId = dataDiskKMSKeyId;
                return this;
            }

            /**
             * The performance level of the ESSD used as the data disk. The parameter only takes effect only when the DataDisks.N.DataDiskCategory parameter is set to cloud_essd. Valid values:
             * <p>
             * 
             * *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
             * *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
             * *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
             * *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
             * 
             * Default value: PL1.
             * 
             * Valid values of N: 0 to 16.
             */
            public Builder dataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
                this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
                return this;
            }

            /**
             * The size of the data disk. Unit: GB.
             * <p>
             * 
             * Valid values: 40 to 500.
             * 
             * Default value: 40.
             * 
             * Valid values of N: 0 to 16.
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
}
