// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link MetricsTrigger} extends {@link TeaModel}
 *
 * <p>MetricsTrigger</p>
 */
public class MetricsTrigger extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConditionLogicOperator")
    private String conditionLogicOperator;

    @com.aliyun.core.annotation.NameInMap("Conditions")
    private java.util.List<TriggerCondition> conditions;

    @com.aliyun.core.annotation.NameInMap("CoolDownInterval")
    private Integer coolDownInterval;

    @com.aliyun.core.annotation.NameInMap("EvaluationCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer evaluationCount;

    @com.aliyun.core.annotation.NameInMap("TimeConstraints")
    private java.util.List<TimeConstraint> timeConstraints;

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
    public java.util.List<TriggerCondition> getConditions() {
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
    public java.util.List<TimeConstraint> getTimeConstraints() {
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
        private java.util.List<TriggerCondition> conditions; 
        private Integer coolDownInterval; 
        private Integer evaluationCount; 
        private java.util.List<TimeConstraint> timeConstraints; 
        private Integer timeWindow; 

        /**
         * <p>多指标逻辑关系。默认：Or。取值范围：</p>
         * <ul>
         * <li>And:与</li>
         * <li>Or：或</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Or</p>
         */
        public Builder conditionLogicOperator(String conditionLogicOperator) {
            this.conditionLogicOperator = conditionLogicOperator;
            return this;
        }

        /**
         * <p>指标触发条件列表。</p>
         */
        public Builder conditions(java.util.List<TriggerCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>冷却时间。 单位为秒</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder coolDownInterval(Integer coolDownInterval) {
            this.coolDownInterval = coolDownInterval;
            return this;
        }

        /**
         * <p>统计次数。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * <p>时间限制。</p>
         */
        public Builder timeConstraints(java.util.List<TimeConstraint> timeConstraints) {
            this.timeConstraints = timeConstraints;
            return this;
        }

        /**
         * <p>统计窗口。单位为秒。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
