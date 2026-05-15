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
 * {@link ModelConnectionConsumerAPIKey} extends {@link TeaModel}
 *
 * <p>ModelConnectionConsumerAPIKey</p>
 */
public class ModelConnectionConsumerAPIKey extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKeyId")
    private String apiKeyId;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private ModelConnectionConsumerAPIKey(Builder builder) {
        this.apiKeyId = builder.apiKeyId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelConnectionConsumerAPIKey create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder(ModelConnectionConsumerAPIKey model) {
            this.apiKeyId = model.apiKeyId;
            this.value = model.value;
        } 

        /**
         * <p>消费者API密钥记录的唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789abc</p>
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

        public ModelConnectionConsumerAPIKey build() {
            return new ModelConnectionConsumerAPIKey(this);
        } 

    } 

}
