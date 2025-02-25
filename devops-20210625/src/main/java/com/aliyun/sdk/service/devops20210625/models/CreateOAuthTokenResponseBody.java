// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link CreateOAuthTokenResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOAuthTokenResponseBody</p>
 */
public class CreateOAuthTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private CreateOAuthTokenResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOAuthTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Result result; 
        private String success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateOAuthTokenResponseBody build() {
            return new CreateOAuthTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOAuthTokenResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOAuthTokenResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessToken")
        private String accessToken;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("tokenType")
        private String tokenType;

        private Result(Builder builder) {
            this.accessToken = builder.accessToken;
            this.id = builder.id;
            this.scope = builder.scope;
            this.tokenType = builder.tokenType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return accessToken
         */
        public String getAccessToken() {
            return this.accessToken;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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
            private String id; 
            private String scope; 
            private String tokenType; 

            /**
             * accessToken.
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * <p>id</p>
             * 
             * <strong>example:</strong>
             * <p>30815</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * tokenType.
             */
            public Builder tokenType(String tokenType) {
                this.tokenType = tokenType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
