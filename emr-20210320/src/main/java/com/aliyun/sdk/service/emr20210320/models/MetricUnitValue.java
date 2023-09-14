// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MetricUnitValue} extends {@link TeaModel}
 *
 * <p>MetricUnitValue</p>
 */
public class MetricUnitValue extends TeaModel {
    @NameInMap("MetricName")
    private String metricName;

    @NameInMap("MetricUnit")
    private String metricUnit;

    private MetricUnitValue(Builder builder) {
        this.metricName = builder.metricName;
        this.metricUnit = builder.metricUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricUnitValue create() {
        return builder().build();
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return metricUnit
     */
    public String getMetricUnit() {
        return this.metricUnit;
    }

    public static final class Builder {
        private String metricName; 
        private String metricUnit; 

        /**
         * 指标名称。
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * 指标单位。
         */
        public Builder metricUnit(String metricUnit) {
            this.metricUnit = metricUnit;
            return this;
        }

        public MetricUnitValue build() {
            return new MetricUnitValue(this);
        } 

    } 

}
