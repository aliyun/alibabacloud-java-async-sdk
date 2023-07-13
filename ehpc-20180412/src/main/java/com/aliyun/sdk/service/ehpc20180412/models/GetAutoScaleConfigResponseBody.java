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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterType.
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
         * EnableAutoGrow.
         */
        public Builder enableAutoGrow(Boolean enableAutoGrow) {
            this.enableAutoGrow = enableAutoGrow;
            return this;
        }

        /**
         * EnableAutoShrink.
         */
        public Builder enableAutoShrink(Boolean enableAutoShrink) {
            this.enableAutoShrink = enableAutoShrink;
            return this;
        }

        /**
         * ExcludeNodes.
         */
        public Builder excludeNodes(String excludeNodes) {
            this.excludeNodes = excludeNodes;
            return this;
        }

        /**
         * ExtraNodesGrowRatio.
         */
        public Builder extraNodesGrowRatio(Integer extraNodesGrowRatio) {
            this.extraNodesGrowRatio = extraNodesGrowRatio;
            return this;
        }

        /**
         * GrowIntervalInMinutes.
         */
        public Builder growIntervalInMinutes(Integer growIntervalInMinutes) {
            this.growIntervalInMinutes = growIntervalInMinutes;
            return this;
        }

        /**
         * GrowRatio.
         */
        public Builder growRatio(Integer growRatio) {
            this.growRatio = growRatio;
            return this;
        }

        /**
         * GrowTimeoutInMinutes.
         */
        public Builder growTimeoutInMinutes(Integer growTimeoutInMinutes) {
            this.growTimeoutInMinutes = growTimeoutInMinutes;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * MaxNodesInCluster.
         */
        public Builder maxNodesInCluster(Integer maxNodesInCluster) {
            this.maxNodesInCluster = maxNodesInCluster;
            return this;
        }

        /**
         * Queues.
         */
        public Builder queues(Queues queues) {
            this.queues = queues;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShrinkIdleTimes.
         */
        public Builder shrinkIdleTimes(Integer shrinkIdleTimes) {
            this.shrinkIdleTimes = shrinkIdleTimes;
            return this;
        }

        /**
         * ShrinkIntervalInMinutes.
         */
        public Builder shrinkIntervalInMinutes(Integer shrinkIntervalInMinutes) {
            this.shrinkIntervalInMinutes = shrinkIntervalInMinutes;
            return this;
        }

        /**
         * SpotPriceLimit.
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * Uid.
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
             * DataDiskCategory.
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * DataDiskDeleteWithInstance.
             */
            public Builder dataDiskDeleteWithInstance(Boolean dataDiskDeleteWithInstance) {
                this.dataDiskDeleteWithInstance = dataDiskDeleteWithInstance;
                return this;
            }

            /**
             * DataDiskEncrypted.
             */
            public Builder dataDiskEncrypted(Boolean dataDiskEncrypted) {
                this.dataDiskEncrypted = dataDiskEncrypted;
                return this;
            }

            /**
             * DataDiskKMSKeyId.
             */
            public Builder dataDiskKMSKeyId(String dataDiskKMSKeyId) {
                this.dataDiskKMSKeyId = dataDiskKMSKeyId;
                return this;
            }

            /**
             * DataDiskPerformanceLevel.
             */
            public Builder dataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
                this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
                return this;
            }

            /**
             * DataDiskSize.
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
             * HostNamePrefix.
             */
            public Builder hostNamePrefix(String hostNamePrefix) {
                this.hostNamePrefix = hostNamePrefix;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * SpotDuration.
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
                return this;
            }

            /**
             * SpotInterruptionBehavior.
             */
            public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
                this.spotInterruptionBehavior = spotInterruptionBehavior;
                return this;
            }

            /**
             * SpotPriceLimit.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ZoneId.
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
             * DataDisks.
             */
            public Builder dataDisks(DataDisks dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * EnableAutoGrow.
             */
            public Builder enableAutoGrow(Boolean enableAutoGrow) {
                this.enableAutoGrow = enableAutoGrow;
                return this;
            }

            /**
             * EnableAutoShrink.
             */
            public Builder enableAutoShrink(Boolean enableAutoShrink) {
                this.enableAutoShrink = enableAutoShrink;
                return this;
            }

            /**
             * HostNamePrefix.
             */
            public Builder hostNamePrefix(String hostNamePrefix) {
                this.hostNamePrefix = hostNamePrefix;
                return this;
            }

            /**
             * HostNameSuffix.
             */
            public Builder hostNameSuffix(String hostNameSuffix) {
                this.hostNameSuffix = hostNameSuffix;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InstanceTypes.
             */
            public Builder instanceTypes(InstanceTypes instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * MaxNodesInQueue.
             */
            public Builder maxNodesInQueue(Integer maxNodesInQueue) {
                this.maxNodesInQueue = maxNodesInQueue;
                return this;
            }

            /**
             * MaxNodesPerCycle.
             */
            public Builder maxNodesPerCycle(Long maxNodesPerCycle) {
                this.maxNodesPerCycle = maxNodesPerCycle;
                return this;
            }

            /**
             * MinNodesInQueue.
             */
            public Builder minNodesInQueue(Integer minNodesInQueue) {
                this.minNodesInQueue = minNodesInQueue;
                return this;
            }

            /**
             * MinNodesPerCycle.
             */
            public Builder minNodesPerCycle(Long minNodesPerCycle) {
                this.minNodesPerCycle = minNodesPerCycle;
                return this;
            }

            /**
             * QueueImageId.
             */
            public Builder queueImageId(String queueImageId) {
                this.queueImageId = queueImageId;
                return this;
            }

            /**
             * QueueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * ResourceGroupId.
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
             * SpotPriceLimit.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * SystemDiskCategory.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * SystemDiskLevel.
             */
            public Builder systemDiskLevel(String systemDiskLevel) {
                this.systemDiskLevel = systemDiskLevel;
                return this;
            }

            /**
             * SystemDiskSize.
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
