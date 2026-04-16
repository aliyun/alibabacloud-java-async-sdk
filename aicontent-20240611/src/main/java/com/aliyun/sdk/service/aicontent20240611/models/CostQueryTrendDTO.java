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
 * {@link CostQueryTrendDTO} extends {@link TeaModel}
 *
 * <p>CostQueryTrendDTO</p>
 */
public class CostQueryTrendDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("defaultMetric")
    private String defaultMetric;

    @com.aliyun.core.annotation.NameInMap("granularity")
    private String granularity;

    @com.aliyun.core.annotation.NameInMap("metrics")
    private java.util.List<MetricDefRespDTO> metrics;

    @com.aliyun.core.annotation.NameInMap("points")
    private java.util.List<TrendPointDTO> points;

    private CostQueryTrendDTO(Builder builder) {
        this.defaultMetric = builder.defaultMetric;
        this.granularity = builder.granularity;
        this.metrics = builder.metrics;
        this.points = builder.points;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CostQueryTrendDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultMetric
     */
    public String getDefaultMetric() {
        return this.defaultMetric;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return metrics
     */
    public java.util.List<MetricDefRespDTO> getMetrics() {
        return this.metrics;
    }

    /**
     * @return points
     */
    public java.util.List<TrendPointDTO> getPoints() {
        return this.points;
    }

    public static final class Builder {
        private String defaultMetric; 
        private String granularity; 
        private java.util.List<MetricDefRespDTO> metrics; 
        private java.util.List<TrendPointDTO> points; 

        private Builder() {
        } 

        private Builder(CostQueryTrendDTO model) {
            this.defaultMetric = model.defaultMetric;
            this.granularity = model.granularity;
            this.metrics = model.metrics;
            this.points = model.points;
        } 

        /**
         * defaultMetric.
         */
        public Builder defaultMetric(String defaultMetric) {
            this.defaultMetric = defaultMetric;
            return this;
        }

        /**
         * granularity.
         */
        public Builder granularity(String granularity) {
            this.granularity = granularity;
            return this;
        }

        /**
         * metrics.
         */
        public Builder metrics(java.util.List<MetricDefRespDTO> metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * points.
         */
        public Builder points(java.util.List<TrendPointDTO> points) {
            this.points = points;
            return this;
        }

        public CostQueryTrendDTO build() {
            return new CostQueryTrendDTO(this);
        } 

    } 

}
