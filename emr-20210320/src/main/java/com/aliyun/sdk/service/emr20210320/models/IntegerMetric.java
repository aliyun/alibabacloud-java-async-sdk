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
 * {@link IntegerMetric} extends {@link TeaModel}
 *
 * <p>IntegerMetric</p>
 */
public class IntegerMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Unit")
    private String unit;

    @com.aliyun.core.annotation.NameInMap("Value")
    private Integer value;

    private IntegerMetric(Builder builder) {
        this.unit = builder.unit;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntegerMetric create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * @return value
     */
    public Integer getValue() {
        return this.value;
    }

    public static final class Builder {
        private String unit; 
        private Integer value; 

        private Builder() {
        } 

        private Builder(IntegerMetric model) {
            this.unit = model.unit;
            this.value = model.value;
        } 

        /**
         * Unit.
         */
        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(Integer value) {
            this.value = value;
            return this;
        }

        public IntegerMetric build() {
            return new IntegerMetric(this);
        } 

    } 

}
