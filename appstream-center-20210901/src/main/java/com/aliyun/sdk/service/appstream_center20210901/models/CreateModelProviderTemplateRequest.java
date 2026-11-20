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
         * <p>The business platform to which the agent belongs. This value must be consistent with the target model group. If this parameter is not provided or an unrecognized value is passed, <code>ENTERPRISE</code> is used.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>COMMON</code>: common model group</li>
         * <li><code>JVS</code>: JVS Claw business</li>
         * <li><code>ENTERPRISE</code>: Enterprise Edition business</li>
         * <li><code>ENTERPRISE_JVS</code>: Enterprise Edition JVS Computer business</li>
         * <li><code>ENTERPRISE_SEAT</code>: Enterprise Edition seat business</li>
         * <li><code>ENTERPRISE_AGENTIC_COMPUTER</code>: AI cloud computer business</li>
         * <li><code>AGENTIC_COMPUTER</code>: Agentic Computer business</li>
         * <li><code>FIXED_API_KEY</code>: fixed API key call business</li>
         * </ul>
         * <p>The platform identifier does not automatically supplement the configuration capabilities or system templates for the corresponding agent.</p>
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
         * <p>The agent type, which must be consistent with the target model group.</p>
         * <p>When you create a custom or managed model connection configuration, the following types are supported:</p>
         * <ul>
         * <li><code>OpenClaw</code>: OpenClaw agent</li>
         * <li><code>HermesAgent</code>: Hermes agent</li>
         * <li><code>AgenticComputer</code>: Agentic Computer agent</li>
         * <li><code>Common</code>: common model group</li>
         * </ul>
         * <p>The provider configuration for <code>Common</code> uses the same field format as <code>OpenClaw</code>. The presence of an agent name in other businesses does not mean that this operation supports its model connection configuration.</p>
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
         * <p>The business type, which is used to identify the business to which the model provider template belongs. Set this parameter to <code>1</code> for Enterprise Edition. This operation does not provide a default value for this parameter.</p>
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
         * <p>The connection configuration of the model provider, passed as a JSON string.</p>
         * <p><strong>When <code>ProviderType</code> is <code>Managed</code> or <code>Custom</code>, you must provide the service endpoint and key.</strong> The field names depend on <code>AgentProvider</code>:</p>
         * <ul>
         * <li><code>OpenClaw</code>, <code>AgenticComputer</code>, and <code>Common</code>: use <code>baseUrl</code> and <code>apiKey</code>. The protocol configuration field is <code>api</code>.</li>
         * <li><code>HermesAgent</code>: use <code>base_url</code> and <code>api_key</code>. The protocol configuration field is <code>api_mode</code>.</li>
         * </ul>
         * <p>Do not mix the two field formats. The key is encrypted and saved after creation. When <code>ProviderType</code> is <code>WuyingPlan</code> or <code>WuyingCredit</code>, the configuration is copied from the system template, and you do not need to pass this parameter.</p>
         * <h3>Endpoint and key verification</h3>
         * <ul>
         * <li><code>Managed</code>: The service endpoint must exactly match the available endpoint configured by the platform for the provider. Bailian, Moonshot, and SiliconFlow use the provided key to request the <code>/models</code> API under the service endpoint. If the verification request fails, the creation fails and <code>ApiKey.Invalid</code> is returned. Invalid, inactive, or mismatched keys, as well as connection failures during the verification request, may trigger this error.</li>
         * <li><code>Custom</code>: The provider name must start with <code>provider-</code>, and the service endpoint must be a valid public HTTP or HTTPS address. The preceding online key verification for the model list API is not performed during creation.</li>
         * </ul>
         * <p>Other supported managed providers do not perform the preceding <code>/models</code> online verification. Successful creation does not replace actual model call verification. The keys in the examples are desensitized. You must use valid keys for actual calls.</p>
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
         * <p>Alibaba Cloud Bailian provider</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Wuying secure proxy.</p>
         * <ul>
         * <li><code>true</code>: Yes.</li>
         * <li><code>false</code>: No.</li>
         * </ul>
         * <p>When <code>ProviderType</code> is <code>Managed</code> or <code>Custom</code>, this parameter takes effect only when the service provides proxy capabilities. If the service does not provide proxy capabilities, setting this parameter to <code>true</code> does not enable the proxy.</p>
         * <p>When <code>ProviderType</code> is <code>WuyingPlan</code> or <code>WuyingCredit</code>, the actual proxy configuration is copied with the preset template and is not overridden by this parameter. Set this parameter to <code>true</code> when you use <code>WuyingCredit</code>. If the service requires the secure proxy to be enabled but the request is not set to <code>true</code>, <code>ModelProviderTemplate.WuyingProxyRequired</code> is returned.</p>
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
         * <p>The ID of the associated model group.</p>
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
         * <p>Alibaba Cloud Bailian</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The name of the model provider. The name must be unique within the same model group.</p>
         * <ul>
         * <li><p>If <code>ProviderType</code> is <code>WuyingPlan</code>, set this parameter to <code>wuying-plan</code>.</p>
         * </li>
         * <li><p>If <code>ProviderType</code> is <code>WuyingCredit</code>, set this parameter to <code>wuying-credit</code>.</p>
         * </li>
         * <li><p>If <code>ProviderType</code> is <code>Custom</code>, the name must start with <code>provider-</code>.</p>
         * </li>
         * <li><p>If <code>ProviderType</code> is <code>Managed</code>, use one of the following provider names. <code>OpenClaw</code>, <code>AgenticComputer</code>, and <code>Common</code> use the values in the list. <code>HermesAgent</code> uses the names with the <code>wuying-</code> prefix, such as <code>wuying-bailian</code>.</p>
         * </li>
         * <li><p><code>bailian</code>: Alibaba Cloud Bailian</p>
         * </li>
         * <li><p><code>moonshot</code>: Moonshot</p>
         * </li>
         * <li><p><code>siliconflow</code>: SiliconFlow</p>
         * </li>
         * <li><p><code>bailian-coding</code>: Alibaba Cloud Bailian Coding Plan</p>
         * </li>
         * <li><p><code>bailian-token-plan</code>: Alibaba Cloud Bailian Token Plan</p>
         * </li>
         * <li><p><code>kimi-coding</code>: Kimi Coding Plan</p>
         * </li>
         * <li><p><code>zhipu</code>: Zhipu AI</p>
         * </li>
         * <li><p><code>zhipu-coding</code>: Zhipu AI Coding Plan</p>
         * </li>
         * <li><p><code>minimax-token-plan</code>: MiniMax Token Plan</p>
         * </li>
         * </ul>
         * <p>Whether the provider can be created also depends on whether the corresponding service endpoint and business configuration are available.</p>
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
         * <p>The access type of the model provider. We recommend that you explicitly pass this parameter. The value is case-sensitive.</p>
         * <ul>
         * <li><code>WuyingPlan</code>: Wuying plan model. <code>ProviderName</code> must be <code>wuying-plan</code>. The configuration is copied from the system template applicable to the current business and agent type. You do not need to provide <code>Config</code>.</li>
         * <li><code>WuyingCredit</code>: Wuying credit package model. <code>ProviderName</code> must be <code>wuying-credit</code>. The configuration is copied from the system template. You do not need to provide <code>Config</code>. Set <code>EnableWuyingProxy</code> to <code>true</code>.</li>
         * <li><code>Managed</code>: third-party model provider managed by the platform. You must provide <code>Config</code>, and the <code>ProviderName</code> and service endpoint must fall within the supported scope of the selected agent.</li>
         * <li><code>Custom</code>: custom model provider. <code>ProviderName</code> must start with <code>provider-</code>. You must provide <code>Config</code>.</li>
         * </ul>
         * <p><code>WuyingPlan</code> and <code>WuyingCredit</code> rely on the corresponding system templates being configured. If no template is found, <code>ModelProviderTemplate.NotFound</code> is returned. If this parameter is not provided, the preceding plan or credit package configuration is not automatically adopted.</p>
         * <p><code>WuyingPreset</code> indicates the system-preset intelligent models in the common model group. Do not mistake it for the template copying method of <code>WuyingPlan</code> or <code>WuyingCredit</code>.</p>
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
