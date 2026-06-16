// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link CreateContextStoreAPIKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateContextStoreAPIKeyResponseBody</p>
 */
public class CreateContextStoreAPIKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateContextStoreAPIKeyResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContextStoreAPIKeyResponseBody create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String apiKey; 
        private String name; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateContextStoreAPIKeyResponseBody model) {
            this.apiKey = model.apiKey;
            this.name = model.name;
            this.requestId = model.requestId;
        } 

        /**
         * apiKey.
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateContextStoreAPIKeyResponseBody build() {
            return new CreateContextStoreAPIKeyResponseBody(this);
        } 

    } 

}
