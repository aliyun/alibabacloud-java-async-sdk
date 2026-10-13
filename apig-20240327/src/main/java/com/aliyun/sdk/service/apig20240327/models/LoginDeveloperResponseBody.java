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
 * {@link LoginDeveloperResponseBody} extends {@link TeaModel}
 *
 * <p>LoginDeveloperResponseBody</p>
 */
public class LoginDeveloperResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private LoginDeveloperResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoginDeveloperResponseBody create() {
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

        private Builder(LoginDeveloperResponseBody model) {
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

        public LoginDeveloperResponseBody build() {
            return new LoginDeveloperResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link LoginDeveloperResponseBody} extends {@link TeaModel}
     *
     * <p>LoginDeveloperResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessToken")
        private String accessToken;

        @com.aliyun.core.annotation.NameInMap("expiresIn")
        private Long expiresIn;

        private Data(Builder builder) {
            this.accessToken = builder.accessToken;
            this.expiresIn = builder.expiresIn;
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

        public static final class Builder {
            private String accessToken; 
            private Long expiresIn; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessToken = model.accessToken;
                this.expiresIn = model.expiresIn;
            } 

            /**
             * <p>The access token returned for the current developer logon. This field is marked as sensitive in the API definition.</p>
             * 
             * <strong>example:</strong>
             * <p>access-token-xxxxxxxx</p>
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * <p>The int64 numeric field associated with the access token. The unit and exact meaning are not declared in the API definition.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder expiresIn(Long expiresIn) {
                this.expiresIn = expiresIn;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
