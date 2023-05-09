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
         * 产品类型。
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

    public static class TimerPeriods extends TeaModel {
        @NameInMap("Amount")
        private Integer amount;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("StartTime")
        private String startTime;

        private TimerPeriods(Builder builder) {
            this.amount = builder.amount;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimerPeriods create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Integer amount; 
            private String endTime; 
            private String startTime; 

            /**
             * 资源数量。
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * 结束时间。格式为HH:mm。
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 开始时间。格式为HH:mm。
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public TimerPeriods build() {
                return new TimerPeriods(this);
            } 

        } 

    }
    public static class RecurrenceSchedules extends TeaModel {
        @NameInMap("RecurrenceType")
        private String recurrenceType;

        @NameInMap("RecurrenceValues")
        private java.util.List < Integer > recurrenceValues;

        @NameInMap("TimerPeriods")
        private java.util.List < TimerPeriods> timerPeriods;

        private RecurrenceSchedules(Builder builder) {
            this.recurrenceType = builder.recurrenceType;
            this.recurrenceValues = builder.recurrenceValues;
            this.timerPeriods = builder.timerPeriods;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecurrenceSchedules create() {
            return builder().build();
        }

        /**
         * @return recurrenceType
         */
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        /**
         * @return recurrenceValues
         */
        public java.util.List < Integer > getRecurrenceValues() {
            return this.recurrenceValues;
        }

        /**
         * @return timerPeriods
         */
        public java.util.List < TimerPeriods> getTimerPeriods() {
            return this.timerPeriods;
        }

        public static final class Builder {
            private String recurrenceType; 
            private java.util.List < Integer > recurrenceValues; 
            private java.util.List < TimerPeriods> timerPeriods; 

            /**
             * 策略执行周期的类型。必须同时指定`RecurrenceType`和`RecurrenceValues`。
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * 策略执行周期的数值列表。
             */
            public Builder recurrenceValues(java.util.List < Integer > recurrenceValues) {
                this.recurrenceValues = recurrenceValues;
                return this;
            }

            /**
             * 策略执行周期的时间段列表。时间段设置要求：
             * <p>
             * 
             * - 最多可添加3个时间段。
             * - 时间段之间不重叠。
             * - 时间段之间的间隔大于或等于5分钟。
             * - 单个时间段的时长大于或等于15分钟。
             * - 所有时间段累计不跨天。
             */
            public Builder timerPeriods(java.util.List < TimerPeriods> timerPeriods) {
                this.timerPeriods = timerPeriods;
                return this;
            }

            public RecurrenceSchedules build() {
                return new RecurrenceSchedules(this);
            } 

        } 

    }
    public static class NodePoolStrategy extends TeaModel {
        @NameInMap("MaxScalingAmount")
        private Integer maxScalingAmount;

        @NameInMap("NodeAmount")
        private Integer nodeAmount;

        @NameInMap("RecurrenceSchedules")
        private java.util.List < RecurrenceSchedules> recurrenceSchedules;

        @NameInMap("ScalingDownAfterIdleMinutes")
        private Integer scalingDownAfterIdleMinutes;

        @NameInMap("ScalingStep")
        private Integer scalingStep;

        @NameInMap("ScalingUsageThreshold")
        private String scalingUsageThreshold;

        @NameInMap("StrategyDisableDate")
        private String strategyDisableDate;

        @NameInMap("StrategyEnableDate")
        private String strategyEnableDate;

        @NameInMap("StrategyType")
        private String strategyType;

        @NameInMap("WarmUp")
        private Boolean warmUp;

        private NodePoolStrategy(Builder builder) {
            this.maxScalingAmount = builder.maxScalingAmount;
            this.nodeAmount = builder.nodeAmount;
            this.recurrenceSchedules = builder.recurrenceSchedules;
            this.scalingDownAfterIdleMinutes = builder.scalingDownAfterIdleMinutes;
            this.scalingStep = builder.scalingStep;
            this.scalingUsageThreshold = builder.scalingUsageThreshold;
            this.strategyDisableDate = builder.strategyDisableDate;
            this.strategyEnableDate = builder.strategyEnableDate;
            this.strategyType = builder.strategyType;
            this.warmUp = builder.warmUp;
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
         * @return nodeAmount
         */
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        /**
         * @return recurrenceSchedules
         */
        public java.util.List < RecurrenceSchedules> getRecurrenceSchedules() {
            return this.recurrenceSchedules;
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
         * @return strategyDisableDate
         */
        public String getStrategyDisableDate() {
            return this.strategyDisableDate;
        }

        /**
         * @return strategyEnableDate
         */
        public String getStrategyEnableDate() {
            return this.strategyEnableDate;
        }

        /**
         * @return strategyType
         */
        public String getStrategyType() {
            return this.strategyType;
        }

        /**
         * @return warmUp
         */
        public Boolean getWarmUp() {
            return this.warmUp;
        }

        public static final class Builder {
            private Integer maxScalingAmount; 
            private Integer nodeAmount; 
            private java.util.List < RecurrenceSchedules> recurrenceSchedules; 
            private Integer scalingDownAfterIdleMinutes; 
            private Integer scalingStep; 
            private String scalingUsageThreshold; 
            private String strategyDisableDate; 
            private String strategyEnableDate; 
            private String strategyType; 
            private Boolean warmUp; 

            /**
             * 最大弹性数量
             */
            public Builder maxScalingAmount(Integer maxScalingAmount) {
                this.maxScalingAmount = maxScalingAmount;
                return this;
            }

            /**
             * 购买资源的数量。取值范围：1~100。
             * <p>
             * 
             * > 
             * - 若为包年包月资源，则该参数不可修改。
             * - 若为按量付费资源，则当弹性模式（`StrategyType`）为固定数量（`NODE_FIXED`）或自动扩缩容（`NODE_SCALING_BY_USAGE`）时该参数可修改。
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * 策略执行周期列表。`StrategyType`（弹性模式）设为`NODE_SCALING_BY_SCHEDULE`（定时扩缩容）时，该字段必填。
             */
            public Builder recurrenceSchedules(java.util.List < RecurrenceSchedules> recurrenceSchedules) {
                this.recurrenceSchedules = recurrenceSchedules;
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
             * 策略失效日期。格式为：yyyy-MM-dd。失效日期与生效日期的间隔必须介于7天到1年之间（含7天和1年）。`StrategyType`（弹性模式）设为`NODE_SCALING_BY_SCHEDULE`（定时扩缩容）时，该字段必填。
             */
            public Builder strategyDisableDate(String strategyDisableDate) {
                this.strategyDisableDate = strategyDisableDate;
                return this;
            }

            /**
             * 策略生效日期。格式为：yyyy-MM-dd。该日期必须大于或等于当前日期。`StrategyType`（弹性模式）设为`NODE_SCALING_BY_SCHEDULE`（定时扩缩容）时，该字段必填。
             */
            public Builder strategyEnableDate(String strategyEnableDate) {
                this.strategyEnableDate = strategyEnableDate;
                return this;
            }

            /**
             * 策略类型，默认为NODE_FIXED
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            /**
             * 是否开启资源预热策略。`StrategyType`（弹性模式）设为`NODE_SCALING_BY_SCHEDULE`（定时扩缩容）时，该字段必填。
             */
            public Builder warmUp(Boolean warmUp) {
                this.warmUp = warmUp;
                return this;
            }

            public NodePoolStrategy build() {
                return new NodePoolStrategy(this);
            } 

        } 

    }
}
