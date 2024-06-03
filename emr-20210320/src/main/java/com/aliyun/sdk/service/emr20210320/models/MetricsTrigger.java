// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MetricsTrigger} extends {@link TeaModel}
 *
 * <p>MetricsTrigger</p>
 */
public class MetricsTrigger extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConditionLogicOperator")
    private String conditionLogicOperator;

    @com.aliyun.core.annotation.NameInMap("Conditions")
    private java.util.List < TriggerCondition > conditions;

    @com.aliyun.core.annotation.NameInMap("CoolDownInterval")
    private Integer coolDownInterval;

    @com.aliyun.core.annotation.NameInMap("EvaluationCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer evaluationCount;

    @com.aliyun.core.annotation.NameInMap("TimeConstraints")
    private java.util.List < TimeConstraint > timeConstraints;

    @com.aliyun.core.annotation.NameInMap("TimeWindow")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer timeWindow;

    private MetricsTrigger(Builder builder) {
        this.conditionLogicOperator = builder.conditionLogicOperator;
        this.conditions = builder.conditions;
        this.coolDownInterval = builder.coolDownInterval;
        this.evaluationCount = builder.evaluationCount;
        this.timeConstraints = builder.timeConstraints;
        this.timeWindow = builder.timeWindow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricsTrigger create() {
        return builder().build();
    }

    /**
     * @return conditionLogicOperator
     */
    public String getConditionLogicOperator() {
        return this.conditionLogicOperator;
    }

    /**
     * @return conditions
     */
    public java.util.List < TriggerCondition > getConditions() {
        return this.conditions;
    }

    /**
     * @return coolDownInterval
     */
    public Integer getCoolDownInterval() {
        return this.coolDownInterval;
    }

    /**
     * @return evaluationCount
     */
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    /**
     * @return timeConstraints
     */
    public java.util.List < TimeConstraint > getTimeConstraints() {
        return this.timeConstraints;
    }

    /**
     * @return timeWindow
     */
    public Integer getTimeWindow() {
        return this.timeWindow;
    }

    public static final class Builder {
        private String conditionLogicOperator; 
        private java.util.List < TriggerCondition > conditions; 
        private Integer coolDownInterval; 
        private Integer evaluationCount; 
        private java.util.List < TimeConstraint > timeConstraints; 
        private Integer timeWindow; 

        /**
         * 多指标逻辑关系。默认：Or。取值范围：
         * <p>
         * - And:与
         * - Or：或
         */
        public Builder conditionLogicOperator(String conditionLogicOperator) {
            this.conditionLogicOperator = conditionLogicOperator;
            return this;
        }

        /**
         * 指标触发条件列表。
         */
        public Builder conditions(java.util.List < TriggerCondition > conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * 冷却时间。 单位为秒
         */
        public Builder coolDownInterval(Integer coolDownInterval) {
            this.coolDownInterval = coolDownInterval;
            return this;
        }

        /**
         * 统计次数。
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * 时间限制。
         */
        public Builder timeConstraints(java.util.List < TimeConstraint > timeConstraints) {
            this.timeConstraints = timeConstraints;
            return this;
        }

        /**
         * 统计窗口。单位为秒。
         */
        public Builder timeWindow(Integer timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }

        public MetricsTrigger build() {
            return new MetricsTrigger(this);
        } 

    } 

}
