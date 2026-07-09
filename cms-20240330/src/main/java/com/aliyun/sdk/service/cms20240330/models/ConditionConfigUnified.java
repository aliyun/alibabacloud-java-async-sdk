// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ConditionConfigUnified} extends {@link TeaModel}
 *
 * <p>ConditionConfigUnified</p>
 */
public class ConditionConfigUnified extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aggregate")
    private String aggregate;

    @com.aliyun.core.annotation.NameInMap("compareList")
    private java.util.List<ApmCompositeCompareConfig> compareList;

    @com.aliyun.core.annotation.NameInMap("compositeEscalation")
    private CloudMonitoringCompositeEscalation compositeEscalation;

    @com.aliyun.core.annotation.NameInMap("countOperator")
    private String countOperator;

    @com.aliyun.core.annotation.NameInMap("countThreshold")
    private Long countThreshold;

    @com.aliyun.core.annotation.NameInMap("durationSecs")
    private Integer durationSecs;

    @com.aliyun.core.annotation.NameInMap("enableSeveritySuppression")
    private Boolean enableSeveritySuppression;

    @com.aliyun.core.annotation.NameInMap("escalationType")
    private String escalationType;

    @com.aliyun.core.annotation.NameInMap("expressEscalation")
    private CloudMonitoringExpressEscalation expressEscalation;

    @com.aliyun.core.annotation.NameInMap("legacyRaw")
    private String legacyRaw;

    @com.aliyun.core.annotation.NameInMap("legacyType")
    private String legacyType;

    @com.aliyun.core.annotation.NameInMap("matchField")
    private String matchField;

    @com.aliyun.core.annotation.NameInMap("matchOperator")
    private String matchOperator;

    @com.aliyun.core.annotation.NameInMap("matchValue")
    private String matchValue;

    @com.aliyun.core.annotation.NameInMap("max")
    private Double max;

    @com.aliyun.core.annotation.NameInMap("min")
    private Double min;

    @com.aliyun.core.annotation.NameInMap("noDataPolicy")
    private String noDataPolicy;

    @com.aliyun.core.annotation.NameInMap("operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("prometheus")
    private CloudMonitoringPrometheusEscalation prometheus;

    @com.aliyun.core.annotation.NameInMap("relation")
    private String relation;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("simpleEscalation")
    private CloudMonitoringSimpleEscalation simpleEscalation;

    @com.aliyun.core.annotation.NameInMap("threshold")
    private Double threshold;

    @com.aliyun.core.annotation.NameInMap("thresholdList")
    private java.util.List<ApmThresholdConfig> thresholdList;

    @com.aliyun.core.annotation.NameInMap("triggers")
    private java.util.List<MetricSetMultiTrigger> triggers;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("yoyTimeUnit")
    private String yoyTimeUnit;

    @com.aliyun.core.annotation.NameInMap("yoyTimeValue")
    private Integer yoyTimeValue;

    private ConditionConfigUnified(Builder builder) {
        this.aggregate = builder.aggregate;
        this.compareList = builder.compareList;
        this.compositeEscalation = builder.compositeEscalation;
        this.countOperator = builder.countOperator;
        this.countThreshold = builder.countThreshold;
        this.durationSecs = builder.durationSecs;
        this.enableSeveritySuppression = builder.enableSeveritySuppression;
        this.escalationType = builder.escalationType;
        this.expressEscalation = builder.expressEscalation;
        this.legacyRaw = builder.legacyRaw;
        this.legacyType = builder.legacyType;
        this.matchField = builder.matchField;
        this.matchOperator = builder.matchOperator;
        this.matchValue = builder.matchValue;
        this.max = builder.max;
        this.min = builder.min;
        this.noDataPolicy = builder.noDataPolicy;
        this.operator = builder.operator;
        this.prometheus = builder.prometheus;
        this.relation = builder.relation;
        this.severity = builder.severity;
        this.simpleEscalation = builder.simpleEscalation;
        this.threshold = builder.threshold;
        this.thresholdList = builder.thresholdList;
        this.triggers = builder.triggers;
        this.type = builder.type;
        this.yoyTimeUnit = builder.yoyTimeUnit;
        this.yoyTimeValue = builder.yoyTimeValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConditionConfigUnified create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregate
     */
    public String getAggregate() {
        return this.aggregate;
    }

    /**
     * @return compareList
     */
    public java.util.List<ApmCompositeCompareConfig> getCompareList() {
        return this.compareList;
    }

    /**
     * @return compositeEscalation
     */
    public CloudMonitoringCompositeEscalation getCompositeEscalation() {
        return this.compositeEscalation;
    }

    /**
     * @return countOperator
     */
    public String getCountOperator() {
        return this.countOperator;
    }

    /**
     * @return countThreshold
     */
    public Long getCountThreshold() {
        return this.countThreshold;
    }

    /**
     * @return durationSecs
     */
    public Integer getDurationSecs() {
        return this.durationSecs;
    }

    /**
     * @return enableSeveritySuppression
     */
    public Boolean getEnableSeveritySuppression() {
        return this.enableSeveritySuppression;
    }

    /**
     * @return escalationType
     */
    public String getEscalationType() {
        return this.escalationType;
    }

    /**
     * @return expressEscalation
     */
    public CloudMonitoringExpressEscalation getExpressEscalation() {
        return this.expressEscalation;
    }

    /**
     * @return legacyRaw
     */
    public String getLegacyRaw() {
        return this.legacyRaw;
    }

    /**
     * @return legacyType
     */
    public String getLegacyType() {
        return this.legacyType;
    }

    /**
     * @return matchField
     */
    public String getMatchField() {
        return this.matchField;
    }

    /**
     * @return matchOperator
     */
    public String getMatchOperator() {
        return this.matchOperator;
    }

    /**
     * @return matchValue
     */
    public String getMatchValue() {
        return this.matchValue;
    }

    /**
     * @return max
     */
    public Double getMax() {
        return this.max;
    }

    /**
     * @return min
     */
    public Double getMin() {
        return this.min;
    }

    /**
     * @return noDataPolicy
     */
    public String getNoDataPolicy() {
        return this.noDataPolicy;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return prometheus
     */
    public CloudMonitoringPrometheusEscalation getPrometheus() {
        return this.prometheus;
    }

    /**
     * @return relation
     */
    public String getRelation() {
        return this.relation;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return simpleEscalation
     */
    public CloudMonitoringSimpleEscalation getSimpleEscalation() {
        return this.simpleEscalation;
    }

    /**
     * @return threshold
     */
    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * @return thresholdList
     */
    public java.util.List<ApmThresholdConfig> getThresholdList() {
        return this.thresholdList;
    }

    /**
     * @return triggers
     */
    public java.util.List<MetricSetMultiTrigger> getTriggers() {
        return this.triggers;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return yoyTimeUnit
     */
    public String getYoyTimeUnit() {
        return this.yoyTimeUnit;
    }

    /**
     * @return yoyTimeValue
     */
    public Integer getYoyTimeValue() {
        return this.yoyTimeValue;
    }

    public static final class Builder {
        private String aggregate; 
        private java.util.List<ApmCompositeCompareConfig> compareList; 
        private CloudMonitoringCompositeEscalation compositeEscalation; 
        private String countOperator; 
        private Long countThreshold; 
        private Integer durationSecs; 
        private Boolean enableSeveritySuppression; 
        private String escalationType; 
        private CloudMonitoringExpressEscalation expressEscalation; 
        private String legacyRaw; 
        private String legacyType; 
        private String matchField; 
        private String matchOperator; 
        private String matchValue; 
        private Double max; 
        private Double min; 
        private String noDataPolicy; 
        private String operator; 
        private CloudMonitoringPrometheusEscalation prometheus; 
        private String relation; 
        private String severity; 
        private CloudMonitoringSimpleEscalation simpleEscalation; 
        private Double threshold; 
        private java.util.List<ApmThresholdConfig> thresholdList; 
        private java.util.List<MetricSetMultiTrigger> triggers; 
        private String type; 
        private String yoyTimeUnit; 
        private Integer yoyTimeValue; 

        private Builder() {
        } 

        private Builder(ConditionConfigUnified model) {
            this.aggregate = model.aggregate;
            this.compareList = model.compareList;
            this.compositeEscalation = model.compositeEscalation;
            this.countOperator = model.countOperator;
            this.countThreshold = model.countThreshold;
            this.durationSecs = model.durationSecs;
            this.enableSeveritySuppression = model.enableSeveritySuppression;
            this.escalationType = model.escalationType;
            this.expressEscalation = model.expressEscalation;
            this.legacyRaw = model.legacyRaw;
            this.legacyType = model.legacyType;
            this.matchField = model.matchField;
            this.matchOperator = model.matchOperator;
            this.matchValue = model.matchValue;
            this.max = model.max;
            this.min = model.min;
            this.noDataPolicy = model.noDataPolicy;
            this.operator = model.operator;
            this.prometheus = model.prometheus;
            this.relation = model.relation;
            this.severity = model.severity;
            this.simpleEscalation = model.simpleEscalation;
            this.threshold = model.threshold;
            this.thresholdList = model.thresholdList;
            this.triggers = model.triggers;
            this.type = model.type;
            this.yoyTimeUnit = model.yoyTimeUnit;
            this.yoyTimeValue = model.yoyTimeValue;
        } 

        /**
         * aggregate.
         */
        public Builder aggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }

        /**
         * compareList.
         */
        public Builder compareList(java.util.List<ApmCompositeCompareConfig> compareList) {
            this.compareList = compareList;
            return this;
        }

        /**
         * compositeEscalation.
         */
        public Builder compositeEscalation(CloudMonitoringCompositeEscalation compositeEscalation) {
            this.compositeEscalation = compositeEscalation;
            return this;
        }

        /**
         * countOperator.
         */
        public Builder countOperator(String countOperator) {
            this.countOperator = countOperator;
            return this;
        }

        /**
         * countThreshold.
         */
        public Builder countThreshold(Long countThreshold) {
            this.countThreshold = countThreshold;
            return this;
        }

        /**
         * durationSecs.
         */
        public Builder durationSecs(Integer durationSecs) {
            this.durationSecs = durationSecs;
            return this;
        }

        /**
         * enableSeveritySuppression.
         */
        public Builder enableSeveritySuppression(Boolean enableSeveritySuppression) {
            this.enableSeveritySuppression = enableSeveritySuppression;
            return this;
        }

        /**
         * escalationType.
         */
        public Builder escalationType(String escalationType) {
            this.escalationType = escalationType;
            return this;
        }

        /**
         * expressEscalation.
         */
        public Builder expressEscalation(CloudMonitoringExpressEscalation expressEscalation) {
            this.expressEscalation = expressEscalation;
            return this;
        }

        /**
         * legacyRaw.
         */
        public Builder legacyRaw(String legacyRaw) {
            this.legacyRaw = legacyRaw;
            return this;
        }

        /**
         * legacyType.
         */
        public Builder legacyType(String legacyType) {
            this.legacyType = legacyType;
            return this;
        }

        /**
         * matchField.
         */
        public Builder matchField(String matchField) {
            this.matchField = matchField;
            return this;
        }

        /**
         * matchOperator.
         */
        public Builder matchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            return this;
        }

        /**
         * matchValue.
         */
        public Builder matchValue(String matchValue) {
            this.matchValue = matchValue;
            return this;
        }

        /**
         * max.
         */
        public Builder max(Double max) {
            this.max = max;
            return this;
        }

        /**
         * min.
         */
        public Builder min(Double min) {
            this.min = min;
            return this;
        }

        /**
         * noDataPolicy.
         */
        public Builder noDataPolicy(String noDataPolicy) {
            this.noDataPolicy = noDataPolicy;
            return this;
        }

        /**
         * operator.
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * prometheus.
         */
        public Builder prometheus(CloudMonitoringPrometheusEscalation prometheus) {
            this.prometheus = prometheus;
            return this;
        }

        /**
         * relation.
         */
        public Builder relation(String relation) {
            this.relation = relation;
            return this;
        }

        /**
         * severity.
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * simpleEscalation.
         */
        public Builder simpleEscalation(CloudMonitoringSimpleEscalation simpleEscalation) {
            this.simpleEscalation = simpleEscalation;
            return this;
        }

        /**
         * threshold.
         */
        public Builder threshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * thresholdList.
         */
        public Builder thresholdList(java.util.List<ApmThresholdConfig> thresholdList) {
            this.thresholdList = thresholdList;
            return this;
        }

        /**
         * triggers.
         */
        public Builder triggers(java.util.List<MetricSetMultiTrigger> triggers) {
            this.triggers = triggers;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * yoyTimeUnit.
         */
        public Builder yoyTimeUnit(String yoyTimeUnit) {
            this.yoyTimeUnit = yoyTimeUnit;
            return this;
        }

        /**
         * yoyTimeValue.
         */
        public Builder yoyTimeValue(Integer yoyTimeValue) {
            this.yoyTimeValue = yoyTimeValue;
            return this;
        }

        public ConditionConfigUnified build() {
            return new ConditionConfigUnified(this);
        } 

    } 

}
