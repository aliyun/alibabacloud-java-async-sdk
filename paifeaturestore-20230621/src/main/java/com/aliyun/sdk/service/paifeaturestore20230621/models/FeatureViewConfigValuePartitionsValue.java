// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link FeatureViewConfigValuePartitionsValue} extends {@link TeaModel}
 *
 * <p>FeatureViewConfigValuePartitionsValue</p>
 */
public class FeatureViewConfigValuePartitionsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List<String> values;

    @com.aliyun.core.annotation.NameInMap("StartValue")
    private String startValue;

    @com.aliyun.core.annotation.NameInMap("EndValue")
    private String endValue;

    private FeatureViewConfigValuePartitionsValue(Builder builder) {
        this.value = builder.value;
        this.values = builder.values;
        this.startValue = builder.startValue;
        this.endValue = builder.endValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FeatureViewConfigValuePartitionsValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return values
     */
    public java.util.List<String> getValues() {
        return this.values;
    }

    /**
     * @return startValue
     */
    public String getStartValue() {
        return this.startValue;
    }

    /**
     * @return endValue
     */
    public String getEndValue() {
        return this.endValue;
    }

    public static final class Builder {
        private String value; 
        private java.util.List<String> values; 
        private String startValue; 
        private String endValue; 

        private Builder() {
        } 

        private Builder(FeatureViewConfigValuePartitionsValue model) {
            this.value = model.value;
            this.values = model.values;
            this.startValue = model.startValue;
            this.endValue = model.endValue;
        } 

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Values.
         */
        public Builder values(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        /**
         * StartValue.
         */
        public Builder startValue(String startValue) {
            this.startValue = startValue;
            return this;
        }

        /**
         * EndValue.
         */
        public Builder endValue(String endValue) {
            this.endValue = endValue;
            return this;
        }

        public FeatureViewConfigValuePartitionsValue build() {
            return new FeatureViewConfigValuePartitionsValue(this);
        } 

    } 

}
