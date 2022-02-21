// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshTokenResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshTokenResponseBody</p>
 */
public class RefreshTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Token")
    private Token token;

    private RefreshTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return token
     */
    public Token getToken() {
        return this.token;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Token token; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * Token.
         */
        public Builder token(Token token) {
            this.token = token;
            return this;
        }

        public RefreshTokenResponseBody build() {
            return new RefreshTokenResponseBody(this);
        } 

    } 

    public static class Token extends TeaModel {
        @NameInMap("SignData")
        private String signData;

        @NameInMap("Signature")
        private String signature;

        private Token(Builder builder) {
            this.signData = builder.signData;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Token create() {
            return builder().build();
        }

        /**
         * @return signData
         */
        public String getSignData() {
            return this.signData;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        public static final class Builder {
            private String signData; 
            private String signature; 

            /**
             * SignData.
             */
            public Builder signData(String signData) {
                this.signData = signData;
                return this;
            }

            /**
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public Token build() {
                return new Token(this);
            } 

        } 

    }
}
