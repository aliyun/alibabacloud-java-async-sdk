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
 * {@link ModelApiApiInfo} extends {@link TeaModel}
 *
 * <p>ModelApiApiInfo</p>
 */
public class ModelApiApiInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentProtocols")
    private java.util.List<String> agentProtocols;

    @com.aliyun.core.annotation.NameInMap("basePath")
    private String basePath;

    @com.aliyun.core.annotation.NameInMap("creationClientToken")
    private String creationClientToken;

    @com.aliyun.core.annotation.NameInMap("deleteStatus")
    private String deleteStatus;

    @com.aliyun.core.annotation.NameInMap("deployCntMap")
    private java.util.Map<String, ModelApiApiInfoDeployCntMapValue> deployCntMap;

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

    @com.aliyun.core.annotation.NameInMap("publishedEndpoints")
    private java.util.List<PublishedEndpoints> publishedEndpoints;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("versionInfo")
    private HttpApiVersionInfo versionInfo;

    private ModelApiApiInfo(Builder builder) {
        this.agentProtocols = builder.agentProtocols;
        this.basePath = builder.basePath;
        this.creationClientToken = builder.creationClientToken;
        this.deleteStatus = builder.deleteStatus;
        this.deployCntMap = builder.deployCntMap;
        this.deployErrorMessage = builder.deployErrorMessage;
        this.description = builder.description;
        this.domainIds = builder.domainIds;
        this.domainInfos = builder.domainInfos;
        this.enableAuth = builder.enableAuth;
        this.environmentId = builder.environmentId;
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
        this.publishedEndpoints = builder.publishedEndpoints;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.type = builder.type;
        this.versionInfo = builder.versionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelApiApiInfo create() {
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
    public java.util.Map<String, ModelApiApiInfoDeployCntMapValue> getDeployCntMap() {
        return this.deployCntMap;
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
     * @return publishedEndpoints
     */
    public java.util.List<PublishedEndpoints> getPublishedEndpoints() {
        return this.publishedEndpoints;
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
        private String basePath; 
        private String creationClientToken; 
        private String deleteStatus; 
        private java.util.Map<String, ModelApiApiInfoDeployCntMapValue> deployCntMap; 
        private String deployErrorMessage; 
        private String description; 
        private java.util.List<String> domainIds; 
        private java.util.List<ModelApiDomainInfo> domainInfos; 
        private Boolean enableAuth; 
        private String environmentId; 
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
        private java.util.List<PublishedEndpoints> publishedEndpoints; 
        private String resourceGroupId; 
        private String status; 
        private String type; 
        private HttpApiVersionInfo versionInfo; 

        private Builder() {
        } 

        private Builder(ModelApiApiInfo model) {
            this.agentProtocols = model.agentProtocols;
            this.basePath = model.basePath;
            this.creationClientToken = model.creationClientToken;
            this.deleteStatus = model.deleteStatus;
            this.deployCntMap = model.deployCntMap;
            this.deployErrorMessage = model.deployErrorMessage;
            this.description = model.description;
            this.domainIds = model.domainIds;
            this.domainInfos = model.domainInfos;
            this.enableAuth = model.enableAuth;
            this.environmentId = model.environmentId;
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
            this.publishedEndpoints = model.publishedEndpoints;
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
         * <p>The read-only correlation identifier for creation requests. It is returned only when the association with the same instance is unique within approximately 24 hours after the first persistence following normal authentication. It is omitted for historical, expired, or ambiguous cases. This identifier cannot be used to determine the success of publishing or authorization, nor does it replace the creation of idempotent records.</p>
         * 
         * <strong>example:</strong>
         * <p>b1907ca4-952c-4c5f-8d1f-0aa6ae339c96</p>
         */
        public Builder creationClientToken(String creationClientToken) {
            this.creationClientToken = creationClientToken;
            return this;
        }

        /**
         * <p>The deletion status of the new version model API. This field is read-only and optional. Deleting indicates that the deletion request is accepted but not yet completed. DeleteFailed indicates that the background deletion failed, and you can use the original clientToken to retry the DeleteModelApi operation. This field is not returned for normal publishing and historical undeployment. The absence of this field does not indicate that the deletion is complete.</p>
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
        public Builder deployCntMap(java.util.Map<String, ModelApiApiInfoDeployCntMapValue> deployCntMap) {
            this.deployCntMap = deployCntMap;
            return this;
        }

        /**
         * <p>The reason for the deployment or deletion failure. This field is read-only.</p>
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
         * <p>The read-only domain name details and the default domain name flag.</p>
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
         * <p>The default environment ID of the bound instance. This field is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>env-d00000000000000000000</p>
         */
        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
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
         * <p>The model API public selection information.</p>
         */
        public Builder modelApiInfo(ModelApiInfo modelApiInfo) {
            this.modelApiInfo = modelApiInfo;
            return this;
        }

        /**
         * <p>The read-only runtime diagnostic information for model cards, derived from the original markers of the deployment configuration. It is used only for the readability and diagnostics of abnormal drafts.</p>
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
         * <p>The collection of successfully published per-path executable models. This field is read-only. It is empty when a snapshot is missing, which does not represent consumer permission.</p>
         */
        public Builder publishedEndpoints(java.util.List<PublishedEndpoints> publishedEndpoints) {
            this.publishedEndpoints = publishedEndpoints;
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
         * <p>The publishing status on the bound instance. In the new version, the status is Undeploying when a deletion is in progress, and UndeployFailed when a deletion fails. To determine whether an operation is a deletion, refer to the deleteStatus field.</p>
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

        public ModelApiApiInfo build() {
            return new ModelApiApiInfo(this);
        } 

    } 

    /**
     * 
     * {@link ModelApiApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiApiInfo</p>
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
     * {@link ModelApiApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiApiInfo</p>
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
     * {@link ModelApiApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiApiInfo</p>
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
             * <p>The ingress class.</p>
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
     * {@link ModelApiApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiApiInfo</p>
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
             * <p>Indicates whether the expanded collection of the current configuration is fully read. A fully empty group returns true and an empty array. Missing, invalid groups, or read failures return false. This does not reflect the online publishing or consumer permission status.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder complete(Boolean complete) {
                this.complete = complete;
                return this;
            }

            /**
             * <p>The identities of the models selected for public exposure in the current configuration, stably sorted and deduplicated. Logical models retain their own IDs and do not include fallback-only targets or underlying execution cards of logical models. If complete is false, this is an empty array and must not be interpreted as zero models.</p>
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
     * {@link ModelApiApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiApiInfo</p>
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
             * <p>The saved state of the direct supply fallback. A value of false indicates that it is disabled. This only reflects the saved configuration and does not indicate successful publishing or activation.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder directSupplyFallbackEnabled(Boolean directSupplyFallbackEnabled) {
                this.directSupplyFallbackEnabled = directSupplyFallbackEnabled;
                return this;
            }

            /**
             * <p>The model exposure mode. Only SELECTED is supported in Phase 1.</p>
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
             * <p>The read-only collection of publicly exposed models for the current configuration. It retains the modelSelection edit source, but the successful online collection is still subject to publishedEndpoints.</p>
             */
            public Builder resolvedModelSelection(ResolvedModelSelection resolvedModelSelection) {
                this.resolvedModelSelection = resolvedModelSelection;
                return this;
            }

            /**
             * <p>The routing mode. Only Direct is supported in Phase 1.</p>
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
     * {@link ModelApiApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiApiInfo</p>
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
    /**
     * 
     * {@link ModelApiApiInfo} extends {@link TeaModel}
     *
     * <p>ModelApiApiInfo</p>
     */
    public static class PublishedEndpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("modelCardIds")
        private java.util.List<String> modelCardIds;

        private PublishedEndpoints(Builder builder) {
            this.endpoint = builder.endpoint;
            this.modelCardIds = builder.modelCardIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishedEndpoints create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return modelCardIds
         */
        public java.util.List<String> getModelCardIds() {
            return this.modelCardIds;
        }

        public static final class Builder {
            private String endpoint; 
            private java.util.List<String> modelCardIds; 

            private Builder() {
            } 

            private Builder(PublishedEndpoints model) {
                this.endpoint = model.endpoint;
                this.modelCardIds = model.modelCardIds;
            } 

            /**
             * <p>The name of the successfully published built-in endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>model-responses</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The collection of executable ModelCard IDs successfully published for this path.</p>
             */
            public Builder modelCardIds(java.util.List<String> modelCardIds) {
                this.modelCardIds = modelCardIds;
                return this;
            }

            public PublishedEndpoints build() {
                return new PublishedEndpoints(this);
            } 

        } 

    }
}
