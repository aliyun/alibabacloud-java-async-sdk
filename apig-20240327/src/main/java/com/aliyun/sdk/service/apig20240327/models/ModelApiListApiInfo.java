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
 * {@link ModelApiListApiInfo} extends {@link TeaModel}
 *
 * <p>ModelApiListApiInfo</p>
 */
public class ModelApiListApiInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentProtocols")
    private java.util.List<String> agentProtocols;

    @com.aliyun.core.annotation.NameInMap("aiProtocols")
    private java.util.List<String> aiProtocols;

    @com.aliyun.core.annotation.NameInMap("authConfig")
    private AuthConfig authConfig;

    @com.aliyun.core.annotation.NameInMap("basePath")
    private String basePath;

    @com.aliyun.core.annotation.NameInMap("creationClientToken")
    private String creationClientToken;

    @com.aliyun.core.annotation.NameInMap("deleteStatus")
    private String deleteStatus;

    @com.aliyun.core.annotation.NameInMap("deployCntMap")
    private java.util.Map<String, ModelApiListApiInfoDeployCntMapValue> deployCntMap;

    @com.aliyun.core.annotation.NameInMap("deployConfigs")
    private java.util.List<HttpApiDeployConfig> deployConfigs;

    @com.aliyun.core.annotation.NameInMap("deployErrorMessage")
    private String deployErrorMessage;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("domainIds")
    private java.util.List<String> domainIds;

    @com.aliyun.core.annotation.NameInMap("domainInfos")
    private java.util.List<ModelApiDomainInfo> domainInfos;

    @com.aliyun.core.annotation.NameInMap("enableAuth")
    private Boolean enableAuth;

    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.NameInMap("environments")
    private java.util.List<Environments> environments;

    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("gatewayInfo")
    private GatewayInfo gatewayInfo;

    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.NameInMap("ingressInfo")
    private IngressInfo ingressInfo;

    @com.aliyun.core.annotation.NameInMap("modelApiInfo")
    private ModelApiInfo modelApiInfo;

    @com.aliyun.core.annotation.NameInMap("modelCardRuntimeDiagnostics")
    private java.util.List<ModelCardRuntimeDiagnostics> modelCardRuntimeDiagnostics;

    @com.aliyun.core.annotation.NameInMap("modelCategory")
    private String modelCategory;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("policyConfigs")
    private java.util.List<ModelApiPolicyConfig> policyConfigs;

    @com.aliyun.core.annotation.NameInMap("protocols")
    private java.util.List<String> protocols;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("versionInfo")
    private HttpApiVersionInfo versionInfo;

    private ModelApiListApiInfo(Builder builder) {
        this.agentProtocols = builder.agentProtocols;
        this.aiProtocols = builder.aiProtocols;
        this.authConfig = builder.authConfig;
        this.basePath = builder.basePath;
        this.creationClientToken = builder.creationClientToken;
        this.deleteStatus = builder.deleteStatus;
        this.deployCntMap = builder.deployCntMap;
        this.deployConfigs = builder.deployConfigs;
        this.deployErrorMessage = builder.deployErrorMessage;
        this.description = builder.description;
        this.domainIds = builder.domainIds;
        this.domainInfos = builder.domainInfos;
        this.enableAuth = builder.enableAuth;
        this.environmentId = builder.environmentId;
        this.environments = builder.environments;
        this.gatewayId = builder.gatewayId;
        this.gatewayInfo = builder.gatewayInfo;
        this.httpApiId = builder.httpApiId;
        this.ingressInfo = builder.ingressInfo;
        this.modelApiInfo = builder.modelApiInfo;
        this.modelCardRuntimeDiagnostics = builder.modelCardRuntimeDiagnostics;
        this.modelCategory = builder.modelCategory;
        this.name = builder.name;
        this.policyConfigs = builder.policyConfigs;
        this.protocols = builder.protocols;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.type = builder.type;
        this.versionInfo = builder.versionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelApiListApiInfo create() {
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
     * @return creationClientToken
     */
    public String getCreationClientToken() {
        return this.creationClientToken;
    }

    /**
     * @return deleteStatus
     */
    public String getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * @return deployCntMap
     */
    public java.util.Map<String, ModelApiListApiInfoDeployCntMapValue> getDeployCntMap() {
        return this.deployCntMap;
    }

    /**
     * @return deployConfigs
     */
    public java.util.List<HttpApiDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
    }

    /**
     * @return deployErrorMessage
     */
    public String getDeployErrorMessage() {
        return this.deployErrorMessage;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainIds
     */
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    /**
     * @return domainInfos
     */
    public java.util.List<ModelApiDomainInfo> getDomainInfos() {
        return this.domainInfos;
    }

    /**
     * @return enableAuth
     */
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
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
     * @return gatewayInfo
     */
    public GatewayInfo getGatewayInfo() {
        return this.gatewayInfo;
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
     * @return modelApiInfo
     */
    public ModelApiInfo getModelApiInfo() {
        return this.modelApiInfo;
    }

    /**
     * @return modelCardRuntimeDiagnostics
     */
    public java.util.List<ModelCardRuntimeDiagnostics> getModelCardRuntimeDiagnostics() {
        return this.modelCardRuntimeDiagnostics;
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
     * @return policyConfigs
     */
    public java.util.List<ModelApiPolicyConfig> getPolicyConfigs() {
        return this.policyConfigs;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
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
        private String creationClientToken; 
        private String deleteStatus; 
        private java.util.Map<String, ModelApiListApiInfoDeployCntMapValue> deployCntMap; 
        private java.util.List<HttpApiDeployConfig> deployConfigs; 
        private String deployErrorMessage; 
        private String description; 
        private java.util.List<String> domainIds; 
        private java.util.List<ModelApiDomainInfo> domainInfos; 
        private Boolean enableAuth; 
        private String environmentId; 
        private java.util.List<Environments> environments; 
        private String gatewayId; 
        private GatewayInfo gatewayInfo; 
        private String httpApiId; 
        private IngressInfo ingressInfo; 
        private ModelApiInfo modelApiInfo; 
        private java.util.List<ModelCardRuntimeDiagnostics> modelCardRuntimeDiagnostics; 
        private String modelCategory; 
        private String name; 
        private java.util.List<ModelApiPolicyConfig> policyConfigs; 
        private java.util.List<String> protocols; 
        private String resourceGroupId; 
        private String status; 
        private String type; 
        private HttpApiVersionInfo versionInfo; 

        private Builder() {
        } 

        private Builder(ModelApiListApiInfo model) {
            this.agentProtocols = model.agentProtocols;
            this.aiProtocols = model.aiProtocols;
            this.authConfig = model.authConfig;
            this.basePath = model.basePath;
            this.creationClientToken = model.creationClientToken;
            this.deleteStatus = model.deleteStatus;
            this.deployCntMap = model.deployCntMap;
            this.deployConfigs = model.deployConfigs;
            this.deployErrorMessage = model.deployErrorMessage;
            this.description = model.description;
            this.domainIds = model.domainIds;
            this.domainInfos = model.domainInfos;
            this.enableAuth = model.enableAuth;
            this.environmentId = model.environmentId;
            this.environments = model.environments;
            this.gatewayId = model.gatewayId;
            this.gatewayInfo = model.gatewayInfo;
            this.httpApiId = model.httpApiId;
            this.ingressInfo = model.ingressInfo;
            this.modelApiInfo = model.modelApiInfo;
            this.modelCardRuntimeDiagnostics = model.modelCardRuntimeDiagnostics;
            this.modelCategory = model.modelCategory;
            this.name = model.name;
            this.policyConfigs = model.policyConfigs;
            this.protocols = model.protocols;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
            this.type = model.type;
            this.versionInfo = model.versionInfo;
        } 

        /**
         * <p>The collection of agent protocols for the model API.</p>
         */
        public Builder agentProtocols(java.util.List<String> agentProtocols) {
            this.agentProtocols = agentProtocols;
            return this;
        }

        /**
         * <p>The API protocols created by scenario. APIs created by selecting models provide open paths through modelApiInfo.</p>
         */
        public Builder aiProtocols(java.util.List<String> aiProtocols) {
            this.aiProtocols = aiProtocols;
            return this;
        }

        /**
         * <p>The API authentication configurations created by scenario.</p>
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
         * <p>The read-only association identifier for the creation request. It is returned only within approximately 24 hours after the first persistence and when the association with the same instance is unique after normal authentication. It is omitted when the identifier is historical, expired, or ambiguous. You cannot use this identifier to determine whether publishing or authorization is successful, nor does it replace the creation idempotency record.</p>
         * 
         * <strong>example:</strong>
         * <p>b1907ca4-952c-4c5f-8d1f-0aa6ae339c96</p>
         */
        public Builder creationClientToken(String creationClientToken) {
            this.creationClientToken = creationClientToken;
            return this;
        }

        /**
         * <p>The optional read-only deletion status of the new model API. Deleting indicates that the deletion request is accepted but not completed. DeleteFailed indicates that the background deletion failed, and you can use the original clientToken to retry DeleteModelApi. This field is not returned for normal deployment and historical undeployment. The absence of this field does not indicate that the deletion is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>Deleting</p>
         */
        public Builder deleteStatus(String deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }

        /**
         * <p>The publish status of the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;example-scope&quot;:{&quot;deployedCnt&quot;:1,&quot;cnt&quot;:1}}</p>
         */
        public Builder deployCntMap(java.util.Map<String, ModelApiListApiInfoDeployCntMapValue> deployCntMap) {
            this.deployCntMap = deployCntMap;
            return this;
        }

        /**
         * <p>The API deployment configurations and associated services created by scenario, provided as read-only list information.</p>
         */
        public Builder deployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
            this.deployConfigs = deployConfigs;
            return this;
        }

        /**
         * <p>The read-only reason for deployment or deletion failure.</p>
         * 
         * <strong>example:</strong>
         * <p>The model configuration is unavailable</p>
         */
        public Builder deployErrorMessage(String deployErrorMessage) {
            this.deployErrorMessage = deployErrorMessage;
            return this;
        }

        /**
         * <p>The API description.</p>
         * 
         * <strong>example:</strong>
         * <p>Model API for business integration</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The selected domain IDs.</p>
         */
        public Builder domainIds(java.util.List<String> domainIds) {
            this.domainIds = domainIds;
            return this;
        }

        /**
         * <p>The read-only domain details and default domain flag.</p>
         */
        public Builder domainInfos(java.util.List<ModelApiDomainInfo> domainInfos) {
            this.domainInfos = domainInfos;
            return this;
        }

        /**
         * <p>Specifies whether to enable authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAuth(Boolean enableAuth) {
            this.enableAuth = enableAuth;
            return this;
        }

        /**
         * <p>The read-only default environment ID of the bound instance.</p>
         * 
         * <strong>example:</strong>
         * <p>env-d00000000000000000000</p>
         */
        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
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
         * <p>gw-d00000000000000000000</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The read-only information of the bound instance.</p>
         */
        public Builder gatewayInfo(GatewayInfo gatewayInfo) {
            this.gatewayInfo = gatewayInfo;
            return this;
        }

        /**
         * <p>The model API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * <p>The HTTP ingress API information.</p>
         */
        public Builder ingressInfo(IngressInfo ingressInfo) {
            this.ingressInfo = ingressInfo;
            return this;
        }

        /**
         * <p>The public selection information of the model API.</p>
         */
        public Builder modelApiInfo(ModelApiInfo modelApiInfo) {
            this.modelApiInfo = modelApiInfo;
            return this;
        }

        /**
         * <p>The read-only runtime diagnostics of the model card, derived from the original markers of the deployment configuration. This is used only for the readability and diagnosability of abnormal drafts.</p>
         */
        public Builder modelCardRuntimeDiagnostics(java.util.List<ModelCardRuntimeDiagnostics> modelCardRuntimeDiagnostics) {
            this.modelCardRuntimeDiagnostics = modelCardRuntimeDiagnostics;
            return this;
        }

        /**
         * <p>The model category of the model API.</p>
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
         * <p>The inline configurations for AI request logs and AI security protection.</p>
         */
        public Builder policyConfigs(java.util.List<ModelApiPolicyConfig> policyConfigs) {
            this.policyConfigs = policyConfigs;
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
         * <p>The deployment status on the bound instance. In the new version, Undeploying indicates that the deletion is in progress, and UndeployFailed indicates that the deletion failed. Refer to deleteStatus to determine whether the operation is a deletion.</p>
         * 
         * <strong>example:</strong>
         * <p>Deployed</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The API type.</p>
         * 
         * <strong>example:</strong>
         * <p>LLM</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The API versioning information.</p>
         */
        public Builder versionInfo(HttpApiVersionInfo versionInfo) {
            this.versionInfo = versionInfo;
            return this;
        }

        public ModelApiListApiInfo build() {
            return new ModelApiListApiInfo(this);
        } 

    } 

    /**
     * 
     * {@link ModelApiListApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiListApiInfo</p>
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
             * <p>The edition of the gateway instance. Valid values: Professional, Serverless, MultiTenantServerless, and Unknown.</p>
             * 
             * <strong>example:</strong>
             * <p>MultiTenantServerless</p>
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
             * <p>The name of the gateway instance.</p>
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
     * {@link ModelApiListApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiListApiInfo</p>
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
             * <p>The ID of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>gs-xxx</p>
             */
            public Builder gatewayServiceId(String gatewayServiceId) {
                this.gatewayServiceId = gatewayServiceId;
                return this;
            }

            /**
             * <p>The match conditions.</p>
             */
            public Builder match(HttpApiBackendMatchConditions match) {
                this.match = match;
                return this;
            }

            /**
             * <p>The name of the service.</p>
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
             * <p>The ID of the service.</p>
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
     * {@link ModelApiListApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiListApiInfo</p>
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
             * <p>The ID of the domain name.</p>
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
     * {@link ModelApiListApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiListApiInfo</p>
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

        @com.aliyun.core.annotation.NameInMap("deployErrorMessage")
        private String deployErrorMessage;

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
            this.deployErrorMessage = builder.deployErrorMessage;
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
         * @return deployErrorMessage
         */
        public String getDeployErrorMessage() {
            return this.deployErrorMessage;
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
            private String deployErrorMessage; 
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
                this.deployErrorMessage = model.deployErrorMessage;
                this.deployStatus = model.deployStatus;
                this.environmentId = model.environmentId;
                this.gatewayInfo = model.gatewayInfo;
                this.name = model.name;
                this.serviceConfigs = model.serviceConfigs;
                this.subDomains = model.subDomains;
            } 

            /**
             * <p>The alias of the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The release scenario.</p>
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
             * <p>The custom domain name information published by the user.</p>
             */
            public Builder customDomains(java.util.List<HttpApiDomainInfo> customDomains) {
                this.customDomains = customDomains;
                return this;
            }

            /**
             * <p>The read-only reason for the release failure.</p>
             * 
             * <strong>example:</strong>
             * <p>The model configuration is unavailable</p>
             */
            public Builder deployErrorMessage(String deployErrorMessage) {
                this.deployErrorMessage = deployErrorMessage;
                return this;
            }

            /**
             * <p>The release status of the API in the current environment.</p>
             * 
             * <strong>example:</strong>
             * <p>Deployed</p>
             */
            public Builder deployStatus(String deployStatus) {
                this.deployStatus = deployStatus;
                return this;
            }

            /**
             * <p>The ID of the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>env-xxx</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>The gateway instance information to which the current environment belongs.</p>
             */
            public Builder gatewayInfo(GatewayInfo gatewayInfo) {
                this.gatewayInfo = gatewayInfo;
                return this;
            }

            /**
             * <p>The name of the environment.</p>
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
     * {@link ModelApiListApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiListApiInfo</p>
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
             * <p>env-d00000000000000000000</p>
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
     * {@link ModelApiListApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiListApiInfo</p>
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
             * <p>c00000000000000000000000000000001</p>
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
     * {@link ModelApiListApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiListApiInfo</p>
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
             * <p>The ingress class being listened to.</p>
             * 
             * <strong>example:</strong>
             * <p>apig</p>
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
             * <p>Specifies whether to update the address in the ingress status.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder overrideIngressIp(Boolean overrideIngressIp) {
                this.overrideIngressIp = overrideIngressIp;
                return this;
            }

            /**
             * <p>The source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>src-d00000000000000000000</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The watched namespace.</p>
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
    /**
     * 
     * {@link ModelApiListApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiListApiInfo</p>
     */
    public static class ResolvedModelSelection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("complete")
        private Boolean complete;

        @com.aliyun.core.annotation.NameInMap("modelCardIds")
        private java.util.List<String> modelCardIds;

        private ResolvedModelSelection(Builder builder) {
            this.complete = builder.complete;
            this.modelCardIds = builder.modelCardIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResolvedModelSelection create() {
            return builder().build();
        }

        /**
         * @return complete
         */
        public Boolean getComplete() {
            return this.complete;
        }

        /**
         * @return modelCardIds
         */
        public java.util.List<String> getModelCardIds() {
            return this.modelCardIds;
        }

        public static final class Builder {
            private Boolean complete; 
            private java.util.List<String> modelCardIds; 

            private Builder() {
            } 

            private Builder(ResolvedModelSelection model) {
                this.complete = model.complete;
                this.modelCardIds = model.modelCardIds;
            } 

            /**
             * <p>Indicates whether the group expansion collection for the current configuration is completely read. A complete empty group returns true and an empty array. A missing, invalid group, or read failure returns false. This does not represent the online release or consumer permission status.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder complete(Boolean complete) {
                this.complete = complete;
                return this;
            }

            /**
             * <p>The model card IDs of the publicly selected models for the current configuration, stably sorted and deduplicated. Logical models retain their own IDs, excluding fallback-only targets or underlying execution cards of logical models. If complete is false, this is an empty array and must not be interpreted as zero models.</p>
             */
            public Builder modelCardIds(java.util.List<String> modelCardIds) {
                this.modelCardIds = modelCardIds;
                return this;
            }

            public ResolvedModelSelection build() {
                return new ResolvedModelSelection(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelApiListApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiListApiInfo</p>
     */
    public static class ModelApiInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("directSupplyFallbackEnabled")
        private Boolean directSupplyFallbackEnabled;

        @com.aliyun.core.annotation.NameInMap("exposureMode")
        private String exposureMode;

        @com.aliyun.core.annotation.NameInMap("modelSelection")
        private ModelSelection modelSelection;

        @com.aliyun.core.annotation.NameInMap("resolvedModelSelection")
        private ResolvedModelSelection resolvedModelSelection;

        @com.aliyun.core.annotation.NameInMap("routingMode")
        private String routingMode;

        private ModelApiInfo(Builder builder) {
            this.directSupplyFallbackEnabled = builder.directSupplyFallbackEnabled;
            this.exposureMode = builder.exposureMode;
            this.modelSelection = builder.modelSelection;
            this.resolvedModelSelection = builder.resolvedModelSelection;
            this.routingMode = builder.routingMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelApiInfo create() {
            return builder().build();
        }

        /**
         * @return directSupplyFallbackEnabled
         */
        public Boolean getDirectSupplyFallbackEnabled() {
            return this.directSupplyFallbackEnabled;
        }

        /**
         * @return exposureMode
         */
        public String getExposureMode() {
            return this.exposureMode;
        }

        /**
         * @return modelSelection
         */
        public ModelSelection getModelSelection() {
            return this.modelSelection;
        }

        /**
         * @return resolvedModelSelection
         */
        public ResolvedModelSelection getResolvedModelSelection() {
            return this.resolvedModelSelection;
        }

        /**
         * @return routingMode
         */
        public String getRoutingMode() {
            return this.routingMode;
        }

        public static final class Builder {
            private Boolean directSupplyFallbackEnabled; 
            private String exposureMode; 
            private ModelSelection modelSelection; 
            private ResolvedModelSelection resolvedModelSelection; 
            private String routingMode; 

            private Builder() {
            } 

            private Builder(ModelApiInfo model) {
                this.directSupplyFallbackEnabled = model.directSupplyFallbackEnabled;
                this.exposureMode = model.exposureMode;
                this.modelSelection = model.modelSelection;
                this.resolvedModelSelection = model.resolvedModelSelection;
                this.routingMode = model.routingMode;
            } 

            /**
             * <p>The save state of the direct supply fallback. A value of false indicates that it is disabled. This only reflects the saved configuration and does not indicate successful release or activation.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder directSupplyFallbackEnabled(Boolean directSupplyFallbackEnabled) {
                this.directSupplyFallbackEnabled = directSupplyFallbackEnabled;
                return this;
            }

            /**
             * <p>The model exposure mode. Only SELECTED is supported in the first phase.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECTED</p>
             */
            public Builder exposureMode(String exposureMode) {
                this.exposureMode = exposureMode;
                return this;
            }

            /**
             * <p>The model selection configuration.</p>
             */
            public Builder modelSelection(ModelSelection modelSelection) {
                this.modelSelection = modelSelection;
                return this;
            }

            /**
             * <p>The read-only public model collection for the current configuration. If complete is false, the collection is unknown, and partial members must not be used as the full count.</p>
             */
            public Builder resolvedModelSelection(ResolvedModelSelection resolvedModelSelection) {
                this.resolvedModelSelection = resolvedModelSelection;
                return this;
            }

            /**
             * <p>The routing mode. Only Direct is supported in the first phase.</p>
             * 
             * <strong>example:</strong>
             * <p>Direct</p>
             */
            public Builder routingMode(String routingMode) {
                this.routingMode = routingMode;
                return this;
            }

            public ModelApiInfo build() {
                return new ModelApiInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelApiListApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiListApiInfo</p>
     */
    public static class ModelCardRuntimeDiagnostics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deployConfigIndex")
        private Integer deployConfigIndex;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("invalidConfiguration")
        private Boolean invalidConfiguration;

        @com.aliyun.core.annotation.NameInMap("reasons")
        private java.util.List<String> reasons;

        private ModelCardRuntimeDiagnostics(Builder builder) {
            this.deployConfigIndex = builder.deployConfigIndex;
            this.gatewayId = builder.gatewayId;
            this.invalidConfiguration = builder.invalidConfiguration;
            this.reasons = builder.reasons;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelCardRuntimeDiagnostics create() {
            return builder().build();
        }

        /**
         * @return deployConfigIndex
         */
        public Integer getDeployConfigIndex() {
            return this.deployConfigIndex;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return invalidConfiguration
         */
        public Boolean getInvalidConfiguration() {
            return this.invalidConfiguration;
        }

        /**
         * @return reasons
         */
        public java.util.List<String> getReasons() {
            return this.reasons;
        }

        public static final class Builder {
            private Integer deployConfigIndex; 
            private String gatewayId; 
            private Boolean invalidConfiguration; 
            private java.util.List<String> reasons; 

            private Builder() {
            } 

            private Builder(ModelCardRuntimeDiagnostics model) {
                this.deployConfigIndex = model.deployConfigIndex;
                this.gatewayId = model.gatewayId;
                this.invalidConfiguration = model.invalidConfiguration;
                this.reasons = model.reasons;
            } 

            /**
             * <p>The index of the corresponding deployment configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deployConfigIndex(Integer deployConfigIndex) {
                this.deployConfigIndex = deployConfigIndex;
                return this;
            }

            /**
             * <p>The gateway instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-d00000000000000000000</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>Indicates whether the marker of the deployment configuration is invalid.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder invalidConfiguration(Boolean invalidConfiguration) {
                this.invalidConfiguration = invalidConfiguration;
                return this;
            }

            /**
             * <p>The list of reasons for invalidity.</p>
             */
            public Builder reasons(java.util.List<String> reasons) {
                this.reasons = reasons;
                return this;
            }

            public ModelCardRuntimeDiagnostics build() {
                return new ModelCardRuntimeDiagnostics(this);
            } 

        } 

    }
}
