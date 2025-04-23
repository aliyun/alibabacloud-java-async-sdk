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
 * {@link DescribeAutoScaleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoScaleConfigResponseBody</p>
 */
public class DescribeAutoScaleConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

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

    @com.aliyun.core.annotation.NameInMap("MaxNodesInCluster")
    private Integer maxNodesInCluster;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShrinkIdleTimes")
    private Integer shrinkIdleTimes;

    @com.aliyun.core.annotation.NameInMap("ShrinkIntervalInMinutes")
    private Integer shrinkIntervalInMinutes;

    @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
    private String spotPriceLimit;

    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.NameInMap("Uid")
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

        private Builder() {
        } 

        private Builder(DescribeAutoScaleConfigResponseBody model) {
            this.clusterId = model.clusterId;
            this.clusterType = model.clusterType;
            this.enableAutoGrow = model.enableAutoGrow;
            this.enableAutoShrink = model.enableAutoShrink;
            this.excludeNodes = model.excludeNodes;
            this.extraNodesGrowRatio = model.extraNodesGrowRatio;
            this.growIntervalInMinutes = model.growIntervalInMinutes;
            this.growRatio = model.growRatio;
            this.growTimeoutInMinutes = model.growTimeoutInMinutes;
            this.maxNodesInCluster = model.maxNodesInCluster;
            this.requestId = model.requestId;
            this.shrinkIdleTimes = model.shrinkIdleTimes;
            this.shrinkIntervalInMinutes = model.shrinkIntervalInMinutes;
            this.spotPriceLimit = model.spotPriceLimit;
            this.spotStrategy = model.spotStrategy;
            this.uid = model.uid;
        } 

        /**
         * <p>The ID of the associated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The type of the scheduler. Valid values:</p>
         * <ul>
         * <li>pbs</li>
         * <li>slurm</li>
         * <li>opengridscheduler</li>
         * <li>deadline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>slurm</p>
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAutoGrow(Boolean enableAutoGrow) {
            this.enableAutoGrow = enableAutoGrow;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto scale-in.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAutoShrink(Boolean enableAutoShrink) {
            this.enableAutoShrink = enableAutoShrink;
            return this;
        }

        /**
         * <p>The list of nodes on which auto scaling is not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp19lgqwxb4206t5****,i-bp1g4hvzs9pywrhb****</p>
         */
        public Builder excludeNodes(String excludeNodes) {
            this.excludeNodes = excludeNodes;
            return this;
        }

        /**
         * <p>The percentage of extra compute nodes. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder extraNodesGrowRatio(Integer extraNodesGrowRatio) {
            this.extraNodesGrowRatio = extraNodesGrowRatio;
            return this;
        }

        /**
         * <p>The interval between two consecutive rounds of scale-in. Valid values: 2 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder growIntervalInMinutes(Integer growIntervalInMinutes) {
            this.growIntervalInMinutes = growIntervalInMinutes;
            return this;
        }

        /**
         * <p>The percentage of each round of scale-out. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder growRatio(Integer growRatio) {
            this.growRatio = growRatio;
            return this;
        }

        /**
         * <p>The timeout period before the scale-out nodes were started. Valid values: 10 to 60.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder growTimeoutInMinutes(Integer growTimeoutInMinutes) {
            this.growTimeoutInMinutes = growTimeoutInMinutes;
            return this;
        }

        /**
         * <p>The maximum number of compute nodes in the cluster. This parameter indicates the largest number of nodes that can be added to the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxNodesInCluster(Integer maxNodesInCluster) {
            this.maxNodesInCluster = maxNodesInCluster;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of consecutive idle times of a node during the resource shrink check. Valid values: 2 to 5.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder shrinkIdleTimes(Integer shrinkIdleTimes) {
            this.shrinkIdleTimes = shrinkIdleTimes;
            return this;
        }

        /**
         * <p>The interval between two consecutive rounds of scale-out. Valid values: 2 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder shrinkIntervalInMinutes(Integer shrinkIntervalInMinutes) {
            this.shrinkIntervalInMinutes = shrinkIntervalInMinutes;
            return this;
        }

        /**
         * <p>The maximum hourly price of the new ECS instance. The value is accurate to three decimal places. It takes effect only when SpotStrategy is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.062</p>
         */
        public Builder spotPriceLimit(String spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * <p>The bidding method of the compute nodes. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instances of the compute node are pay-as-you-go instances.</li>
         * <li>SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</li>
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
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testu****</p>
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
