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
    @NameInMap("Max")
    @Validation(required = true)
    private Integer max;

    @Body
    @NameInMap("Min")
    @Validation(required = true)
    private Integer min;

    @Body
    @NameInMap("Strategies")
    @Validation(required = true)
    private Strategies strategies;

    private UpdateServiceAutoScalerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.max = builder.max;
        this.min = builder.min;
        this.strategies = builder.strategies;
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
     * @return strategies
     */
    public Strategies getStrategies() {
        return this.strategies;
    }

    public static final class Builder extends Request.Builder<UpdateServiceAutoScalerRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private Integer max; 
        private Integer min; 
        private Strategies strategies; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceAutoScalerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.max = request.max;
            this.min = request.min;
            this.strategies = request.strategies;
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
         * ?????? replica ??????????????????MinReplica
         */
        public Builder max(Integer max) {
            this.putBodyParameter("Max", max);
            this.max = max;
            return this;
        }

        /**
         * ?????? replica ??????????????????0
         */
        public Builder min(Integer min) {
            this.putBodyParameter("Min", min);
            this.min = min;
            return this;
        }

        /**
         * map ?????????????????????
         */
        public Builder strategies(Strategies strategies) {
            this.putBodyParameter("Strategies", strategies);
            this.strategies = strategies;
            return this;
        }

        @Override
        public UpdateServiceAutoScalerRequest build() {
            return new UpdateServiceAutoScalerRequest(this);
        } 

    } 

    public static class Strategies extends TeaModel {
        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("Qps")
        private Float qps;

        private Strategies(Builder builder) {
            this.cpu = builder.cpu;
            this.qps = builder.qps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategies create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return qps
         */
        public Float getQps() {
            return this.qps;
        }

        public static final class Builder {
            private Float cpu; 
            private Float qps; 

            /**
             * ?????? replica ??????????????????MinReplica
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * ???????????????????????????qps?????????????????????
             */
            public Builder qps(Float qps) {
                this.qps = qps;
                return this;
            }

            public Strategies build() {
                return new Strategies(this);
            } 

        } 

    }
}
