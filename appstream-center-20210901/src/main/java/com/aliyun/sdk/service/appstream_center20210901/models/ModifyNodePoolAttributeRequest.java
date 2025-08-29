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
         * <p>The ID of the region where the delivery group resides. For information about the supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cn-shanghai: China (Shanghai)</li>
         * <li>cn-hangzhou: China (Hangzhou)</li>
         * </ul>
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
         * NodeCapacity.
         */
        public Builder nodeCapacity(Integer nodeCapacity) {
            this.putBodyParameter("NodeCapacity", nodeCapacity);
            this.nodeCapacity = nodeCapacity;
            return this;
        }

        /**
         * <p>The auto scaling policy used by the delivery group.</p>
         */
        public Builder nodePoolStrategy(NodePoolStrategy nodePoolStrategy) {
            String nodePoolStrategyShrink = shrink(nodePoolStrategy, "NodePoolStrategy", "json");
            this.putBodyParameter("NodePoolStrategy", nodePoolStrategyShrink);
            this.nodePoolStrategy = nodePoolStrategy;
            return this;
        }

        /**
         * PoolId.
         */
        public Builder poolId(String poolId) {
            this.putBodyParameter("PoolId", poolId);
            this.poolId = poolId;
            return this;
        }

        /**
         * <p>The product type.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>CloudApp: App Streaming</li>
         * </ul>
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
             * <p>The number of resources.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The end of the time period during which the scaling policy is executed. Format: HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>15:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The beginning of the time period during which the scaling policy is executed. Format: HH:mm.</p>
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
             * <p>The schedule type of the scaling policy. This parameter must be configured together with <code>RecurrenceValues</code>.``</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>weekly: The scaling policy is executed on specific days each week.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>weekly</p>
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * <p>The days of each week on which the scaling policy is executed.</p>
             */
            public Builder recurrenceValues(java.util.List<Integer> recurrenceValues) {
                this.recurrenceValues = recurrenceValues;
                return this;
            }

            /**
             * <p>The time periods during which the scaling policy can be executed. The time periods must meet the following requirements:</p>
             * <ul>
             * <li>Up to three time periods can be added.</li>
             * <li>Time periods cannot be overlapped.</li>
             * <li>The interval between two consecutive time periods must be greater than or equal to 5 minutes.</li>
             * <li>Each time period must be greater than or equal to 15 minutes.</li>
             * <li>The total length of the time periods that you specify cannot be greater than a day.</li>
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
             * <p>The maximum number of idle sessions. After you specify a value for this parameter, auto scaling is triggered only if the number of idle sessions in the delivery group is smaller than the specified value and the session usage exceeds the value specified for <code>ScalingUsageThreshold</code>. Otherwise, the system determines that the idle sessions in the delivery group are sufficient and does not perform auto scaling.`` You can use this parameter to flexibly manage auto scaling and reduce costs.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxIdleAppInstanceAmount(Integer maxIdleAppInstanceAmount) {
                this.maxIdleAppInstanceAmount = maxIdleAppInstanceAmount;
                return this;
            }

            /**
             * <p>The maximum number of resources that can be created for scale-out. This parameter is required only if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_USAGE</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxScalingAmount(Integer maxScalingAmount) {
                this.maxScalingAmount = maxScalingAmount;
                return this;
            }

            /**
             * <p>The number of resources to purchase. Valid values: 1 to 100.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>If you use subscription resources, you cannot modify this parameter.</li>
             * <li>If you use pay-as-you-go resources, you can modify this parameter only if you set <code>StrategyType</code> to <code>NODE_FIXED</code> or <code>NODE_SCALING_BY_USAGE</code>.</li>
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
             * <p>The intervals at which the scaling policy is executed. This parameter is required only if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
             */
            public Builder recurrenceSchedules(java.util.List<RecurrenceSchedules> recurrenceSchedules) {
                this.recurrenceSchedules = recurrenceSchedules;
                return this;
            }

            /**
             * <p>The maximum retention period of a resource to which no session is connected. If no session is connected to a resource, the resource is automatically scaled in after the specified retention period elapses. Valid values: 5 to 120. Default value: 5. Unit: minutes. If one of the following situations occurs, the resource is not scaled in.</p>
             * <ul>
             * <li>If a scale-out is automatically triggered after the resource is scaled in, the scale-in is not executed. This prevents repeated scale-in and scale-out.</li>
             * <li>If a scale-out is automatically triggered due to an increase in the number of sessions during the specified period of time, the resource is not scaled in and the countdown restarts.</li>
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
             * <p>The number of resources that are created each time resources are scaled out. Valid values: 1 to 10. This parameter is required only if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_USAGE</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder scalingStep(Integer scalingStep) {
                this.scalingStep = scalingStep;
                return this;
            }

            /**
             * <p>The upper limit of session usage. If the session usage exceeds the specified upper limit, auto scaling is automatically triggered. The session usage is calculated by using the following formula: <code>Session usage = Number of current sessions/(Total number of resources × Number of concurrent sessions) × 100%</code>. This parameter is required only if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_USAGE</code>. Valid values: 0 to 100. Default value: 85.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder scalingUsageThreshold(String scalingUsageThreshold) {
                this.scalingUsageThreshold = scalingUsageThreshold;
                return this;
            }

            /**
             * <p>The expiration date of the scaling policy. Format: yyyy-MM-dd. The interval between the expiration date and the effective date must be from 7 days to 1 year. This parameter is required only if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-19</p>
             */
            public Builder strategyDisableDate(String strategyDisableDate) {
                this.strategyDisableDate = strategyDisableDate;
                return this;
            }

            /**
             * <p>The effective date of the scaling policy. Format: yyyy-MM-dd. The date must be the same as or later than the current date. This parameter is required only if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-05</p>
             */
            public Builder strategyEnableDate(String strategyEnableDate) {
                this.strategyEnableDate = strategyEnableDate;
                return this;
            }

            /**
             * <p>The scaling mode.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><code>NODE_FIXED</code>: no scaling. This value is applicable to pay-as-you-go resources and subscription resources.</li>
             * <li><code>NODE_SCALING_BY_USAGE</code>: auto scaling. This value is applicable to pay-as-you-go resources and subscription resources.</li>
             * <li><code>NODE_SCALING_BY_SCHEDULE</code>: scheduled scaling. This value is applicable only to pay-as-you-go resources.</li>
             * </ul>
             * <p>Valid values:</p>
             * <ul>
             * <li>NODE_FIXED: no scaling</li>
             * <li>NODE_SCALING_BY_SCHEDULE: scheduled scaling</li>
             * <li>NODE_SCALING_BY_USAGE: auto scaling</li>
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
             * <p>Specifies whether to enable the warmup policy for resources. This parameter is required only if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
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
