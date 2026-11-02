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
 * {@link TriggerConditions} extends {@link TeaModel}
 *
 * <p>TriggerConditions</p>
 */
public class TriggerConditions extends TeaModel {
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

    private TriggerConditions(Builder builder) {
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

    public static TriggerConditions create() {
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

        private Builder(TriggerConditions model) {
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
         * <p>The minimum deviation or absolute deviation dead zone for dynamic baselines, which takes effect only for baseline operators. No alert is triggered if the absolute difference between the current value and the boundary is less than the absDeviation value. The unit is the same as the metric unit. The value must be greater than or equal to 0. A value of 0 indicates no limit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder absDeviation(Double absDeviation) {
            this.absDeviation = absDeviation;
            return this;
        }

        /**
         * <p>The baseline period, which takes effect only for baseline operators. Valid values: AUTO for automatic identification, DAILY for daily, WEEKLY for weekly, and NONE for no period. If you set this parameter to WEEKLY, the backend automatically extends the historical training window to at least 14 days.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        public Builder baselinePeriod(String baselinePeriod) {
            this.baselinePeriod = baselinePeriod;
            return this;
        }

        /**
         * <p>The expression type. The value is fixed as SIMPLE, which is used for MetricSet multi-threshold triggers.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        public Builder expressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }

        /**
         * <p>The upper bound of the range. This parameter is required when the operator is IN_RANGE or OUT_OF_RANGE, and the value must be greater than or equal to the min value.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder max(Double max) {
            this.max = max;
            return this;
        }

        /**
         * <p>The lower bound of the range. This parameter is required when the operator is IN_RANGE or OUT_OF_RANGE.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder min(Double min) {
            this.min = min;
            return this;
        }

        /**
         * <p>The comparison operator. Valid values: GT, GE, LT, LE, EQ, NE, IN_RANGE (requires both min and max), OUT_OF_RANGE (requires both min and max), PRESENT, and NOT_PRESENT.</p>
         * 
         * <strong>example:</strong>
         * <p>GT</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>The referenced query name, which corresponds to QueryConfigUnified.queries[].name.</p>
         * 
         * <strong>example:</strong>
         * <p>cpuQuery</p>
         */
        public Builder queryName(String queryName) {
            this.queryName = queryName;
            return this;
        }

        /**
         * <p>The dynamic baseline sensitivity, which takes effect only when the operator is ABOVE_UPPER, BELOW_LOWER, or OUT_OF_BAND. Valid values: HIGH for the narrowest and most sensitive band, MEDIUM for medium sensitivity, and LOW for the widest and least sensitive band. You can configure different sensitivities for multiple subconditions.</p>
         * 
         * <strong>example:</strong>
         * <p>MEDIUM</p>
         */
        public Builder sensitivity(String sensitivity) {
            this.sensitivity = sensitivity;
            return this;
        }

        /**
         * <p>The comparison threshold. This parameter is used when the operator is GT, GE, LT, LE, EQ, or NE. For IN_RANGE or OUT_OF_RANGE, use the min and max parameters. For PRESENT or NOT_PRESENT, leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder threshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }

        public TriggerConditions build() {
            return new TriggerConditions(this);
        } 

    } 

}
