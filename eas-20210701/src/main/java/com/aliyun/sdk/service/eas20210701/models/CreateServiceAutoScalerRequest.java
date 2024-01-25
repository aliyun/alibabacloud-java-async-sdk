// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceAutoScalerRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceAutoScalerRequest</p>
 */
public class CreateServiceAutoScalerRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Body
    @NameInMap("behavior")
    private Behavior behavior;

    @Body
    @NameInMap("max")
    @Validation(required = true)
    private Integer max;

    @Body
    @NameInMap("min")
    @Validation(required = true)
    private Integer min;

    @Body
    @NameInMap("scaleStrategies")
    @Validation(required = true)
    private java.util.List < ScaleStrategies> scaleStrategies;

    private CreateServiceAutoScalerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.behavior = builder.behavior;
        this.max = builder.max;
        this.min = builder.min;
        this.scaleStrategies = builder.scaleStrategies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceAutoScalerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return behavior
     */
    public Behavior getBehavior() {
        return this.behavior;
    }

    /**
     * @return max
     */
    public Integer getMax() {
        return this.max;
    }

    /**
     * @return min
     */
    public Integer getMin() {
        return this.min;
    }

    /**
     * @return scaleStrategies
     */
    public java.util.List < ScaleStrategies> getScaleStrategies() {
        return this.scaleStrategies;
    }

    public static final class Builder extends Request.Builder<CreateServiceAutoScalerRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private Behavior behavior; 
        private Integer max; 
        private Integer min; 
        private java.util.List < ScaleStrategies> scaleStrategies; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceAutoScalerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.behavior = request.behavior;
            this.max = request.max;
            this.min = request.min;
            this.scaleStrategies = request.scaleStrategies;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The Autoscaler operation.
         */
        public Builder behavior(Behavior behavior) {
            this.putBodyParameter("behavior", behavior);
            this.behavior = behavior;
            return this;
        }

        /**
         * The maximum number of instances. The value must be greater than that of the min parameter.
         */
        public Builder max(Integer max) {
            this.putBodyParameter("max", max);
            this.max = max;
            return this;
        }

        /**
         * The minimum number of instances. The value must be greater than 0.
         */
        public Builder min(Integer min) {
            this.putBodyParameter("min", min);
            this.min = min;
            return this;
        }

        /**
         * The Autoscaler strategies.
         */
        public Builder scaleStrategies(java.util.List < ScaleStrategies> scaleStrategies) {
            this.putBodyParameter("scaleStrategies", scaleStrategies);
            this.scaleStrategies = scaleStrategies;
            return this;
        }

        @Override
        public CreateServiceAutoScalerRequest build() {
            return new CreateServiceAutoScalerRequest(this);
        } 

    } 

    public static class OnZero extends TeaModel {
        @NameInMap("scaleDownGracePeriodSeconds")
        private Integer scaleDownGracePeriodSeconds;

        @NameInMap("scaleUpActivationReplicas")
        private Integer scaleUpActivationReplicas;

        private OnZero(Builder builder) {
            this.scaleDownGracePeriodSeconds = builder.scaleDownGracePeriodSeconds;
            this.scaleUpActivationReplicas = builder.scaleUpActivationReplicas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnZero create() {
            return builder().build();
        }

        /**
         * @return scaleDownGracePeriodSeconds
         */
        public Integer getScaleDownGracePeriodSeconds() {
            return this.scaleDownGracePeriodSeconds;
        }

        /**
         * @return scaleUpActivationReplicas
         */
        public Integer getScaleUpActivationReplicas() {
            return this.scaleUpActivationReplicas;
        }

        public static final class Builder {
            private Integer scaleDownGracePeriodSeconds; 
            private Integer scaleUpActivationReplicas; 

            /**
             * The time window that is required before the number of instances is reduced to 0. The number of instances can be reduced to 0 only if no request is available or no traffic exists in the specified time window. Default value: 600.
             */
            public Builder scaleDownGracePeriodSeconds(Integer scaleDownGracePeriodSeconds) {
                this.scaleDownGracePeriodSeconds = scaleDownGracePeriodSeconds;
                return this;
            }

            /**
             * The number of instances that you want to create at a time if the number of instances is scaled out from 0. Default value: 1.
             */
            public Builder scaleUpActivationReplicas(Integer scaleUpActivationReplicas) {
                this.scaleUpActivationReplicas = scaleUpActivationReplicas;
                return this;
            }

            public OnZero build() {
                return new OnZero(this);
            } 

        } 

    }
    public static class ScaleDown extends TeaModel {
        @NameInMap("stabilizationWindowSeconds")
        private Integer stabilizationWindowSeconds;

        private ScaleDown(Builder builder) {
            this.stabilizationWindowSeconds = builder.stabilizationWindowSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleDown create() {
            return builder().build();
        }

        /**
         * @return stabilizationWindowSeconds
         */
        public Integer getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

        public static final class Builder {
            private Integer stabilizationWindowSeconds; 

            /**
             * The time window that is required before the scale-in operation is performed. The scale-in operation can be performed only if the specified metric drops below the specified threshold in the specified time window. Default value: 300.
             */
            public Builder stabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
                this.stabilizationWindowSeconds = stabilizationWindowSeconds;
                return this;
            }

            public ScaleDown build() {
                return new ScaleDown(this);
            } 

        } 

    }
    public static class ScaleUp extends TeaModel {
        @NameInMap("stabilizationWindowSeconds")
        private Integer stabilizationWindowSeconds;

        private ScaleUp(Builder builder) {
            this.stabilizationWindowSeconds = builder.stabilizationWindowSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleUp create() {
            return builder().build();
        }

        /**
         * @return stabilizationWindowSeconds
         */
        public Integer getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

        public static final class Builder {
            private Integer stabilizationWindowSeconds; 

            /**
             * The time window that is required before the scale-out operation is performed. The scale-out operation can be performed only if the specified metric exceeds the specified threshold in the specified time window. Default value: 0.
             */
            public Builder stabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
                this.stabilizationWindowSeconds = stabilizationWindowSeconds;
                return this;
            }

            public ScaleUp build() {
                return new ScaleUp(this);
            } 

        } 

    }
    public static class Behavior extends TeaModel {
        @NameInMap("onZero")
        private OnZero onZero;

        @NameInMap("scaleDown")
        private ScaleDown scaleDown;

        @NameInMap("scaleUp")
        private ScaleUp scaleUp;

        private Behavior(Builder builder) {
            this.onZero = builder.onZero;
            this.scaleDown = builder.scaleDown;
            this.scaleUp = builder.scaleUp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Behavior create() {
            return builder().build();
        }

        /**
         * @return onZero
         */
        public OnZero getOnZero() {
            return this.onZero;
        }

        /**
         * @return scaleDown
         */
        public ScaleDown getScaleDown() {
            return this.scaleDown;
        }

        /**
         * @return scaleUp
         */
        public ScaleUp getScaleUp() {
            return this.scaleUp;
        }

        public static final class Builder {
            private OnZero onZero; 
            private ScaleDown scaleDown; 
            private ScaleUp scaleUp; 

            /**
             * The operation that reduces the number of instances to 0.
             */
            public Builder onZero(OnZero onZero) {
                this.onZero = onZero;
                return this;
            }

            /**
             * The scale-in operation.
             */
            public Builder scaleDown(ScaleDown scaleDown) {
                this.scaleDown = scaleDown;
                return this;
            }

            /**
             * The scale-out operation.
             */
            public Builder scaleUp(ScaleUp scaleUp) {
                this.scaleUp = scaleUp;
                return this;
            }

            public Behavior build() {
                return new Behavior(this);
            } 

        } 

    }
    public static class ScaleStrategies extends TeaModel {
        @NameInMap("metricName")
        @Validation(required = true)
        private String metricName;

        @NameInMap("service")
        private String service;

        @NameInMap("threshold")
        @Validation(required = true)
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
             * The name of the metric for triggering auto scaling. Valid values:
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
