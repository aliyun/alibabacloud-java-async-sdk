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

        private Builder(SetAutoScaleConfigRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.enableAutoGrow = response.enableAutoGrow;
            this.enableAutoShrink = response.enableAutoShrink;
            this.excludeNodes = response.excludeNodes;
            this.extraNodesGrowRatio = response.extraNodesGrowRatio;
            this.growIntervalInMinutes = response.growIntervalInMinutes;
            this.growRatio = response.growRatio;
            this.growTimeoutInMinutes = response.growTimeoutInMinutes;
            this.imageId = response.imageId;
            this.maxNodesInCluster = response.maxNodesInCluster;
            this.queues = response.queues;
            this.shrinkIdleTimes = response.shrinkIdleTimes;
            this.shrinkIntervalInMinutes = response.shrinkIntervalInMinutes;
            this.spotPriceLimit = response.spotPriceLimit;
            this.spotStrategy = response.spotStrategy;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * EnableAutoGrow.
         */
        public Builder enableAutoGrow(Boolean enableAutoGrow) {
            this.putQueryParameter("EnableAutoGrow", enableAutoGrow);
            this.enableAutoGrow = enableAutoGrow;
            return this;
        }

        /**
         * EnableAutoShrink.
         */
        public Builder enableAutoShrink(Boolean enableAutoShrink) {
            this.putQueryParameter("EnableAutoShrink", enableAutoShrink);
            this.enableAutoShrink = enableAutoShrink;
            return this;
        }

        /**
         * ExcludeNodes.
         */
        public Builder excludeNodes(String excludeNodes) {
            this.putQueryParameter("ExcludeNodes", excludeNodes);
            this.excludeNodes = excludeNodes;
            return this;
        }

        /**
         * ExtraNodesGrowRatio.
         */
        public Builder extraNodesGrowRatio(Integer extraNodesGrowRatio) {
            this.putQueryParameter("ExtraNodesGrowRatio", extraNodesGrowRatio);
            this.extraNodesGrowRatio = extraNodesGrowRatio;
            return this;
        }

        /**
         * GrowIntervalInMinutes.
         */
        public Builder growIntervalInMinutes(Integer growIntervalInMinutes) {
            this.putQueryParameter("GrowIntervalInMinutes", growIntervalInMinutes);
            this.growIntervalInMinutes = growIntervalInMinutes;
            return this;
        }

        /**
         * GrowRatio.
         */
        public Builder growRatio(Integer growRatio) {
            this.putQueryParameter("GrowRatio", growRatio);
            this.growRatio = growRatio;
            return this;
        }

        /**
         * GrowTimeoutInMinutes.
         */
        public Builder growTimeoutInMinutes(Integer growTimeoutInMinutes) {
            this.putQueryParameter("GrowTimeoutInMinutes", growTimeoutInMinutes);
            this.growTimeoutInMinutes = growTimeoutInMinutes;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * MaxNodesInCluster.
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
         * ShrinkIdleTimes.
         */
        public Builder shrinkIdleTimes(Integer shrinkIdleTimes) {
            this.putQueryParameter("ShrinkIdleTimes", shrinkIdleTimes);
            this.shrinkIdleTimes = shrinkIdleTimes;
            return this;
        }

        /**
         * ShrinkIntervalInMinutes.
         */
        public Builder shrinkIntervalInMinutes(Integer shrinkIntervalInMinutes) {
            this.putQueryParameter("ShrinkIntervalInMinutes", shrinkIntervalInMinutes);
            this.shrinkIntervalInMinutes = shrinkIntervalInMinutes;
            return this;
        }

        /**
         * SpotPriceLimit.
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.putQueryParameter("SpotPriceLimit", spotPriceLimit);
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * SpotStrategy.
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

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
    public static class InstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

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
            private Float spotPriceLimit; 
            private String spotStrategy; 
            private String vSwitchId; 
            private String zoneId; 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
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

        @NameInMap("MinNodesInQueue")
        private Integer minNodesInQueue;

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
            this.minNodesInQueue = builder.minNodesInQueue;
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
         * @return minNodesInQueue
         */
        public Integer getMinNodesInQueue() {
            return this.minNodesInQueue;
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
            private Integer minNodesInQueue; 
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
            public Builder instanceTypes(java.util.List < InstanceTypes> instanceTypes) {
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
             * MinNodesInQueue.
             */
            public Builder minNodesInQueue(Integer minNodesInQueue) {
                this.minNodesInQueue = minNodesInQueue;
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

            public Queues build() {
                return new Queues(this);
            } 

        } 

    }
}
