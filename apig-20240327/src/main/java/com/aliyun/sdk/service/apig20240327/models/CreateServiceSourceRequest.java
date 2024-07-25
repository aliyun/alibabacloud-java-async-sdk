// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceSourceRequest</p>
 */
public class CreateServiceSourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("k8sServiceSourceConfig")
    private K8sServiceSourceConfig k8sServiceSourceConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nacosServiceSourceConfig")
    private NacosServiceSourceConfig nacosServiceSourceConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateServiceSourceRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.k8sServiceSourceConfig = builder.k8sServiceSourceConfig;
        this.nacosServiceSourceConfig = builder.nacosServiceSourceConfig;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceSourceRequest create() {
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
     * @return k8sServiceSourceConfig
     */
    public K8sServiceSourceConfig getK8sServiceSourceConfig() {
        return this.k8sServiceSourceConfig;
    }

    /**
     * @return nacosServiceSourceConfig
     */
    public NacosServiceSourceConfig getNacosServiceSourceConfig() {
        return this.nacosServiceSourceConfig;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateServiceSourceRequest, Builder> {
        private String gatewayId; 
        private K8sServiceSourceConfig k8sServiceSourceConfig; 
        private NacosServiceSourceConfig nacosServiceSourceConfig; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceSourceRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.k8sServiceSourceConfig = request.k8sServiceSourceConfig;
            this.nacosServiceSourceConfig = request.nacosServiceSourceConfig;
            this.type = request.type;
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
         * k8sServiceSourceConfig.
         */
        public Builder k8sServiceSourceConfig(K8sServiceSourceConfig k8sServiceSourceConfig) {
            this.putBodyParameter("k8sServiceSourceConfig", k8sServiceSourceConfig);
            this.k8sServiceSourceConfig = k8sServiceSourceConfig;
            return this;
        }

        /**
         * nacosServiceSourceConfig.
         */
        public Builder nacosServiceSourceConfig(NacosServiceSourceConfig nacosServiceSourceConfig) {
            this.putBodyParameter("nacosServiceSourceConfig", nacosServiceSourceConfig);
            this.nacosServiceSourceConfig = nacosServiceSourceConfig;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateServiceSourceRequest build() {
            return new CreateServiceSourceRequest(this);
        } 

    } 

    public static class AuthorizeSecurityGroupRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("portRanges")
        private java.util.List < String > portRanges;

        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        private AuthorizeSecurityGroupRules(Builder builder) {
            this.description = builder.description;
            this.portRanges = builder.portRanges;
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizeSecurityGroupRules create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return portRanges
         */
        public java.util.List < String > getPortRanges() {
            return this.portRanges;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private String description; 
            private java.util.List < String > portRanges; 
            private String securityGroupId; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * portRanges.
             */
            public Builder portRanges(java.util.List < String > portRanges) {
                this.portRanges = portRanges;
                return this;
            }

            /**
             * securityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public AuthorizeSecurityGroupRules build() {
                return new AuthorizeSecurityGroupRules(this);
            } 

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
        @com.aliyun.core.annotation.NameInMap("authorizeSecurityGroupRules")
        private java.util.List < AuthorizeSecurityGroupRules> authorizeSecurityGroupRules;

        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ingressConfig")
        private IngressConfig ingressConfig;

        private K8sServiceSourceConfig(Builder builder) {
            this.authorizeSecurityGroupRules = builder.authorizeSecurityGroupRules;
            this.clusterId = builder.clusterId;
            this.ingressConfig = builder.ingressConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static K8sServiceSourceConfig create() {
            return builder().build();
        }

        /**
         * @return authorizeSecurityGroupRules
         */
        public java.util.List < AuthorizeSecurityGroupRules> getAuthorizeSecurityGroupRules() {
            return this.authorizeSecurityGroupRules;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return ingressConfig
         */
        public IngressConfig getIngressConfig() {
            return this.ingressConfig;
        }

        public static final class Builder {
            private java.util.List < AuthorizeSecurityGroupRules> authorizeSecurityGroupRules; 
            private String clusterId; 
            private IngressConfig ingressConfig; 

            /**
             * authorizeSecurityGroupRules.
             */
            public Builder authorizeSecurityGroupRules(java.util.List < AuthorizeSecurityGroupRules> authorizeSecurityGroupRules) {
                this.authorizeSecurityGroupRules = authorizeSecurityGroupRules;
                return this;
            }

            /**
             * clusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

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
    public static class NacosServiceSourceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        private NacosServiceSourceConfig(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NacosServiceSourceConfig create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceId; 

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public NacosServiceSourceConfig build() {
                return new NacosServiceSourceConfig(this);
            } 

        } 

    }
}
