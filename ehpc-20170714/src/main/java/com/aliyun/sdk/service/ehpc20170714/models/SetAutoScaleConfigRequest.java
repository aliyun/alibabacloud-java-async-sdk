// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

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
    @NameInMap("MaxNodesInCluster")
    @Validation(required = true)
    private Integer maxNodesInCluster;

    @Query
    @NameInMap("ShrinkIdleTimes")
    private Integer shrinkIdleTimes;

    @Query
    @NameInMap("ShrinkIntervalInMinutes")
    private Integer shrinkIntervalInMinutes;

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
        this.maxNodesInCluster = builder.maxNodesInCluster;
        this.shrinkIdleTimes = builder.shrinkIdleTimes;
        this.shrinkIntervalInMinutes = builder.shrinkIntervalInMinutes;
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
     * @return maxNodesInCluster
     */
    public Integer getMaxNodesInCluster() {
        return this.maxNodesInCluster;
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

    public static final class Builder extends Request.Builder<SetAutoScaleConfigRequest, Builder> {
        private String clusterId; 
        private Boolean enableAutoGrow; 
        private Boolean enableAutoShrink; 
        private String excludeNodes; 
        private Integer extraNodesGrowRatio; 
        private Integer growIntervalInMinutes; 
        private Integer growRatio; 
        private Integer growTimeoutInMinutes; 
        private Integer maxNodesInCluster; 
        private Integer shrinkIdleTimes; 
        private Integer shrinkIntervalInMinutes; 

        private Builder() {
            super();
        } 

        private Builder(SetAutoScaleConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.enableAutoGrow = request.enableAutoGrow;
            this.enableAutoShrink = request.enableAutoShrink;
            this.excludeNodes = request.excludeNodes;
            this.extraNodesGrowRatio = request.extraNodesGrowRatio;
            this.growIntervalInMinutes = request.growIntervalInMinutes;
            this.growRatio = request.growRatio;
            this.growTimeoutInMinutes = request.growTimeoutInMinutes;
            this.maxNodesInCluster = request.maxNodesInCluster;
            this.shrinkIdleTimes = request.shrinkIdleTimes;
            this.shrinkIntervalInMinutes = request.shrinkIntervalInMinutes;
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
         * MaxNodesInCluster.
         */
        public Builder maxNodesInCluster(Integer maxNodesInCluster) {
            this.putQueryParameter("MaxNodesInCluster", maxNodesInCluster);
            this.maxNodesInCluster = maxNodesInCluster;
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

        @Override
        public SetAutoScaleConfigRequest build() {
            return new SetAutoScaleConfigRequest(this);
        } 

    } 

}
