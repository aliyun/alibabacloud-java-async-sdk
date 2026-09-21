// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ModifyNodePoolAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyNodePoolAttributeRequest</p>
 */
public class ModifyNodePoolAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeCapacity")
    private Integer nodeCapacity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodePoolStrategy")
    private NodePoolStrategy nodePoolStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PoolId")
    private String poolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
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
         * <p>The region ID of the delivery group. For more information about supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The number of concurrent sessions, which is the number of sessions that can be simultaneously connected to a single resource. If too many sessions are connected simultaneously, the application experience may degrade. The value range varies depending on the resource specification. The value ranges for each resource specification are as follows:</p>
         * <ul>
         * <li>appstreaming.general.4c8g: 1 to 2.</li>
         * <li>appstreaming.general.8c16g: 1 to 4.</li>
         * <li>appstreaming.vgpu.8c16g.4g: 1 to 4.</li>
         * <li>appstreaming.vgpu.8c31g.16g: 1 to 4.</li>
         * <li>appstreaming.vgpu.14c93g.12g: 1 to 6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder nodeCapacity(Integer nodeCapacity) {
            this.putBodyParameter("NodeCapacity", nodeCapacity);
            this.nodeCapacity = nodeCapacity;
            return this;
        }

        /**
         * <p>The automatic scaling strategy of the delivery group.</p>
         */
        public Builder nodePoolStrategy(NodePoolStrategy nodePoolStrategy) {
            String nodePoolStrategyShrink = shrink(nodePoolStrategy, "NodePoolStrategy", "json");
            this.putBodyParameter("NodePoolStrategy", nodePoolStrategyShrink);
            this.nodePoolStrategy = nodePoolStrategy;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ew7va2g1wl3vm****</p>
         */
        public Builder poolId(String poolId) {
            this.putBodyParameter("PoolId", poolId);
            this.poolId = poolId;
            return this;
        }

        /**
         * <p>The product type.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
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

    /**
     * 
     * {@link ModifyNodePoolAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyNodePoolAttributeRequest</p>
     */
    public static class TimerPeriods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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

            private Builder() {
            } 

            private Builder(TimerPeriods model) {
                this.amount = model.amount;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The resource count.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The end time. Format: HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>15:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time. Format: HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>12:00</p>
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
    /**
     * 
     * {@link ModifyNodePoolAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyNodePoolAttributeRequest</p>
     */
    public static class RecurrenceSchedules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecurrenceType")
        private String recurrenceType;

        @com.aliyun.core.annotation.NameInMap("RecurrenceValues")
        private java.util.List<Integer> recurrenceValues;

        @com.aliyun.core.annotation.NameInMap("TimerPeriods")
        private java.util.List<TimerPeriods> timerPeriods;

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
        public java.util.List<Integer> getRecurrenceValues() {
            return this.recurrenceValues;
        }

        /**
         * @return timerPeriods
         */
        public java.util.List<TimerPeriods> getTimerPeriods() {
            return this.timerPeriods;
        }

        public static final class Builder {
            private String recurrenceType; 
            private java.util.List<Integer> recurrenceValues; 
            private java.util.List<TimerPeriods> timerPeriods; 

            private Builder() {
            } 

            private Builder(RecurrenceSchedules model) {
                this.recurrenceType = model.recurrenceType;
                this.recurrenceValues = model.recurrenceValues;
                this.timerPeriods = model.timerPeriods;
            } 

            /**
             * <p>The type of the strategy execution cycle. You must specify both <code>RecurrenceType</code> and <code>RecurrenceValues</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>weekly</p>
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * <p>The list of values for the strategy execution cycle.</p>
             */
            public Builder recurrenceValues(java.util.List<Integer> recurrenceValues) {
                this.recurrenceValues = recurrenceValues;
                return this;
            }

            /**
             * <p>The list of time periods for the strategy execution cycle. Requirements for time period settings:</p>
             * <ul>
             * <li>You can add up to 3 time periods.</li>
             * <li>Time periods cannot overlap.</li>
             * <li>The interval between time periods must be greater than or equal to 5 minutes.</li>
             * <li>The duration of a single time period must be greater than or equal to 15 minutes.</li>
             * <li>All time periods combined must not span across days.</li>
             * </ul>
             */
            public Builder timerPeriods(java.util.List<TimerPeriods> timerPeriods) {
                this.timerPeriods = timerPeriods;
                return this;
            }

            public RecurrenceSchedules build() {
                return new RecurrenceSchedules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyNodePoolAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyNodePoolAttributeRequest</p>
     */
    public static class NodePoolStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxIdleAppInstanceAmount")
        private Integer maxIdleAppInstanceAmount;

        @com.aliyun.core.annotation.NameInMap("MaxScalingAmount")
        private Integer maxScalingAmount;

        @com.aliyun.core.annotation.NameInMap("NodeAmount")
        private Integer nodeAmount;

        @com.aliyun.core.annotation.NameInMap("RecurrenceSchedules")
        private java.util.List<RecurrenceSchedules> recurrenceSchedules;

        @com.aliyun.core.annotation.NameInMap("ScalingDownAfterIdleMinutes")
        private Integer scalingDownAfterIdleMinutes;

        @com.aliyun.core.annotation.NameInMap("ScalingStep")
        private Integer scalingStep;

        @com.aliyun.core.annotation.NameInMap("ScalingUsageThreshold")
        private String scalingUsageThreshold;

        @com.aliyun.core.annotation.NameInMap("StrategyDisableDate")
        private String strategyDisableDate;

        @com.aliyun.core.annotation.NameInMap("StrategyEnableDate")
        private String strategyEnableDate;

        @com.aliyun.core.annotation.NameInMap("StrategyType")
        private String strategyType;

        @com.aliyun.core.annotation.NameInMap("WarmUp")
        private Boolean warmUp;

        private NodePoolStrategy(Builder builder) {
            this.maxIdleAppInstanceAmount = builder.maxIdleAppInstanceAmount;
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
         * @return maxIdleAppInstanceAmount
         */
        public Integer getMaxIdleAppInstanceAmount() {
            return this.maxIdleAppInstanceAmount;
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
        public java.util.List<RecurrenceSchedules> getRecurrenceSchedules() {
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
            private Integer maxIdleAppInstanceAmount; 
            private Integer maxScalingAmount; 
            private Integer nodeAmount; 
            private java.util.List<RecurrenceSchedules> recurrenceSchedules; 
            private Integer scalingDownAfterIdleMinutes; 
            private Integer scalingStep; 
            private String scalingUsageThreshold; 
            private String strategyDisableDate; 
            private String strategyEnableDate; 
            private String strategyType; 
            private Boolean warmUp; 

            private Builder() {
            } 

            private Builder(NodePoolStrategy model) {
                this.maxIdleAppInstanceAmount = model.maxIdleAppInstanceAmount;
                this.maxScalingAmount = model.maxScalingAmount;
                this.nodeAmount = model.nodeAmount;
                this.recurrenceSchedules = model.recurrenceSchedules;
                this.scalingDownAfterIdleMinutes = model.scalingDownAfterIdleMinutes;
                this.scalingStep = model.scalingStep;
                this.scalingUsageThreshold = model.scalingUsageThreshold;
                this.strategyDisableDate = model.strategyDisableDate;
                this.strategyEnableDate = model.strategyEnableDate;
                this.strategyType = model.strategyType;
                this.warmUp = model.warmUp;
            } 

            /**
             * <p>The upper limit of idle sessions. When this value is specified, automatic scale-out is triggered only when the session usage exceeds <code>ScalingUsageThreshold</code> and the number of idle sessions in the current delivery group is less than <code>MaxIdleAppInstanceAmount</code>. Otherwise, the idle sessions in the delivery group are considered sufficient and automatic scale-out is not triggered. This parameter can be used to flexibly control elastic scale-out behavior and reduce costs.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxIdleAppInstanceAmount(Integer maxIdleAppInstanceAmount) {
                this.maxIdleAppInstanceAmount = maxIdleAppInstanceAmount;
                return this;
            }

            /**
             * <p>The maximum number of resources that can be created during scale-out. This parameter is required when <code>StrategyType</code> is set to <code>NODE_SCALING_BY_USAGE</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxScalingAmount(Integer maxScalingAmount) {
                this.maxScalingAmount = maxScalingAmount;
                return this;
            }

            /**
             * <p>The number of purchased resources. Valid values: 1 to 100.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>If the resources are subscription resources, this parameter cannot be modified.</li>
             * <li>If the resources are pay-as-you-go resources, this parameter can be modified when the elastic mode (<code>StrategyType</code>) is set to fixed quantity (<code>NODE_FIXED</code>) or automatic scaling (<code>NODE_SCALING_BY_USAGE</code>).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * <p>The list of strategy execution cycles. This parameter is required when <code>StrategyType</code> (elastic mode) is set to <code>NODE_SCALING_BY_SCHEDULE</code> (scheduled scaling).</p>
             */
            public Builder recurrenceSchedules(java.util.List<RecurrenceSchedules> recurrenceSchedules) {
                this.recurrenceSchedules = recurrenceSchedules;
                return this;
            }

            /**
             * <p>The maximum duration (in minutes) that a resource without session connections is retained. When no sessions are connected to a resource, a countdown starts based on the duration specified here. Scale-in is completed when the countdown ends. Valid values: 5 to 120. Default value: 5. The following exceptions apply:</p>
             * <ul>
             * <li>If scale-in would trigger automatic scale-out again, scale-in is not performed to avoid repeated scale-in and scale-out operations.</li>
             * <li>If automatic scale-out is triggered due to an increase in sessions during this period, the resource is not scaled in as originally planned, and the countdown restarts.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder scalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
                this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
                return this;
            }

            /**
             * <p>The number of resources created during each scale-out operation. Valid values: 1 to 10. This parameter is required when <code>StrategyType</code> is set to <code>NODE_SCALING_BY_USAGE</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder scalingStep(Integer scalingStep) {
                this.scalingStep = scalingStep;
                return this;
            }

            /**
             * <p>The upper threshold of session usage (%). Automatic scale-out is triggered when the session usage exceeds this threshold. The formula for session usage is <code>Session usage = Current sessions ÷ (Total resources × Concurrent sessions per resource) × 100%</code>. This parameter is required when <code>StrategyType</code> is set to <code>NODE_SCALING_BY_USAGE</code>. Valid values: 0 to 100. Default value: 85.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder scalingUsageThreshold(String scalingUsageThreshold) {
                this.scalingUsageThreshold = scalingUsageThreshold;
                return this;
            }

            /**
             * <p>The date when the strategy expires. Format: yyyy-MM-dd. The interval between the expiration date and the effective date must be between 7 days and 1 year (inclusive). This parameter is required when <code>StrategyType</code> (elastic mode) is set to <code>NODE_SCALING_BY_SCHEDULE</code> (scheduled scaling).</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-19</p>
             */
            public Builder strategyDisableDate(String strategyDisableDate) {
                this.strategyDisableDate = strategyDisableDate;
                return this;
            }

            /**
             * <p>The date when the strategy takes effect. Format: yyyy-MM-dd. This date must be greater than or equal to the current date. This parameter is required when <code>StrategyType</code> (elastic mode) is set to <code>NODE_SCALING_BY_SCHEDULE</code> (scheduled scaling).</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-05</p>
             */
            public Builder strategyEnableDate(String strategyEnableDate) {
                this.strategyEnableDate = strategyEnableDate;
                return this;
            }

            /**
             * <p>The elastic mode.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><code>NODE_FIXED</code> (fixed quantity): Applicable to subscription and pay-as-you-go resources.</li>
             * <li><code>NODE_SCALING_BY_USAGE</code> (automatic scaling): Applicable to subscription and pay-as-you-go resources.</li>
             * <li><code>NODE_SCALING_BY_SCHEDULE</code> (scheduled scaling): Applicable only to pay-as-you-go resources.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NODE_FIXED</p>
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            /**
             * <p>Specifies whether to enable the resource prefetch policy. This parameter is required when <code>StrategyType</code> (elastic mode) is set to <code>NODE_SCALING_BY_SCHEDULE</code> (scheduled scaling).</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
