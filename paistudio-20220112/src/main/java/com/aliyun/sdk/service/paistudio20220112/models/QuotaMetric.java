// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuotaMetric} extends {@link TeaModel}
 *
 * <p>QuotaMetric</p>
 */
public class QuotaMetric extends TeaModel {
    @NameInMap("GPUType")
    private String GPUType;

    @NameInMap("Metrics")
    private java.util.List < Metric > metrics;

    private QuotaMetric(Builder builder) {
        this.GPUType = builder.GPUType;
        this.metrics = builder.metrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaMetric create() {
        return builder().build();
    }

    /**
     * @return GPUType
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * @return metrics
     */
    public java.util.List < Metric > getMetrics() {
        return this.metrics;
    }

    public static final class Builder {
        private String GPUType; 
        private java.util.List < Metric > metrics; 

        /**
         * GPUType.
         */
        public Builder GPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }

        /**
         * Metrics.
         */
        public Builder metrics(java.util.List < Metric > metrics) {
            this.metrics = metrics;
            return this;
        }

        public QuotaMetric build() {
            return new QuotaMetric(this);
        } 

    } 

}
