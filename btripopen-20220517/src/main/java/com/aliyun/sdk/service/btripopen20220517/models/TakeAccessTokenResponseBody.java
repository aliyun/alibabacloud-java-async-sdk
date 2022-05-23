// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TakeAccessTokenResponseBody} extends {@link TeaModel}
 *
 * <p>TakeAccessTokenResponseBody</p>
 */
public class TakeAccessTokenResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("message")
    private String message;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private String success;

    private TakeAccessTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TakeAccessTokenResponseBody create() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public TakeAccessTokenResponseBody build() {
            return new TakeAccessTokenResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("access_token")
        private String accessToken;

        @NameInMap("expire")
        private Long expire;

        private Data(Builder builder) {
            this.accessToken = builder.accessToken;
            this.expire = builder.expire;
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
         * @return expire
         */
        public Long getExpire() {
            return this.expire;
        }

        public static final class Builder {
            private String accessToken; 
            private Long expire; 

            /**
             * access_token.
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
                return this;
            }

            /**
             * expire.
             */
            public Builder expire(Long expire) {
                this.expire = expire;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
