// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScalingRule} extends {@link TeaModel}
 *
 * <p>ScalingRule</p>
 */
public class ScalingRule extends TeaModel {
    @NameInMap("ActivityType")
    @Validation(required = true)
    private String activityType;

    @NameInMap("AdjustmentValue")
    @Validation(required = true)
    private Integer adjustmentValue;

    @NameInMap("MetricsTrigger")
    private MetricsTrigger metricsTrigger;

    @NameInMap("MinAdjustmentValue")
    private Integer minAdjustmentValue;

    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    @NameInMap("TimeTrigger")
    private TimeTrigger timeTrigger;

    @NameInMap("TriggerType")
    @Validation(required = true)
    private String triggerType;

    private ScalingRule(Builder builder) {
        this.activityType = builder.activityType;
        this.adjustmentValue = builder.adjustmentValue;
        this.metricsTrigger = builder.metricsTrigger;
        this.minAdjustmentValue = builder.minAdjustmentValue;
        this.ruleName = builder.ruleName;
        this.timeTrigger = builder.timeTrigger;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingRule create() {
        return builder().build();
    }

    /**
     * @return activityType
     */
    public String getActivityType() {
        return this.activityType;
    }

    /**
     * @return adjustmentValue
     */
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    /**
     * @return metricsTrigger
     */
    public MetricsTrigger getMetricsTrigger() {
        return this.metricsTrigger;
    }

    /**
     * @return minAdjustmentValue
     */
    public Integer getMinAdjustmentValue() {
        return this.minAdjustmentValue;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return timeTrigger
     */
    public TimeTrigger getTimeTrigger() {
        return this.timeTrigger;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    public static final class Builder {
        private String activityType; 
        private Integer adjustmentValue; 
        private MetricsTrigger metricsTrigger; 
        private Integer minAdjustmentValue; 
        private String ruleName; 
        private TimeTrigger timeTrigger; 
        private String triggerType; 

        /**
         * 伸缩活动类型。取值范围：
         * <p>
         * - SCALE_OUT：扩容。
         * - SCALE_IN：缩容。
         */
        public Builder activityType(String activityType) {
            this.activityType = activityType;
            return this;
        }

        /**
         * 调整值。需要为正数，代表需要扩容或者缩容的实例数量。
         */
        public Builder adjustmentValue(Integer adjustmentValue) {
            this.adjustmentValue = adjustmentValue;
            return this;
        }

        /**
         * 按照负载伸缩描述。
         * <p>
         * <p>
         */
        public Builder metricsTrigger(MetricsTrigger metricsTrigger) {
            this.metricsTrigger = metricsTrigger;
            return this;
        }

        /**
         * MinAdjustmentValue.
         */
        public Builder minAdjustmentValue(Integer minAdjustmentValue) {
            this.minAdjustmentValue = minAdjustmentValue;
            return this;
        }

        /**
         * 规则名称。
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * 按照时间伸缩描述。
         * <p>
         * <p>
         */
        public Builder timeTrigger(TimeTrigger timeTrigger) {
            this.timeTrigger = timeTrigger;
            return this;
        }

        /**
         * 伸缩规则类型。 取值范围：
         * <p>
         * - TIME_TRIGGER: 按时间伸缩。
         * - METRICS_TRIGGER: 按负载伸缩。
         */
        public Builder triggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        public ScalingRule build() {
            return new ScalingRule(this);
        } 

    } 

}
