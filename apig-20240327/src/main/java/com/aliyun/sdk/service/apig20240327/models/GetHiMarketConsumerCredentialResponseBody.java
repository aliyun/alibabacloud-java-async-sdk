// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetHiMarketConsumerCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>GetHiMarketConsumerCredentialResponseBody</p>
 */
public class GetHiMarketConsumerCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetHiMarketConsumerCredentialResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHiMarketConsumerCredentialResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetHiMarketConsumerCredentialResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHiMarketConsumerCredentialResponseBody build() {
            return new GetHiMarketConsumerCredentialResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHiMarketConsumerCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>GetHiMarketConsumerCredentialResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKeyConfig")
        private HiMarketApiKeyConfig apiKeyConfig;

        @com.aliyun.core.annotation.NameInMap("hmacConfig")
        private HiMarketHmacConfig hmacConfig;

        private Data(Builder builder) {
            this.apiKeyConfig = builder.apiKeyConfig;
            this.hmacConfig = builder.hmacConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiKeyConfig
         */
        public HiMarketApiKeyConfig getApiKeyConfig() {
            return this.apiKeyConfig;
        }

        /**
         * @return hmacConfig
         */
        public HiMarketHmacConfig getHmacConfig() {
            return this.hmacConfig;
        }

        public static final class Builder {
            private HiMarketApiKeyConfig apiKeyConfig; 
            private HiMarketHmacConfig hmacConfig; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiKeyConfig = model.apiKeyConfig;
                this.hmacConfig = model.hmacConfig;
            } 

            /**
             * <p>The API key credential configuration of the consumer. This corresponds to the common data structure HiMarketApiKeyConfig and includes the key, source, and credentials list members. Each item in the credentials list contains an apiKey.</p>
             */
            public Builder apiKeyConfig(HiMarketApiKeyConfig apiKeyConfig) {
                this.apiKeyConfig = apiKeyConfig;
                return this;
            }

            /**
             * <p>The HMAC credential configuration of the consumer. This corresponds to the common data structure HiMarketHmacConfig and includes the credentials list member. Each item in the credentials list contains an ak and an sk.</p>
             */
            public Builder hmacConfig(HiMarketHmacConfig hmacConfig) {
                this.hmacConfig = hmacConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
