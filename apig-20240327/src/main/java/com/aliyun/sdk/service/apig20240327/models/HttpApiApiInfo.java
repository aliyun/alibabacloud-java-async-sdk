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
 * {@link HttpApiApiInfo} extends {@link TeaModel}
 *
 * <p>HttpApiApiInfo</p>
 */
public class HttpApiApiInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentProtocols")
    private java.util.List<String> agentProtocols;

    @com.aliyun.core.annotation.NameInMap("aiProtocols")
    private java.util.List<String> aiProtocols;

    @com.aliyun.core.annotation.NameInMap("authConfig")
    private AuthConfig authConfig;

    @com.aliyun.core.annotation.NameInMap("basePath")
    private String basePath;

    @com.aliyun.core.annotation.NameInMap("deployCntMap")
    private java.util.Map<String, HttpApiApiInfoDeployCntMapValue> deployCntMap;

    @com.aliyun.core.annotation.NameInMap("deployConfigs")
    private java.util.List<HttpApiDeployConfig> deployConfigs;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enableAuth")
    private Boolean enableAuth;

    @com.aliyun.core.annotation.NameInMap("environments")
    private java.util.List<Environments> environments;

    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.NameInMap("ingressInfo")
    private IngressInfo ingressInfo;

    @com.aliyun.core.annotation.NameInMap("modelCategory")
    private String modelCategory;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("protocols")
    private java.util.List<String> protocols;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("versionInfo")
    private HttpApiVersionInfo versionInfo;

    private HttpApiApiInfo(Builder builder) {
        this.agentProtocols = builder.agentProtocols;
        this.aiProtocols = builder.aiProtocols;
        this.authConfig = builder.authConfig;
        this.basePath = builder.basePath;
        this.deployCntMap = builder.deployCntMap;
        this.deployConfigs = builder.deployConfigs;
        this.description = builder.description;
        this.enableAuth = builder.enableAuth;
        this.environments = builder.environments;
        this.gatewayId = builder.gatewayId;
        this.httpApiId = builder.httpApiId;
        this.ingressInfo = builder.ingressInfo;
        this.modelCategory = builder.modelCategory;
        this.name = builder.name;
        this.protocols = builder.protocols;
        this.resourceGroupId = builder.resourceGroupId;
        this.type = builder.type;
        this.versionInfo = builder.versionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiApiInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentProtocols
     */
    public java.util.List<String> getAgentProtocols() {
        return this.agentProtocols;
    }

    /**
     * @return aiProtocols
     */
    public java.util.List<String> getAiProtocols() {
        return this.aiProtocols;
    }

    /**
     * @return authConfig
     */
    public AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return basePath
     */
    public String getBasePath() {
        return this.basePath;
    }

    /**
     * @return deployCntMap
     */
    public java.util.Map<String, HttpApiApiInfoDeployCntMapValue> getDeployCntMap() {
        return this.deployCntMap;
    }

    /**
     * @return deployConfigs
     */
    public java.util.List<HttpApiDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableAuth
     */
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    /**
     * @return environments
     */
    public java.util.List<Environments> getEnvironments() {
        return this.environments;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return ingressInfo
     */
    public IngressInfo getIngressInfo() {
        return this.ingressInfo;
    }

    /**
     * @return modelCategory
     */
    public String getModelCategory() {
        return this.modelCategory;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return protocols
     */
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return versionInfo
     */
    public HttpApiVersionInfo getVersionInfo() {
        return this.versionInfo;
    }

    public static final class Builder {
        private java.util.List<String> agentProtocols; 
        private java.util.List<String> aiProtocols; 
        private AuthConfig authConfig; 
        private String basePath; 
        private java.util.Map<String, HttpApiApiInfoDeployCntMapValue> deployCntMap; 
        private java.util.List<HttpApiDeployConfig> deployConfigs; 
        private String description; 
        private Boolean enableAuth; 
        private java.util.List<Environments> environments; 
        private String gatewayId; 
        private String httpApiId; 
        private IngressInfo ingressInfo; 
        private String modelCategory; 
        private String name; 
        private java.util.List<String> protocols; 
        private String resourceGroupId; 
        private String type; 
        private HttpApiVersionInfo versionInfo; 

        private Builder() {
        } 

        private Builder(HttpApiApiInfo model) {
            this.agentProtocols = model.agentProtocols;
            this.aiProtocols = model.aiProtocols;
            this.authConfig = model.authConfig;
            this.basePath = model.basePath;
            this.deployCntMap = model.deployCntMap;
            this.deployConfigs = model.deployConfigs;
            this.description = model.description;
            this.enableAuth = model.enableAuth;
            this.environments = model.environments;
            this.gatewayId = model.gatewayId;
            this.httpApiId = model.httpApiId;
            this.ingressInfo = model.ingressInfo;
            this.modelCategory = model.modelCategory;
            this.name = model.name;
            this.protocols = model.protocols;
            this.resourceGroupId = model.resourceGroupId;
            this.type = model.type;
            this.versionInfo = model.versionInfo;
        } 

        /**
         * <p>The list of agent protocols.</p>
         */
        public Builder agentProtocols(java.util.List<String> agentProtocols) {
            this.agentProtocols = agentProtocols;
            return this;
        }

        /**
         * <p>The list of AI protocols.</p>
         */
        public Builder aiProtocols(java.util.List<String> aiProtocols) {
            this.aiProtocols = aiProtocols;
            return this;
        }

        /**
         * <p>The authentication configuration.</p>
         */
        public Builder authConfig(AuthConfig authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * <p>The API base path.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1</p>
         */
        public Builder basePath(String basePath) {
            this.basePath = basePath;
            return this;
        }

        /**
         * <p>The API operation deployment status.</p>
         */
        public Builder deployCntMap(java.util.Map<String, HttpApiApiInfoDeployCntMapValue> deployCntMap) {
            this.deployCntMap = deployCntMap;
            return this;
        }

        /**
         * <p>The list of API deployment configurations.</p>
         */
        public Builder deployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
            this.deployConfigs = deployConfigs;
            return this;
        }

        /**
         * <p>The API description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test API</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * enableAuth.
         */
        public Builder enableAuth(Boolean enableAuth) {
            this.enableAuth = enableAuth;
            return this;
        }

        /**
         * <p>The publish environment context of the API.</p>
         */
        public Builder environments(java.util.List<Environments> environments) {
            this.environments = environments;
            return this;
        }

        /**
         * <p>The ID of the gateway instance to which the API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cpv4sqdl****</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>HTTP API ID。</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * <p>The HTTP Ingress API information.</p>
         */
        public Builder ingressInfo(IngressInfo ingressInfo) {
            this.ingressInfo = ingressInfo;
            return this;
        }

        /**
         * <p>The model category.</p>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        public Builder modelCategory(String modelCategory) {
            this.modelCategory = modelCategory;
            return this;
        }

        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The list of API protocols.</p>
         */
        public Builder protocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The API type.</p>
         * 
         * <strong>example:</strong>
         * <p>Rest</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The API version control information.</p>
         */
        public Builder versionInfo(HttpApiVersionInfo versionInfo) {
            this.versionInfo = versionInfo;
            return this;
        }

        public HttpApiApiInfo build() {
            return new HttpApiApiInfo(this);
        } 

    } 

    /**
     * 
     * {@link HttpApiApiInfo} extends {@link TeaModel}
     *
     * <p>HttpApiApiInfo</p>
     */
    public static class GatewayInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayEdition")
        private String gatewayEdition;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private GatewayInfo(Builder builder) {
            this.gatewayEdition = builder.gatewayEdition;
            this.gatewayId = builder.gatewayId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayInfo create() {
            return builder().build();
        }

        /**
         * @return gatewayEdition
         */
        public String getGatewayEdition() {
            return this.gatewayEdition;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String gatewayEdition; 
            private String gatewayId; 
            private String name; 

            private Builder() {
            } 

            private Builder(GatewayInfo model) {
                this.gatewayEdition = model.gatewayEdition;
                this.gatewayId = model.gatewayId;
                this.name = model.name;
            } 

            /**
             * gatewayEdition.
             */
            public Builder gatewayEdition(String gatewayEdition) {
                this.gatewayEdition = gatewayEdition;
                return this;
            }

            /**
             * <p>The gateway instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-xxx</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The gateway instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public GatewayInfo build() {
                return new GatewayInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiApiInfo} extends {@link TeaModel}
     *
     * <p>HttpApiApiInfo</p>
     */
    public static class ServiceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayServiceId")
        private String gatewayServiceId;

        @com.aliyun.core.annotation.NameInMap("match")
        private HttpApiBackendMatchConditions match;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private ServiceConfigs(Builder builder) {
            this.gatewayServiceId = builder.gatewayServiceId;
            this.match = builder.match;
            this.name = builder.name;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.serviceId = builder.serviceId;
            this.version = builder.version;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceConfigs create() {
            return builder().build();
        }

        /**
         * @return gatewayServiceId
         */
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        /**
         * @return match
         */
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String gatewayServiceId; 
            private HttpApiBackendMatchConditions match; 
            private String name; 
            private String port; 
            private String protocol; 
            private String serviceId; 
            private String version; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(ServiceConfigs model) {
                this.gatewayServiceId = model.gatewayServiceId;
                this.match = model.match;
                this.name = model.name;
                this.port = model.port;
                this.protocol = model.protocol;
                this.serviceId = model.serviceId;
                this.version = model.version;
                this.weight = model.weight;
            } 

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gs-xxx</p>
             */
            public Builder gatewayServiceId(String gatewayServiceId) {
                this.gatewayServiceId = gatewayServiceId;
                return this;
            }

            /**
             * <p>The match condition.</p>
             */
            public Builder match(HttpApiBackendMatchConditions match) {
                this.match = match;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-service</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The service port.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>svc-xxx</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The service version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The weight.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public ServiceConfigs build() {
                return new ServiceConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiApiInfo} extends {@link TeaModel}
     *
     * <p>HttpApiApiInfo</p>
     */
    public static class SubDomains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("networkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private SubDomains(Builder builder) {
            this.domainId = builder.domainId;
            this.name = builder.name;
            this.networkType = builder.networkType;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDomains create() {
            return builder().build();
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String domainId; 
            private String name; 
            private String networkType; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(SubDomains model) {
                this.domainId = model.domainId;
                this.name = model.name;
                this.networkType = model.networkType;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The domain name ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d-xxx</p>
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The network type.</p>
             * 
             * <strong>example:</strong>
             * <p>Internet</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The access protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public SubDomains build() {
                return new SubDomains(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiApiInfo} extends {@link TeaModel}
     *
     * <p>HttpApiApiInfo</p>
     */
    public static class Environments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("backendScene")
        private String backendScene;

        @com.aliyun.core.annotation.NameInMap("backendType")
        private String backendType;

        @com.aliyun.core.annotation.NameInMap("customDomains")
        private java.util.List<HttpApiDomainInfo> customDomains;

        @com.aliyun.core.annotation.NameInMap("deployStatus")
        private String deployStatus;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("gatewayInfo")
        private GatewayInfo gatewayInfo;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("serviceConfigs")
        private java.util.List<ServiceConfigs> serviceConfigs;

        @com.aliyun.core.annotation.NameInMap("subDomains")
        private java.util.List<SubDomains> subDomains;

        private Environments(Builder builder) {
            this.alias = builder.alias;
            this.backendScene = builder.backendScene;
            this.backendType = builder.backendType;
            this.customDomains = builder.customDomains;
            this.deployStatus = builder.deployStatus;
            this.environmentId = builder.environmentId;
            this.gatewayInfo = builder.gatewayInfo;
            this.name = builder.name;
            this.serviceConfigs = builder.serviceConfigs;
            this.subDomains = builder.subDomains;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Environments create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return backendScene
         */
        public String getBackendScene() {
            return this.backendScene;
        }

        /**
         * @return backendType
         */
        public String getBackendType() {
            return this.backendType;
        }

        /**
         * @return customDomains
         */
        public java.util.List<HttpApiDomainInfo> getCustomDomains() {
            return this.customDomains;
        }

        /**
         * @return deployStatus
         */
        public String getDeployStatus() {
            return this.deployStatus;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return gatewayInfo
         */
        public GatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return serviceConfigs
         */
        public java.util.List<ServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

        /**
         * @return subDomains
         */
        public java.util.List<SubDomains> getSubDomains() {
            return this.subDomains;
        }

        public static final class Builder {
            private String alias; 
            private String backendScene; 
            private String backendType; 
            private java.util.List<HttpApiDomainInfo> customDomains; 
            private String deployStatus; 
            private String environmentId; 
            private GatewayInfo gatewayInfo; 
            private String name; 
            private java.util.List<ServiceConfigs> serviceConfigs; 
            private java.util.List<SubDomains> subDomains; 

            private Builder() {
            } 

            private Builder(Environments model) {
                this.alias = model.alias;
                this.backendScene = model.backendScene;
                this.backendType = model.backendType;
                this.customDomains = model.customDomains;
                this.deployStatus = model.deployStatus;
                this.environmentId = model.environmentId;
                this.gatewayInfo = model.gatewayInfo;
                this.name = model.name;
                this.serviceConfigs = model.serviceConfigs;
                this.subDomains = model.subDomains;
            } 

            /**
             * <p>The environment alias.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The deployment scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>SingleService</p>
             */
            public Builder backendScene(String backendScene) {
                this.backendScene = backendScene;
                return this;
            }

            /**
             * <p>The backend type.</p>
             * 
             * <strong>example:</strong>
             * <p>Service</p>
             */
            public Builder backendType(String backendType) {
                this.backendType = backendType;
                return this;
            }

            /**
             * <p>The domain name information published by the user.</p>
             */
            public Builder customDomains(java.util.List<HttpApiDomainInfo> customDomains) {
                this.customDomains = customDomains;
                return this;
            }

            /**
             * <p>The deployment status of the API in the current environment.</p>
             * 
             * <strong>example:</strong>
             * <p>Deployed</p>
             */
            public Builder deployStatus(String deployStatus) {
                this.deployStatus = deployStatus;
                return this;
            }

            /**
             * <p>The environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>env-xxx</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>The gateway instance information for the current environment.</p>
             */
            public Builder gatewayInfo(GatewayInfo gatewayInfo) {
                this.gatewayInfo = gatewayInfo;
                return this;
            }

            /**
             * <p>The environment name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The existing service configurations.</p>
             */
            public Builder serviceConfigs(java.util.List<ServiceConfigs> serviceConfigs) {
                this.serviceConfigs = serviceConfigs;
                return this;
            }

            /**
             * <p>The list of default domain names for the environment.</p>
             */
            public Builder subDomains(java.util.List<SubDomains> subDomains) {
                this.subDomains = subDomains;
                return this;
            }

            public Environments build() {
                return new Environments(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiApiInfo} extends {@link TeaModel}
     *
     * <p>HttpApiApiInfo</p>
     */
    public static class EnvironmentInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        private EnvironmentInfo(Builder builder) {
            this.environmentId = builder.environmentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentInfo create() {
            return builder().build();
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public static final class Builder {
            private String environmentId; 

            private Builder() {
            } 

            private Builder(EnvironmentInfo model) {
                this.environmentId = model.environmentId;
            } 

            /**
             * <p>The environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>env-xxx</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            public EnvironmentInfo build() {
                return new EnvironmentInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiApiInfo} extends {@link TeaModel}
     *
     * <p>HttpApiApiInfo</p>
     */
    public static class K8sClusterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        private K8sClusterInfo(Builder builder) {
            this.clusterId = builder.clusterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static K8sClusterInfo create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        public static final class Builder {
            private String clusterId; 

            private Builder() {
            } 

            private Builder(K8sClusterInfo model) {
                this.clusterId = model.clusterId;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ca435c77cba1547cca9311957bcxxxxxx</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            public K8sClusterInfo build() {
                return new K8sClusterInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiApiInfo} extends {@link TeaModel}
     *
     * <p>HttpApiApiInfo</p>
     */
    public static class IngressInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("environmentInfo")
        private EnvironmentInfo environmentInfo;

        @com.aliyun.core.annotation.NameInMap("ingressClass")
        private String ingressClass;

        @com.aliyun.core.annotation.NameInMap("k8sClusterInfo")
        private K8sClusterInfo k8sClusterInfo;

        @com.aliyun.core.annotation.NameInMap("overrideIngressIp")
        private Boolean overrideIngressIp;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("watchNamespace")
        private String watchNamespace;

        private IngressInfo(Builder builder) {
            this.environmentInfo = builder.environmentInfo;
            this.ingressClass = builder.ingressClass;
            this.k8sClusterInfo = builder.k8sClusterInfo;
            this.overrideIngressIp = builder.overrideIngressIp;
            this.sourceId = builder.sourceId;
            this.watchNamespace = builder.watchNamespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressInfo create() {
            return builder().build();
        }

        /**
         * @return environmentInfo
         */
        public EnvironmentInfo getEnvironmentInfo() {
            return this.environmentInfo;
        }

        /**
         * @return ingressClass
         */
        public String getIngressClass() {
            return this.ingressClass;
        }

        /**
         * @return k8sClusterInfo
         */
        public K8sClusterInfo getK8sClusterInfo() {
            return this.k8sClusterInfo;
        }

        /**
         * @return overrideIngressIp
         */
        public Boolean getOverrideIngressIp() {
            return this.overrideIngressIp;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return watchNamespace
         */
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

        public static final class Builder {
            private EnvironmentInfo environmentInfo; 
            private String ingressClass; 
            private K8sClusterInfo k8sClusterInfo; 
            private Boolean overrideIngressIp; 
            private String sourceId; 
            private String watchNamespace; 

            private Builder() {
            } 

            private Builder(IngressInfo model) {
                this.environmentInfo = model.environmentInfo;
                this.ingressClass = model.ingressClass;
                this.k8sClusterInfo = model.k8sClusterInfo;
                this.overrideIngressIp = model.overrideIngressIp;
                this.sourceId = model.sourceId;
                this.watchNamespace = model.watchNamespace;
            } 

            /**
             * <p>The environment context.</p>
             */
            public Builder environmentInfo(EnvironmentInfo environmentInfo) {
                this.environmentInfo = environmentInfo;
                return this;
            }

            /**
             * <p>The monitored Ingress Class.</p>
             * 
             * <strong>example:</strong>
             * <p>mse</p>
             */
            public Builder ingressClass(String ingressClass) {
                this.ingressClass = ingressClass;
                return this;
            }

            /**
             * <p>The Kubernetes cluster information.</p>
             */
            public Builder k8sClusterInfo(K8sClusterInfo k8sClusterInfo) {
                this.k8sClusterInfo = k8sClusterInfo;
                return this;
            }

            /**
             * <p>Specifies whether to update the address in Ingress Status.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder overrideIngressIp(Boolean overrideIngressIp) {
                this.overrideIngressIp = overrideIngressIp;
                return this;
            }

            /**
             * <p>The source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>src-xxx</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The monitored namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder watchNamespace(String watchNamespace) {
                this.watchNamespace = watchNamespace;
                return this;
            }

            public IngressInfo build() {
                return new IngressInfo(this);
            } 

        } 

    }
}
