// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceAutoScalerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceAutoScalerResponseBody</p>
 */
public class DescribeServiceAutoScalerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Behavior")
    private java.util.Map < String, ? > behavior;

    @com.aliyun.core.annotation.NameInMap("CurrentMetrics")
    private java.util.List < CurrentMetrics> currentMetrics;

    @com.aliyun.core.annotation.NameInMap("MaxReplica")
    private Integer maxReplica;

    @com.aliyun.core.annotation.NameInMap("MinReplica")
    private Integer minReplica;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScaleStrategies")
    private java.util.List < ScaleStrategies> scaleStrategies;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    private DescribeServiceAutoScalerResponseBody(Builder builder) {
        this.behavior = builder.behavior;
        this.currentMetrics = builder.currentMetrics;
        this.maxReplica = builder.maxReplica;
        this.minReplica = builder.minReplica;
        this.requestId = builder.requestId;
        this.scaleStrategies = builder.scaleStrategies;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceAutoScalerResponseBody create() {
        return builder().build();
    }

    /**
     * @return behavior
     */
    public java.util.Map < String, ? > getBehavior() {
        return this.behavior;
    }

    /**
     * @return currentMetrics
     */
    public java.util.List < CurrentMetrics> getCurrentMetrics() {
        return this.currentMetrics;
    }

    /**
     * @return maxReplica
     */
    public Integer getMaxReplica() {
        return this.maxReplica;
    }

    /**
     * @return minReplica
     */
    public Integer getMinReplica() {
        return this.minReplica;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scaleStrategies
     */
    public java.util.List < ScaleStrategies> getScaleStrategies() {
        return this.scaleStrategies;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder {
        private java.util.Map < String, ? > behavior; 
        private java.util.List < CurrentMetrics> currentMetrics; 
        private Integer maxReplica; 
        private Integer minReplica; 
        private String requestId; 
        private java.util.List < ScaleStrategies> scaleStrategies; 
        private String serviceName; 

        /**
         * The additional information about the Autoscaler policy, such as the interval of triggering Autoscaler.
         */
        public Builder behavior(java.util.Map < String, ? > behavior) {
            this.behavior = behavior;
            return this;
        }

        /**
         * The metrics.
         */
        public Builder currentMetrics(java.util.List < CurrentMetrics> currentMetrics) {
            this.currentMetrics = currentMetrics;
            return this;
        }

        /**
         * The maximum number of instances in the service.
         */
        public Builder maxReplica(Integer maxReplica) {
            this.maxReplica = maxReplica;
            return this;
        }

        /**
         * The minimum number of instances in the service.
         */
        public Builder minReplica(Integer minReplica) {
            this.minReplica = minReplica;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The auto scaling policies.
         */
        public Builder scaleStrategies(java.util.List < ScaleStrategies> scaleStrategies) {
            this.scaleStrategies = scaleStrategies;
            return this;
        }

        /**
         * The service name.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public DescribeServiceAutoScalerResponseBody build() {
            return new DescribeServiceAutoScalerResponseBody(this);
        } 

    } 

    public static class CurrentMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("service")
        private String service;

        @com.aliyun.core.annotation.NameInMap("value")
        private Float value;

        private CurrentMetrics(Builder builder) {
            this.metricName = builder.metricName;
            this.service = builder.service;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentMetrics create() {
            return builder().build();
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String metricName; 
            private String service; 
            private Float value; 

            /**
             * The metric name. Valid values:
             * <p>
             * 
             * *   QPS
             * *   CPU
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The service for which the metric is specified.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * The metric value.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public CurrentMetrics build() {
                return new CurrentMetrics(this);
            } 

        } 

    }
    public static class ScaleStrategies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("service")
        private String service;

        @com.aliyun.core.annotation.NameInMap("threshold")
        private Float threshold;

        private ScaleStrategies(Builder builder) {
            this.metricName = builder.metricName;
            this.service = builder.service;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleStrategies create() {
            return builder().build();
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String metricName; 
            private String service; 
            private Float threshold; 

            /**
             * The metric name. Valid values:
             * <p>
             * 
             * *   QPS: the queries per second (QPS) for an individual instance.
             * *   CPU: the CPU utilization.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The service for which the metric is specified. If you do not set this parameter, the current service is specified by default.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * The threshold of the metric that triggers auto scaling.
             * <p>
             * 
             * *   If you set metricName to QPS, scale-out is triggered when the average QPS for a single instance is greater than this threshold.
             * *   If you set metricName to CPU, scale-out is triggered when the average CPU utilization for a single instance is greater than this threshold.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            public ScaleStrategies build() {
                return new ScaleStrategies(this);
            } 

        } 

    }
}
