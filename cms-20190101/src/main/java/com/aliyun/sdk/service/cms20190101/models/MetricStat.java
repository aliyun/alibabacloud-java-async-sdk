// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link MetricStat} extends {@link TeaModel}
 *
 * <p>MetricStat</p>
 */
public class MetricStat extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Associated")
    private java.util.Map<String, String> associated;

    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private java.util.List<Dimension> dimensions;

    @com.aliyun.core.annotation.NameInMap("LogTime")
    private Long logTime;

    @com.aliyun.core.annotation.NameInMap("Measurements")
    private java.util.Map<String, ?> measurements;

    @com.aliyun.core.annotation.NameInMap("Metric")
    private String metric;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return associated
     */
    public java.util.Map<String, String> getAssociated() {
        return this.associated;
    }

    /**
     * @return dimensions
     */
    public java.util.List<Dimension> getDimensions() {
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
    public java.util.Map<String, ?> getMeasurements() {
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
        private java.util.Map<String, String> associated; 
        private java.util.List<Dimension> dimensions; 
        private Long logTime; 
        private java.util.Map<String, ?> measurements; 
        private String metric; 
        private String namespace; 
        private Integer period; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(MetricStat model) {
            this.associated = model.associated;
            this.dimensions = model.dimensions;
            this.logTime = model.logTime;
            this.measurements = model.measurements;
            this.metric = model.metric;
            this.namespace = model.namespace;
            this.period = model.period;
            this.timestamp = model.timestamp;
        } 

        /**
         * <p>The additional information of the monitored object (instance).</p>
         */
        public Builder associated(java.util.Map<String, String> associated) {
            this.associated = associated;
            return this;
        }

        /**
         * <p>The dimension information used to identify the monitored object (instance).</p>
         */
        public Builder dimensions(java.util.List<Dimension> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The recording time of the monitoring data, in milliseconds. For non-raw data (aggregated data), LogTime is null.</p>
         * 
         * <strong>example:</strong>
         * <p>1683686550073</p>
         */
        public Builder logTime(Long logTime) {
            this.logTime = logTime;
            return this;
        }

        /**
         * <p>The measurement values of the metric (multi-value mode by default).</p>
         */
        public Builder measurements(java.util.Map<String, ?> measurements) {
            this.measurements = measurements;
            return this;
        }

        /**
         * <p>The name of the metric for the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_idle</p>
         */
        public Builder metric(String metric) {
            this.metric = metric;
            return this;
        }

        /**
         * <p>The data namespace of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The time interval of the metric.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder period(Integer period) {
            this.period = period;
            return this;
        }

        /**
         * <p>The timestamp of the monitoring data, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1641454680000</p>
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
