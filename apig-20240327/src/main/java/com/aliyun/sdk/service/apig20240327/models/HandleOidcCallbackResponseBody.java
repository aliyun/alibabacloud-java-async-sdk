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
 * {@link HandleOidcCallbackResponseBody} extends {@link TeaModel}
 *
 * <p>HandleOidcCallbackResponseBody</p>
 */
public class HandleOidcCallbackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private HandleOidcCallbackResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HandleOidcCallbackResponseBody create() {
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

        private Builder(HandleOidcCallbackResponseBody model) {
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

        public HandleOidcCallbackResponseBody build() {
            return new HandleOidcCallbackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HandleOidcCallbackResponseBody} extends {@link TeaModel}
     *
     * <p>HandleOidcCallbackResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessToken")
        private String accessToken;

        @com.aliyun.core.annotation.NameInMap("expiresIn")
        private Long expiresIn;

        @com.aliyun.core.annotation.NameInMap("tokenType")
        private String tokenType;

        private Data(Builder builder) {
            this.accessToken = builder.accessToken;
            this.expiresIn = builder.expiresIn;
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
        public Long getExpiresIn() {
            return this.expiresIn;
        }

        /**
         * @return tokenType
         */
        public String getTokenType() {
            return this.tokenType;
        }

        public static final class Builder {
            private String accessToken; 
            private Long expiresIn; 
            private String tokenType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessToken = model.accessToken;
                this.expiresIn = model.expiresIn;
                this.tokenType = model.tokenType;
            } 

            /**
             * <p>The access token returned for the current OIDC logon. The API definition marks this field as sensitive.</p>
             * 
             * <strong>example:</strong>
             * <p>access-token-xxxxxxxx</p>
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * <p>The validity period value of the access token. The unit is not specified in the API definition.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder expiresIn(Long expiresIn) {
                this.expiresIn = expiresIn;
                return this;
            }

            /**
             * <p>The type identifier of the access token. The valid values are not specified in the API definition.</p>
             * 
             * <strong>example:</strong>
             * <p>token-type-xxxxxxxx</p>
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
