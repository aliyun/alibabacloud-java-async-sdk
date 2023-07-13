// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MetricStat} extends {@link TeaModel}
 *
 * <p>MetricStat</p>
 */
public class MetricStat extends TeaModel {
    @NameInMap("Associated")
    private java.util.Map < String, String > associated;

    @NameInMap("Dimensions")
    private java.util.List < Dimension > dimensions;

    @NameInMap("LogTime")
    private Long logTime;

    @NameInMap("Measurements")
    private java.util.Map < String, ? > measurements;

    @NameInMap("Metric")
    private String metric;

    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("Period")
    private Integer period;

    @NameInMap("Timestamp")
    private Long timestamp;

    private MetricStat(Builder builder) {
        this.associated = builder.associated;
        this.dimensions = builder.dimensions;
        this.logTime = builder.logTime;
        this.measurements = builder.measurements;
        this.metric = builder.metric;
        this.namespace = builder.namespace;
        this.period = builder.period;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricStat create() {
        return builder().build();
    }

    /**
     * @return associated
     */
    public java.util.Map < String, String > getAssociated() {
        return this.associated;
    }

    /**
     * @return dimensions
     */
    public java.util.List < Dimension > getDimensions() {
        return this.dimensions;
    }

    /**
     * @return logTime
     */
    public Long getLogTime() {
        return this.logTime;
    }

    /**
     * @return measurements
     */
    public java.util.Map < String, ? > getMeasurements() {
        return this.measurements;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private java.util.Map < String, String > associated; 
        private java.util.List < Dimension > dimensions; 
        private Long logTime; 
        private java.util.Map < String, ? > measurements; 
        private String metric; 
        private String namespace; 
        private Integer period; 
        private Long timestamp; 

        /**
         * Associated.
         */
        public Builder associated(java.util.Map < String, String > associated) {
            this.associated = associated;
            return this;
        }

        /**
         * Dimensions.
         */
        public Builder dimensions(java.util.List < Dimension > dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        /**
         * LogTime.
         */
        public Builder logTime(Long logTime) {
            this.logTime = logTime;
            return this;
        }

        /**
         * Measurements.
         */
        public Builder measurements(java.util.Map < String, ? > measurements) {
            this.measurements = measurements;
            return this;
        }

        /**
         * Metric.
         */
        public Builder metric(String metric) {
            this.metric = metric;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.period = period;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public MetricStat build() {
            return new MetricStat(this);
        } 

    } 

}
