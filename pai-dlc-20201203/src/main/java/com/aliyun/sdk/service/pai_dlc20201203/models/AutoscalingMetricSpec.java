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

    @com.aliyun.core.annotation.NameInMap("StabilizationWindowSeconds")
    private Integer stabilizationWindowSeconds;

    @com.aliyun.core.annotation.NameInMap("TargetValue")
    private Integer targetValue;

    @com.aliyun.core.annotation.NameInMap("Tolerance")
    private String tolerance;

    private AutoscalingMetricSpec(Builder builder) {
        this.metricName = builder.metricName;
        this.stabilizationWindowSeconds = builder.stabilizationWindowSeconds;
        this.targetValue = builder.targetValue;
        this.tolerance = builder.tolerance;
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
     * @return stabilizationWindowSeconds
     */
    public Integer getStabilizationWindowSeconds() {
        return this.stabilizationWindowSeconds;
    }

    /**
     * @return targetValue
     */
    public Integer getTargetValue() {
        return this.targetValue;
    }

    /**
     * @return tolerance
     */
    public String getTolerance() {
        return this.tolerance;
    }

    public static final class Builder {
        private String metricName; 
        private Integer stabilizationWindowSeconds; 
        private Integer targetValue; 
        private String tolerance; 

        private Builder() {
        } 

        private Builder(AutoscalingMetricSpec model) {
            this.metricName = model.metricName;
            this.stabilizationWindowSeconds = model.stabilizationWindowSeconds;
            this.targetValue = model.targetValue;
            this.tolerance = model.tolerance;
        } 

        /**
         * <p>The name of the metric for autoscaling. This can be a predefined or a custom metric.</p>
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The cooldown period, in seconds, after a scaling activity. This prevents the service from initiating another scaling action before the effects of the previous one are observable, stabilizing resource fluctuations.</p>
         */
        public Builder stabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }

        /**
         * <p>The target value for the specified metric. The autoscaling service tries to maintain the metric at or near this value.</p>
         */
        public Builder targetValue(Integer targetValue) {
            this.targetValue = targetValue;
            return this;
        }

        /**
         * <p>The acceptable deviation from the <code>TargetValue</code>, specified as a percentage string. A scaling action is triggered only if the metric value moves outside the range defined by the <code>TargetValue</code> and this tolerance. This prevents scaling actions based on minor fluctuations.</p>
         */
        public Builder tolerance(String tolerance) {
            this.tolerance = tolerance;
            return this;
        }

        public AutoscalingMetricSpec build() {
            return new AutoscalingMetricSpec(this);
        } 

    } 

}
