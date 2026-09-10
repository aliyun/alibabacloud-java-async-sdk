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

    @com.aliyun.core.annotation.NameInMap("threshold")
    private Double threshold;

    private TriggerConditions(Builder builder) {
        this.expressionType = builder.expressionType;
        this.max = builder.max;
        this.min = builder.min;
        this.operator = builder.operator;
        this.queryName = builder.queryName;
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
     * @return threshold
     */
    public Double getThreshold() {
        return this.threshold;
    }

    public static final class Builder {
        private String expressionType; 
        private Double max; 
        private Double min; 
        private String operator; 
        private String queryName; 
        private Double threshold; 

        private Builder() {
        } 

        private Builder(TriggerConditions model) {
            this.expressionType = model.expressionType;
            this.max = model.max;
            this.min = model.min;
            this.operator = model.operator;
            this.queryName = model.queryName;
            this.threshold = model.threshold;
        } 

        /**
         * <p>The expression type. Fixed as SIMPLE (used for MetricSet multi-threshold triggers).</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        public Builder expressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }

        /**
         * <p>The upper bound of the range. Required when operator is IN_RANGE or OUT_OF_RANGE. Must be greater than or equal to min.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder max(Double max) {
            this.max = max;
            return this;
        }

        /**
         * <p>The lower bound of the range. Required when operator is IN_RANGE or OUT_OF_RANGE.</p>
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
         * <p>The comparison threshold. Used when operator is GT, GE, LT, LE, EQ, or NE. For IN_RANGE or OUT_OF_RANGE, use min and max instead. Not required for PRESENT or NOT_PRESENT.</p>
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
