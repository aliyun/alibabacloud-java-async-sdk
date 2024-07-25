// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceSourceRequest</p>
 */
public class UpdateServiceSourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceSourceId")
    private String serviceSourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("k8sServiceSourceConfig")
    private K8sServiceSourceConfig k8sServiceSourceConfig;

    private UpdateServiceSourceRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.serviceSourceId = builder.serviceSourceId;
        this.k8sServiceSourceConfig = builder.k8sServiceSourceConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return serviceSourceId
     */
    public String getServiceSourceId() {
        return this.serviceSourceId;
    }

    /**
     * @return k8sServiceSourceConfig
     */
    public K8sServiceSourceConfig getK8sServiceSourceConfig() {
        return this.k8sServiceSourceConfig;
    }

    public static final class Builder extends Request.Builder<UpdateServiceSourceRequest, Builder> {
        private String gatewayId; 
        private String serviceSourceId; 
        private K8sServiceSourceConfig k8sServiceSourceConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceSourceRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.serviceSourceId = request.serviceSourceId;
            this.k8sServiceSourceConfig = request.k8sServiceSourceConfig;
        } 

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * serviceSourceId.
         */
        public Builder serviceSourceId(String serviceSourceId) {
            this.putPathParameter("serviceSourceId", serviceSourceId);
            this.serviceSourceId = serviceSourceId;
            return this;
        }

        /**
         * k8sServiceSourceConfig.
         */
        public Builder k8sServiceSourceConfig(K8sServiceSourceConfig k8sServiceSourceConfig) {
            this.putBodyParameter("k8sServiceSourceConfig", k8sServiceSourceConfig);
            this.k8sServiceSourceConfig = k8sServiceSourceConfig;
            return this;
        }

        @Override
        public UpdateServiceSourceRequest build() {
            return new UpdateServiceSourceRequest(this);
        } 

    } 

    public static class IngressConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("ingressClass")
        private String ingressClass;

        @com.aliyun.core.annotation.NameInMap("overrideIngressIp")
        private Boolean overrideIngressIp;

        @com.aliyun.core.annotation.NameInMap("watchNamespace")
        private String watchNamespace;

        private IngressConfig(Builder builder) {
            this.enable = builder.enable;
            this.ingressClass = builder.ingressClass;
            this.overrideIngressIp = builder.overrideIngressIp;
            this.watchNamespace = builder.watchNamespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressConfig create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return ingressClass
         */
        public String getIngressClass() {
            return this.ingressClass;
        }

        /**
         * @return overrideIngressIp
         */
        public Boolean getOverrideIngressIp() {
            return this.overrideIngressIp;
        }

        /**
         * @return watchNamespace
         */
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

        public static final class Builder {
            private Boolean enable; 
            private String ingressClass; 
            private Boolean overrideIngressIp; 
            private String watchNamespace; 

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * ingressClass.
             */
            public Builder ingressClass(String ingressClass) {
                this.ingressClass = ingressClass;
                return this;
            }

            /**
             * overrideIngressIp.
             */
            public Builder overrideIngressIp(Boolean overrideIngressIp) {
                this.overrideIngressIp = overrideIngressIp;
                return this;
            }

            /**
             * watchNamespace.
             */
            public Builder watchNamespace(String watchNamespace) {
                this.watchNamespace = watchNamespace;
                return this;
            }

            public IngressConfig build() {
                return new IngressConfig(this);
            } 

        } 

    }
    public static class K8sServiceSourceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ingressConfig")
        private IngressConfig ingressConfig;

        private K8sServiceSourceConfig(Builder builder) {
            this.ingressConfig = builder.ingressConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static K8sServiceSourceConfig create() {
            return builder().build();
        }

        /**
         * @return ingressConfig
         */
        public IngressConfig getIngressConfig() {
            return this.ingressConfig;
        }

        public static final class Builder {
            private IngressConfig ingressConfig; 

            /**
             * ingressConfig.
             */
            public Builder ingressConfig(IngressConfig ingressConfig) {
                this.ingressConfig = ingressConfig;
                return this;
            }

            public K8sServiceSourceConfig build() {
                return new K8sServiceSourceConfig(this);
            } 

        } 

    }
}
