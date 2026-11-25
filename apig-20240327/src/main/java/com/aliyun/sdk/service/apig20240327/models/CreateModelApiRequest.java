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
 * {@link CreateModelApiRequest} extends {@link RequestModel}
 *
 * <p>CreateModelApiRequest</p>
 */
public class CreateModelApiRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("basePath")
    private String basePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directSupplyFallbackEnabled")
    private Boolean directSupplyFallbackEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("domainIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> domainIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableAuth")
    private Boolean enableAuth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("firstByteTimeout")
    private Integer firstByteTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("initialConfiguration")
    private Boolean initialConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelSelection")
    @com.aliyun.core.annotation.Validation(required = true)
    private ModelSelection modelSelection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("policyConfigs")
    private java.util.List<ModelApiPolicyConfig> policyConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    private CreateModelApiRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.basePath = builder.basePath;
        this.description = builder.description;
        this.directSupplyFallbackEnabled = builder.directSupplyFallbackEnabled;
        this.domainIds = builder.domainIds;
        this.enableAuth = builder.enableAuth;
        this.firstByteTimeout = builder.firstByteTimeout;
        this.gatewayId = builder.gatewayId;
        this.initialConfiguration = builder.initialConfiguration;
        this.modelSelection = builder.modelSelection;
        this.name = builder.name;
        this.policyConfigs = builder.policyConfigs;
        this.resourceGroupId = builder.resourceGroupId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelApiRequest create() {
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
     * @return basePath
     */
    public String getBasePath() {
        return this.basePath;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return directSupplyFallbackEnabled
     */
    public Boolean getDirectSupplyFallbackEnabled() {
        return this.directSupplyFallbackEnabled;
    }

    /**
     * @return domainIds
     */
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
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
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return initialConfiguration
     */
    public Boolean getInitialConfiguration() {
        return this.initialConfiguration;
    }

    /**
     * @return modelSelection
     */
    public ModelSelection getModelSelection() {
        return this.modelSelection;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateModelApiRequest, Builder> {
        private String regionId; 
        private String basePath; 
        private String description; 
        private Boolean directSupplyFallbackEnabled; 
        private java.util.List<String> domainIds; 
        private Boolean enableAuth; 
        private Integer firstByteTimeout; 
        private String gatewayId; 
        private Boolean initialConfiguration; 
        private ModelSelection modelSelection; 
        private String name; 
        private java.util.List<ModelApiPolicyConfig> policyConfigs; 
        private String resourceGroupId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelApiRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.basePath = request.basePath;
            this.description = request.description;
            this.directSupplyFallbackEnabled = request.directSupplyFallbackEnabled;
            this.domainIds = request.domainIds;
            this.enableAuth = request.enableAuth;
            this.firstByteTimeout = request.firstByteTimeout;
            this.gatewayId = request.gatewayId;
            this.initialConfiguration = request.initialConfiguration;
            this.modelSelection = request.modelSelection;
            this.name = request.name;
            this.policyConfigs = request.policyConfigs;
            this.resourceGroupId = request.resourceGroupId;
            this.clientToken = request.clientToken;
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
         * <p>The API access prefix. The default value for creation is /. If omitted during an update, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>/beta</p>
         */
        public Builder basePath(String basePath) {
            this.putBodyParameter("basePath", basePath);
            this.basePath = basePath;
            return this;
        }

        /**
         * <p>The description of the model API. If omitted during an update, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>Model API for business integration</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable direct supply fallback. If omitted in a create request, the default value is false, which does not implicitly incur pay-as-you-go tail charges. You can only enable this feature by explicitly setting this parameter to true.</p>
         */
        public Builder directSupplyFallbackEnabled(Boolean directSupplyFallbackEnabled) {
            this.putBodyParameter("directSupplyFallbackEnabled", directSupplyFallbackEnabled);
            this.directSupplyFallbackEnabled = directSupplyFallbackEnabled;
            return this;
        }

        /**
         * <p>The IDs of the selected custom or default instance domain names. This parameter must be explicitly specified and cannot be empty during creation. If omitted during an update, the original value is retained. If submitted, the entire list is replaced and cannot be empty.</p>
         * <p>This parameter is required.</p>
         */
        public Builder domainIds(java.util.List<String> domainIds) {
            this.putBodyParameter("domainIds", domainIds);
            this.domainIds = domainIds;
            return this;
        }

        /**
         * <p>Specifies whether to enable consumer API key authentication. If omitted during an update, the original value is retained. The type is fixed to Apikey or Custom.</p>
         */
        public Builder enableAuth(Boolean enableAuth) {
            this.putBodyParameter("enableAuth", enableAuth);
            this.enableAuth = enableAuth;
            return this;
        }

        /**
         * <p>The timeout period for the first byte.</p>
         * 
         * <strong>example:</strong>
         * <p>30000</p>
         */
        public Builder firstByteTimeout(Integer firstByteTimeout) {
            this.putBodyParameter("firstByteTimeout", firstByteTimeout);
            this.firstByteTimeout = firstByteTimeout;
            return this;
        }

        /**
         * <p>The target dedicated gateway instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-d00000000000000000000</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>Specifies whether to explicitly perform the initial configuration. If omitted or set to false, standard multi-API creation is retained. If set to true, you must explicitly set name to default, basePath to /, and provide a non-empty clientToken. Additionally, when saving, multi-API management must be disabled and the number of complete new-version APIs must be zero.</p>
         */
        public Builder initialConfiguration(Boolean initialConfiguration) {
            this.putBodyParameter("initialConfiguration", initialConfiguration);
            this.initialConfiguration = initialConfiguration;
            return this;
        }

        /**
         * <p>The model selection. This parameter is required for creation. If omitted during an update, the original value is retained. If submitted, the entire value is replaced.</p>
         * <p>This parameter is required.</p>
         */
        public Builder modelSelection(ModelSelection modelSelection) {
            this.putBodyParameter("modelSelection", modelSelection);
            this.modelSelection = modelSelection;
            return this;
        }

        /**
         * <p>The name of the model API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>beta-model-api</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The configurations for AI request logging and AI security protection only. If omitted during an update, the original values are retained. If submitted, the inline policies of both types are entirely replaced. An empty array clears both types. Independent token quotas are not affected.</p>
         */
        public Builder policyConfigs(java.util.List<ModelApiPolicyConfig> policyConfigs) {
            this.putBodyParameter("policyConfigs", policyConfigs);
            this.policyConfigs = policyConfigs;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acf0000000000000000</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The idempotency identity. The caller generates a globally unique value (we recommend a UUID) to invoke the API. The maximum length is 64 characters. Within approximately 24 hours after the initial request succeeds, if you invoke a duplicate request with the same clientToken and identical request parameter values, the system directly returns the initial creation result. If a request parameter is inconsistent or the initial request is still being processed, the system returns the corresponding idempotency fault. If omitted, the original creation behavior is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>create-model-api-client-token-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateModelApiRequest build() {
            return new CreateModelApiRequest(this);
        } 

    } 

}
