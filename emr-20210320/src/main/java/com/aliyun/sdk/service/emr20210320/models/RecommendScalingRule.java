// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecommendScalingRule} extends {@link TeaModel}
 *
 * <p>RecommendScalingRule</p>
 */
public class RecommendScalingRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActivityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String activityType;

    @com.aliyun.core.annotation.NameInMap("AdjustmentValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer adjustmentValue;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("MaxSave")
    private Float maxSave;

    @com.aliyun.core.annotation.NameInMap("MetricsTrigger")
    private MetricsTrigger metricsTrigger;

    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.NameInMap("TimeTrigger")
    private TimeTrigger timeTrigger;

    @com.aliyun.core.annotation.NameInMap("TriggerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerType;

    private RecommendScalingRule(Builder builder) {
        this.activityType = builder.activityType;
        this.adjustmentValue = builder.adjustmentValue;
        this.instanceType = builder.instanceType;
        this.maxSave = builder.maxSave;
        this.metricsTrigger = builder.metricsTrigger;
        this.ruleName = builder.ruleName;
        this.timeTrigger = builder.timeTrigger;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecommendScalingRule create() {
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
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return maxSave
     */
    public Float getMaxSave() {
        return this.maxSave;
    }

    /**
     * @return metricsTrigger
     */
    public MetricsTrigger getMetricsTrigger() {
        return this.metricsTrigger;
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
        private String instanceType; 
        private Float maxSave; 
        private MetricsTrigger metricsTrigger; 
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
         * 推荐的规格类型。
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * 最大节约成本。
         */
        public Builder maxSave(Float maxSave) {
            this.maxSave = maxSave;
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

        public RecommendScalingRule build() {
            return new RecommendScalingRule(this);
        } 

    } 

}
