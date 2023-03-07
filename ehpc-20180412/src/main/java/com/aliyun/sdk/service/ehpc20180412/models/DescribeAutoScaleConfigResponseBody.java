// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoScaleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoScaleConfigResponseBody</p>
 */
public class DescribeAutoScaleConfigResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("ClusterType")
    private String clusterType;

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

    @NameInMap("MaxNodesInCluster")
    private Integer maxNodesInCluster;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShrinkIdleTimes")
    private Integer shrinkIdleTimes;

    @NameInMap("ShrinkIntervalInMinutes")
    private Integer shrinkIntervalInMinutes;

    @NameInMap("SpotPriceLimit")
    private String spotPriceLimit;

    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @NameInMap("Uid")
    private String uid;

    private DescribeAutoScaleConfigResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.clusterType = builder.clusterType;
        this.enableAutoGrow = builder.enableAutoGrow;
        this.enableAutoShrink = builder.enableAutoShrink;
        this.excludeNodes = builder.excludeNodes;
        this.extraNodesGrowRatio = builder.extraNodesGrowRatio;
        this.growIntervalInMinutes = builder.growIntervalInMinutes;
        this.growRatio = builder.growRatio;
        this.growTimeoutInMinutes = builder.growTimeoutInMinutes;
        this.maxNodesInCluster = builder.maxNodesInCluster;
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

    public static DescribeAutoScaleConfigResponseBody create() {
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
     * @return maxNodesInCluster
     */
    public Integer getMaxNodesInCluster() {
        return this.maxNodesInCluster;
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
    public String getSpotPriceLimit() {
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
        private Boolean enableAutoGrow; 
        private Boolean enableAutoShrink; 
        private String excludeNodes; 
        private Integer extraNodesGrowRatio; 
        private Integer growIntervalInMinutes; 
        private Integer growRatio; 
        private Integer growTimeoutInMinutes; 
        private Integer maxNodesInCluster; 
        private String requestId; 
        private Integer shrinkIdleTimes; 
        private Integer shrinkIntervalInMinutes; 
        private String spotPriceLimit; 
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
         * *   pbs
         * *   slurm
         * *   opengridscheduler
         * *   deadline
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * Indicates whether auto scale-out is enabled.
         */
        public Builder enableAutoGrow(Boolean enableAutoGrow) {
            this.enableAutoGrow = enableAutoGrow;
            return this;
        }

        /**
         * Indicates whether auto scale-in is enabled.
         */
        public Builder enableAutoShrink(Boolean enableAutoShrink) {
            this.enableAutoShrink = enableAutoShrink;
            return this;
        }

        /**
         * The list of nodes on which auto scaling is not enabled.
         */
        public Builder excludeNodes(String excludeNodes) {
            this.excludeNodes = excludeNodes;
            return this;
        }

        /**
         * The ratio of added nodes to the original ones. Valid values: 0 to 100.
         */
        public Builder extraNodesGrowRatio(Integer extraNodesGrowRatio) {
            this.extraNodesGrowRatio = extraNodesGrowRatio;
            return this;
        }

        /**
         * The scale-out interval. The interval at which the compute nodes were scaled out. Valid values: 2 to 10.
         */
        public Builder growIntervalInMinutes(Integer growIntervalInMinutes) {
            this.growIntervalInMinutes = growIntervalInMinutes;
            return this;
        }

        /**
         * The percentage of the added nodes. Valid values: 1 to 100.
         */
        public Builder growRatio(Integer growRatio) {
            this.growRatio = growRatio;
            return this;
        }

        /**
         * The timeout period before the node was started. Valid values: 10 to 60.
         */
        public Builder growTimeoutInMinutes(Integer growTimeoutInMinutes) {
            this.growTimeoutInMinutes = growTimeoutInMinutes;
            return this;
        }

        /**
         * The maximum number of compute nodes in the cluster. This parameter indicates the largest number of nodes that can be added to the cluster.
         */
        public Builder maxNodesInCluster(Integer maxNodesInCluster) {
            this.maxNodesInCluster = maxNodesInCluster;
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
         * The number of consecutive idle times of a node during a scale-in check. Valid values: 2 to 5.
         */
        public Builder shrinkIdleTimes(Integer shrinkIdleTimes) {
            this.shrinkIdleTimes = shrinkIdleTimes;
            return this;
        }

        /**
         * The scale-in interval. The interval at which the compute nodes were scaled in. Valid values: 2 to 10.
         */
        public Builder shrinkIntervalInMinutes(Integer shrinkIntervalInMinutes) {
            this.shrinkIntervalInMinutes = shrinkIntervalInMinutes;
            return this;
        }

        /**
         * The maximum hourly rate of the instance. The value is accurate to three decimal places. It takes effect only when SpotStrategy is set to SpotWithPriceLimit.
         */
        public Builder spotPriceLimit(String spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * The bidding policy for the compute nodes. Valid values:
         * <p>
         * 
         * *   NoSpot: The instance is created as a regular pay-as-you-go instance.
         * *   SpotWithPriceLimit: The instance is a preemptible one with a user-defined maximum hourly rate.
         * *   SpotAsPriceGo: The instance is created as a pay-as-you-go instance that is automatically priced based on the Alibaba Cloud Marketplace.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The ID of the user.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public DescribeAutoScaleConfigResponseBody build() {
            return new DescribeAutoScaleConfigResponseBody(this);
        } 

    } 

}
