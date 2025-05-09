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
 * {@link GetTrainingJobLatestMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrainingJobLatestMetricsResponseBody</p>
 */
public class GetTrainingJobLatestMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.List<Metrics> metrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTrainingJobLatestMetricsResponseBody(Builder builder) {
        this.metrics = builder.metrics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrainingJobLatestMetricsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metrics
     */
    public java.util.List<Metrics> getMetrics() {
        return this.metrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Metrics> metrics; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetTrainingJobLatestMetricsResponseBody model) {
            this.metrics = model.metrics;
            this.requestId = model.requestId;
        } 

        /**
         * Metrics.
         */
        public Builder metrics(java.util.List<Metrics> metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTrainingJobLatestMetricsResponseBody build() {
            return new GetTrainingJobLatestMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTrainingJobLatestMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobLatestMetricsResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Double value;

        private Metrics(Builder builder) {
            this.name = builder.name;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String timestamp; 
            private Double value; 

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.name = model.name;
                this.timestamp = model.timestamp;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-18T22:20:55Z</p>
             */
            public Builder timestamp(String timestamp) {
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
}
