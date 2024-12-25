// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeServiceAutoScalerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceAutoScalerResponseBody</p>
 */
public class DescribeServiceAutoScalerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Behavior")
    private java.util.Map<String, ?> behavior;

    @com.aliyun.core.annotation.NameInMap("CurrentMetrics")
    private java.util.List<CurrentMetrics> currentMetrics;

    @com.aliyun.core.annotation.NameInMap("MaxReplica")
    private Integer maxReplica;

    @com.aliyun.core.annotation.NameInMap("MinReplica")
    private Integer minReplica;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScaleStrategies")
    private java.util.List<ScaleStrategies> scaleStrategies;

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
    public java.util.Map<String, ?> getBehavior() {
        return this.behavior;
    }

    /**
     * @return currentMetrics
     */
    public java.util.List<CurrentMetrics> getCurrentMetrics() {
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
    public java.util.List<ScaleStrategies> getScaleStrategies() {
        return this.scaleStrategies;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder {
        private java.util.Map<String, ?> behavior; 
        private java.util.List<CurrentMetrics> currentMetrics; 
        private Integer maxReplica; 
        private Integer minReplica; 
        private String requestId; 
        private java.util.List<ScaleStrategies> scaleStrategies; 
        private String serviceName; 

        /**
         * <p>The additional information about the Autoscaler policy, such as the interval of triggering Autoscaler.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;behavior&quot;: {
         *     &quot;scaleDown&quot;: {
         *       &quot;stabilizationWindowSeconds&quot;: 150
         *     }
         *   }
         * }</p>
         */
        public Builder behavior(java.util.Map<String, ?> behavior) {
            this.behavior = behavior;
            return this;
        }

        /**
         * <p>The metrics.</p>
         */
        public Builder currentMetrics(java.util.List<CurrentMetrics> currentMetrics) {
            this.currentMetrics = currentMetrics;
            return this;
        }

        /**
         * <p>The maximum number of instances in the service.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder maxReplica(Integer maxReplica) {
            this.maxReplica = maxReplica;
            return this;
        }

        /**
         * <p>The minimum number of instances in the service.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder minReplica(Integer minReplica) {
            this.minReplica = minReplica;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The auto scaling policies.</p>
         */
        public Builder scaleStrategies(java.util.List<ScaleStrategies> scaleStrategies) {
            this.scaleStrategies = scaleStrategies;
            return this;
        }

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public DescribeServiceAutoScalerResponseBody build() {
            return new DescribeServiceAutoScalerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceAutoScalerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceAutoScalerResponseBody</p>
     */
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
             * <p>The metric name. Valid values:</p>
             * <ul>
             * <li>QPS</li>
             * <li>CPU</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>qps</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The service for which the metric is specified.</p>
             * 
             * <strong>example:</strong>
             * <p>demo_svc</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * <p>The metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link DescribeServiceAutoScalerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceAutoScalerResponseBody</p>
     */
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
             * <p>The metric name. Valid values:</p>
             * <ul>
             * <li>QPS: the queries per second (QPS) for an individual instance.</li>
             * <li>CPU: the CPU utilization.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>QPS</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The service for which the metric is specified. If you do not set this parameter, the current service is specified by default.</p>
             * 
             * <strong>example:</strong>
             * <p>demo_svc</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * <p>The threshold of the metric that triggers auto scaling.</p>
             * <ul>
             * <li>If you set metricName to QPS, scale-out is triggered when the average QPS for a single instance is greater than this threshold.</li>
             * <li>If you set metricName to CPU, scale-out is triggered when the average CPU utilization for a single instance is greater than this threshold.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
