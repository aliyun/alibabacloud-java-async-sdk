// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelservice20220614.models;

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
 * {@link GetUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserResponseBody</p>
 */
public class GetUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AnthropicHost")
    private String anthropicHost;

    @com.aliyun.core.annotation.NameInMap("ApiKeys")
    private java.util.List<ApiKeys> apiKeys;

    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DashscopeHost")
    private String dashscopeHost;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("InnerToken")
    private String innerToken;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetUserResponseBody(Builder builder) {
        this.anthropicHost = builder.anthropicHost;
        this.apiKeys = builder.apiKeys;
        this.appId = builder.appId;
        this.code = builder.code;
        this.dashscopeHost = builder.dashscopeHost;
        this.host = builder.host;
        this.innerToken = builder.innerToken;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anthropicHost
     */
    public String getAnthropicHost() {
        return this.anthropicHost;
    }

    /**
     * @return apiKeys
     */
    public java.util.List<ApiKeys> getApiKeys() {
        return this.apiKeys;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dashscopeHost
     */
    public String getDashscopeHost() {
        return this.dashscopeHost;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return innerToken
     */
    public String getInnerToken() {
        return this.innerToken;
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

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private String anthropicHost; 
        private java.util.List<ApiKeys> apiKeys; 
        private String appId; 
        private String code; 
        private String dashscopeHost; 
        private String host; 
        private String innerToken; 
        private String message; 
        private String requestId; 
        private String token; 

        private Builder() {
        } 

        private Builder(GetUserResponseBody model) {
            this.anthropicHost = model.anthropicHost;
            this.apiKeys = model.apiKeys;
            this.appId = model.appId;
            this.code = model.code;
            this.dashscopeHost = model.dashscopeHost;
            this.host = model.host;
            this.innerToken = model.innerToken;
            this.message = model.message;
            this.requestId = model.requestId;
            this.token = model.token;
        } 

        /**
         * AnthropicHost.
         */
        public Builder anthropicHost(String anthropicHost) {
            this.anthropicHost = anthropicHost;
            return this;
        }

        /**
         * ApiKeys.
         */
        public Builder apiKeys(java.util.List<ApiKeys> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DashscopeHost.
         */
        public Builder dashscopeHost(String dashscopeHost) {
            this.dashscopeHost = dashscopeHost;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * InnerToken.
         */
        public Builder innerToken(String innerToken) {
            this.innerToken = innerToken;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public GetUserResponseBody build() {
            return new GetUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserResponseBody</p>
     */
    public static class ApiKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("InnerApiKey")
        private String innerApiKey;

        private ApiKeys(Builder builder) {
            this.apiKey = builder.apiKey;
            this.innerApiKey = builder.innerApiKey;
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
         * @return innerApiKey
         */
        public String getInnerApiKey() {
            return this.innerApiKey;
        }

        public static final class Builder {
            private String apiKey; 
            private String innerApiKey; 

            private Builder() {
            } 

            private Builder(ApiKeys model) {
                this.apiKey = model.apiKey;
                this.innerApiKey = model.innerApiKey;
            } 

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * InnerApiKey.
             */
            public Builder innerApiKey(String innerApiKey) {
                this.innerApiKey = innerApiKey;
                return this;
            }

            public ApiKeys build() {
                return new ApiKeys(this);
            } 

        } 

    }
}
