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
 * {@link UpdateModelApiRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelApiRequest</p>
 */
public class UpdateModelApiRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

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
    private java.util.List<String> domainIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableAuth")
    private Boolean enableAuth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("firstByteTimeout")
    private Integer firstByteTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelSelection")
    private ModelSelection modelSelection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelSelectionDelta")
    private ModelSelectionDelta modelSelectionDelta;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("policyConfigs")
    private java.util.List<ModelApiPolicyConfig> policyConfigs;

    private UpdateModelApiRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.basePath = builder.basePath;
        this.description = builder.description;
        this.directSupplyFallbackEnabled = builder.directSupplyFallbackEnabled;
        this.domainIds = builder.domainIds;
        this.enableAuth = builder.enableAuth;
        this.firstByteTimeout = builder.firstByteTimeout;
        this.modelSelection = builder.modelSelection;
        this.modelSelectionDelta = builder.modelSelectionDelta;
        this.name = builder.name;
        this.policyConfigs = builder.policyConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelApiRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
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
     * @return modelSelection
     */
    public ModelSelection getModelSelection() {
        return this.modelSelection;
    }

    /**
     * @return modelSelectionDelta
     */
    public ModelSelectionDelta getModelSelectionDelta() {
        return this.modelSelectionDelta;
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

    public static final class Builder extends Request.Builder<UpdateModelApiRequest, Builder> {
        private String httpApiId; 
        private String basePath; 
        private String description; 
        private Boolean directSupplyFallbackEnabled; 
        private java.util.List<String> domainIds; 
        private Boolean enableAuth; 
        private Integer firstByteTimeout; 
        private ModelSelection modelSelection; 
        private ModelSelectionDelta modelSelectionDelta; 
        private String name; 
        private java.util.List<ModelApiPolicyConfig> policyConfigs; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelApiRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.basePath = request.basePath;
            this.description = request.description;
            this.directSupplyFallbackEnabled = request.directSupplyFallbackEnabled;
            this.domainIds = request.domainIds;
            this.enableAuth = request.enableAuth;
            this.firstByteTimeout = request.firstByteTimeout;
            this.modelSelection = request.modelSelection;
            this.modelSelectionDelta = request.modelSelectionDelta;
            this.name = request.name;
            this.policyConfigs = request.policyConfigs;
        } 

        /**
         * <p>The ID of the model API to update.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api-d00000000000000000000</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * <p>The API access prefix. The default value is / during creation. If omitted during an update, the original value is retained.</p>
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
         * <p>Specifies whether to enable direct supply fallback. If omitted during an update, the original value is retained. Explicitly set to false to disable it.</p>
         */
        public Builder directSupplyFallbackEnabled(Boolean directSupplyFallbackEnabled) {
            this.putBodyParameter("directSupplyFallbackEnabled", directSupplyFallbackEnabled);
            this.directSupplyFallbackEnabled = directSupplyFallbackEnabled;
            return this;
        }

        /**
         * <p>The IDs of the selected custom or default domain names of the instance. This parameter must be explicitly non-empty during creation. If omitted during an update, the original value is retained. When submitted, the entire list is replaced and cannot be empty.</p>
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
         * <p>The time to first byte.</p>
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
         * <p>The model selection. This parameter is required during creation. If omitted during an update, the original value is retained. When submitted, the entire selection is replaced.</p>
         */
        public Builder modelSelection(ModelSelection modelSelection) {
            this.putBodyParameter("modelSelection", modelSelection);
            this.modelSelection = modelSelection;
            return this;
        }

        /**
         * <p>Supported only by the new version of ModelAPI in minimalist mode: merges the actual source model IDs added to or removed from the model source in this request into the latest selection within the lock. This parameter is mutually exclusive with modelSelection and cannot be null or an empty delta. The standard update and publish process applies.</p>
         */
        public Builder modelSelectionDelta(ModelSelectionDelta modelSelectionDelta) {
            this.putBodyParameter("modelSelectionDelta", modelSelectionDelta);
            this.modelSelectionDelta = modelSelectionDelta;
            return this;
        }

        /**
         * <p>The name of the model API. If omitted or set to null, the original value is retained. When submitted, the value is trimmed of leading and trailing whitespace, must be non-empty, contain a maximum of 128 UTF-8 bytes, and cannot contain @ or /. Renaming the API does not change the API ID or access prefix.</p>
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
         * <p>The configurations for AI request logs and AI security protection. If omitted during an update, the original values are retained. When submitted, the inline policies of both types are entirely replaced. An empty array clears both types. Independent token quotas are not affected.</p>
         */
        public Builder policyConfigs(java.util.List<ModelApiPolicyConfig> policyConfigs) {
            this.putBodyParameter("policyConfigs", policyConfigs);
            this.policyConfigs = policyConfigs;
            return this;
        }

        @Override
        public UpdateModelApiRequest build() {
            return new UpdateModelApiRequest(this);
        } 

    } 

}
