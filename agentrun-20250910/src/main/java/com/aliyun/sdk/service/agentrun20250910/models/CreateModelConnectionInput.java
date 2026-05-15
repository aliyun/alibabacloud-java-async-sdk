// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CreateModelConnectionInput} extends {@link TeaModel}
 *
 * <p>CreateModelConnectionInput</p>
 */
public class CreateModelConnectionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("consumerApiKeys")
    private java.util.List<ConsumerApiKeys> consumerApiKeys;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("modelConnectionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelConnectionName;

    @com.aliyun.core.annotation.NameInMap("modelInfoConfigs")
    private java.util.List<ModelInfoConfig> modelInfoConfigs;

    @com.aliyun.core.annotation.NameInMap("provider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String provider;

    @com.aliyun.core.annotation.NameInMap("providerSettings")
    @com.aliyun.core.annotation.Validation(required = true)
    private ModelConnectionProviderSettings providerSettings;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private CreateModelConnectionInput(Builder builder) {
        this.consumerApiKeys = builder.consumerApiKeys;
        this.description = builder.description;
        this.modelConnectionName = builder.modelConnectionName;
        this.modelInfoConfigs = builder.modelInfoConfigs;
        this.provider = builder.provider;
        this.providerSettings = builder.providerSettings;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelConnectionInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerApiKeys
     */
    public java.util.List<ConsumerApiKeys> getConsumerApiKeys() {
        return this.consumerApiKeys;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return modelConnectionName
     */
    public String getModelConnectionName() {
        return this.modelConnectionName;
    }

    /**
     * @return modelInfoConfigs
     */
    public java.util.List<ModelInfoConfig> getModelInfoConfigs() {
        return this.modelInfoConfigs;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return providerSettings
     */
    public ModelConnectionProviderSettings getProviderSettings() {
        return this.providerSettings;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private java.util.List<ConsumerApiKeys> consumerApiKeys; 
        private String description; 
        private String modelConnectionName; 
        private java.util.List<ModelInfoConfig> modelInfoConfigs; 
        private String provider; 
        private ModelConnectionProviderSettings providerSettings; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(CreateModelConnectionInput model) {
            this.consumerApiKeys = model.consumerApiKeys;
            this.description = model.description;
            this.modelConnectionName = model.modelConnectionName;
            this.modelInfoConfigs = model.modelInfoConfigs;
            this.provider = model.provider;
            this.providerSettings = model.providerSettings;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>要绑定的消费者API密钥列表；空表示开放模式</p>
         */
        public Builder consumerApiKeys(java.util.List<ConsumerApiKeys> consumerApiKeys) {
            this.consumerApiKeys = consumerApiKeys;
            return this;
        }

        /**
         * <p>模型连接的描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAI GPT-4 connection for production</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>模型连接的唯一名称标识</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-openai-connection</p>
         */
        public Builder modelConnectionName(String modelConnectionName) {
            this.modelConnectionName = modelConnectionName;
            return this;
        }

        /**
         * <p>模型元数据配置列表</p>
         */
        public Builder modelInfoConfigs(java.util.List<ModelInfoConfig> modelInfoConfigs) {
            this.modelInfoConfigs = modelInfoConfigs;
            return this;
        }

        /**
         * <p>模型提供商名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>openai</p>
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * <p>模型提供商的配置信息，包括基础URL、模型列表等</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder providerSettings(ModelConnectionProviderSettings providerSettings) {
            this.providerSettings = providerSettings;
            return this;
        }

        /**
         * <p>模型连接所属的工作空间标识符</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1234567890abcdef</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public CreateModelConnectionInput build() {
            return new CreateModelConnectionInput(this);
        } 

    } 

    /**
     * 
     * {@link CreateModelConnectionInput} extends {@link TeaModel}
     *
     * <p>CreateModelConnectionInput</p>
     */
    public static class ConsumerApiKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKeyId")
        private String apiKeyId;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ConsumerApiKeys(Builder builder) {
            this.apiKeyId = builder.apiKeyId;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerApiKeys create() {
            return builder().build();
        }

        /**
         * @return apiKeyId
         */
        public String getApiKeyId() {
            return this.apiKeyId;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String apiKeyId; 
            private String value; 

            private Builder() {
            } 

            private Builder(ConsumerApiKeys model) {
                this.apiKeyId = model.apiKeyId;
                this.value = model.value;
            } 

            /**
             * apiKeyId.
             */
            public Builder apiKeyId(String apiKeyId) {
                this.apiKeyId = apiKeyId;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConsumerApiKeys build() {
                return new ConsumerApiKeys(this);
            } 

        } 

    }
}
