// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVisitorLoginDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetVisitorLoginDetailsResponseBody</p>
 */
public class GetVisitorLoginDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List < String > params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetVisitorLoginDetailsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVisitorLoginDetailsResponseBody create() {
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
     * @return params
     */
    public java.util.List < String > getParams() {
        return this.params;
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
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List < String > params; 
        private String requestId; 

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
         * Params.
         */
        public Builder params(java.util.List < String > params) {
            this.params = params;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVisitorLoginDetailsResponseBody build() {
            return new GetVisitorLoginDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVisitorLoginDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetVisitorLoginDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChatAppId")
        private String chatAppId;

        @com.aliyun.core.annotation.NameInMap("ChatAppKey")
        private String chatAppKey;

        @com.aliyun.core.annotation.NameInMap("ChatDeviceId")
        private String chatDeviceId;

        @com.aliyun.core.annotation.NameInMap("ChatLoginToken")
        private String chatLoginToken;

        @com.aliyun.core.annotation.NameInMap("ChatServerUrl")
        private String chatServerUrl;

        @com.aliyun.core.annotation.NameInMap("ChatUserId")
        private String chatUserId;

        private Data(Builder builder) {
            this.chatAppId = builder.chatAppId;
            this.chatAppKey = builder.chatAppKey;
            this.chatDeviceId = builder.chatDeviceId;
            this.chatLoginToken = builder.chatLoginToken;
            this.chatServerUrl = builder.chatServerUrl;
            this.chatUserId = builder.chatUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return chatAppId
         */
        public String getChatAppId() {
            return this.chatAppId;
        }

        /**
         * @return chatAppKey
         */
        public String getChatAppKey() {
            return this.chatAppKey;
        }

        /**
         * @return chatDeviceId
         */
        public String getChatDeviceId() {
            return this.chatDeviceId;
        }

        /**
         * @return chatLoginToken
         */
        public String getChatLoginToken() {
            return this.chatLoginToken;
        }

        /**
         * @return chatServerUrl
         */
        public String getChatServerUrl() {
            return this.chatServerUrl;
        }

        /**
         * @return chatUserId
         */
        public String getChatUserId() {
            return this.chatUserId;
        }

        public static final class Builder {
            private String chatAppId; 
            private String chatAppKey; 
            private String chatDeviceId; 
            private String chatLoginToken; 
            private String chatServerUrl; 
            private String chatUserId; 

            /**
             * ChatAppId.
             */
            public Builder chatAppId(String chatAppId) {
                this.chatAppId = chatAppId;
                return this;
            }

            /**
             * ChatAppKey.
             */
            public Builder chatAppKey(String chatAppKey) {
                this.chatAppKey = chatAppKey;
                return this;
            }

            /**
             * ChatDeviceId.
             */
            public Builder chatDeviceId(String chatDeviceId) {
                this.chatDeviceId = chatDeviceId;
                return this;
            }

            /**
             * ChatLoginToken.
             */
            public Builder chatLoginToken(String chatLoginToken) {
                this.chatLoginToken = chatLoginToken;
                return this;
            }

            /**
             * ChatServerUrl.
             */
            public Builder chatServerUrl(String chatServerUrl) {
                this.chatServerUrl = chatServerUrl;
                return this;
            }

            /**
             * ChatUserId.
             */
            public Builder chatUserId(String chatUserId) {
                this.chatUserId = chatUserId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
