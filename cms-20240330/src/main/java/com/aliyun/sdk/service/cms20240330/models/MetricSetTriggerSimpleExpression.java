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
 * {@link MetricSetTriggerSimpleExpression} extends {@link TeaModel}
 *
 * <p>MetricSetTriggerSimpleExpression</p>
 */
public class MetricSetTriggerSimpleExpression extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("absDeviation")
    private Double absDeviation;

    @com.aliyun.core.annotation.NameInMap("baselinePeriod")
    private String baselinePeriod;

    @com.aliyun.core.annotation.NameInMap("expressionType")
    private String expressionType;

    @com.aliyun.core.annotation.NameInMap("max")
    private Double max;

    @com.aliyun.core.annotation.NameInMap("min")
    private Double min;

    @com.aliyun.core.annotation.NameInMap("operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("queryName")
    private String queryName;

    @com.aliyun.core.annotation.NameInMap("sensitivity")
    private String sensitivity;

    @com.aliyun.core.annotation.NameInMap("threshold")
    private Double threshold;

    private MetricSetTriggerSimpleExpression(Builder builder) {
        this.absDeviation = builder.absDeviation;
        this.baselinePeriod = builder.baselinePeriod;
        this.expressionType = builder.expressionType;
        this.max = builder.max;
        this.min = builder.min;
        this.operator = builder.operator;
        this.queryName = builder.queryName;
        this.sensitivity = builder.sensitivity;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricSetTriggerSimpleExpression create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return absDeviation
     */
    public Double getAbsDeviation() {
        return this.absDeviation;
    }

    /**
     * @return baselinePeriod
     */
    public String getBaselinePeriod() {
        return this.baselinePeriod;
    }

    /**
     * @return expressionType
     */
    public String getExpressionType() {
        return this.expressionType;
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
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return queryName
     */
    public String getQueryName() {
        return this.queryName;
    }

    /**
     * @return sensitivity
     */
    public String getSensitivity() {
        return this.sensitivity;
    }

    /**
     * @return threshold
     */
    public Double getThreshold() {
        return this.threshold;
    }

    public static final class Builder {
        private Double absDeviation; 
        private String baselinePeriod; 
        private String expressionType; 
        private Double max; 
        private Double min; 
        private String operator; 
        private String queryName; 
        private String sensitivity; 
        private Double threshold; 

        private Builder() {
        } 

        private Builder(MetricSetTriggerSimpleExpression model) {
            this.absDeviation = model.absDeviation;
            this.baselinePeriod = model.baselinePeriod;
            this.expressionType = model.expressionType;
            this.max = model.max;
            this.min = model.min;
            this.operator = model.operator;
            this.queryName = model.queryName;
            this.sensitivity = model.sensitivity;
            this.threshold = model.threshold;
        } 

        /**
         * <p>The minimum deviation or absolute deviation dead zone for the dynamic baseline. Takes effect only for baseline operators. The unit is the same as the metric. The value must be greater than or equal to 0. A value of 0 indicates no restriction.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder absDeviation(Double absDeviation) {
            this.absDeviation = absDeviation;
            return this;
        }

        /**
         * <p>The baseline period. Takes effect only for baseline operators. Valid values:</p>
         * <ul>
         * <li>AUTO: Automatically identifies the period.</li>
         * <li>DAILY: Daily period.</li>
         * <li>WEEKLY: Weekly period. The backend automatically expands the historical training window to at least 14 days.</li>
         * <li>NONE: No period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        public Builder baselinePeriod(String baselinePeriod) {
            this.baselinePeriod = baselinePeriod;
            return this;
        }

        /**
         * <p>The expression type. Fixed value: SIMPLE.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        public Builder expressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }

        /**
         * <p>The upper bound of the range. Required when operator is set to IN_RANGE or OUT_OF_RANGE. The value must be greater than or equal to min.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder max(Double max) {
            this.max = max;
            return this;
        }

        /**
         * <p>The lower bound of the range. Required when operator is set to IN_RANGE or OUT_OF_RANGE.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder min(Double min) {
            this.min = min;
            return this;
        }

        /**
         * <p>The comparison operator. Valid values:</p>
         * <ul>
         * <li>GT: Greater than.</li>
         * <li>GE: Greater than or equal to.</li>
         * <li>LT: Less than.</li>
         * <li>LE: Less than or equal to.</li>
         * <li>EQ: Equal to.</li>
         * <li>NE: Not equal to.</li>
         * <li>IN_RANGE: Within the range. Both min and max must be specified.</li>
         * <li>OUT_OF_RANGE: Outside the range. Both min and max must be specified.</li>
         * <li>PRESENT: The field exists. The threshold, min, and max parameters are not required.</li>
         * <li>NOT_PRESENT: The field does not exist. The threshold, min, and max parameters are not required.</li>
         * <li>ABOVE_UPPER: Dynamic baseline spike. The sensitivity parameter is required. The threshold, min, and max parameters are not required.</li>
         * <li>BELOW_LOWER: Dynamic baseline drop. The sensitivity parameter is required. The threshold, min, and max parameters are not required.</li>
         * <li>OUT_OF_BAND: Dynamic baseline bidirectional deviation. The sensitivity parameter is required. The threshold, min, and max parameters are not required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OUT_OF_BAND</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>The referenced query name, corresponding to QueryConfigUnified.queries[].name.</p>
         * 
         * <strong>example:</strong>
         * <p>cpuQuery</p>
         */
        public Builder queryName(String queryName) {
            this.queryName = queryName;
            return this;
        }

        /**
         * <p>The dynamic baseline sensitivity. Takes effect only for baseline operators. Valid values:</p>
         * <ul>
         * <li>HIGH: The narrowest band and highest sensitivity.</li>
         * <li>MEDIUM: Medium sensitivity.</li>
         * <li>LOW: The widest band and lowest sensitivity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MEDIUM</p>
         */
        public Builder sensitivity(String sensitivity) {
            this.sensitivity = sensitivity;
            return this;
        }

        /**
         * <p>The comparison threshold. Used when operator is set to GT, GE, LT, LE, EQ, or NE. For IN_RANGE or OUT_OF_RANGE, use min and max instead. Not required for PRESENT or NOT_PRESENT.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder threshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }

        public MetricSetTriggerSimpleExpression build() {
            return new MetricSetTriggerSimpleExpression(this);
        } 

    } 

}
