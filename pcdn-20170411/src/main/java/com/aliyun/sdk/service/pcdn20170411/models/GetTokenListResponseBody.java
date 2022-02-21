// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTokenListResponseBody} extends {@link TeaModel}
 *
 * <p>GetTokenListResponseBody</p>
 */
public class GetTokenListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TokenList")
    private TokenList tokenList;

    private GetTokenListResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.tokenList = builder.tokenList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTokenListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tokenList
     */
    public TokenList getTokenList() {
        return this.tokenList;
    }

    public static final class Builder {
        private Integer code; 
        private String requestId; 
        private TokenList tokenList; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * TokenList.
         */
        public Builder tokenList(TokenList tokenList) {
            this.tokenList = tokenList;
            return this;
        }

        public GetTokenListResponseBody build() {
            return new GetTokenListResponseBody(this);
        } 

    } 

    public static class Token extends TeaModel {
        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("CreatedAt")
        private String createdAt;

        @NameInMap("PlatformName")
        private String platformName;

        @NameInMap("PlatformType")
        private String platformType;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("Token")
        private String token;

        @NameInMap("UpdatedAt")
        private String updatedAt;

        private Token(Builder builder) {
            this.clientId = builder.clientId;
            this.createdAt = builder.createdAt;
            this.platformName = builder.platformName;
            this.platformType = builder.platformType;
            this.resourceId = builder.resourceId;
            this.token = builder.token;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Token create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return platformName
         */
        public String getPlatformName() {
            return this.platformName;
        }

        /**
         * @return platformType
         */
        public String getPlatformType() {
            return this.platformType;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String clientId; 
            private String createdAt; 
            private String platformName; 
            private String platformType; 
            private String resourceId; 
            private String token; 
            private String updatedAt; 

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * PlatformName.
             */
            public Builder platformName(String platformName) {
                this.platformName = platformName;
                return this;
            }

            /**
             * PlatformType.
             */
            public Builder platformType(String platformType) {
                this.platformType = platformType;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * Token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * UpdatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Token build() {
                return new Token(this);
            } 

        } 

    }
    public static class TokenList extends TeaModel {
        @NameInMap("Token")
        private java.util.List < Token> token;

        private TokenList(Builder builder) {
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TokenList create() {
            return builder().build();
        }

        /**
         * @return token
         */
        public java.util.List < Token> getToken() {
            return this.token;
        }

        public static final class Builder {
            private java.util.List < Token> token; 

            /**
             * Token.
             */
            public Builder token(java.util.List < Token> token) {
                this.token = token;
                return this;
            }

            public TokenList build() {
                return new TokenList(this);
            } 

        } 

    }
}
