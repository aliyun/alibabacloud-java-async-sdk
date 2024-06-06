// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FetchAccessTokenResponseBody} extends {@link TeaModel}
 *
 * <p>FetchAccessTokenResponseBody</p>
 */
public class FetchAccessTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private FetchAccessTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchAccessTokenResponseBody create() {
        return builder().build();
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public FetchAccessTokenResponseBody build() {
            return new FetchAccessTokenResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Access_token")
        private String accessToken;

        @com.aliyun.core.annotation.NameInMap("Expires_in")
        private String expiresIn;

        @com.aliyun.core.annotation.NameInMap("Id_token")
        private String idToken;

        @com.aliyun.core.annotation.NameInMap("Refresh_token")
        private String refreshToken;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Token_type")
        private String tokenType;

        private Data(Builder builder) {
            this.accessToken = builder.accessToken;
            this.expiresIn = builder.expiresIn;
            this.idToken = builder.idToken;
            this.refreshToken = builder.refreshToken;
            this.scope = builder.scope;
            this.tokenType = builder.tokenType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessToken
         */
        public String getAccessToken() {
            return this.accessToken;
        }

        /**
         * @return expiresIn
         */
        public String getExpiresIn() {
            return this.expiresIn;
        }

        /**
         * @return idToken
         */
        public String getIdToken() {
            return this.idToken;
        }

        /**
         * @return refreshToken
         */
        public String getRefreshToken() {
            return this.refreshToken;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return tokenType
         */
        public String getTokenType() {
            return this.tokenType;
        }

        public static final class Builder {
            private String accessToken; 
            private String expiresIn; 
            private String idToken; 
            private String refreshToken; 
            private String scope; 
            private String tokenType; 

            /**
             * Access_token.
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * Expires_in.
             */
            public Builder expiresIn(String expiresIn) {
                this.expiresIn = expiresIn;
                return this;
            }

            /**
             * Id_token.
             */
            public Builder idToken(String idToken) {
                this.idToken = idToken;
                return this;
            }

            /**
             * Refresh_token.
             */
            public Builder refreshToken(String refreshToken) {
                this.refreshToken = refreshToken;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * Token_type.
             */
            public Builder tokenType(String tokenType) {
                this.tokenType = tokenType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
