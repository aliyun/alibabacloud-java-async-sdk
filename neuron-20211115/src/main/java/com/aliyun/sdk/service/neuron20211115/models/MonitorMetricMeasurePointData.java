// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MonitorMetricMeasurePointData} extends {@link TeaModel}
 *
 * <p>MonitorMetricMeasurePointData</p>
 */
public class MonitorMetricMeasurePointData extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("measure")
    private String measure;

    @com.aliyun.core.annotation.NameInMap("timeStamp")
    private String timeStamp;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    @com.aliyun.core.annotation.NameInMap("valueWithUnit")
    private String valueWithUnit;

    private MonitorMetricMeasurePointData(Builder builder) {
        this.measure = builder.measure;
        this.timeStamp = builder.timeStamp;
        this.value = builder.value;
        this.valueWithUnit = builder.valueWithUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorMetricMeasurePointData create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return measure
     */
    public String getMeasure() {
        return this.measure;
    }

    /**
     * @return timeStamp
     */
    public String getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return valueWithUnit
     */
    public String getValueWithUnit() {
        return this.valueWithUnit;
    }

    public static final class Builder {
        private String measure; 
        private String timeStamp; 
        private String value; 
        private String valueWithUnit; 

        private Builder() {
        } 

        private Builder(MonitorMetricMeasurePointData model) {
            this.measure = model.measure;
            this.timeStamp = model.timeStamp;
            this.value = model.value;
            this.valueWithUnit = model.valueWithUnit;
        } 

        /**
         * measure.
         */
        public Builder measure(String measure) {
            this.measure = measure;
            return this;
        }

        /**
         * timeStamp.
         */
        public Builder timeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * valueWithUnit.
         */
        public Builder valueWithUnit(String valueWithUnit) {
            this.valueWithUnit = valueWithUnit;
            return this;
        }

        public MonitorMetricMeasurePointData build() {
            return new MonitorMetricMeasurePointData(this);
        } 

    } 

}
