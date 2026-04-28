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
 * {@link ResetConsumerApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>ResetConsumerApiKeyResponseBody</p>
 */
public class ResetConsumerApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("ConsumerId")
    private String consumerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ResetConsumerApiKeyResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.consumerId = builder.consumerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetConsumerApiKeyResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String apiKey; 
        private String consumerId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ResetConsumerApiKeyResponseBody model) {
            this.apiKey = model.apiKey;
            this.consumerId = model.consumerId;
            this.requestId = model.requestId;
        } 

        /**
         * ApiKey.
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * ConsumerId.
         */
        public Builder consumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3AA69096-757C-4647-B36C-29EBC2******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ResetConsumerApiKeyResponseBody build() {
            return new ResetConsumerApiKeyResponseBody(this);
        } 

    } 

}
