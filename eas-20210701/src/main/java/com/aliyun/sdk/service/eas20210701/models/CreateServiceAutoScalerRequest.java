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
            this.max = request.max;
            this.min = request.min;
            this.scaleStrategies = request.scaleStrategies;
        } 

        /**
         * 服务所在区域
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 服务名字
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
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
        public CreateServiceAutoScalerRequest build() {
            return new CreateServiceAutoScalerRequest(this);
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
