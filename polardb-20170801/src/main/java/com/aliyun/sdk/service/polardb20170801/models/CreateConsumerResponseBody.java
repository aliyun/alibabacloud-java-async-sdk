// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateConsumerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConsumerResponseBody</p>
 */
public class CreateConsumerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("ConsumerId")
    private String consumerId;

    @com.aliyun.core.annotation.NameInMap("KeyType")
    private String keyType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateConsumerResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.consumerId = builder.consumerId;
        this.keyType = builder.keyType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerResponseBody create() {
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
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return keyType
     */
    public String getKeyType() {
        return this.keyType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String apiKey; 
        private String consumerId; 
        private String keyType; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateConsumerResponseBody model) {
            this.apiKey = model.apiKey;
            this.consumerId = model.consumerId;
            this.keyType = model.keyType;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The full APIKey, returned only in this response.</p>
         * 
         * <strong>example:</strong>
         * <p>6c4b1f0317cd4fd7a5b446d3503d**</p>
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>The consumer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-mqveroemc***</p>
         */
        public Builder consumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }

        /**
         * <p>The key type. The value is always ApiKey.</p>
         * 
         * <strong>example:</strong>
         * <p>ApiKey</p>
         */
        public Builder keyType(String keyType) {
            this.keyType = keyType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateConsumerResponseBody build() {
            return new CreateConsumerResponseBody(this);
        } 

    } 

}
