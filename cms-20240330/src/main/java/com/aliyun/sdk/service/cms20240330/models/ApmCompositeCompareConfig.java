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
 * {@link ApmCompositeCompareConfig} extends {@link TeaModel}
 *
 * <p>ApmCompositeCompareConfig</p>
 */
public class ApmCompositeCompareConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aggregate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregate;

    @com.aliyun.core.annotation.NameInMap("operator")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operator;

    @com.aliyun.core.annotation.NameInMap("threshold")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float threshold;

    @com.aliyun.core.annotation.NameInMap("yoyTimeUnit")
    private String yoyTimeUnit;

    @com.aliyun.core.annotation.NameInMap("yoyTimeValue")
    private Integer yoyTimeValue;

    private ApmCompositeCompareConfig(Builder builder) {
        this.aggregate = builder.aggregate;
        this.operator = builder.operator;
        this.threshold = builder.threshold;
        this.yoyTimeUnit = builder.yoyTimeUnit;
        this.yoyTimeValue = builder.yoyTimeValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApmCompositeCompareConfig create() {
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
     * @return operator
     */
    public String getOperator() {
        return this.operator;
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
        private String aggregate; 
        private String operator; 
        private Float threshold; 
        private String yoyTimeUnit; 
        private Integer yoyTimeValue; 

        private Builder() {
        } 

        private Builder(ApmCompositeCompareConfig model) {
            this.aggregate = model.aggregate;
            this.operator = model.operator;
            this.threshold = model.threshold;
            this.yoyTimeUnit = model.yoyTimeUnit;
            this.yoyTimeValue = model.yoyTimeValue;
        } 

        /**
         * <p>The aggregate functions.</p>
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
         * <p>The comparison operator.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GT</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>The threshold.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        public ApmCompositeCompareConfig build() {
            return new ApmCompositeCompareConfig(this);
        } 

    } 

}
