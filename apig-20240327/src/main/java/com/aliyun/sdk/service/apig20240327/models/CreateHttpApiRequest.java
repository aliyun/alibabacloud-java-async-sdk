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
 * {@link CreateHttpApiRequest} extends {@link RequestModel}
 *
 * <p>CreateHttpApiRequest</p>
 */
public class CreateHttpApiRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentProtocols")
    private java.util.List<String> agentProtocols;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aiProtocols")
    private java.util.List<String> aiProtocols;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authConfig")
    private AuthConfig authConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("basePath")
    private String basePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("belongGatewayId")
    private String belongGatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deployConfigs")
    private java.util.List<HttpApiDeployConfig> deployConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dryRun")
    @Deprecated
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableAuth")
    private Boolean enableAuth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("firstByteTimeout")
    private Integer firstByteTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ingressConfig")
    private IngressConfig ingressConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelCategory")
    private String modelCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("protocols")
    private java.util.List<String> protocols;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("removeBasePathOnForward")
    private Boolean removeBasePathOnForward;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("strategy")
    private String strategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("versionConfig")
    private HttpApiVersionConfig versionConfig;

    private CreateHttpApiRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentProtocols = builder.agentProtocols;
        this.aiProtocols = builder.aiProtocols;
        this.authConfig = builder.authConfig;
        this.basePath = builder.basePath;
        this.belongGatewayId = builder.belongGatewayId;
        this.deployConfigs = builder.deployConfigs;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.enableAuth = builder.enableAuth;
        this.firstByteTimeout = builder.firstByteTimeout;
        this.ingressConfig = builder.ingressConfig;
        this.modelCategory = builder.modelCategory;
        this.name = builder.name;
        this.protocols = builder.protocols;
        this.removeBasePathOnForward = builder.removeBasePathOnForward;
        this.resourceGroupId = builder.resourceGroupId;
        this.strategy = builder.strategy;
        this.type = builder.type;
        this.versionConfig = builder.versionConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHttpApiRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return belongGatewayId
     */
    public String getBelongGatewayId() {
        return this.belongGatewayId;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return enableAuth
     */
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    /**
     * @return firstByteTimeout
     */
    public Integer getFirstByteTimeout() {
        return this.firstByteTimeout;
    }

    /**
     * @return ingressConfig
     */
    public IngressConfig getIngressConfig() {
        return this.ingressConfig;
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
     * @return removeBasePathOnForward
     */
    public Boolean getRemoveBasePathOnForward() {
        return this.removeBasePathOnForward;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return versionConfig
     */
    public HttpApiVersionConfig getVersionConfig() {
        return this.versionConfig;
    }

    public static final class Builder extends Request.Builder<CreateHttpApiRequest, Builder> {
        private String regionId; 
        private java.util.List<String> agentProtocols; 
        private java.util.List<String> aiProtocols; 
        private AuthConfig authConfig; 
        private String basePath; 
        private String belongGatewayId; 
        private java.util.List<HttpApiDeployConfig> deployConfigs; 
        private String description; 
        private Boolean dryRun; 
        private Boolean enableAuth; 
        private Integer firstByteTimeout; 
        private IngressConfig ingressConfig; 
        private String modelCategory; 
        private String name; 
        private java.util.List<String> protocols; 
        private Boolean removeBasePathOnForward; 
        private String resourceGroupId; 
        private String strategy; 
        private String type; 
        private HttpApiVersionConfig versionConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateHttpApiRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentProtocols = request.agentProtocols;
            this.aiProtocols = request.aiProtocols;
            this.authConfig = request.authConfig;
            this.basePath = request.basePath;
            this.belongGatewayId = request.belongGatewayId;
            this.deployConfigs = request.deployConfigs;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.enableAuth = request.enableAuth;
            this.firstByteTimeout = request.firstByteTimeout;
            this.ingressConfig = request.ingressConfig;
            this.modelCategory = request.modelCategory;
            this.name = request.name;
            this.protocols = request.protocols;
            this.removeBasePathOnForward = request.removeBasePathOnForward;
            this.resourceGroupId = request.resourceGroupId;
            this.strategy = request.strategy;
            this.type = request.type;
            this.versionConfig = request.versionConfig;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of protocols supported by the agent. Required when type is Agent. Not required for other types.</p>
         */
        public Builder agentProtocols(java.util.List<String> agentProtocols) {
            this.putBodyParameter("agentProtocols", agentProtocols);
            this.agentProtocols = agentProtocols;
            return this;
        }

        /**
         * <p>The list of AI API protocols. Required when type is LLM, and only one protocol can be specified. Required when type is Ai, and multiple protocols can be specified. Not required for other types. Example protocol entry: OpenAI/v1.</p>
         */
        public Builder aiProtocols(java.util.List<String> aiProtocols) {
            this.putBodyParameter("aiProtocols", aiProtocols);
            this.aiProtocols = aiProtocols;
            return this;
        }

        /**
         * <p>The authentication configuration. Required when enableAuth=true.</p>
         */
        public Builder authConfig(AuthConfig authConfig) {
            this.putBodyParameter("authConfig", authConfig);
            this.authConfig = authConfig;
            return this;
        }

        /**
         * <p>The API base path. Must start with a forward slash (/), cannot exceed 256 bytes in length, and cannot contain spaces. Required when type=Rest. Optional when type=LLM, Ai, or Agent. Default value: /</p>
         * 
         * <strong>example:</strong>
         * <p>/v1</p>
         */
        public Builder basePath(String basePath) {
            this.putBodyParameter("basePath", basePath);
            this.basePath = basePath;
            return this;
        }

        /**
         * <p>The ID of the gateway to which the API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-abc123xyz789</p>
         */
        public Builder belongGatewayId(String belongGatewayId) {
            this.putBodyParameter("belongGatewayId", belongGatewayId);
            this.belongGatewayId = belongGatewayId;
            return this;
        }

        /**
         * <p>The list of deployment configurations for the HTTP API. Required when type is LLM or Ai, and only one deployment configuration can be specified. Not validated at the request level for other types.</p>
         */
        public Builder deployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
            this.putBodyParameter("deployConfigs", deployConfigs);
            this.deployConfigs = deployConfigs;
            return this;
        }

        /**
         * <p>The API description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test API for integration</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run without executing the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to enable authentication. Validated when type is LLM, Ai, or Agent. Not validated at the request level when type is Rest.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAuth(Boolean enableAuth) {
            this.putBodyParameter("enableAuth", enableAuth);
            this.enableAuth = enableAuth;
            return this;
        }

        /**
         * <p>The timeout period for waiting for the first byte from the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder firstByteTimeout(Integer firstByteTimeout) {
            this.putBodyParameter("firstByteTimeout", firstByteTimeout);
            this.firstByteTimeout = firstByteTimeout;
            return this;
        }

        /**
         * <p>The HTTP Ingress API configuration. Required when type is HttpIngress and cannot be nil. Not required for other types.</p>
         */
        public Builder ingressConfig(IngressConfig ingressConfig) {
            this.putBodyParameter("ingressConfig", ingressConfig);
            this.ingressConfig = ingressConfig;
            return this;
        }

        /**
         * <p>The AI model category. Optional when type is LLM or Ai. Not required for other types. Valid values: Text (text generation), Image (image generation), Audio (audio processing), Video (AI video generation), MultiModal (multi-modal), Embedding (text embedding), Rerank (reranking), Others (other).</p>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        public Builder modelCategory(String modelCategory) {
            this.putBodyParameter("modelCategory", modelCategory);
            this.modelCategory = modelCategory;
            return this;
        }

        /**
         * <p>The name of the HTTP API, used to identify the current API resource. Example: test-api.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-api</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of API access protocols.</p>
         */
        public Builder protocols(java.util.List<String> protocols) {
            this.putBodyParameter("protocols", protocols);
            this.protocols = protocols;
            return this;
        }

        /**
         * <p>Specifies whether to remove the base path when forwarding requests.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder removeBasePathOnForward(Boolean removeBasePathOnForward) {
            this.putBodyParameter("removeBasePathOnForward", removeBasePathOnForward);
            this.removeBasePathOnForward = removeBasePathOnForward;
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
         * <p>The conflict merge strategy for import.</p>
         * 
         * <strong>example:</strong>
         * <p>ExistFirst</p>
         */
        public Builder strategy(String strategy) {
            this.putBodyParameter("strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        /**
         * <p>The HTTP API type. Valid values: Http (standard HTTP API), Rest (RESTful API), WebSocket (WebSocket API), HttpIngress (HTTP API accessed through Ingress), LLM (large language model API), Agent (Agent proxy API).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Http</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The API versioning configuration.</p>
         */
        public Builder versionConfig(HttpApiVersionConfig versionConfig) {
            this.putBodyParameter("versionConfig", versionConfig);
            this.versionConfig = versionConfig;
            return this;
        }

        @Override
        public CreateHttpApiRequest build() {
            return new CreateHttpApiRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateHttpApiRequest} extends {@link TeaModel}
     *
     * <p>CreateHttpApiRequest</p>
     */
    public static class IngressConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("ingressClass")
        private String ingressClass;

        @com.aliyun.core.annotation.NameInMap("overrideIngressIp")
        private Boolean overrideIngressIp;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        @Deprecated
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("watchNamespace")
        private String watchNamespace;

        private IngressConfig(Builder builder) {
            this.clusterId = builder.clusterId;
            this.environmentId = builder.environmentId;
            this.ingressClass = builder.ingressClass;
            this.overrideIngressIp = builder.overrideIngressIp;
            this.sourceId = builder.sourceId;
            this.watchNamespace = builder.watchNamespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressConfig create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
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
            private String clusterId; 
            private String environmentId; 
            private String ingressClass; 
            private Boolean overrideIngressIp; 
            private String sourceId; 
            private String watchNamespace; 

            private Builder() {
            } 

            private Builder(IngressConfig model) {
                this.clusterId = model.clusterId;
                this.environmentId = model.environmentId;
                this.ingressClass = model.ingressClass;
                this.overrideIngressIp = model.overrideIngressIp;
                this.sourceId = model.sourceId;
                this.watchNamespace = model.watchNamespace;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>k7v5eobfzttudni2pw***</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>env-cq146allhtgk***</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>The Ingress Class to listen on.</p>
             * 
             * <strong>example:</strong>
             * <p>mse</p>
             */
            public Builder ingressClass(String ingressClass) {
                this.ingressClass = ingressClass;
                return this;
            }

            /**
             * <p>Specifies whether to update the address in the Ingress Status.</p>
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
             * <p>src-crdddallhtgtr***</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The namespace to listen on.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
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
}
