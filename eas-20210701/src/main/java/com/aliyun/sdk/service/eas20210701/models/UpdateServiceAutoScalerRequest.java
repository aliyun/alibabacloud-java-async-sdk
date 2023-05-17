// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceAutoScalerRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceAutoScalerRequest</p>
 */
public class UpdateServiceAutoScalerRequest extends Request {
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

    private UpdateServiceAutoScalerRequest(Builder builder) {
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

    public static UpdateServiceAutoScalerRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateServiceAutoScalerRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private Behavior behavior; 
        private Integer max; 
        private Integer min; 
        private java.util.List < ScaleStrategies> scaleStrategies; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceAutoScalerRequest request) {
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
         * behavior.
         */
        public Builder behavior(Behavior behavior) {
            this.putBodyParameter("behavior", behavior);
            this.behavior = behavior;
            return this;
        }

        /**
         * 最大 replica 数，需要大于MinReplica
         */
        public Builder max(Integer max) {
            this.putBodyParameter("max", max);
            this.max = max;
            return this;
        }

        /**
         * 最小 replica 数，需要大于0
         */
        public Builder min(Integer min) {
            this.putBodyParameter("min", min);
            this.min = min;
            return this;
        }

        /**
         * scaleStrategies.
         */
        public Builder scaleStrategies(java.util.List < ScaleStrategies> scaleStrategies) {
            this.putBodyParameter("scaleStrategies", scaleStrategies);
            this.scaleStrategies = scaleStrategies;
            return this;
        }

        @Override
        public UpdateServiceAutoScalerRequest build() {
            return new UpdateServiceAutoScalerRequest(this);
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
             * scaleDownGracePeriodSeconds.
             */
            public Builder scaleDownGracePeriodSeconds(Integer scaleDownGracePeriodSeconds) {
                this.scaleDownGracePeriodSeconds = scaleDownGracePeriodSeconds;
                return this;
            }

            /**
             * scaleUpActivationReplicas.
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
             * stabilizationWindowSeconds.
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
             * stabilizationWindowSeconds.
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
             * onZero.
             */
            public Builder onZero(OnZero onZero) {
                this.onZero = onZero;
                return this;
            }

            /**
             * scaleDown.
             */
            public Builder scaleDown(ScaleDown scaleDown) {
                this.scaleDown = scaleDown;
                return this;
            }

            /**
             * scaleUp.
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
