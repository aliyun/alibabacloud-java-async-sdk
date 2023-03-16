// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAutoScaleConfigRequest} extends {@link RequestModel}
 *
 * <p>SetAutoScaleConfigRequest</p>
 */
public class SetAutoScaleConfigRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ComputeEnableHt")
    private Boolean computeEnableHt;

    @Query
    @NameInMap("EnableAutoGrow")
    private Boolean enableAutoGrow;

    @Query
    @NameInMap("EnableAutoShrink")
    private Boolean enableAutoShrink;

    @Query
    @NameInMap("ExcludeNodes")
    private String excludeNodes;

    @Query
    @NameInMap("ExtraNodesGrowRatio")
    private Integer extraNodesGrowRatio;

    @Query
    @NameInMap("GrowIntervalInMinutes")
    private Integer growIntervalInMinutes;

    @Query
    @NameInMap("GrowRatio")
    @Validation(maximum = 100)
    private Integer growRatio;

    @Query
    @NameInMap("GrowTimeoutInMinutes")
    private Integer growTimeoutInMinutes;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("MaxNodesInCluster")
    @Validation(required = true)
    private Integer maxNodesInCluster;

    @Query
    @NameInMap("Queues")
    private java.util.List < Queues> queues;

    @Query
    @NameInMap("ShrinkIdleTimes")
    private Integer shrinkIdleTimes;

    @Query
    @NameInMap("ShrinkIntervalInMinutes")
    private Integer shrinkIntervalInMinutes;

    @Query
    @NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    private SetAutoScaleConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.computeEnableHt = builder.computeEnableHt;
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
        this.shrinkIdleTimes = builder.shrinkIdleTimes;
        this.shrinkIntervalInMinutes = builder.shrinkIntervalInMinutes;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.spotStrategy = builder.spotStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAutoScaleConfigRequest create() {
        return builder().build();
    }

    @Override
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
     * @return computeEnableHt
     */
    public Boolean getComputeEnableHt() {
        return this.computeEnableHt;
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
    public java.util.List < Queues> getQueues() {
        return this.queues;
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

    public static final class Builder extends Request.Builder<SetAutoScaleConfigRequest, Builder> {
        private String clusterId; 
        private Boolean computeEnableHt; 
        private Boolean enableAutoGrow; 
        private Boolean enableAutoShrink; 
        private String excludeNodes; 
        private Integer extraNodesGrowRatio; 
        private Integer growIntervalInMinutes; 
        private Integer growRatio; 
        private Integer growTimeoutInMinutes; 
        private String imageId; 
        private Integer maxNodesInCluster; 
        private java.util.List < Queues> queues; 
        private Integer shrinkIdleTimes; 
        private Integer shrinkIntervalInMinutes; 
        private Float spotPriceLimit; 
        private String spotStrategy; 

        private Builder() {
            super();
        } 

        private Builder(SetAutoScaleConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.computeEnableHt = request.computeEnableHt;
            this.enableAutoGrow = request.enableAutoGrow;
            this.enableAutoShrink = request.enableAutoShrink;
            this.excludeNodes = request.excludeNodes;
            this.extraNodesGrowRatio = request.extraNodesGrowRatio;
            this.growIntervalInMinutes = request.growIntervalInMinutes;
            this.growRatio = request.growRatio;
            this.growTimeoutInMinutes = request.growTimeoutInMinutes;
            this.imageId = request.imageId;
            this.maxNodesInCluster = request.maxNodesInCluster;
            this.queues = request.queues;
            this.shrinkIdleTimes = request.shrinkIdleTimes;
            this.shrinkIntervalInMinutes = request.shrinkIntervalInMinutes;
            this.spotPriceLimit = request.spotPriceLimit;
            this.spotStrategy = request.spotStrategy;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ComputeEnableHt.
         */
        public Builder computeEnableHt(Boolean computeEnableHt) {
            this.putQueryParameter("ComputeEnableHt", computeEnableHt);
            this.computeEnableHt = computeEnableHt;
            return this;
        }

        /**
         * Specifies whether to enable auto scale-out. Valid values:
         * <p>
         * 
         * *   true: enables auto scale-out.
         * *   false: disables auto scale-out
         * 
         * Default value: false
         */
        public Builder enableAutoGrow(Boolean enableAutoGrow) {
            this.putQueryParameter("EnableAutoGrow", enableAutoGrow);
            this.enableAutoGrow = enableAutoGrow;
            return this;
        }

        /**
         * Specifies whether to enable auto scale-in. Valid values:
         * <p>
         * 
         * *   true: enables auto scale-in.
         * *   false: disables auto scale-in
         * 
         * Default value: false
         */
        public Builder enableAutoShrink(Boolean enableAutoShrink) {
            this.putQueryParameter("EnableAutoShrink", enableAutoShrink);
            this.enableAutoShrink = enableAutoShrink;
            return this;
        }

        /**
         * The compute nodes that are excluded from the list of auto scaling nodes. Separate multiple compute nodes with commas (,).
         * <p>
         * 
         * If you want to retain a compute node, you can set the node as an exceptional node. Then, the node is not released if it is idle.
         */
        public Builder excludeNodes(String excludeNodes) {
            this.putQueryParameter("ExcludeNodes", excludeNodes);
            this.excludeNodes = excludeNodes;
            return this;
        }

        /**
         * The percentage of extra compute nodes. Valid values: 0 to 100
         * <p>
         * 
         * Default value: 0
         * 
         * If you need to add 100 compute nodes and the value of the ExtraNodesGrowRatio parameter is 2, 102 compute nodes are added.
         */
        public Builder extraNodesGrowRatio(Integer extraNodesGrowRatio) {
            this.putQueryParameter("ExtraNodesGrowRatio", extraNodesGrowRatio);
            this.extraNodesGrowRatio = extraNodesGrowRatio;
            return this;
        }

        /**
         * The interval between two consecutive rounds of scale-out. Unit: minutes.
         * <p>
         * 
         * Valid values: 2 to 10
         * 
         * Default value: 2
         * 
         * >  An interval may exist during multiple rounds of a scale-out task or between two consecutive scale-out tasks.
         */
        public Builder growIntervalInMinutes(Integer growIntervalInMinutes) {
            this.putQueryParameter("GrowIntervalInMinutes", growIntervalInMinutes);
            this.growIntervalInMinutes = growIntervalInMinutes;
            return this;
        }

        /**
         * The percentage of each round of scale-out. Valid values: 1 to 100.
         * <p>
         * 
         * Default value: 100
         * 
         * If you set GrowRatio to 50, the scale-out has two rounds. Each round completes half of the scale-out.
         */
        public Builder growRatio(Integer growRatio) {
            this.putQueryParameter("GrowRatio", growRatio);
            this.growRatio = growRatio;
            return this;
        }

        /**
         * The scale-out timeout period. Unit: minutes.
         * <p>
         * 
         * Valid values: 10 to 60
         * 
         * Default value: 20
         * 
         * If the scale-out timeout period has been reached but the scale-out nodes still do not reach the Running state, the system resets them.
         */
        public Builder growTimeoutInMinutes(Integer growTimeoutInMinutes) {
            this.putQueryParameter("GrowTimeoutInMinutes", growTimeoutInMinutes);
            this.growTimeoutInMinutes = growTimeoutInMinutes;
            return this;
        }

        /**
         * The ID of the image.
         * <p>
         * 
         * > 
         * *   If you set both `Queues.N.QueueImageId` and `ImageId`, `Queues.N.QueueImageId` prevails.
         * *   If you set `Queues.N.QueueImageId` or `ImageId`, the parameter that you set takes effect.
         * *   If you leave both `Queues.N.QueueImageId` and `ImageId` empty, the image that was specified when you created the cluster or the last time when you scaled out the cluster is used by default.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The maximum number of compute nodes that can be added in the cluster. Valid values: 0 to 500.
         * <p>
         * 
         * Default value: 100
         */
        public Builder maxNodesInCluster(Integer maxNodesInCluster) {
            this.putQueryParameter("MaxNodesInCluster", maxNodesInCluster);
            this.maxNodesInCluster = maxNodesInCluster;
            return this;
        }

        /**
         * Queues.
         */
        public Builder queues(java.util.List < Queues> queues) {
            this.putQueryParameter("Queues", queues);
            this.queues = queues;
            return this;
        }

        /**
         * The number of consecutive times that a compute node is idle during the resource scale-in check.
         * <p>
         * 
         * Valid values: 2 to 5
         * 
         * Default value: 3
         * 
         * If the parameter is set to 3, a compute node is idle for more than three consecutive times. In this case, the node is released. If a compute node is idle for more than 6 minutes in a row, it is released by default. This is because the default value of the ShrinkIntervalInMinutes parameter is 2.
         */
        public Builder shrinkIdleTimes(Integer shrinkIdleTimes) {
            this.putQueryParameter("ShrinkIdleTimes", shrinkIdleTimes);
            this.shrinkIdleTimes = shrinkIdleTimes;
            return this;
        }

        /**
         * The interval between two consecutive rounds of scale-in. Unit: minutes.
         * <p>
         * 
         * Valid values: 2 to 10
         * 
         * Default value: 2
         */
        public Builder shrinkIntervalInMinutes(Integer shrinkIntervalInMinutes) {
            this.putQueryParameter("ShrinkIntervalInMinutes", shrinkIntervalInMinutes);
            this.shrinkIntervalInMinutes = shrinkIntervalInMinutes;
            return this;
        }

        /**
         * The maximum hourly price of the compute nodes. The value can be accurate to three decimal places. The parameter takes effect only when `SpotStrategy` is set to `SpotWithPriceLimit`.
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.putQueryParameter("SpotPriceLimit", spotPriceLimit);
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
         * 
         * Default value: NoSpot
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        @Override
        public SetAutoScaleConfigRequest build() {
            return new SetAutoScaleConfigRequest(this);
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
             * Default value: cloud_efficiency
             * 
             * Valid values of N: 0 to 16
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
             * Default value: true
             * 
             * Valid values of N: 0 to 16
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
             * Default value: false
             * 
             * Valid values of N: 0 to 16
             */
            public Builder dataDiskEncrypted(Boolean dataDiskEncrypted) {
                this.dataDiskEncrypted = dataDiskEncrypted;
                return this;
            }

            /**
             * The KMS key ID of the data disk.
             * <p>
             * 
             * Valid values of N: 0 to 16
             */
            public Builder dataDiskKMSKeyId(String dataDiskKMSKeyId) {
                this.dataDiskKMSKeyId = dataDiskKMSKeyId;
                return this;
            }

            /**
             * The performance level of the ESSD used as the data disk. The parameter takes effect only when the Queues.N.DataDisks.N.DataDiskCategory parameter is set to cloud_essd. Valid values:
             * <p>
             * 
             * *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
             * *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
             * *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
             * *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
             * 
             * Default value: PL1
             * 
             * Valid values of N: 0 to 16
             */
            public Builder dataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
                this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
                return this;
            }

            /**
             * The size of the data disk. Unit: GB.
             * <p>
             * 
             * Valid values: 40 to 500
             * 
             * Default value: 40
             * 
             * Valid values of N: 0 to 16
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
    public static class InstanceTypes extends TeaModel {
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

        private InstanceTypes(Builder builder) {
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

        public static InstanceTypes create() {
            return builder().build();
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
            private String instanceType; 
            private Integer spotDuration; 
            private String spotInterruptionBehavior; 
            private Float spotPriceLimit; 
            private String spotStrategy; 
            private String vSwitchId; 
            private String zoneId; 

            /**
             * The instance type of the compute nodes that are automatically added in the queue.
             * <p>
             * 
             * N queue names can be set at the same time. Valid values of N: 1 to 8.
             * 
             * The instance types of N compute nodes in the queue can be set at the same time when auto scaling is performed in the queue. Valid values of N: 0 to 500.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * 抢占式实例的保留时长，单位为小时。取值范围：0~6。
             * <p>
             * - 保留时长2~6正在邀测中，如需开通请提交工单。
             * - 取值为0，则为无保护期模式。
             * 默认值：1。
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
                return this;
            }

            /**
             * 抢占实例中断模式。目前仅支持Terminate（默认）直接释放实例。
             */
            public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
                this.spotInterruptionBehavior = spotInterruptionBehavior;
                return this;
            }

            /**
             * The maximum hourly price of the compute nodes that are automatically added in the queue. The value can be accurate to three decimal places. The parameter takes effect only when `Queues.N.InstanceTypes.N.SpotStrategy` is set to `Queues.N.InstanceTypes.N.SpotStrategy`.
             * <p>
             * 
             * The maximum hourly prices of the compute nodes that are automatically added in N queues can be set the same time. Valid values of N: 1 to 8.
             * 
             * The maximum hourly prices of N compute nodes in the queue can be set at the same time when auto scaling is performed in the queue. Valid values of N: 0 to 500.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The bidding method of the compute nodes that are automatically added in the queue. Valid values:
             * <p>
             * 
             * *   NoSpot: The compute nodes are pay-as-you-go instances.
             * *   SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.
             * *   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.
             * 
             * Default value: NoSpot
             * 
             * N queue names can be set at the same time. Valid values of N: 1 to 8.
             * 
             * The bidding methods of N compute nodes in the queue can be set at the same time when auto scaling is performed in the queue. Valid values of N: 0 to 500.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The vSwitch ID of the compute nodes that are automatically added in the queue.
             * <p>
             * 
             * N queue names can be set at the same time. Valid values of N: 1 to 8.
             * 
             * The vSwitch IDs of N compute nodes in the queue can be set at the same time when auto scaling is performed in the queue. Valid values of N: 0 to 500.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The zone ID of the compute nodes that are automatically added in the queue belongs.
             * <p>
             * 
             * N queue names can be set at the same time. Valid values of N: 1 to 8.
             * 
             * The zone IDs of N compute nodes in the queue can be set at the same time when auto scaling is performed in the queue. Valid values of N: 0 to 500.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
    public static class Queues extends TeaModel {
        @NameInMap("DataDisks")
        private java.util.List < DataDisks> dataDisks;

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
        private java.util.List < InstanceTypes> instanceTypes;

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

        private Queues(Builder builder) {
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
            this.spotPriceLimit = builder.spotPriceLimit;
            this.spotStrategy = builder.spotStrategy;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskLevel = builder.systemDiskLevel;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Queues create() {
            return builder().build();
        }

        /**
         * @return dataDisks
         */
        public java.util.List < DataDisks> getDataDisks() {
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
        public java.util.List < InstanceTypes> getInstanceTypes() {
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
            private java.util.List < DataDisks> dataDisks; 
            private Boolean enableAutoGrow; 
            private Boolean enableAutoShrink; 
            private String hostNamePrefix; 
            private String hostNameSuffix; 
            private String instanceType; 
            private java.util.List < InstanceTypes> instanceTypes; 
            private Integer maxNodesInQueue; 
            private Long maxNodesPerCycle; 
            private Integer minNodesInQueue; 
            private Long minNodesPerCycle; 
            private String queueImageId; 
            private String queueName; 
            private Float spotPriceLimit; 
            private String spotStrategy; 
            private String systemDiskCategory; 
            private String systemDiskLevel; 
            private Integer systemDiskSize; 

            /**
             * DataDisks.
             */
            public Builder dataDisks(java.util.List < DataDisks> dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * Specifies whether the queue enables auto scale-out. Valid values:
             * <p>
             * 
             * *   true: enables auto scale-out.
             * *   false: disables auto scale-out
             * 
             * Valid values of N: 1 to 8
             * 
             * Default value: false
             */
            public Builder enableAutoGrow(Boolean enableAutoGrow) {
                this.enableAutoGrow = enableAutoGrow;
                return this;
            }

            /**
             * Specifies whether the queue enables auto scale-in. Valid values:
             * <p>
             * 
             * *   true: enables auto scale-in.
             * *   false: disables auto scale-in
             * 
             * Valid values of N: 1 to 8
             * 
             * Default value: false
             */
            public Builder enableAutoShrink(Boolean enableAutoShrink) {
                this.enableAutoShrink = enableAutoShrink;
                return this;
            }

            /**
             * The hostname prefix of the host that is used to perform scale-out for the queue. You can manage compute nodes that have a specified hostname prefix.
             * <p>
             * 
             * Valid values of N: 1 to 8
             */
            public Builder hostNamePrefix(String hostNamePrefix) {
                this.hostNamePrefix = hostNamePrefix;
                return this;
            }

            /**
             * The hostname suffix of the host that is used to perform scale-out for the queue. You can manage nodes that have a specified hostname suffix.
             * <p>
             * 
             * Valid values of N: 1 to 8
             */
            public Builder hostNameSuffix(String hostNameSuffix) {
                this.hostNameSuffix = hostNameSuffix;
                return this;
            }

            /**
             * The instance type of the compute nodes that are automatically added in the queue. Valid values of N: 1 to 8
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InstanceTypes.
             */
            public Builder instanceTypes(java.util.List < InstanceTypes> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * The maximum number of the compute nodes that can be added in the queue. Valid values: 0 to 500.
             * <p>
             * 
             * Valid values of N: 1 to 8
             * 
             * Default value: 100
             */
            public Builder maxNodesInQueue(Integer maxNodesInQueue) {
                this.maxNodesInQueue = maxNodesInQueue;
                return this;
            }

            /**
             * The maximum number of compute nodes that can be added in each round of scale-out. Valid values: 0 to 99.
             * <p>
             * 
             * Default value: 0
             */
            public Builder maxNodesPerCycle(Long maxNodesPerCycle) {
                this.maxNodesPerCycle = maxNodesPerCycle;
                return this;
            }

            /**
             * The minimum number of the compute nodes that can be removed in the queue. Valid values: 0 to 50.
             * <p>
             * 
             * Valid values of N: 1 to 8
             * 
             * Default value: 0
             */
            public Builder minNodesInQueue(Integer minNodesInQueue) {
                this.minNodesInQueue = minNodesInQueue;
                return this;
            }

            /**
             * The minimum number of compute nodes that can be added in each round of scale-out. Valid values: 1 to 99.
             * <p>
             * 
             * Default value: 1
             * 
             * If the compute nodes that you want to add in a round is less than the minimum compute nodes that can be added, the value of this parameter is automatically changed to the number of compute nodes that you want to add. This ensures that compute nodes can be added as expected.
             * 
             * >  The configuration takes effect only for the minimum compute nodes that can be added in the current round.
             */
            public Builder minNodesPerCycle(Long minNodesPerCycle) {
                this.minNodesPerCycle = minNodesPerCycle;
                return this;
            }

            /**
             * The image ID of the queue where scale-out is performed. Valid values of N: 1 to 8.
             * <p>
             * 
             * > 
             * *   If you set both `Queues.N.QueueImageId` and `ImageId`, `Queues.N.QueueImageId` prevails.
             * *   If you set `Queues.N.QueueImageId` or `ImageId`, the parameter that you set takes effect.
             * *   If you leave both `Queues.N.QueueImageId` and `ImageId` empty, the image that was specified when you created the cluster or the last time when you scaled out the cluster is used by default.
             */
            public Builder queueImageId(String queueImageId) {
                this.queueImageId = queueImageId;
                return this;
            }

            /**
             * The name of the queue. N queue names can be set at the same time. Valid values of N: 1 to 8.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * The maximum hourly price of the compute nodes that are automatically added in the queue. The value can be accurate to three decimal places. The parameter takes effect only when `Queues.N.SpotStrategy` is set to `SpotWithPriceLimit`.
             * <p>
             * 
             * Valid values of N: 1 to 8
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The bidding method of the compute nodes that are automatically added in the queue. Valid values of N: 1 to 8
             * <p>
             * 
             * Valid values:
             * 
             * *   NoSpot: The compute nodes are pay-as-you-go instances.
             * *   SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.
             * *   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.
             * 
             * Default value: NoSpot
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The type of the system disk specified for the compute nodes that are added in the queue. Valid values:
             * <p>
             * 
             * *   cloud_efficiency: ultra disk.
             * *   cloud_ssd: SSD.
             * *   cloud_essd: ESSD.
             * *   cloud: basic disk. Disks of this type are retired.
             * 
             * Valid values of N: 1 to 8
             * 
             * Default value: cloud_efficiency
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * The performance level of the system disk specified for the compute nodes that are added in the queue. Valid values:
             * <p>
             * 
             * *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
             * *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
             * *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
             * *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
             * 
             * Valid values of N: 1 to 8
             * 
             * Default value: PL1
             */
            public Builder systemDiskLevel(String systemDiskLevel) {
                this.systemDiskLevel = systemDiskLevel;
                return this;
            }

            /**
             * The size of the system disk specified for the compute nodes that are added in the queue. Unit: GB.
             * <p>
             * 
             * Valid values: 40 to 500
             * 
             * Valid values of N: 1 to 8
             * 
             * Default value: 40
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public Queues build() {
                return new Queues(this);
            } 

        } 

    }
}
