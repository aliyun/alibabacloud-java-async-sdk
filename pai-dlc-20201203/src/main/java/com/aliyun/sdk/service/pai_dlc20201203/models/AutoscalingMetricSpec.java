// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link AutoscalingMetricSpec} extends {@link TeaModel}
 *
 * <p>AutoscalingMetricSpec</p>
 */
public class AutoscalingMetricSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.NameInMap("TargetValue")
    private Integer targetValue;

    private AutoscalingMetricSpec(Builder builder) {
        this.metricName = builder.metricName;
        this.targetValue = builder.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AutoscalingMetricSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return targetValue
     */
    public Integer getTargetValue() {
        return this.targetValue;
    }

    public static final class Builder {
        private String metricName; 
        private Integer targetValue; 

        private Builder() {
        } 

        private Builder(AutoscalingMetricSpec model) {
            this.metricName = model.metricName;
            this.targetValue = model.targetValue;
        } 

        /**
         * MetricName.
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * TargetValue.
         */
        public Builder targetValue(Integer targetValue) {
            this.targetValue = targetValue;
            return this;
        }

        public AutoscalingMetricSpec build() {
            return new AutoscalingMetricSpec(this);
        } 

    } 

}
