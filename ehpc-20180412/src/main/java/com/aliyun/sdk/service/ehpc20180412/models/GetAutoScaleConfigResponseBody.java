// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutoScaleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoScaleConfigResponseBody</p>
 */
public class GetAutoScaleConfigResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("ClusterType")
    private String clusterType;

    @NameInMap("ComputeEnableHt")
    private Boolean computeEnableHt;

    @NameInMap("DnsConfig")
    private String dnsConfig;

    @NameInMap("EnableAutoGrow")
    private Boolean enableAutoGrow;

    @NameInMap("EnableAutoShrink")
    private Boolean enableAutoShrink;

    @NameInMap("ExcludeNodes")
    private String excludeNodes;

    @NameInMap("ExtraNodesGrowRatio")
    private Integer extraNodesGrowRatio;

    @NameInMap("GrowIntervalInMinutes")
    private Integer growIntervalInMinutes;

    @NameInMap("GrowRatio")
    private Integer growRatio;

    @NameInMap("GrowTimeoutInMinutes")
    private Integer growTimeoutInMinutes;

    @NameInMap("ImageId")
    private String imageId;

    @NameInMap("MaxNodesInCluster")
    private Integer maxNodesInCluster;

    @NameInMap("Queues")
    private Queues queues;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShrinkIdleTimes")
    private Integer shrinkIdleTimes;

    @NameInMap("ShrinkIntervalInMinutes")
    private Integer shrinkIntervalInMinutes;

    @NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @NameInMap("Uid")
    private String uid;

    private GetAutoScaleConfigResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.clusterType = builder.clusterType;
        this.computeEnableHt = builder.computeEnableHt;
        this.dnsConfig = builder.dnsConfig;
        this.enableAutoGrow = builder.enableAutoGrow;
        this.enableAutoShrink = builder.enableAutoShrink;
        this.excludeNodes = builder.excludeNodes;
        this.extraNodesGrowRatio = builder.extraNodesGrowRatio;
        this.growIntervalInMinutes = builder.growIntervalInMinutes;
        this.growRatio = builder.growRatio;
        this.growTimeoutInMinutes = builder.growTimeoutInMinutes;
        this.imageId = builder.imageId;
        this.maxNodesInCluster = builder.maxNodesInCluster;
        this.queues = builder.queues;
        this.requestId = builder.requestId;
        this.shrinkIdleTimes = builder.shrinkIdleTimes;
        this.shrinkIntervalInMinutes = builder.shrinkIntervalInMinutes;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.spotStrategy = builder.spotStrategy;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoScaleConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return computeEnableHt
     */
    public Boolean getComputeEnableHt() {
        return this.computeEnableHt;
    }

    /**
     * @return dnsConfig
     */
    public String getDnsConfig() {
        return this.dnsConfig;
    }

    /**
     * @return enableAutoGrow
     */
    public Boolean getEnableAutoGrow() {
        return this.enableAutoGrow;
    }

    /**
     * @return enableAutoShrink
     */
    public Boolean getEnableAutoShrink() {
        return this.enableAutoShrink;
    }

    /**
     * @return excludeNodes
     */
    public String getExcludeNodes() {
        return this.excludeNodes;
    }

    /**
     * @return extraNodesGrowRatio
     */
    public Integer getExtraNodesGrowRatio() {
        return this.extraNodesGrowRatio;
    }

    /**
     * @return growIntervalInMinutes
     */
    public Integer getGrowIntervalInMinutes() {
        return this.growIntervalInMinutes;
    }

    /**
     * @return growRatio
     */
    public Integer getGrowRatio() {
        return this.growRatio;
    }

    /**
     * @return growTimeoutInMinutes
     */
    public Integer getGrowTimeoutInMinutes() {
        return this.growTimeoutInMinutes;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return maxNodesInCluster
     */
    public Integer getMaxNodesInCluster() {
        return this.maxNodesInCluster;
    }

    /**
     * @return queues
     */
    public Queues getQueues() {
        return this.queues;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shrinkIdleTimes
     */
    public Integer getShrinkIdleTimes() {
        return this.shrinkIdleTimes;
    }

    /**
     * @return shrinkIntervalInMinutes
     */
    public Integer getShrinkIntervalInMinutes() {
        return this.shrinkIntervalInMinutes;
    }

    /**
     * @return spotPriceLimit
     */
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private String clusterId; 
        private String clusterType; 
        private Boolean computeEnableHt; 
        private String dnsConfig; 
        private Boolean enableAutoGrow; 
        private Boolean enableAutoShrink; 
        private String excludeNodes; 
        private Integer extraNodesGrowRatio; 
        private Integer growIntervalInMinutes; 
        private Integer growRatio; 
        private Integer growTimeoutInMinutes; 
        private String imageId; 
        private Integer maxNodesInCluster; 
        private Queues queues; 
        private String requestId; 
        private Integer shrinkIdleTimes; 
        private Integer shrinkIntervalInMinutes; 
        private Float spotPriceLimit; 
        private String spotStrategy; 
        private String uid; 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The type of the scheduler. Valid values:
         * <p>
         * 
         * *   slurm
         * *   pbs
         * *   opengridscheduler
         * *   deadline
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * ComputeEnableHt.
         */
        public Builder computeEnableHt(Boolean computeEnableHt) {
            this.computeEnableHt = computeEnableHt;
            return this;
        }

        /**
         * DnsConfig.
         */
        public Builder dnsConfig(String dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        /**
         * Indicates whether the cluster enabled auto scale-out. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder enableAutoGrow(Boolean enableAutoGrow) {
            this.enableAutoGrow = enableAutoGrow;
            return this;
        }

        /**
         * Indicates whether the cluster enabled auto scale-in. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder enableAutoShrink(Boolean enableAutoShrink) {
            this.enableAutoShrink = enableAutoShrink;
            return this;
        }

        /**
         * The compute nodes that were excluded from the list of auto scaling nodes. Multiple compute nodes were separated with commas (,).
         */
        public Builder excludeNodes(String excludeNodes) {
            this.excludeNodes = excludeNodes;
            return this;
        }

        /**
         * The percentage of extra compute nodes. Valid values: 0 to 100.
         * <p>
         * 
         * If you need to add 100 compute nodes and the value of the ExtraNodesGrowRatio parameter is 2, 102 compute nodes are added.
         */
        public Builder extraNodesGrowRatio(Integer extraNodesGrowRatio) {
            this.extraNodesGrowRatio = extraNodesGrowRatio;
            return this;
        }

        /**
         * The interval between two consecutive rounds of scale-in. Unit: minutes. Valid values: 2 to 10.
         * <p>
         * 
         * >  An interval may exist during multiple rounds of a scale-out task or between two consecutive scale-out tasks.
         */
        public Builder growIntervalInMinutes(Integer growIntervalInMinutes) {
            this.growIntervalInMinutes = growIntervalInMinutes;
            return this;
        }

        /**
         * The percentage of each round of scale-out. Valid values: 1 to 100.
         * <p>
         * 
         * If you set GrowRatio to 50, the scale-out has two rounds. Each round completes half of the scale-out.
         */
        public Builder growRatio(Integer growRatio) {
            this.growRatio = growRatio;
            return this;
        }

        /**
         * The timeout period before the scale-out nodes were started. Unit: minutes. Valid values: 10 to 60.
         * <p>
         * 
         * If the scale-out timeout period has been reached but the scale-out nodes still do not reach the Running state, the system resets them.
         */
        public Builder growTimeoutInMinutes(Integer growTimeoutInMinutes) {
            this.growTimeoutInMinutes = growTimeoutInMinutes;
            return this;
        }

        /**
         * The image ID of the compute nodes in the queue.
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * The maximum number of compute nodes that can be added in the cluster. Valid values: 0 to 500.
         */
        public Builder maxNodesInCluster(Integer maxNodesInCluster) {
            this.maxNodesInCluster = maxNodesInCluster;
            return this;
        }

        /**
         * The auto scaling configuration of the queue.
         * <p>
         * 
         * >  If auto scaling is enabled for the cluster and queue at the same time, the queue settings prevail.
         */
        public Builder queues(Queues queues) {
            this.queues = queues;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of consecutive times that a compute node is idle during the resource scale-in check. Valid values: 2 to 5.
         * <p>
         * 
         * If the parameter is set to 3, a compute node is idle for more than three consecutive times. In this case, the node is released.
         */
        public Builder shrinkIdleTimes(Integer shrinkIdleTimes) {
            this.shrinkIdleTimes = shrinkIdleTimes;
            return this;
        }

        /**
         * The interval between two consecutive rounds of scale-out. Unit: minutes. Valid values: 2 to 10.
         */
        public Builder shrinkIntervalInMinutes(Integer shrinkIntervalInMinutes) {
            this.shrinkIntervalInMinutes = shrinkIntervalInMinutes;
            return this;
        }

        /**
         * The maximum hourly price of the compute nodes. The value can be accurate to three decimal places. The parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit.
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * The preemption policy of the compute nodes. Valid values:
         * <p>
         * 
         * *   NoSpot: The compute nodes are pay-as-you-go instances.
         * *   SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.
         * *   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public GetAutoScaleConfigResponseBody build() {
            return new GetAutoScaleConfigResponseBody(this);
        } 

    } 

    public static class DataDisksInfo extends TeaModel {
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

        private DataDisksInfo(Builder builder) {
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

        public static DataDisksInfo create() {
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
             * - cloud_efficiency: ultra disk
             * - cloud_ssd: SSD
             * - cloud_essd: ESSD
             * - cloud: basic disk
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * Indicates whether the data disk is released when the node is released. Valid values:
             * <p>
             * 
             * - true
             * - false
             */
            public Builder dataDiskDeleteWithInstance(Boolean dataDiskDeleteWithInstance) {
                this.dataDiskDeleteWithInstance = dataDiskDeleteWithInstance;
                return this;
            }

            /**
             * Indicates whether the data disk is encrypted. Valid values:
             * <p>
             * 
             * - true
             * - false
             */
            public Builder dataDiskEncrypted(Boolean dataDiskEncrypted) {
                this.dataDiskEncrypted = dataDiskEncrypted;
                return this;
            }

            /**
             * The KMS key ID of the data disk.
             */
            public Builder dataDiskKMSKeyId(String dataDiskKMSKeyId) {
                this.dataDiskKMSKeyId = dataDiskKMSKeyId;
                return this;
            }

            /**
             * The performance level of the ESSD used as the data disk. The parameter takes effect only when the DataDisks.N.DataDiskCategory parameter is set to cloud_essd. Valid values:
             * <p>
             * 
             * - PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
             * - PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
             * - PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
             * - PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
             */
            public Builder dataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
                this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
                return this;
            }

            /**
             * The capacity of the data disk. Unit: GB.
             * <p>
             * 
             * Valid values: 40 to 500.
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            public DataDisksInfo build() {
                return new DataDisksInfo(this);
            } 

        } 

    }
    public static class DataDisks extends TeaModel {
        @NameInMap("DataDisksInfo")
        private java.util.List < DataDisksInfo> dataDisksInfo;

        private DataDisks(Builder builder) {
            this.dataDisksInfo = builder.dataDisksInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisks create() {
            return builder().build();
        }

        /**
         * @return dataDisksInfo
         */
        public java.util.List < DataDisksInfo> getDataDisksInfo() {
            return this.dataDisksInfo;
        }

        public static final class Builder {
            private java.util.List < DataDisksInfo> dataDisksInfo; 

            /**
             * DataDisksInfo.
             */
            public Builder dataDisksInfo(java.util.List < DataDisksInfo> dataDisksInfo) {
                this.dataDisksInfo = dataDisksInfo;
                return this;
            }

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
    public static class InstanceTypeInfo extends TeaModel {
        @NameInMap("HostNamePrefix")
        private String hostNamePrefix;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("SpotDuration")
        private Integer spotDuration;

        @NameInMap("SpotInterruptionBehavior")
        private String spotInterruptionBehavior;

        @NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private InstanceTypeInfo(Builder builder) {
            this.hostNamePrefix = builder.hostNamePrefix;
            this.instanceType = builder.instanceType;
            this.spotDuration = builder.spotDuration;
            this.spotInterruptionBehavior = builder.spotInterruptionBehavior;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.spotStrategy = builder.spotStrategy;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeInfo create() {
            return builder().build();
        }

        /**
         * @return hostNamePrefix
         */
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
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
         * @return spotInterruptionBehavior
         */
        public String getSpotInterruptionBehavior() {
            return this.spotInterruptionBehavior;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
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

        public static final class Builder {
            private String hostNamePrefix; 
            private String instanceType; 
            private Integer spotDuration; 
            private String spotInterruptionBehavior; 
            private Float spotPriceLimit; 
            private String spotStrategy; 
            private String vSwitchId; 
            private String zoneId; 

            /**
             * The prefix of the hostname. You can query compute nodes that have a specified prefix.
             */
            public Builder hostNamePrefix(String hostNamePrefix) {
                this.hostNamePrefix = hostNamePrefix;
                return this;
            }

            /**
             * The instance type of the node.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The protection period of the preemptible instance. Unit: hours. Valid values: 0 to 1. Default value: 1. A value of 0 means no protection period is specified.
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
                return this;
            }

            /**
             * The interruption mode of the preemptible instance. Default value: Terminate. Set the value to Terminate, which indicates that the instance is released.
             */
            public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
                this.spotInterruptionBehavior = spotInterruptionBehavior;
                return this;
            }

            /**
             * The maximum hourly price of the compute nodes. The value can be accurate to three decimal places. The parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The bidding method of the compute nodes. Valid values:
             * <p>
             * 
             * *   NoSpot: The compute nodes are pay-as-you-go instances.
             * *   SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.
             * *   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public InstanceTypeInfo build() {
                return new InstanceTypeInfo(this);
            } 

        } 

    }
    public static class InstanceTypes extends TeaModel {
        @NameInMap("InstanceTypeInfo")
        private java.util.List < InstanceTypeInfo> instanceTypeInfo;

        private InstanceTypes(Builder builder) {
            this.instanceTypeInfo = builder.instanceTypeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypes create() {
            return builder().build();
        }

        /**
         * @return instanceTypeInfo
         */
        public java.util.List < InstanceTypeInfo> getInstanceTypeInfo() {
            return this.instanceTypeInfo;
        }

        public static final class Builder {
            private java.util.List < InstanceTypeInfo> instanceTypeInfo; 

            /**
             * InstanceTypeInfo.
             */
            public Builder instanceTypeInfo(java.util.List < InstanceTypeInfo> instanceTypeInfo) {
                this.instanceTypeInfo = instanceTypeInfo;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
    public static class QueueInfo extends TeaModel {
        @NameInMap("AutoMinNodesPerCycle")
        private Boolean autoMinNodesPerCycle;

        @NameInMap("DataDisks")
        private DataDisks dataDisks;

        @NameInMap("EnableAutoGrow")
        private Boolean enableAutoGrow;

        @NameInMap("EnableAutoShrink")
        private Boolean enableAutoShrink;

        @NameInMap("HostNamePrefix")
        private String hostNamePrefix;

        @NameInMap("HostNameSuffix")
        private String hostNameSuffix;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstanceTypes")
        private InstanceTypes instanceTypes;

        @NameInMap("MaxNodesInQueue")
        private Integer maxNodesInQueue;

        @NameInMap("MaxNodesPerCycle")
        private Long maxNodesPerCycle;

        @NameInMap("MinNodesInQueue")
        private Integer minNodesInQueue;

        @NameInMap("MinNodesPerCycle")
        private Long minNodesPerCycle;

        @NameInMap("QueueImageId")
        private String queueImageId;

        @NameInMap("QueueName")
        private String queueName;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SortedByInventory")
        private Boolean sortedByInventory;

        @NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @NameInMap("SystemDiskLevel")
        private String systemDiskLevel;

        @NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        private QueueInfo(Builder builder) {
            this.autoMinNodesPerCycle = builder.autoMinNodesPerCycle;
            this.dataDisks = builder.dataDisks;
            this.enableAutoGrow = builder.enableAutoGrow;
            this.enableAutoShrink = builder.enableAutoShrink;
            this.hostNamePrefix = builder.hostNamePrefix;
            this.hostNameSuffix = builder.hostNameSuffix;
            this.instanceType = builder.instanceType;
            this.instanceTypes = builder.instanceTypes;
            this.maxNodesInQueue = builder.maxNodesInQueue;
            this.maxNodesPerCycle = builder.maxNodesPerCycle;
            this.minNodesInQueue = builder.minNodesInQueue;
            this.minNodesPerCycle = builder.minNodesPerCycle;
            this.queueImageId = builder.queueImageId;
            this.queueName = builder.queueName;
            this.resourceGroupId = builder.resourceGroupId;
            this.sortedByInventory = builder.sortedByInventory;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.spotStrategy = builder.spotStrategy;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskLevel = builder.systemDiskLevel;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueInfo create() {
            return builder().build();
        }

        /**
         * @return autoMinNodesPerCycle
         */
        public Boolean getAutoMinNodesPerCycle() {
            return this.autoMinNodesPerCycle;
        }

        /**
         * @return dataDisks
         */
        public DataDisks getDataDisks() {
            return this.dataDisks;
        }

        /**
         * @return enableAutoGrow
         */
        public Boolean getEnableAutoGrow() {
            return this.enableAutoGrow;
        }

        /**
         * @return enableAutoShrink
         */
        public Boolean getEnableAutoShrink() {
            return this.enableAutoShrink;
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
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypes
         */
        public InstanceTypes getInstanceTypes() {
            return this.instanceTypes;
        }

        /**
         * @return maxNodesInQueue
         */
        public Integer getMaxNodesInQueue() {
            return this.maxNodesInQueue;
        }

        /**
         * @return maxNodesPerCycle
         */
        public Long getMaxNodesPerCycle() {
            return this.maxNodesPerCycle;
        }

        /**
         * @return minNodesInQueue
         */
        public Integer getMinNodesInQueue() {
            return this.minNodesInQueue;
        }

        /**
         * @return minNodesPerCycle
         */
        public Long getMinNodesPerCycle() {
            return this.minNodesPerCycle;
        }

        /**
         * @return queueImageId
         */
        public String getQueueImageId() {
            return this.queueImageId;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return sortedByInventory
         */
        public Boolean getSortedByInventory() {
            return this.sortedByInventory;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
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

        public static final class Builder {
            private Boolean autoMinNodesPerCycle; 
            private DataDisks dataDisks; 
            private Boolean enableAutoGrow; 
            private Boolean enableAutoShrink; 
            private String hostNamePrefix; 
            private String hostNameSuffix; 
            private String instanceType; 
            private InstanceTypes instanceTypes; 
            private Integer maxNodesInQueue; 
            private Long maxNodesPerCycle; 
            private Integer minNodesInQueue; 
            private Long minNodesPerCycle; 
            private String queueImageId; 
            private String queueName; 
            private String resourceGroupId; 
            private Boolean sortedByInventory; 
            private Float spotPriceLimit; 
            private String spotStrategy; 
            private String systemDiskCategory; 
            private String systemDiskLevel; 
            private Integer systemDiskSize; 

            /**
             * AutoMinNodesPerCycle.
             */
            public Builder autoMinNodesPerCycle(Boolean autoMinNodesPerCycle) {
                this.autoMinNodesPerCycle = autoMinNodesPerCycle;
                return this;
            }

            /**
             * The list of data disks.
             */
            public Builder dataDisks(DataDisks dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * Indicates whether the queue enabled auto scale-out. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder enableAutoGrow(Boolean enableAutoGrow) {
                this.enableAutoGrow = enableAutoGrow;
                return this;
            }

            /**
             * Indicates whether the queue enabled auto scale-in. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder enableAutoShrink(Boolean enableAutoShrink) {
                this.enableAutoShrink = enableAutoShrink;
                return this;
            }

            /**
             * The prefix of the queue name. You can query queues that have a specified prefix.
             */
            public Builder hostNamePrefix(String hostNamePrefix) {
                this.hostNamePrefix = hostNamePrefix;
                return this;
            }

            /**
             * The suffix of the queue name. You can query queues that have a specified suffix.
             */
            public Builder hostNameSuffix(String hostNameSuffix) {
                this.hostNameSuffix = hostNameSuffix;
                return this;
            }

            /**
             * The instance type of the compute nodes that were automatically added in the queue.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The specification information of the compute nodes.
             */
            public Builder instanceTypes(InstanceTypes instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * The maximum number of compute nodes that can be added in a queue. Valid values: 0 to 500.
             */
            public Builder maxNodesInQueue(Integer maxNodesInQueue) {
                this.maxNodesInQueue = maxNodesInQueue;
                return this;
            }

            /**
             * The maximum number of compute nodes that can be added in each round of an auto scale-out task. Valid values: 0 to 99.
             * <p>
             * 
             * Default value: 0.
             */
            public Builder maxNodesPerCycle(Long maxNodesPerCycle) {
                this.maxNodesPerCycle = maxNodesPerCycle;
                return this;
            }

            /**
             * The minimum number of compute nodes that can be retained in a queue. Valid values: 0 to 50.
             */
            public Builder minNodesInQueue(Integer minNodesInQueue) {
                this.minNodesInQueue = minNodesInQueue;
                return this;
            }

            /**
             * The minimum number of compute nodes that can be added in each round of an auto scale-out task. Valid values: 1 to 99.
             * <p>
             * 
             * Default value: 1.
             * 
             * If the number of compute nodes that you want to add in a round is less than the value of this property, the system automatically changes the value of this property to the number of compute nodes that you want to add in a round. This helps ensure that compute nodes can be added as expected.
             * 
             * > The configuration takes effect only for the minimum compute nodes that can be added in the current round.
             */
            public Builder minNodesPerCycle(Long minNodesPerCycle) {
                this.minNodesPerCycle = minNodesPerCycle;
                return this;
            }

            /**
             * The image ID of the compute nodes in the queue.
             */
            public Builder queueImageId(String queueImageId) {
                this.queueImageId = queueImageId;
                return this;
            }

            /**
             * The name of the queue.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * The ID of the resource group to which the compute nodes belong.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SortedByInventory.
             */
            public Builder sortedByInventory(Boolean sortedByInventory) {
                this.sortedByInventory = sortedByInventory;
                return this;
            }

            /**
             * The maximum hourly price of the compute nodes. The value can be accurate to three decimal places. The parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The preemption policy of the compute nodes. Valid values:
             * <p>
             * 
             * *   NoSpot: The compute nodes are pay-as-you-go instances.
             * *   SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.
             * *   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The type of the system disk. Valid values:
             * <p>
             * 
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: SSD
             * *   cloud_essd: ESSD
             * *   cloud: basic disk
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * The performance level of the system disk. Valid values:
             * <p>
             * 
             * *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
             * *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
             * *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
             * *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
             */
            public Builder systemDiskLevel(String systemDiskLevel) {
                this.systemDiskLevel = systemDiskLevel;
                return this;
            }

            /**
             * The size of the system disk. Unit: GB. Valid values: 40 to 500.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public QueueInfo build() {
                return new QueueInfo(this);
            } 

        } 

    }
    public static class Queues extends TeaModel {
        @NameInMap("QueueInfo")
        private java.util.List < QueueInfo> queueInfo;

        private Queues(Builder builder) {
            this.queueInfo = builder.queueInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Queues create() {
            return builder().build();
        }

        /**
         * @return queueInfo
         */
        public java.util.List < QueueInfo> getQueueInfo() {
            return this.queueInfo;
        }

        public static final class Builder {
            private java.util.List < QueueInfo> queueInfo; 

            /**
             * QueueInfo.
             */
            public Builder queueInfo(java.util.List < QueueInfo> queueInfo) {
                this.queueInfo = queueInfo;
                return this;
            }

            public Queues build() {
                return new Queues(this);
            } 

        } 

    }
}
