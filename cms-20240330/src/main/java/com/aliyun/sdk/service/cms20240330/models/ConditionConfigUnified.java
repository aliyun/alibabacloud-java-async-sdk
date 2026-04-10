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

    @com.aliyun.core.annotation.NameInMap("durationSecs")
    private Integer durationSecs;

    @com.aliyun.core.annotation.NameInMap("operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("relation")
    private String relation;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("threshold")
    private Double threshold;

    @com.aliyun.core.annotation.NameInMap("thresholdList")
    private java.util.List<ApmThresholdConfig> thresholdList;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ConditionConfigUnified(Builder builder) {
        this.aggregate = builder.aggregate;
        this.compareList = builder.compareList;
        this.durationSecs = builder.durationSecs;
        this.operator = builder.operator;
        this.relation = builder.relation;
        this.severity = builder.severity;
        this.threshold = builder.threshold;
        this.thresholdList = builder.thresholdList;
        this.type = builder.type;
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
     * @return durationSecs
     */
    public Integer getDurationSecs() {
        return this.durationSecs;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String aggregate; 
        private java.util.List<ApmCompositeCompareConfig> compareList; 
        private Integer durationSecs; 
        private String operator; 
        private String relation; 
        private String severity; 
        private Double threshold; 
        private java.util.List<ApmThresholdConfig> thresholdList; 
        private String type; 

        private Builder() {
        } 

        private Builder(ConditionConfigUnified model) {
            this.aggregate = model.aggregate;
            this.compareList = model.compareList;
            this.durationSecs = model.durationSecs;
            this.operator = model.operator;
            this.relation = model.relation;
            this.severity = model.severity;
            this.threshold = model.threshold;
            this.thresholdList = model.thresholdList;
            this.type = model.type;
        } 

        /**
         * <p>聚合函数（APM_SIMPLE_CONDITION）</p>
         */
        public Builder aggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }

        /**
         * <p>多条比较（APM_COMPOSITE_CONDITION）</p>
         */
        public Builder compareList(java.util.List<ApmCompositeCompareConfig> compareList) {
            this.compareList = compareList;
            return this;
        }

        /**
         * <p>持续时间（秒），PROMETHEUS_SIMPLE / UMODEL_METRICSET 使用</p>
         */
        public Builder durationSecs(Integer durationSecs) {
            this.durationSecs = durationSecs;
            return this;
        }

        /**
         * <p>比较操作符（UMODEL_METRICSET_CONDITION 或 APM_SIMPLE_CONDITION）</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>条件间逻辑关系（APM_COMPOSITE_CONDITION）</p>
         */
        public Builder relation(String relation) {
            this.relation = relation;
            return this;
        }

        /**
         * <p>严重等级（UMODEL / PROMETHEUS_SIMPLE / APM_COMPOSITE）</p>
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * <p>阈值（UMODEL_METRICSET_CONDITION）</p>
         */
        public Builder threshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * <p>多阈值列表（APM_SIMPLE_CONDITION）</p>
         */
        public Builder thresholdList(java.util.List<ApmThresholdConfig> thresholdList) {
            this.thresholdList = thresholdList;
            return this;
        }

        /**
         * <p>检测条件类型</p>
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ConditionConfigUnified build() {
            return new ConditionConfigUnified(this);
        } 

    } 

}
