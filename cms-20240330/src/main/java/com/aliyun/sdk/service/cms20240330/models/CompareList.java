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

    private CompareList(Builder builder) {
        this.aggregate = builder.aggregate;
        this.operator = builder.operator;
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

        private Builder(CompareList model) {
            this.aggregate = model.aggregate;
            this.operator = model.operator;
            this.threshold = model.threshold;
            this.yoyTimeUnit = model.yoyTimeUnit;
            this.yoyTimeValue = model.yoyTimeValue;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder aggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder threshold(Float threshold) {
            this.threshold = threshold;
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

        public CompareList build() {
            return new CompareList(this);
        } 

    } 

}
