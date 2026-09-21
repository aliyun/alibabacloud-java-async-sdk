// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link CreateModelProviderTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateModelProviderTemplateRequest</p>
 */
public class CreateModelProviderTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentPlatform")
    private String agentPlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentProvider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableWuyingProxy")
    private Boolean enableWuyingProxy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProviderName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String providerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProviderType")
    private String providerType;

    private CreateModelProviderTemplateRequest(Builder builder) {
        super(builder);
        this.agentPlatform = builder.agentPlatform;
        this.agentProvider = builder.agentProvider;
        this.bizType = builder.bizType;
        this.config = builder.config;
        this.description = builder.description;
        this.enableWuyingProxy = builder.enableWuyingProxy;
        this.modelTemplateId = builder.modelTemplateId;
        this.name = builder.name;
        this.providerName = builder.providerName;
        this.providerType = builder.providerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelProviderTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentPlatform
     */
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    /**
     * @return agentProvider
     */
    public String getAgentProvider() {
        return this.agentProvider;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableWuyingProxy
     */
    public Boolean getEnableWuyingProxy() {
        return this.enableWuyingProxy;
    }

    /**
     * @return modelTemplateId
     */
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return providerName
     */
    public String getProviderName() {
        return this.providerName;
    }

    /**
     * @return providerType
     */
    public String getProviderType() {
        return this.providerType;
    }

    public static final class Builder extends Request.Builder<CreateModelProviderTemplateRequest, Builder> {
        private String agentPlatform; 
        private String agentProvider; 
        private Integer bizType; 
        private String config; 
        private String description; 
        private Boolean enableWuyingProxy; 
        private String modelTemplateId; 
        private String name; 
        private String providerName; 
        private String providerType; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelProviderTemplateRequest request) {
            super(request);
            this.agentPlatform = request.agentPlatform;
            this.agentProvider = request.agentProvider;
            this.bizType = request.bizType;
            this.config = request.config;
            this.description = request.description;
            this.enableWuyingProxy = request.enableWuyingProxy;
            this.modelTemplateId = request.modelTemplateId;
            this.name = request.name;
            this.providerName = request.providerName;
            this.providerType = request.providerType;
        } 

        /**
         * <p>The Agent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder agentPlatform(String agentPlatform) {
            this.putQueryParameter("AgentPlatform", agentPlatform);
            this.agentPlatform = agentPlatform;
            return this;
        }

        /**
         * <p>The Agent provider name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw</p>
         */
        public Builder agentProvider(String agentProvider) {
            this.putQueryParameter("AgentProvider", agentProvider);
            this.agentProvider = agentProvider;
            return this;
        }

        /**
         * <p>The business type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The model provider configuration in JSON format, which contains connection information such as baseUrl, apiKey, and api. The apiKey is encrypted after creation. When ProviderType is set to WuyingCredit, this parameter is not required because the configuration is copied from the system template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;api&quot;: &quot;openai-completions&quot;,
         *     &quot;apiKey&quot;: &quot;sk-xxxx&quot;,
         *     &quot;baseUrl&quot;: &quot;<a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a>&quot;
         * }</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The description of the model provider template.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云百炼服务商</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable the WUYING secure proxy. This parameter must be set to true when ProviderType is set to WuyingCredit.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableWuyingProxy(Boolean enableWuyingProxy) {
            this.putQueryParameter("EnableWuyingProxy", enableWuyingProxy);
            this.enableWuyingProxy = enableWuyingProxy;
            return this;
        }

        /**
         * <p>The ID of the associated model template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxx</p>
         */
        public Builder modelTemplateId(String modelTemplateId) {
            this.putQueryParameter("ModelTemplateId", modelTemplateId);
            this.modelTemplateId = modelTemplateId;
            return this;
        }

        /**
         * <p>The name of the model provider template.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云百炼</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The model provider name. The name must be unique within the same model template. The naming rules vary based on the value of ProviderType. For more information, see the description of ProviderType.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        public Builder providerName(String providerName) {
            this.putQueryParameter("ProviderName", providerName);
            this.providerName = providerName;
            return this;
        }

        /**
         * <p>The model provider type. Different types impose different constraints on ProviderName and Config. Valid values:</p>
         * <ul>
         * <li>WuyingCredit: WUYING credit plan. ProviderName must be set to wuying-credit. The template is created by copying from a system template, and Config is not required.</li>
         * <li>Managed: managed provider. System-reserved names such as wuying-credit cannot be used. Config is required.</li>
         * <li>Custom: user-defined provider. ProviderName must start with the prefix provider-. Config is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        public Builder providerType(String providerType) {
            this.putQueryParameter("ProviderType", providerType);
            this.providerType = providerType;
            return this;
        }

        @Override
        public CreateModelProviderTemplateRequest build() {
            return new CreateModelProviderTemplateRequest(this);
        } 

    } 

}
