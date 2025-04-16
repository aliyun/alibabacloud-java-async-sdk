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
 * {@link ListTrainingJobInstanceMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrainingJobInstanceMetricsResponseBody</p>
 */
public class ListTrainingJobInstanceMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceMetrics")
    private java.util.List<InstanceMetrics> instanceMetrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTrainingJobInstanceMetricsResponseBody(Builder builder) {
        this.instanceMetrics = builder.instanceMetrics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrainingJobInstanceMetricsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceMetrics
     */
    public java.util.List<InstanceMetrics> getInstanceMetrics() {
        return this.instanceMetrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceMetrics> instanceMetrics; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListTrainingJobInstanceMetricsResponseBody model) {
            this.instanceMetrics = model.instanceMetrics;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceMetrics.
         */
        public Builder instanceMetrics(java.util.List<InstanceMetrics> instanceMetrics) {
            this.instanceMetrics = instanceMetrics;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTrainingJobInstanceMetricsResponseBody build() {
            return new ListTrainingJobInstanceMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTrainingJobInstanceMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrainingJobInstanceMetricsResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Double value;

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
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private String time; 
            private Double value; 

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.time = model.time;
                this.value = model.value;
            } 

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
     * {@link ListTrainingJobInstanceMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrainingJobInstanceMetricsResponseBody</p>
     */
    public static class InstanceMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.List<Metrics> metrics;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        private InstanceMetrics(Builder builder) {
            this.instanceId = builder.instanceId;
            this.metrics = builder.metrics;
            this.nodeName = builder.nodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceMetrics create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return metrics
         */
        public java.util.List<Metrics> getMetrics() {
            return this.metrics;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        public static final class Builder {
            private String instanceId; 
            private java.util.List<Metrics> metrics; 
            private String nodeName; 

            private Builder() {
            } 

            private Builder(InstanceMetrics model) {
                this.instanceId = model.instanceId;
                this.metrics = model.metrics;
                this.nodeName = model.nodeName;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public InstanceMetrics build() {
                return new InstanceMetrics(this);
            } 

        } 

    }
}
