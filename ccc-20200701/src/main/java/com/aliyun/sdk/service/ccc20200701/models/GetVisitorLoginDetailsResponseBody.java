// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
    private java.util.List<String> params;

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
    public java.util.List<String> getParams() {
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
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetVisitorLoginDetailsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Parameter information.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>19D09CCC-F298-4124-849A-AFA217819011</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.chatAppId = model.chatAppId;
                this.chatAppKey = model.chatAppKey;
                this.chatDeviceId = model.chatDeviceId;
                this.chatLoginToken = model.chatLoginToken;
                this.chatServerUrl = model.chatServerUrl;
                this.chatUserId = model.chatUserId;
            } 

            /**
             * <p>Chat session application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7pjxxx</p>
             */
            public Builder chatAppId(String chatAppId) {
                this.chatAppId = chatAppId;
                return this;
            }

            /**
             * <p>Chat session application key.</p>
             * 
             * <strong>example:</strong>
             * <p>955e4bd7xxxxxxxxxxxxxd7898ba9fa0d0</p>
             */
            public Builder chatAppKey(String chatAppKey) {
                this.chatAppKey = chatAppKey;
                return this;
            }

            /**
             * <p>Chat device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4c51c9116c36537cb850dc1081d745df</p>
             */
            public Builder chatDeviceId(String chatDeviceId) {
                this.chatDeviceId = chatDeviceId;
                return this;
            }

            /**
             * <p>Chat session login token.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;accessToken&quot;:&quot;oauth_cloud_key:+4oJXUAFSWxGD2YuRW4V/oUN0/8qJGNc0I<em><strong><strong><strong><strong>n1E3DOr3Q3lX00ZnTpyqRi8Y6hYoLYA7n2ZkWuv485hVtXeSgnIQkKxXPbMgwoLxWaK//lI5Dn/mb4YuDifigv+ZyFzc+07vxm9ZFu/NjA==&quot;,&quot;accessTokenExpiredTime&quot;:86400000,&quot;refreshToken&quot;:&quot;oauth_cloud_key:/U+8UueDmpeUszhXC+SWow4pNLZp2C</strong></strong></strong></strong></em>**U/377BNXF+Mjo1lFgDk6GtEjNNoJpapX2mHH8GcRke2+yKQs/w4gAN9xSMn543Ciung+93pXV6IpQGbEVlu&quot;}</p>
             */
            public Builder chatLoginToken(String chatLoginToken) {
                this.chatLoginToken = chatLoginToken;
                return this;
            }

            /**
             * <p>Chat session server address.</p>
             * 
             * <strong>example:</strong>
             * <p>wss://wss.im.dingtalk.cn</p>
             */
            public Builder chatServerUrl(String chatServerUrl) {
                this.chatServerUrl = chatServerUrl;
                return this;
            }

            /**
             * <p>Visitor\&quot;s identity ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dac9c001****a15684ea91a81317</p>
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
