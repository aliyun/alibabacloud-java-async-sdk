// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

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
 * {@link GetInstanceMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceMetricsResponseBody</p>
 */
public class GetInstanceMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("PodMetrics")
    private java.util.List<PodMetrics> podMetrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstanceMetricsResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.podMetrics = builder.podMetrics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return podMetrics
     */
    public java.util.List<PodMetrics> getPodMetrics() {
        return this.podMetrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceId; 
        private java.util.List<PodMetrics> podMetrics; 
        private String requestId; 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PodMetrics.
         */
        public Builder podMetrics(java.util.List<PodMetrics> podMetrics) {
            this.podMetrics = podMetrics;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceMetricsResponseBody build() {
            return new GetInstanceMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceMetricsResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Metrics(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String time; 
            private String value; 

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
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
     * {@link GetInstanceMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceMetricsResponseBody</p>
     */
    public static class PodMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.List<Metrics> metrics;

        @com.aliyun.core.annotation.NameInMap("PodId")
        private String podId;

        private PodMetrics(Builder builder) {
            this.metrics = builder.metrics;
            this.podId = builder.podId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PodMetrics create() {
            return builder().build();
        }

        /**
         * @return metrics
         */
        public java.util.List<Metrics> getMetrics() {
            return this.metrics;
        }

        /**
         * @return podId
         */
        public String getPodId() {
            return this.podId;
        }

        public static final class Builder {
            private java.util.List<Metrics> metrics; 
            private String podId; 

            /**
             * Metrics.
             */
            public Builder metrics(java.util.List<Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * <p>Pod ID。</p>
             * 
             * <strong>example:</strong>
             * <p>eais-hznzre6ffmz9num4****-579b587ddf-9txr6</p>
             */
            public Builder podId(String podId) {
                this.podId = podId;
                return this;
            }

            public PodMetrics build() {
                return new PodMetrics(this);
            } 

        } 

    }
}
