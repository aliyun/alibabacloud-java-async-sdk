// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link GetAutoScaleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoScaleConfigResponseBody</p>
 */
public class GetAutoScaleConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.NameInMap("ComputeEnableHt")
    private Boolean computeEnableHt;

    @com.aliyun.core.annotation.NameInMap("DnsConfig")
    private String dnsConfig;

    @com.aliyun.core.annotation.NameInMap("EnableAutoGrow")
    private Boolean enableAutoGrow;

    @com.aliyun.core.annotation.NameInMap("EnableAutoShrink")
    private Boolean enableAutoShrink;

    @com.aliyun.core.annotation.NameInMap("ExcludeNodes")
    private String excludeNodes;

    @com.aliyun.core.annotation.NameInMap("ExtraNodesGrowRatio")
    private Integer extraNodesGrowRatio;

    @com.aliyun.core.annotation.NameInMap("GrowIntervalInMinutes")
    private Integer growIntervalInMinutes;

    @com.aliyun.core.annotation.NameInMap("GrowRatio")
    private Integer growRatio;

    @com.aliyun.core.annotation.NameInMap("GrowTimeoutInMinutes")
    private Integer growTimeoutInMinutes;

    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("MaxNodesInCluster")
    private Integer maxNodesInCluster;

    @com.aliyun.core.annotation.NameInMap("Queues")
    private Queues queues;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShrinkIdleTimes")
    private Integer shrinkIdleTimes;

    @com.aliyun.core.annotation.NameInMap("ShrinkIntervalInMinutes")
    private Integer shrinkIntervalInMinutes;

    @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.NameInMap("Uid")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAutoScaleConfigResponseBody model) {
            this.clusterId = model.clusterId;
            this.clusterType = model.clusterType;
            this.computeEnableHt = model.computeEnableHt;
            this.dnsConfig = model.dnsConfig;
            this.enableAutoGrow = model.enableAutoGrow;
            this.enableAutoShrink = model.enableAutoShrink;
            this.excludeNodes = model.excludeNodes;
            this.extraNodesGrowRatio = model.extraNodesGrowRatio;
            this.growIntervalInMinutes = model.growIntervalInMinutes;
            this.growRatio = model.growRatio;
            this.growTimeoutInMinutes = model.growTimeoutInMinutes;
            this.imageId = model.imageId;
            this.maxNodesInCluster = model.maxNodesInCluster;
            this.queues = model.queues;
            this.requestId = model.requestId;
            this.shrinkIdleTimes = model.shrinkIdleTimes;
            this.shrinkIntervalInMinutes = model.shrinkIntervalInMinutes;
            this.spotPriceLimit = model.spotPriceLimit;
            this.spotStrategy = model.spotStrategy;
            this.uid = model.uid;
        } 

        /**
         * <p>The prefix of the queue name. You can query queues that have a specified prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pbs</p>
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>Specifies whether to enable hyper-threading for the ECS instance that is used as the compute node.</p>
         * <blockquote>
         * <p> You can only disable hyper-threading for some instance types. The hyper-threading is enabled for ECS instances by default. For more information, see <a href="https://help.aliyun.com/document_detail/145895.html">Specify and view CPU options</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder computeEnableHt(Boolean computeEnableHt) {
            this.computeEnableHt = computeEnableHt;
            return this;
        }

        /**
         * <p>The configurations of DNS.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;DnsType&quot;:&quot;PrivateZone&quot;,&quot;DnsName&quot;:&quot;xxxxx&quot;}&quot;</p>
         */
        public Builder dnsConfig(String dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        /**
         * <p>The percentage of each round of scale-out. Valid values: 1 to 100.</p>
         * <p>If you set GrowRatio to 50, the scale-out has two rounds. Each round completes half of the scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAutoGrow(Boolean enableAutoGrow) {
            this.enableAutoGrow = enableAutoGrow;
            return this;
        }

        /**
         * <p>The number of consecutive times that a compute node is idle during the resource scale-in check. Valid values: 2 to 5.</p>
         * <p>If the parameter is set to 3, a compute node is idle for more than three consecutive times. In this case, the node is released.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAutoShrink(Boolean enableAutoShrink) {
            this.enableAutoShrink = enableAutoShrink;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp19lgqwxb4206t5****,i-bp1g4hvzs9pywrhb****</p>
         */
        public Builder excludeNodes(String excludeNodes) {
            this.excludeNodes = excludeNodes;
            return this;
        }

        /**
         * <p>The instance type of the compute nodes that were automatically added in the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder extraNodesGrowRatio(Integer extraNodesGrowRatio) {
            this.extraNodesGrowRatio = extraNodesGrowRatio;
            return this;
        }

        /**
         * <p>The image ID of the compute nodes in the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder growIntervalInMinutes(Integer growIntervalInMinutes) {
            this.growIntervalInMinutes = growIntervalInMinutes;
            return this;
        }

        /**
         * <p>The minimum number of compute nodes that can be retained in a queue. Valid values: 0 to 50.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder growRatio(Integer growRatio) {
            this.growRatio = growRatio;
            return this;
        }

        /**
         * <p>The maximum hourly price of the compute nodes. The value can be accurate to three decimal places. The parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder growTimeoutInMinutes(Integer growTimeoutInMinutes) {
            this.growTimeoutInMinutes = growTimeoutInMinutes;
            return this;
        }

        /**
         * <p>The preemption policy of the compute nodes. Valid values:</p>
         * <ul>
         * <li>NoSpot: The compute nodes are pay-as-you-go instances.</li>
         * <li>SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>m-bp10txryr4mhrrt1****</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The interval between two consecutive rounds of scale-in. Unit: minutes. Valid values: 2 to 10.</p>
         * <blockquote>
         * <p> An interval may exist during multiple rounds of a scale-out task or between two consecutive scale-out tasks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder maxNodesInCluster(Integer maxNodesInCluster) {
            this.maxNodesInCluster = maxNodesInCluster;
            return this;
        }

        /**
         * <p>The auto scaling configuration of the queue.</p>
         * <blockquote>
         * <p> If auto scaling is enabled for the cluster and queue at the same time, the queue settings prevail.</p>
         * </blockquote>
         */
        public Builder queues(Queues queues) {
            this.queues = queues;
            return this;
        }

        /**
         * <p>The image ID of the compute nodes in the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The suffix of the queue name. You can query queues that have a specified suffix.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder shrinkIdleTimes(Integer shrinkIdleTimes) {
            this.shrinkIdleTimes = shrinkIdleTimes;
            return this;
        }

        /**
         * <p>The auto scaling configuration of the queue.</p>
         * <blockquote>
         * <p> If auto scaling is enabled for the cluster and queue at the same time, the queue settings prevail.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder shrinkIntervalInMinutes(Integer shrinkIntervalInMinutes) {
            this.shrinkIntervalInMinutes = shrinkIntervalInMinutes;
            return this;
        }

        /**
         * <p>The type of the system disk. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: SSD</li>
         * <li>cloud_essd: ESSD</li>
         * <li>cloud: basic disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0.062</p>
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * <p>The percentage of extra compute nodes. Valid values: 0 to 100.</p>
         * <p>If you need to add 100 compute nodes and the value of the ExtraNodesGrowRatio parameter is 2, 102 compute nodes are added.</p>
         * 
         * <strong>example:</strong>
         * <p>SpotWithPriceLimit</p>
         */
        public Builder spotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * <p>The size of the system disk. Unit: GB. Valid values: 40 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>129845258050****</p>
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public GetAutoScaleConfigResponseBody build() {
            return new GetAutoScaleConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAutoScaleConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoScaleConfigResponseBody</p>
     */
    public static class DataDisksInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @com.aliyun.core.annotation.NameInMap("DataDiskDeleteWithInstance")
        private Boolean dataDiskDeleteWithInstance;

        @com.aliyun.core.annotation.NameInMap("DataDiskEncrypted")
        private Boolean dataDiskEncrypted;

        @com.aliyun.core.annotation.NameInMap("DataDiskKMSKeyId")
        private String dataDiskKMSKeyId;

        @com.aliyun.core.annotation.NameInMap("DataDiskPerformanceLevel")
        private String dataDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
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

            private Builder() {
            } 

            private Builder(DataDisksInfo model) {
                this.dataDiskCategory = model.dataDiskCategory;
                this.dataDiskDeleteWithInstance = model.dataDiskDeleteWithInstance;
                this.dataDiskEncrypted = model.dataDiskEncrypted;
                this.dataDiskKMSKeyId = model.dataDiskKMSKeyId;
                this.dataDiskPerformanceLevel = model.dataDiskPerformanceLevel;
                this.dataDiskSize = model.dataDiskSize;
            } 

            /**
             * <p>The type of the data disk. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_essd: ESSD.</li>
             * <li>cloud: basic disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * <p>Indicates whether the data disk is released when the node is released. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataDiskDeleteWithInstance(Boolean dataDiskDeleteWithInstance) {
                this.dataDiskDeleteWithInstance = dataDiskDeleteWithInstance;
                return this;
            }

            /**
             * <p>Indicates whether the data disk is encrypted. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dataDiskEncrypted(Boolean dataDiskEncrypted) {
                this.dataDiskEncrypted = dataDiskEncrypted;
                return this;
            }

            /**
             * <p>The ID of the KMS key that is used by the data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40826X</p>
             */
            public Builder dataDiskKMSKeyId(String dataDiskKMSKeyId) {
                this.dataDiskKMSKeyId = dataDiskKMSKeyId;
                return this;
            }

            /**
             * <p>The performance level of the ESSD used as the data disk. The parameter is returned only when the DataDisks.N.DataDiskCategory parameter is set to cloud_essd. Valid values:</p>
             * <ul>
             * <li>PL0: An ESSD can deliver up to 10,000 random read/write IOPS.</li>
             * <li>PL1: An ESSD can deliver up to 50,000 random read/write IOPS.</li>
             * <li>PL2: An ESSD can deliver up to 100,000 random read/write IOPS.</li>
             * <li>PL3: An ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder dataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
                this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The capacity of the data disk. Unit: GB.</p>
             * <p>Valid values: 40 to 500.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
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
    /**
     * 
     * {@link GetAutoScaleConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoScaleConfigResponseBody</p>
     */
    public static class DataDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDisksInfo")
        private java.util.List<DataDisksInfo> dataDisksInfo;

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
        public java.util.List<DataDisksInfo> getDataDisksInfo() {
            return this.dataDisksInfo;
        }

        public static final class Builder {
            private java.util.List<DataDisksInfo> dataDisksInfo; 

            private Builder() {
            } 

            private Builder(DataDisks model) {
                this.dataDisksInfo = model.dataDisksInfo;
            } 

            /**
             * DataDisksInfo.
             */
            public Builder dataDisksInfo(java.util.List<DataDisksInfo> dataDisksInfo) {
                this.dataDisksInfo = dataDisksInfo;
                return this;
            }

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoScaleConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoScaleConfigResponseBody</p>
     */
    public static class InstanceTypeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostNamePrefix")
        private String hostNamePrefix;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("SpotDuration")
        private Integer spotDuration;

        @com.aliyun.core.annotation.NameInMap("SpotInterruptionBehavior")
        private String spotInterruptionBehavior;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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

            private Builder() {
            } 

            private Builder(InstanceTypeInfo model) {
                this.hostNamePrefix = model.hostNamePrefix;
                this.instanceType = model.instanceType;
                this.spotDuration = model.spotDuration;
                this.spotInterruptionBehavior = model.spotInterruptionBehavior;
                this.spotPriceLimit = model.spotPriceLimit;
                this.spotStrategy = model.spotStrategy;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The prefix of the hostname. You can query compute nodes that have a specified prefix.</p>
             * 
             * <strong>example:</strong>
             * <p>compute</p>
             */
            public Builder hostNamePrefix(String hostNamePrefix) {
                this.hostNamePrefix = hostNamePrefix;
                return this;
            }

            /**
             * <p>The instance type of the compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.sn1ne.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The protection period of the preemptible instance. Unit: hours. Valid values: 0 to 1. Default value: 1. A value of 0 means no protection period is specified.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
                return this;
            }

            /**
             * <p>The interruption event of the preemptible instance. The value can only be Terminate, which specifies that the instance is released.</p>
             * 
             * <strong>example:</strong>
             * <p>Terminate</p>
             */
            public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
                this.spotInterruptionBehavior = spotInterruptionBehavior;
                return this;
            }

            /**
             * <p>The maximum hourly price of the compute nodes. The value can be accurate to three decimal places. This parameter is valid only when the SpotStrategy parameter is set to SpotWithPriceLimit.</p>
             * 
             * <strong>example:</strong>
             * <p>0.062</p>
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * <p>The bidding method of the compute nodes. Valid values:</p>
             * <ul>
             * <li>NoSpot: The compute nodes are pay-as-you-go instances.</li>
             * <li>SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.</li>
             * <li>SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1lfcjbfb099rrjn****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
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
    /**
     * 
     * {@link GetAutoScaleConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoScaleConfigResponseBody</p>
     */
    public static class InstanceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceTypeInfo")
        private java.util.List<InstanceTypeInfo> instanceTypeInfo;

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
        public java.util.List<InstanceTypeInfo> getInstanceTypeInfo() {
            return this.instanceTypeInfo;
        }

        public static final class Builder {
            private java.util.List<InstanceTypeInfo> instanceTypeInfo; 

            private Builder() {
            } 

            private Builder(InstanceTypes model) {
                this.instanceTypeInfo = model.instanceTypeInfo;
            } 

            /**
             * InstanceTypeInfo.
             */
            public Builder instanceTypeInfo(java.util.List<InstanceTypeInfo> instanceTypeInfo) {
                this.instanceTypeInfo = instanceTypeInfo;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoScaleConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoScaleConfigResponseBody</p>
     */
    public static class QueueInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoMinNodesPerCycle")
        private Boolean autoMinNodesPerCycle;

        @com.aliyun.core.annotation.NameInMap("DataDisks")
        private DataDisks dataDisks;

        @com.aliyun.core.annotation.NameInMap("EnableAutoGrow")
        private Boolean enableAutoGrow;

        @com.aliyun.core.annotation.NameInMap("EnableAutoShrink")
        private Boolean enableAutoShrink;

        @com.aliyun.core.annotation.NameInMap("HostNamePrefix")
        private String hostNamePrefix;

        @com.aliyun.core.annotation.NameInMap("HostNameSuffix")
        private String hostNameSuffix;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceTypes")
        private InstanceTypes instanceTypes;

        @com.aliyun.core.annotation.NameInMap("MaxNodesInQueue")
        private Integer maxNodesInQueue;

        @com.aliyun.core.annotation.NameInMap("MaxNodesPerCycle")
        private Long maxNodesPerCycle;

        @com.aliyun.core.annotation.NameInMap("MinNodesInQueue")
        private Integer minNodesInQueue;

        @com.aliyun.core.annotation.NameInMap("MinNodesPerCycle")
        private Long minNodesPerCycle;

        @com.aliyun.core.annotation.NameInMap("QueueImageId")
        private String queueImageId;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SortedByInventory")
        private Boolean sortedByInventory;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskLevel")
        private String systemDiskLevel;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
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

            private Builder() {
            } 

            private Builder(QueueInfo model) {
                this.autoMinNodesPerCycle = model.autoMinNodesPerCycle;
                this.dataDisks = model.dataDisks;
                this.enableAutoGrow = model.enableAutoGrow;
                this.enableAutoShrink = model.enableAutoShrink;
                this.hostNamePrefix = model.hostNamePrefix;
                this.hostNameSuffix = model.hostNameSuffix;
                this.instanceType = model.instanceType;
                this.instanceTypes = model.instanceTypes;
                this.maxNodesInQueue = model.maxNodesInQueue;
                this.maxNodesPerCycle = model.maxNodesPerCycle;
                this.minNodesInQueue = model.minNodesInQueue;
                this.minNodesPerCycle = model.minNodesPerCycle;
                this.queueImageId = model.queueImageId;
                this.queueName = model.queueName;
                this.resourceGroupId = model.resourceGroupId;
                this.sortedByInventory = model.sortedByInventory;
                this.spotPriceLimit = model.spotPriceLimit;
                this.spotStrategy = model.spotStrategy;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskLevel = model.systemDiskLevel;
                this.systemDiskSize = model.systemDiskSize;
            } 

            /**
             * <p>Indicates whether the minimum node number for each scale-out is automatically set. If this parameter is set to true, the minimum number of nodes for each scale-out is equal to the number of nodes required by the job. The maximum number is 99.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoMinNodesPerCycle(Boolean autoMinNodesPerCycle) {
                this.autoMinNodesPerCycle = autoMinNodesPerCycle;
                return this;
            }

            /**
             * <p>The list of data disks.</p>
             */
            public Builder dataDisks(DataDisks dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * <p>Indicates whether the queue enabled the auto scale-out. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAutoGrow(Boolean enableAutoGrow) {
                this.enableAutoGrow = enableAutoGrow;
                return this;
            }

            /**
             * <p>Indicates whether the queue enabled the auto scale-in. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAutoShrink(Boolean enableAutoShrink) {
                this.enableAutoShrink = enableAutoShrink;
                return this;
            }

            /**
             * <p>The prefix of the queue name. You can query queues that have a specified prefix.</p>
             * 
             * <strong>example:</strong>
             * <p>compute</p>
             */
            public Builder hostNamePrefix(String hostNamePrefix) {
                this.hostNamePrefix = hostNamePrefix;
                return this;
            }

            /**
             * <p>The suffix of the queue name. You can query queues that have a specified suffix.</p>
             * 
             * <strong>example:</strong>
             * <p>000</p>
             */
            public Builder hostNameSuffix(String hostNameSuffix) {
                this.hostNameSuffix = hostNameSuffix;
                return this;
            }

            /**
             * <p>The instance type of the compute nodes that are automatically added to the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.sn1ne.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The specification information of the compute nodes.</p>
             */
            public Builder instanceTypes(InstanceTypes instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The maximum number of compute nodes that can be added to a queue. Valid values: 0 to 500.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxNodesInQueue(Integer maxNodesInQueue) {
                this.maxNodesInQueue = maxNodesInQueue;
                return this;
            }

            /**
             * <p>The maximum number of compute nodes that can be added in each round of scale-out. Valid values: 0 to 99.</p>
             * <p>Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxNodesPerCycle(Long maxNodesPerCycle) {
                this.maxNodesPerCycle = maxNodesPerCycle;
                return this;
            }

            /**
             * <p>The minimum number of compute nodes that can be retained in a queue. Valid values: 0 to 50.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder minNodesInQueue(Integer minNodesInQueue) {
                this.minNodesInQueue = minNodesInQueue;
                return this;
            }

            /**
             * <p>The minimum number of compute nodes that can be added in each round of scale-out. Valid values: 1 to 99</p>
             * <p>Default value: 1.</p>
             * <p>If the compute nodes that you want to add in a round is less than the minimum compute nodes that can be added, the value of this parameter is automatically changed to the number of compute nodes that you want to add. This ensures that compute nodes can be added as expected.</p>
             * <blockquote>
             * <p> The configuration takes effect only for the minimum compute nodes that can be added in the current round.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder minNodesPerCycle(Long minNodesPerCycle) {
                this.minNodesPerCycle = minNodesPerCycle;
                return this;
            }

            /**
             * <p>The image ID of the compute node in the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_7_06_64_20G_alibase_2019071****</p>
             */
            public Builder queueImageId(String queueImageId) {
                this.queueImageId = queueImageId;
                return this;
            }

            /**
             * <p>The name of the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>workq</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the compute nodes belong.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxp7uc24****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the instances are unordered. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <blockquote>
             * <p> If this parameter is set to true, the system selects instance types in descending order based on the number of instances in stock during auto scaling.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sortedByInventory(Boolean sortedByInventory) {
                this.sortedByInventory = sortedByInventory;
                return this;
            }

            /**
             * <p>The maximum hourly price of the compute nodes. The value can be accurate to three decimal places. This parameter is valid only when the SpotStrategy parameter is set to SpotWithPriceLimit.</p>
             * 
             * <strong>example:</strong>
             * <p>0.062</p>
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * <p>The preemption policy of the compute nodes. Valid values:</p>
             * <ul>
             * <li>NoSpot: The compute nodes are pay-as-you-go instances.</li>
             * <li>SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.</li>
             * <li>SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>The category of the system disk. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_essd: enhanced SSD (ESSD).</li>
             * <li>cloud: basic disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The performance level of the system disk. Valid values:</p>
             * <ul>
             * <li>PL0: An ESSD can deliver up to 10,000 random read/write IOPS.</li>
             * <li>PL1: An ESSD can deliver up to 50,000 random read/write IOPS.</li>
             * <li>PL2: An ESSD can deliver up to 100,000 random read/write IOPS.</li>
             * <li>PL3: An ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder systemDiskLevel(String systemDiskLevel) {
                this.systemDiskLevel = systemDiskLevel;
                return this;
            }

            /**
             * <p>The system disk size. Unit: GB. Valid values: 40 to 500.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
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
    /**
     * 
     * {@link GetAutoScaleConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoScaleConfigResponseBody</p>
     */
    public static class Queues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QueueInfo")
        private java.util.List<QueueInfo> queueInfo;

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
        public java.util.List<QueueInfo> getQueueInfo() {
            return this.queueInfo;
        }

        public static final class Builder {
            private java.util.List<QueueInfo> queueInfo; 

            private Builder() {
            } 

            private Builder(Queues model) {
                this.queueInfo = model.queueInfo;
            } 

            /**
             * QueueInfo.
             */
            public Builder queueInfo(java.util.List<QueueInfo> queueInfo) {
                this.queueInfo = queueInfo;
                return this;
            }

            public Queues build() {
                return new Queues(this);
            } 

        } 

    }
}
