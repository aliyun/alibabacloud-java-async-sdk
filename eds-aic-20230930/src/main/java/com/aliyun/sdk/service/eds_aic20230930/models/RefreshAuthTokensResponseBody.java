// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link RefreshAuthTokensResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshAuthTokensResponseBody</p>
 */
public class RefreshAuthTokensResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RefreshAuthTokensResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshAuthTokensResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RefreshAuthTokensResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>请求ID</p>
         * 
         * <strong>example:</strong>
         * <p>9A51B1DF-96FF-3BCC-B08C-783161D3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefreshAuthTokensResponseBody build() {
            return new RefreshAuthTokensResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RefreshAuthTokensResponseBody} extends {@link TeaModel}
     *
     * <p>RefreshAuthTokensResponseBody</p>
     */
    public static class Tokens extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthToken")
        private String authToken;

        @com.aliyun.core.annotation.NameInMap("ExpireAt")
        private Long expireAt;

        @com.aliyun.core.annotation.NameInMap("ExpireSeconds")
        private Long expireSeconds;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IssuedAt")
        private Long issuedAt;

        @com.aliyun.core.annotation.NameInMap("LicenseKey")
        private String licenseKey;

        private Tokens(Builder builder) {
            this.authToken = builder.authToken;
            this.expireAt = builder.expireAt;
            this.expireSeconds = builder.expireSeconds;
            this.instanceId = builder.instanceId;
            this.issuedAt = builder.issuedAt;
            this.licenseKey = builder.licenseKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tokens create() {
            return builder().build();
        }

        /**
         * @return authToken
         */
        public String getAuthToken() {
            return this.authToken;
        }

        /**
         * @return expireAt
         */
        public Long getExpireAt() {
            return this.expireAt;
        }

        /**
         * @return expireSeconds
         */
        public Long getExpireSeconds() {
            return this.expireSeconds;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return issuedAt
         */
        public Long getIssuedAt() {
            return this.issuedAt;
        }

        /**
         * @return licenseKey
         */
        public String getLicenseKey() {
            return this.licenseKey;
        }

        public static final class Builder {
            private String authToken; 
            private Long expireAt; 
            private Long expireSeconds; 
            private String instanceId; 
            private Long issuedAt; 
            private String licenseKey; 

            private Builder() {
            } 

            private Builder(Tokens model) {
                this.authToken = model.authToken;
                this.expireAt = model.expireAt;
                this.expireSeconds = model.expireSeconds;
                this.instanceId = model.instanceId;
                this.issuedAt = model.issuedAt;
                this.licenseKey = model.licenseKey;
            } 

            /**
             * <p>JWT Token 或 API Key 明文</p>
             * 
             * <strong>example:</strong>
             * <p>cp******lp</p>
             */
            public Builder authToken(String authToken) {
                this.authToken = authToken;
                return this;
            }

            /**
             * <p>过期时间（Unix 时间戳，秒）</p>
             * 
             * <strong>example:</strong>
             * <p>1719648600</p>
             */
            public Builder expireAt(Long expireAt) {
                this.expireAt = expireAt;
                return this;
            }

            /**
             * <p>有效期（秒）</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder expireSeconds(Long expireSeconds) {
                this.expireSeconds = expireSeconds;
                return this;
            }

            /**
             * <p>实例 ID</p>
             * 
             * <strong>example:</strong>
             * <p>acp-2zef0gov2nh2l3xxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>签发时间（Unix 时间戳，秒）</p>
             * 
             * <strong>example:</strong>
             * <p>1719648000</p>
             */
            public Builder issuedAt(Long issuedAt) {
                this.issuedAt = issuedAt;
                return this;
            }

            /**
             * <p>授权密钥</p>
             * 
             * <strong>example:</strong>
             * <p>lk-abcdef1234567890</p>
             */
            public Builder licenseKey(String licenseKey) {
                this.licenseKey = licenseKey;
                return this;
            }

            public Tokens build() {
                return new Tokens(this);
            } 

        } 

    }
    /**
     * 
     * {@link RefreshAuthTokensResponseBody} extends {@link TeaModel}
     *
     * <p>RefreshAuthTokensResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseUrl")
        private String baseUrl;

        @com.aliyun.core.annotation.NameInMap("Tokens")
        private java.util.List<Tokens> tokens;

        private Data(Builder builder) {
            this.baseUrl = builder.baseUrl;
            this.tokens = builder.tokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        /**
         * @return tokens
         */
        public java.util.List<Tokens> getTokens() {
            return this.tokens;
        }

        public static final class Builder {
            private String baseUrl; 
            private java.util.List<Tokens> tokens; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.baseUrl = model.baseUrl;
                this.tokens = model.tokens;
            } 

            /**
             * <p>模型网关访问 URL（与 apiCode 绑定，可选）</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ai-gateway.example.com/v1">https://ai-gateway.example.com/v1</a></p>
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * <p>批量签发的令牌结果列表</p>
             */
            public Builder tokens(java.util.List<Tokens> tokens) {
                this.tokens = tokens;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
