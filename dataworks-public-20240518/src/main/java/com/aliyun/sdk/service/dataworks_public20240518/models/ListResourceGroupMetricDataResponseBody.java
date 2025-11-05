// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListResourceGroupMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceGroupMetricDataResponseBody</p>
 */
public class ListResourceGroupMetricDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricData")
    private MetricData metricData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListResourceGroupMetricDataResponseBody(Builder builder) {
        this.metricData = builder.metricData;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupMetricDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricData
     */
    public MetricData getMetricData() {
        return this.metricData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private MetricData metricData; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListResourceGroupMetricDataResponseBody model) {
            this.metricData = model.metricData;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * MetricData.
         */
        public Builder metricData(MetricData metricData) {
            this.metricData = metricData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListResourceGroupMetricDataResponseBody build() {
            return new ListResourceGroupMetricDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceGroupMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupMetricDataResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Double value;

        private Metrics(Builder builder) {
            this.timestamp = builder.timestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
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
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long timestamp; 
            private Double value; 

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.timestamp = model.timestamp;
                this.value = model.value;
            } 

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourceGroupMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupMetricDataResponseBody</p>
     */
    public static class MetricData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.List<Metrics> metrics;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private MetricData(Builder builder) {
            this.id = builder.id;
            this.metricName = builder.metricName;
            this.metrics = builder.metrics;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricData create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return metrics
         */
        public java.util.List<Metrics> getMetrics() {
            return this.metrics;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private String id; 
            private String metricName; 
            private java.util.List<Metrics> metrics; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(MetricData model) {
                this.id = model.id;
                this.metricName = model.metricName;
                this.metrics = model.metrics;
                this.nextToken = model.nextToken;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * Metrics.
             */
            public Builder metrics(java.util.List<Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public MetricData build() {
                return new MetricData(this);
            } 

        } 

    }
}
