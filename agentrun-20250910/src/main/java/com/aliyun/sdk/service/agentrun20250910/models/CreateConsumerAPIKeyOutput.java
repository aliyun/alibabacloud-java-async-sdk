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
 * {@link CreateConsumerAPIKeyOutput} extends {@link TeaModel}
 *
 * <p>CreateConsumerAPIKeyOutput</p>
 */
public class CreateConsumerAPIKeyOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("active")
    private Boolean active;

    @com.aliyun.core.annotation.NameInMap("apiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("consumerApiKeyId")
    private String consumerApiKeyId;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("maskedKey")
    private String maskedKey;

    @com.aliyun.core.annotation.NameInMap("modelConnectionId")
    private String modelConnectionId;

    private CreateConsumerAPIKeyOutput(Builder builder) {
        this.active = builder.active;
        this.apiKey = builder.apiKey;
        this.consumerApiKeyId = builder.consumerApiKeyId;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.lastUpdatedAt = builder.lastUpdatedAt;
        this.maskedKey = builder.maskedKey;
        this.modelConnectionId = builder.modelConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerAPIKeyOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return consumerApiKeyId
     */
    public String getConsumerApiKeyId() {
        return this.consumerApiKeyId;
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
     * @return maskedKey
     */
    public String getMaskedKey() {
        return this.maskedKey;
    }

    /**
     * @return modelConnectionId
     */
    public String getModelConnectionId() {
        return this.modelConnectionId;
    }

    public static final class Builder {
        private Boolean active; 
        private String apiKey; 
        private String consumerApiKeyId; 
        private String createdAt; 
        private String description; 
        private String lastUpdatedAt; 
        private String maskedKey; 
        private String modelConnectionId; 

        private Builder() {
        } 

        private Builder(CreateConsumerAPIKeyOutput model) {
            this.active = model.active;
            this.apiKey = model.apiKey;
            this.consumerApiKeyId = model.consumerApiKeyId;
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.lastUpdatedAt = model.lastUpdatedAt;
            this.maskedKey = model.maskedKey;
            this.modelConnectionId = model.modelConnectionId;
        } 

        /**
         * <p>密钥是否启用</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        /**
         * <p>完整的API密钥明文，仅在创建时返回一次，请妥善保存</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>消费者API密钥的唯一标识符</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789abc</p>
         */
        public Builder consumerApiKeyId(String consumerApiKeyId) {
            this.consumerApiKeyId = consumerApiKeyId;
            return this;
        }

        /**
         * <p>创建时间，采用ISO 8601格式</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-10T10:30:00Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>消费者API密钥的描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>用于生产环境的API密钥</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>更新时间，采用ISO 8601格式</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-10T10:30:00Z</p>
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        /**
         * <p>API密钥的掩码展示形式</p>
         * 
         * <strong>example:</strong>
         * <p>sk-****1234</p>
         */
        public Builder maskedKey(String maskedKey) {
            this.maskedKey = maskedKey;
            return this;
        }

        /**
         * <p>关联的模型连接标识符</p>
         * 
         * <strong>example:</strong>
         * <p>mc-1234567890abcdef</p>
         */
        public Builder modelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }

        public CreateConsumerAPIKeyOutput build() {
            return new CreateConsumerAPIKeyOutput(this);
        } 

    } 

}
