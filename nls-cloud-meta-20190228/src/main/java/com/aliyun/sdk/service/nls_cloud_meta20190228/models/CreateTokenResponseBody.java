// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nls_cloud_meta20190228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTokenResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTokenResponseBody</p>
 */
public class CreateTokenResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    private Integer errCode;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("NlsRequestId")
    private String nlsRequestId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Token")
    private Token token;

    private CreateTokenResponseBody(Builder builder) {
        this.errCode = builder.errCode;
        this.errMsg = builder.errMsg;
        this.nlsRequestId = builder.nlsRequestId;
        this.requestId = builder.requestId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return errCode
     */
    public Integer getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return nlsRequestId
     */
    public String getNlsRequestId() {
        return this.nlsRequestId;
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
    public Token getToken() {
        return this.token;
    }

    public static final class Builder {
        private Integer errCode; 
        private String errMsg; 
        private String nlsRequestId; 
        private String requestId; 
        private Token token; 

        /**
         * ErrCode.
         */
        public Builder errCode(Integer errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }

        /**
         * NlsRequestId.
         */
        public Builder nlsRequestId(String nlsRequestId) {
            this.nlsRequestId = nlsRequestId;
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
        public Builder token(Token token) {
            this.token = token;
            return this;
        }

        public CreateTokenResponseBody build() {
            return new CreateTokenResponseBody(this);
        } 

    } 

    public static class Token extends TeaModel {
        @NameInMap("ExpireTime")
        private Integer expireTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("UserId")
        private String userId;

        private Token(Builder builder) {
            this.expireTime = builder.expireTime;
            this.id = builder.id;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Token create() {
            return builder().build();
        }

        /**
         * @return expireTime
         */
        public Integer getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Integer expireTime; 
            private String id; 
            private String userId; 

            /**
             * ExpireTime.
             */
            public Builder expireTime(Integer expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Token build() {
                return new Token(this);
            } 

        } 

    }
}
