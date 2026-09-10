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
 * {@link CompareList} extends {@link TeaModel}
 *
 * <p>CompareList</p>
 */
public class CompareList extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("absDeviation")
    private Double absDeviation;

    @com.aliyun.core.annotation.NameInMap("aggregate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregate;

    @com.aliyun.core.annotation.NameInMap("baselinePeriod")
    private String baselinePeriod;

    @com.aliyun.core.annotation.NameInMap("operator")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operator;

    @com.aliyun.core.annotation.NameInMap("sensitivity")
    private String sensitivity;

    @com.aliyun.core.annotation.NameInMap("threshold")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float threshold;

    @com.aliyun.core.annotation.NameInMap("yoyTimeUnit")
    private String yoyTimeUnit;

    @com.aliyun.core.annotation.NameInMap("yoyTimeValue")
    private Integer yoyTimeValue;

    private CompareList(Builder builder) {
        this.absDeviation = builder.absDeviation;
        this.aggregate = builder.aggregate;
        this.baselinePeriod = builder.baselinePeriod;
        this.operator = builder.operator;
        this.sensitivity = builder.sensitivity;
        this.threshold = builder.threshold;
        this.yoyTimeUnit = builder.yoyTimeUnit;
        this.yoyTimeValue = builder.yoyTimeValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompareList create() {
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
     * @return aggregate
     */
    public String getAggregate() {
        return this.aggregate;
    }

    /**
     * @return baselinePeriod
     */
    public String getBaselinePeriod() {
        return this.baselinePeriod;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
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
    public Float getThreshold() {
        return this.threshold;
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
        private Double absDeviation; 
        private String aggregate; 
        private String baselinePeriod; 
        private String operator; 
        private String sensitivity; 
        private Float threshold; 
        private String yoyTimeUnit; 
        private Integer yoyTimeValue; 

        private Builder() {
        } 

        private Builder(CompareList model) {
            this.absDeviation = model.absDeviation;
            this.aggregate = model.aggregate;
            this.baselinePeriod = model.baselinePeriod;
            this.operator = model.operator;
            this.sensitivity = model.sensitivity;
            this.threshold = model.threshold;
            this.yoyTimeUnit = model.yoyTimeUnit;
            this.yoyTimeValue = model.yoyTimeValue;
        } 

        /**
         * <p>The dynamic baseline minimum deviation or absolute deviation dead zone. This parameter takes effect only when a baseline operator is used. If |current value − boundary| &lt; absDeviation, no alert is triggered. The unit is the same as the metric unit. The value must be greater than or equal to 0. A value of 0 indicates no restriction.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder absDeviation(Double absDeviation) {
            this.absDeviation = absDeviation;
            return this;
        }

        /**
         * <p>The aggregation function.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AVG</p>
         */
        public Builder aggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }

        /**
         * <p>The baseline period. This parameter takes effect only when a baseline operator is used. Valid values:</p>
         * <ul>
         * <li>AUTO: Automatically identifies the period. The specific identification result cannot be displayed.</li>
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
         * <p>The comparison operator. Valid values:</p>
         * <ul>
         * <li>GTE: greater than or equal to.</li>
         * <li>LTE: less than or equal to.</li>
         * <li>YOY_UP: year-over-year increase. You must also specify yoyTimeUnit and yoyTimeValue.</li>
         * <li>YOY_DOWN: year-over-year decrease. You must also specify yoyTimeUnit and yoyTimeValue.</li>
         * <li>ABOVE_UPPER: dynamic baseline spike. You must specify sensitivity. When using a baseline operator, threshold is not used for evaluation. Set it to 0 as a placeholder.</li>
         * <li>BELOW_LOWER: dynamic baseline drop. You must specify sensitivity. When using a baseline operator, threshold is not used for evaluation. Set it to 0 as a placeholder.</li>
         * <li>OUT_OF_BAND: dynamic baseline bidirectional. You must specify sensitivity. When using a baseline operator, threshold is not used for evaluation. Set it to 0 as a placeholder.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OUT_OF_BAND</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>The dynamic baseline sensitivity. This parameter takes effect only when a baseline operator is used. Valid values:</p>
         * <ul>
         * <li>HIGH: The narrowest band and the most sensitive.</li>
         * <li>MEDIUM: Medium sensitivity.</li>
         * <li>LOW: The widest band and the least sensitive.</li>
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
         * <p>The threshold.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder threshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * <p>The year-over-year time unit. This parameter takes effect only when operator is set to YOY_UP or YOY_DOWN.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        public Builder yoyTimeUnit(String yoyTimeUnit) {
            this.yoyTimeUnit = yoyTimeUnit;
            return this;
        }

        /**
         * <p>The year-over-year time value. This parameter takes effect only when operator is set to YOY_UP or YOY_DOWN.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder yoyTimeValue(Integer yoyTimeValue) {
            this.yoyTimeValue = yoyTimeValue;
            return this;
        }

        public CompareList build() {
            return new CompareList(this);
        } 

    } 

}
