// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceAutoScalerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceAutoScalerResponseBody</p>
 */
public class DescribeServiceAutoScalerResponseBody extends TeaModel {
    @NameInMap("Behavior")
    private java.util.Map < String, ? > behavior;

    @NameInMap("CurrentMetrics")
    private java.util.List < CurrentMetrics> currentMetrics;

    @NameInMap("MaxReplica")
    private Integer maxReplica;

    @NameInMap("MinReplica")
    private Integer minReplica;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScaleStrategies")
    private java.util.List < ScaleStrategies> scaleStrategies;

    @NameInMap("ServiceName")
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
         * Behavior.
         */
        public Builder behavior(java.util.Map < String, ? > behavior) {
            this.behavior = behavior;
            return this;
        }

        /**
         * CurrentMetrics.
         */
        public Builder currentMetrics(java.util.List < CurrentMetrics> currentMetrics) {
            this.currentMetrics = currentMetrics;
            return this;
        }

        /**
         * MaxReplica.
         */
        public Builder maxReplica(Integer maxReplica) {
            this.maxReplica = maxReplica;
            return this;
        }

        /**
         * MinReplica.
         */
        public Builder minReplica(Integer minReplica) {
            this.minReplica = minReplica;
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
         * ScaleStrategies.
         */
        public Builder scaleStrategies(java.util.List < ScaleStrategies> scaleStrategies) {
            this.scaleStrategies = scaleStrategies;
            return this;
        }

        /**
         * ServiceName.
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
        @NameInMap("metricName")
        private String metricName;

        @NameInMap("service")
        private String service;

        @NameInMap("value")
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
             * metricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * value.
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
        @NameInMap("metricName")
        private String metricName;

        @NameInMap("service")
        private String service;

        @NameInMap("threshold")
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
             * metricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * threshold.
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
