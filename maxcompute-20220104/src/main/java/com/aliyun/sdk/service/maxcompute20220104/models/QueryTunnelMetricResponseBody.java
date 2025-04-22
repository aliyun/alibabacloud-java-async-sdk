// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link QueryTunnelMetricResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTunnelMetricResponseBody</p>
 */
public class QueryTunnelMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private QueryTunnelMetricResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTunnelMetricResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryTunnelMetricResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * httpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryTunnelMetricResponseBody build() {
            return new QueryTunnelMetricResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTunnelMetricResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTunnelMetricResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metric")
        private java.util.Map<String, String> metric;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<java.util.List<Double>> values;

        private Metrics(Builder builder) {
            this.metric = builder.metric;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return metric
         */
        public java.util.Map<String, String> getMetric() {
            return this.metric;
        }

        /**
         * @return values
         */
        public java.util.List<java.util.List<Double>> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.Map<String, String> metric; 
            private java.util.List<java.util.List<Double>> values; 

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.metric = model.metric;
                this.values = model.values;
            } 

            /**
             * metric.
             */
            public Builder metric(java.util.Map<String, String> metric) {
                this.metric = metric;
                return this;
            }

            /**
             * values.
             */
            public Builder values(java.util.List<java.util.List<Double>> values) {
                this.values = values;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTunnelMetricResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTunnelMetricResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("metrics")
        private java.util.List<Metrics> metrics;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("period")
        private Long period;

        private Data(Builder builder) {
            this.category = builder.category;
            this.metrics = builder.metrics;
            this.name = builder.name;
            this.period = builder.period;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return metrics
         */
        public java.util.List<Metrics> getMetrics() {
            return this.metrics;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return period
         */
        public Long getPeriod() {
            return this.period;
        }

        public static final class Builder {
            private String category; 
            private java.util.List<Metrics> metrics; 
            private String name; 
            private Long period; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.category = model.category;
                this.metrics = model.metrics;
                this.name = model.name;
                this.period = model.period;
            } 

            /**
             * category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * metrics.
             */
            public Builder metrics(java.util.List<Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * period.
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
