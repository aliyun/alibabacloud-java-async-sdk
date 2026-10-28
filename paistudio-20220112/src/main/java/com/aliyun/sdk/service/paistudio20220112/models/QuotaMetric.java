// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link QuotaMetric} extends {@link TeaModel}
 *
 * <p>QuotaMetric</p>
 */
public class QuotaMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.List<Metric> metrics;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Metric> getMetrics() {
        return this.metrics;
    }

    public static final class Builder {
        private String GPUType; 
        private java.util.List<Metric> metrics; 

        private Builder() {
        } 

        private Builder(QuotaMetric model) {
            this.GPUType = model.GPUType;
            this.metrics = model.metrics;
        } 

        /**
         * <p>The GPU type.</p>
         * 
         * <strong>example:</strong>
         * <p>GU108</p>
         */
        public Builder GPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }

        /**
         * <p>The performance metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>23000</p>
         */
        public Builder metrics(java.util.List<Metric> metrics) {
            this.metrics = metrics;
            return this;
        }

        public QuotaMetric build() {
            return new QuotaMetric(this);
        } 

    } 

}
