// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNodePoolAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyNodePoolAttributeRequest</p>
 */
public class ModifyNodePoolAttributeRequest extends Request {
    @Body
    @NameInMap("BizRegionId")
    private String bizRegionId;

    @Body
    @NameInMap("NodeCapacity")
    private Integer nodeCapacity;

    @Body
    @NameInMap("NodePoolStrategy")
    private NodePoolStrategy nodePoolStrategy;

    @Body
    @NameInMap("PoolId")
    private String poolId;

    @Body
    @NameInMap("ProductType")
    private String productType;

    private ModifyNodePoolAttributeRequest(Builder builder) {
        super(builder);
        this.bizRegionId = builder.bizRegionId;
        this.nodeCapacity = builder.nodeCapacity;
        this.nodePoolStrategy = builder.nodePoolStrategy;
        this.poolId = builder.poolId;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNodePoolAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return nodeCapacity
     */
    public Integer getNodeCapacity() {
        return this.nodeCapacity;
    }

    /**
     * @return nodePoolStrategy
     */
    public NodePoolStrategy getNodePoolStrategy() {
        return this.nodePoolStrategy;
    }

    /**
     * @return poolId
     */
    public String getPoolId() {
        return this.poolId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<ModifyNodePoolAttributeRequest, Builder> {
        private String bizRegionId; 
        private Integer nodeCapacity; 
        private NodePoolStrategy nodePoolStrategy; 
        private String poolId; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNodePoolAttributeRequest request) {
            super(request);
            this.bizRegionId = request.bizRegionId;
            this.nodeCapacity = request.nodeCapacity;
            this.nodePoolStrategy = request.nodePoolStrategy;
            this.poolId = request.poolId;
            this.productType = request.productType;
        } 

        /**
         * BizRegionId.
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * 按资源售卖的，单个节点允许运行的应用实例数
         */
        public Builder nodeCapacity(Integer nodeCapacity) {
            this.putBodyParameter("NodeCapacity", nodeCapacity);
            this.nodeCapacity = nodeCapacity;
            return this;
        }

        /**
         * 节点池策略
         */
        public Builder nodePoolStrategy(NodePoolStrategy nodePoolStrategy) {
            String nodePoolStrategyShrink = shrink(nodePoolStrategy, "NodePoolStrategy", "json");
            this.putBodyParameter("NodePoolStrategy", nodePoolStrategyShrink);
            this.nodePoolStrategy = nodePoolStrategy;
            return this;
        }

        /**
         * 资源组id
         */
        public Builder poolId(String poolId) {
            this.putBodyParameter("PoolId", poolId);
            this.poolId = poolId;
            return this;
        }

        /**
         * 产品类型
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public ModifyNodePoolAttributeRequest build() {
            return new ModifyNodePoolAttributeRequest(this);
        } 

    } 

    public static class NodePoolStrategy extends TeaModel {
        @NameInMap("MaxScalingAmount")
        private Integer maxScalingAmount;

        @NameInMap("ScalingDownAfterIdleMinutes")
        private Integer scalingDownAfterIdleMinutes;

        @NameInMap("ScalingStep")
        private Integer scalingStep;

        @NameInMap("ScalingUsageThreshold")
        private String scalingUsageThreshold;

        @NameInMap("StrategyType")
        private String strategyType;

        private NodePoolStrategy(Builder builder) {
            this.maxScalingAmount = builder.maxScalingAmount;
            this.scalingDownAfterIdleMinutes = builder.scalingDownAfterIdleMinutes;
            this.scalingStep = builder.scalingStep;
            this.scalingUsageThreshold = builder.scalingUsageThreshold;
            this.strategyType = builder.strategyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodePoolStrategy create() {
            return builder().build();
        }

        /**
         * @return maxScalingAmount
         */
        public Integer getMaxScalingAmount() {
            return this.maxScalingAmount;
        }

        /**
         * @return scalingDownAfterIdleMinutes
         */
        public Integer getScalingDownAfterIdleMinutes() {
            return this.scalingDownAfterIdleMinutes;
        }

        /**
         * @return scalingStep
         */
        public Integer getScalingStep() {
            return this.scalingStep;
        }

        /**
         * @return scalingUsageThreshold
         */
        public String getScalingUsageThreshold() {
            return this.scalingUsageThreshold;
        }

        /**
         * @return strategyType
         */
        public String getStrategyType() {
            return this.strategyType;
        }

        public static final class Builder {
            private Integer maxScalingAmount; 
            private Integer scalingDownAfterIdleMinutes; 
            private Integer scalingStep; 
            private String scalingUsageThreshold; 
            private String strategyType; 

            /**
             * 最大弹性数量
             */
            public Builder maxScalingAmount(Integer maxScalingAmount) {
                this.maxScalingAmount = maxScalingAmount;
                return this;
            }

            /**
             * 资源回收时间
             */
            public Builder scalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
                this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
                return this;
            }

            /**
             * 弹性扩容步长
             */
            public Builder scalingStep(Integer scalingStep) {
                this.scalingStep = scalingStep;
                return this;
            }

            /**
             * 触发弹性扩容的会话百分比
             */
            public Builder scalingUsageThreshold(String scalingUsageThreshold) {
                this.scalingUsageThreshold = scalingUsageThreshold;
                return this;
            }

            /**
             * 策略类型，默认为NODE_FIXED
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            public NodePoolStrategy build() {
                return new NodePoolStrategy(this);
            } 

        } 

    }
}
