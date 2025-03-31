// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreateServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceRequest</p>
 */
public class CreateServiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceConfigs")
    private java.util.List<ServiceConfigs> serviceConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    private CreateServiceRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceConfigs = builder.serviceConfigs;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceConfigs
     */
    public java.util.List<ServiceConfigs> getServiceConfigs() {
        return this.serviceConfigs;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<CreateServiceRequest, Builder> {
        private String gatewayId; 
        private String resourceGroupId; 
        private java.util.List<ServiceConfigs> serviceConfigs; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.resourceGroupId = request.resourceGroupId;
            this.serviceConfigs = request.serviceConfigs;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The gateway instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cq7l5s5lhtg***</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The list of service configurations.</p>
         */
        public Builder serviceConfigs(java.util.List<ServiceConfigs> serviceConfigs) {
            this.putBodyParameter("serviceConfigs", serviceConfigs);
            this.serviceConfigs = serviceConfigs;
            return this;
        }

        /**
         * <p>The service source. Valid values:</p>
         * <ul>
         * <li>MSE_NACOS: a service in an MSE Nacos instance</li>
         * <li>K8S: a service in a Kubernetes (K8s) cluster in Container Service for Kubernetes (ACK)</li>
         * <li>VIP: a fixed IP address</li>
         * <li>DNS: a Domain Name System (DNS) domain name</li>
         * <li>FC3: a service in Function Compute</li>
         * <li>SAE_K8S_SERVICE: a service in a K8s cluster in Serverless App Engine (SAE)</li>
         * </ul>
         * <p>Enumerated values:</p>
         * <ul>
         * <li>SAE_K8S_SERVICE</li>
         * <li>K8S</li>
         * <li>FC3</li>
         * <li>DNS</li>
         * <li>VIP</li>
         * <li>MSE_NACOS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MSE_NACOS</p>
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("sourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public CreateServiceRequest build() {
            return new CreateServiceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateServiceRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceRequest</p>
     */
    public static class ServiceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("addresses")
        private java.util.List<String> addresses;

        @com.aliyun.core.annotation.NameInMap("aiServiceConfig")
        private AiServiceConfig aiServiceConfig;

        @com.aliyun.core.annotation.NameInMap("dnsServers")
        private java.util.List<String> dnsServers;

        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("qualifier")
        private String qualifier;

        private ServiceConfigs(Builder builder) {
            this.addresses = builder.addresses;
            this.aiServiceConfig = builder.aiServiceConfig;
            this.dnsServers = builder.dnsServers;
            this.groupName = builder.groupName;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.qualifier = builder.qualifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceConfigs create() {
            return builder().build();
        }

        /**
         * @return addresses
         */
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        /**
         * @return aiServiceConfig
         */
        public AiServiceConfig getAiServiceConfig() {
            return this.aiServiceConfig;
        }

        /**
         * @return dnsServers
         */
        public java.util.List<String> getDnsServers() {
            return this.dnsServers;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return qualifier
         */
        public String getQualifier() {
            return this.qualifier;
        }

        public static final class Builder {
            private java.util.List<String> addresses; 
            private AiServiceConfig aiServiceConfig; 
            private java.util.List<String> dnsServers; 
            private String groupName; 
            private String name; 
            private String namespace; 
            private String qualifier; 

            private Builder() {
            } 

            private Builder(ServiceConfigs model) {
                this.addresses = model.addresses;
                this.aiServiceConfig = model.aiServiceConfig;
                this.dnsServers = model.dnsServers;
                this.groupName = model.groupName;
                this.name = model.name;
                this.namespace = model.namespace;
                this.qualifier = model.qualifier;
            } 

            /**
             * <p>The list of domain names or fixed addresses.</p>
             */
            public Builder addresses(java.util.List<String> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * <p>The AI service configurations.</p>
             */
            public Builder aiServiceConfig(AiServiceConfig aiServiceConfig) {
                this.aiServiceConfig = aiServiceConfig;
                return this;
            }

            /**
             * <p>The list of DNS service addresses.</p>
             */
            public Builder dnsServers(java.util.List<String> dnsServers) {
                this.dnsServers = dnsServers;
                return this;
            }

            /**
             * <p>The service group name. This parameter is required if sourceType is set to MSE_NACOS.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT_GROUP</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>user-service</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The service namespace. This parameter is required when sourceType is set to K8S or MSE_NACOS.</p>
             * <ul>
             * <li>If sourceType is set to K8S, this parameter specifies the namespace where the K8s service resides.</li>
             * <li>If sourceType is set to MSE_NACOS, this parameter specifies a namespace in Nacos.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The function version or alias.</p>
             * 
             * <strong>example:</strong>
             * <p>LATEST</p>
             */
            public Builder qualifier(String qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            public ServiceConfigs build() {
                return new ServiceConfigs(this);
            } 

        } 

    }
}
