// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link GetSupabaseProjectApiKeysResponseBody} extends {@link TeaModel}
 *
 * <p>GetSupabaseProjectApiKeysResponseBody</p>
 */
public class GetSupabaseProjectApiKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKeys")
    private java.util.List<ApiKeys> apiKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSupabaseProjectApiKeysResponseBody(Builder builder) {
        this.apiKeys = builder.apiKeys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSupabaseProjectApiKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeys
     */
    public java.util.List<ApiKeys> getApiKeys() {
        return this.apiKeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ApiKeys> apiKeys; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSupabaseProjectApiKeysResponseBody model) {
            this.apiKeys = model.apiKeys;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried API keys.</p>
         */
        public Builder apiKeys(java.util.List<ApiKeys> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSupabaseProjectApiKeysResponseBody build() {
            return new GetSupabaseProjectApiKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSupabaseProjectApiKeysResponseBody} extends {@link TeaModel}
     *
     * <p>GetSupabaseProjectApiKeysResponseBody</p>
     */
    public static class ApiKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ApiKeys(Builder builder) {
            this.apiKey = builder.apiKey;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiKeys create() {
            return builder().build();
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

        public static final class Builder {
            private String apiKey; 
            private String name; 

            private Builder() {
            } 

            private Builder(ApiKeys model) {
                this.apiKey = model.apiKey;
                this.name = model.name;
            } 

            /**
             * <p>The queried API key.</p>
             * 
             * <strong>example:</strong>
             * <p>Tmz2Z59caMDeq/Xi9vuc****</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The name of the API key, including the Anon key and the service role key.</p>
             * 
             * <strong>example:</strong>
             * <p>anon key</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ApiKeys build() {
                return new ApiKeys(this);
            } 

        } 

    }
}
