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
 * {@link DeleteAIDBClusterApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAIDBClusterApiKeyResponseBody</p>
 */
public class DeleteAIDBClusterApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteAIDBClusterApiKeyResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAIDBClusterApiKeyResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String apiKey; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteAIDBClusterApiKeyResponseBody model) {
            this.apiKey = model.apiKey;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The API key for the model service.</p>
         * 
         * <strong>example:</strong>
         * <p>6c4b1f0317cd4fd7a5b446d3503d**</p>
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>068F730C-9130-596E-B696-5B4388C840DF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAIDBClusterApiKeyResponseBody build() {
            return new DeleteAIDBClusterApiKeyResponseBody(this);
        } 

    } 

}
