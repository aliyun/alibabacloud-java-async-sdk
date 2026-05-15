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
 * {@link CreateConsumerAPIKeyInput} extends {@link TeaModel}
 *
 * <p>CreateConsumerAPIKeyInput</p>
 */
public class CreateConsumerAPIKeyInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("modelConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelConnectionId;

    private CreateConsumerAPIKeyInput(Builder builder) {
        this.apiKey = builder.apiKey;
        this.description = builder.description;
        this.modelConnectionId = builder.modelConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerAPIKeyInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return modelConnectionId
     */
    public String getModelConnectionId() {
        return this.modelConnectionId;
    }

    public static final class Builder {
        private String apiKey; 
        private String description; 
        private String modelConnectionId; 

        private Builder() {
        } 

        private Builder(CreateConsumerAPIKeyInput model) {
            this.apiKey = model.apiKey;
            this.description = model.description;
            this.modelConnectionId = model.modelConnectionId;
        } 

        /**
         * <p>用户自定义的完整API密钥；为空时由服务自动生成</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>消费者API密钥的描述信息，用于说明该密钥的用途</p>
         * 
         * <strong>example:</strong>
         * <p>用于生产环境的API密钥</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>关联的模型连接标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-1234567890abcdef</p>
         */
        public Builder modelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }

        public CreateConsumerAPIKeyInput build() {
            return new CreateConsumerAPIKeyInput(this);
        } 

    } 

}
