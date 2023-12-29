// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSmsAuthTokensResponseBody} extends {@link TeaModel}
 *
 * <p>GetSmsAuthTokensResponseBody</p>
 */
public class GetSmsAuthTokensResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetSmsAuthTokensResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmsAuthTokensResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The response code.
         * <p>
         * 
         * *   If OK is returned, the request is successful.
         * *   For more information about other error codes, see [API response codes](~~85198~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSmsAuthTokensResponseBody build() {
            return new GetSmsAuthTokensResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BizToken")
        private String bizToken;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("StsAccessKeyId")
        private String stsAccessKeyId;

        @NameInMap("StsAccessKeySecret")
        private String stsAccessKeySecret;

        @NameInMap("StsToken")
        private String stsToken;

        private Data(Builder builder) {
            this.bizToken = builder.bizToken;
            this.expireTime = builder.expireTime;
            this.stsAccessKeyId = builder.stsAccessKeyId;
            this.stsAccessKeySecret = builder.stsAccessKeySecret;
            this.stsToken = builder.stsToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizToken
         */
        public String getBizToken() {
            return this.bizToken;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return stsAccessKeyId
         */
        public String getStsAccessKeyId() {
            return this.stsAccessKeyId;
        }

        /**
         * @return stsAccessKeySecret
         */
        public String getStsAccessKeySecret() {
            return this.stsAccessKeySecret;
        }

        /**
         * @return stsToken
         */
        public String getStsToken() {
            return this.stsToken;
        }

        public static final class Builder {
            private String bizToken; 
            private Long expireTime; 
            private String stsAccessKeyId; 
            private String stsAccessKeySecret; 
            private String stsToken; 

            /**
             * The business token.
             */
            public Builder bizToken(String bizToken) {
                this.bizToken = bizToken;
                return this;
            }

            /**
             * The time when the token expired. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The AccessKey ID.
             */
            public Builder stsAccessKeyId(String stsAccessKeyId) {
                this.stsAccessKeyId = stsAccessKeyId;
                return this;
            }

            /**
             * The AccessKey secret.
             */
            public Builder stsAccessKeySecret(String stsAccessKeySecret) {
                this.stsAccessKeySecret = stsAccessKeySecret;
                return this;
            }

            /**
             * The security token.
             */
            public Builder stsToken(String stsToken) {
                this.stsToken = stsToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
