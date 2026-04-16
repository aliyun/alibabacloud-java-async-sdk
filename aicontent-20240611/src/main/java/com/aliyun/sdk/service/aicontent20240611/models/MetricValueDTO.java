// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link MetricValueDTO} extends {@link TeaModel}
 *
 * <p>MetricValueDTO</p>
 */
public class MetricValueDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("unit")
    private String unit;

    @com.aliyun.core.annotation.NameInMap("value")
    private Float value;

    private MetricValueDTO(Builder builder) {
        this.key = builder.key;
        this.label = builder.label;
        this.unit = builder.unit;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricValueDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
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
    public Float getValue() {
        return this.value;
    }

    public static final class Builder {
        private String key; 
        private String label; 
        private String unit; 
        private Float value; 

        private Builder() {
        } 

        private Builder(MetricValueDTO model) {
            this.key = model.key;
            this.label = model.label;
            this.unit = model.unit;
            this.value = model.value;
        } 

        /**
         * key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * unit.
         */
        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }

        /**
         * value.
         */
        public Builder value(Float value) {
            this.value = value;
            return this;
        }

        public MetricValueDTO build() {
            return new MetricValueDTO(this);
        } 

    } 

}
