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
 * {@link ModelConnection} extends {@link TeaModel}
 *
 * <p>ModelConnection</p>
 */
public class ModelConnection extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("consumerApiKeys")
    private java.util.List<ModelConnectionConsumerAPIKey> consumerApiKeys;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("modelConnectionId")
    private String modelConnectionId;

    @com.aliyun.core.annotation.NameInMap("modelConnectionName")
    private String modelConnectionName;

    @com.aliyun.core.annotation.NameInMap("modelInfoConfigs")
    private java.util.List<ModelInfoConfig> modelInfoConfigs;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("providerSettings")
    private ModelConnectionProviderSettings providerSettings;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private ModelConnection(Builder builder) {
        this.consumerApiKeys = builder.consumerApiKeys;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.lastUpdatedAt = builder.lastUpdatedAt;
        this.modelConnectionId = builder.modelConnectionId;
        this.modelConnectionName = builder.modelConnectionName;
        this.modelInfoConfigs = builder.modelInfoConfigs;
        this.provider = builder.provider;
        this.providerSettings = builder.providerSettings;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelConnection create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerApiKeys
     */
    public java.util.List<ModelConnectionConsumerAPIKey> getConsumerApiKeys() {
        return this.consumerApiKeys;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return lastUpdatedAt
     */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * @return modelConnectionId
     */
    public String getModelConnectionId() {
        return this.modelConnectionId;
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
        private java.util.List<ModelConnectionConsumerAPIKey> consumerApiKeys; 
        private String createdAt; 
        private String description; 
        private String lastUpdatedAt; 
        private String modelConnectionId; 
        private String modelConnectionName; 
        private java.util.List<ModelInfoConfig> modelInfoConfigs; 
        private String provider; 
        private ModelConnectionProviderSettings providerSettings; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(ModelConnection model) {
            this.consumerApiKeys = model.consumerApiKeys;
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.lastUpdatedAt = model.lastUpdatedAt;
            this.modelConnectionId = model.modelConnectionId;
            this.modelConnectionName = model.modelConnectionName;
            this.modelInfoConfigs = model.modelInfoConfigs;
            this.provider = model.provider;
            this.providerSettings = model.providerSettings;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>绑定的消费者API密钥列表</p>
         */
        public Builder consumerApiKeys(java.util.List<ModelConnectionConsumerAPIKey> consumerApiKeys) {
            this.consumerApiKeys = consumerApiKeys;
            return this;
        }

        /**
         * <p>模型连接的创建时间，采用ISO 8601格式</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-10T10:30:00Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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
         * <p>模型连接最后一次更新的时间，采用ISO 8601格式</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-10T11:45:00Z</p>
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        /**
         * <p>模型连接的唯一标识符</p>
         * 
         * <strong>example:</strong>
         * <p>mc-1234567890abcdef</p>
         */
        public Builder modelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }

        /**
         * <p>模型连接的唯一名称标识</p>
         * 
         * <strong>example:</strong>
         * <p>my-openai-connection</p>
         */
        public Builder modelConnectionName(String modelConnectionName) {
            this.modelConnectionName = modelConnectionName;
            return this;
        }

        /**
         * <p>模型元数据配置列表，包含各个模型的功能特性和参数规则</p>
         */
        public Builder modelInfoConfigs(java.util.List<ModelInfoConfig> modelInfoConfigs) {
            this.modelInfoConfigs = modelInfoConfigs;
            return this;
        }

        /**
         * <p>模型提供商名称</p>
         * 
         * <strong>example:</strong>
         * <p>openai</p>
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * <p>模型提供商的配置信息</p>
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

        public ModelConnection build() {
            return new ModelConnection(this);
        } 

    } 

}
