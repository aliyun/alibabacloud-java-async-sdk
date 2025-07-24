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
 * {@link DoubleMetric} extends {@link TeaModel}
 *
 * <p>DoubleMetric</p>
 */
public class DoubleMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Unit")
    private String unit;

    @com.aliyun.core.annotation.NameInMap("Value")
    private Double value;

    private DoubleMetric(Builder builder) {
        this.unit = builder.unit;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DoubleMetric create() {
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
    public Double getValue() {
        return this.value;
    }

    public static final class Builder {
        private String unit; 
        private Double value; 

        private Builder() {
        } 

        private Builder(DoubleMetric model) {
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
        public Builder value(Double value) {
            this.value = value;
            return this;
        }

        public DoubleMetric build() {
            return new DoubleMetric(this);
        } 

    } 

}
