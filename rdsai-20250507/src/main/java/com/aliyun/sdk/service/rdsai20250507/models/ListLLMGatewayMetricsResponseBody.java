// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ListLLMGatewayMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLLMGatewayMetricsResponseBody</p>
 */
public class ListLLMGatewayMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Granularity")
    private String granularity;

    @com.aliyun.core.annotation.NameInMap("MetricItems")
    private java.util.List<MetricItems> metricItems;

    @com.aliyun.core.annotation.NameInMap("MetricType")
    private String metricType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListLLMGatewayMetricsResponseBody(Builder builder) {
        this.granularity = builder.granularity;
        this.metricItems = builder.metricItems;
        this.metricType = builder.metricType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLLMGatewayMetricsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return metricItems
     */
    public java.util.List<MetricItems> getMetricItems() {
        return this.metricItems;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String granularity; 
        private java.util.List<MetricItems> metricItems; 
        private String metricType; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListLLMGatewayMetricsResponseBody model) {
            this.granularity = model.granularity;
            this.metricItems = model.metricItems;
            this.metricType = model.metricType;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The time granularity of the returned metric data.</p>
         * 
         * <strong>example:</strong>
         * <p>minute</p>
         */
        public Builder granularity(String granularity) {
            this.granularity = granularity;
            return this;
        }

        /**
         * <p>The list of metric series. Each element contains the metric key, model name, unit, and list of data points.</p>
         */
        public Builder metricItems(java.util.List<MetricItems> metricItems) {
            this.metricItems = metricItems;
            return this;
        }

        /**
         * <p>The metric type for the current request. Valid values: tokenPerMinute, requestPerMinute, errorRequestPerMinute, and timeToFirstToken.</p>
         * 
         * <strong>example:</strong>
         * <p>tokenPerMinute</p>
         */
        public Builder metricType(String metricType) {
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>ABCDEF77-41B5-5F9E-81E8-93DFDD379024</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLLMGatewayMetricsResponseBody build() {
            return new ListLLMGatewayMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLLMGatewayMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLLMGatewayMetricsResponseBody</p>
     */
    public static class DataPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DataPoints(Builder builder) {
            this.timestamp = builder.timestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataPoints create() {
            return builder().build();
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long timestamp; 
            private String value; 

            private Builder() {
            } 

            private Builder(DataPoints model) {
                this.timestamp = model.timestamp;
                this.value = model.value;
            } 

            /**
             * <p>The UNIX timestamp of the minute for the data point, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1779799200000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The metric value, returned as a string.</p>
             * 
             * <strong>example:</strong>
             * <p>16022</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DataPoints build() {
                return new DataPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLLMGatewayMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLLMGatewayMetricsResponseBody</p>
     */
    public static class MetricItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataPoints")
        private java.util.List<DataPoints> dataPoints;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private MetricItems(Builder builder) {
            this.dataPoints = builder.dataPoints;
            this.key = builder.key;
            this.model = builder.model;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricItems create() {
            return builder().build();
        }

        /**
         * @return dataPoints
         */
        public java.util.List<DataPoints> getDataPoints() {
            return this.dataPoints;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private java.util.List<DataPoints> dataPoints; 
            private String key; 
            private String model; 
            private String unit; 

            private Builder() {
            } 

            private Builder(MetricItems model) {
                this.dataPoints = model.dataPoints;
                this.key = model.key;
                this.model = model.model;
                this.unit = model.unit;
            } 

            /**
             * <p>The list of minute-level data points for the metric series.</p>
             */
            public Builder dataPoints(java.util.List<DataPoints> dataPoints) {
                this.dataPoints = dataPoints;
                return this;
            }

            /**
             * <p>The metric key. For tokenPerMinute, the returned values can be inputTokens, outputTokens, implicitCachedTokens, explicitCachedTokens, and totalTokens. For requestPerMinute, the returned value is requestPerMinute. For errorRequestPerMinute, the returned value is the HTTP status code. For timeToFirstToken, the returned values can be averageTimeToFirstTokenMs, p50TimeToFirstTokenMs, p90TimeToFirstTokenMs, p95TimeToFirstTokenMs, and p99TimeToFirstTokenMs.</p>
             * 
             * <strong>example:</strong>
             * <p>inputTokens</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The name of the model corresponding to the metric series.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The unit of the metric value. The unit is tokens for token usage metrics, count for request and error request metrics, and ms for time to first token metrics.</p>
             * 
             * <strong>example:</strong>
             * <p>tokens</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public MetricItems build() {
                return new MetricItems(this);
            } 

        } 

    }
}
