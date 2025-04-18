// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link GetNisNetworkMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>GetNisNetworkMetricsResponseBody</p>
 */
public class GetNisNetworkMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNisNetworkMetricsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNisNetworkMetricsResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNisNetworkMetricsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNisNetworkMetricsResponseBody build() {
            return new GetNisNetworkMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNisNetworkMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>GetNisNetworkMetricsResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private Long timeStamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Double value;

        private Metrics(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return timeStamp
         */
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long timeStamp; 
            private Double value; 

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.timeStamp = model.timeStamp;
                this.value = model.value;
            } 

            /**
             * TimeStamp.
             */
            public Builder timeStamp(Long timeStamp) {
                this.timeStamp = timeStamp;
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
     * {@link GetNisNetworkMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>GetNisNetworkMetricsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.List<Metrics> metrics;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Data(Builder builder) {
            this.metrics = builder.metrics;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return metrics
         */
        public java.util.List<Metrics> getMetrics() {
            return this.metrics;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private java.util.List<Metrics> metrics; 
            private String unit; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.metrics = model.metrics;
                this.unit = model.unit;
            } 

            /**
             * Metrics.
             */
            public Builder metrics(java.util.List<Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
