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
 * {@link ApmThresholdConfig} extends {@link TeaModel}
 *
 * <p>ApmThresholdConfig</p>
 */
public class ApmThresholdConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("max")
    private Double max;

    @com.aliyun.core.annotation.NameInMap("min")
    private Double min;

    @com.aliyun.core.annotation.NameInMap("severity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String severity;

    @com.aliyun.core.annotation.NameInMap("threshold")
    private Float threshold;

    private ApmThresholdConfig(Builder builder) {
        this.max = builder.max;
        this.min = builder.min;
        this.severity = builder.severity;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApmThresholdConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return max
     */
    public Double getMax() {
        return this.max;
    }

    /**
     * @return min
     */
    public Double getMin() {
        return this.min;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return threshold
     */
    public Float getThreshold() {
        return this.threshold;
    }

    public static final class Builder {
        private Double max; 
        private Double min; 
        private String severity; 
        private Float threshold; 

        private Builder() {
        } 

        private Builder(ApmThresholdConfig model) {
            this.max = model.max;
            this.min = model.min;
            this.severity = model.severity;
            this.threshold = model.threshold;
        } 

        /**
         * max.
         */
        public Builder max(Double max) {
            this.max = max;
            return this;
        }

        /**
         * min.
         */
        public Builder min(Double min) {
            this.min = min;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * threshold.
         */
        public Builder threshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }

        public ApmThresholdConfig build() {
            return new ApmThresholdConfig(this);
        } 

    } 

}
