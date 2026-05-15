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
 * {@link UpdateModelConnectionInput} extends {@link TeaModel}
 *
 * <p>UpdateModelConnectionInput</p>
 */
public class UpdateModelConnectionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("consumerApiKeys")
    private java.util.List<ConsumerApiKeys> consumerApiKeys;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("modelInfoConfigs")
    private java.util.List<ModelInfoConfig> modelInfoConfigs;

    @com.aliyun.core.annotation.NameInMap("providerSettings")
    private ModelConnectionProviderSettings providerSettings;

    private UpdateModelConnectionInput(Builder builder) {
        this.consumerApiKeys = builder.consumerApiKeys;
        this.description = builder.description;
        this.modelInfoConfigs = builder.modelInfoConfigs;
        this.providerSettings = builder.providerSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelConnectionInput create() {
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
     * @return modelInfoConfigs
     */
    public java.util.List<ModelInfoConfig> getModelInfoConfigs() {
        return this.modelInfoConfigs;
    }

    /**
     * @return providerSettings
     */
    public ModelConnectionProviderSettings getProviderSettings() {
        return this.providerSettings;
    }

    public static final class Builder {
        private java.util.List<ConsumerApiKeys> consumerApiKeys; 
        private String description; 
        private java.util.List<ModelInfoConfig> modelInfoConfigs; 
        private ModelConnectionProviderSettings providerSettings; 

        private Builder() {
        } 

        private Builder(UpdateModelConnectionInput model) {
            this.consumerApiKeys = model.consumerApiKeys;
            this.description = model.description;
            this.modelInfoConfigs = model.modelInfoConfigs;
            this.providerSettings = model.providerSettings;
        } 

        /**
         * <p>更新绑定的消费者API密钥列表</p>
         */
        public Builder consumerApiKeys(java.util.List<ConsumerApiKeys> consumerApiKeys) {
            this.consumerApiKeys = consumerApiKeys;
            return this;
        }

        /**
         * <p>更新后的描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>Updated connection description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>更新后的模型元数据配置列表</p>
         */
        public Builder modelInfoConfigs(java.util.List<ModelInfoConfig> modelInfoConfigs) {
            this.modelInfoConfigs = modelInfoConfigs;
            return this;
        }

        /**
         * <p>更新后的模型提供商配置信息</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder providerSettings(ModelConnectionProviderSettings providerSettings) {
            this.providerSettings = providerSettings;
            return this;
        }

        public UpdateModelConnectionInput build() {
            return new UpdateModelConnectionInput(this);
        } 

    } 

    /**
     * 
     * {@link UpdateModelConnectionInput} extends {@link TeaModel}
     *
     * <p>UpdateModelConnectionInput</p>
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
