// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link CreateChatSessionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateChatSessionResponseBody</p>
 */
public class CreateChatSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private CreateChatSessionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChatSessionResponseBody create() {
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
    public Long getHttpStatusCode() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateChatSessionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * httpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateChatSessionResponseBody build() {
            return new CreateChatSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateChatSessionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateChatSessionResponseBody</p>
     */
    public static class AvatarAssets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("minRequiredVersion")
        private String minRequiredVersion;

        @com.aliyun.core.annotation.NameInMap("secret")
        private String secret;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private AvatarAssets(Builder builder) {
            this.md5 = builder.md5;
            this.minRequiredVersion = builder.minRequiredVersion;
            this.secret = builder.secret;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvatarAssets create() {
            return builder().build();
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return minRequiredVersion
         */
        public String getMinRequiredVersion() {
            return this.minRequiredVersion;
        }

        /**
         * @return secret
         */
        public String getSecret() {
            return this.secret;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String md5; 
            private String minRequiredVersion; 
            private String secret; 
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(AvatarAssets model) {
                this.md5 = model.md5;
                this.minRequiredVersion = model.minRequiredVersion;
                this.secret = model.secret;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * minRequiredVersion.
             */
            public Builder minRequiredVersion(String minRequiredVersion) {
                this.minRequiredVersion = minRequiredVersion;
                return this;
            }

            /**
             * secret.
             */
            public Builder secret(String secret) {
                this.secret = secret;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public AvatarAssets build() {
                return new AvatarAssets(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateChatSessionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateChatSessionResponseBody</p>
     */
    public static class RtcParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("avatarUserId")
        private String avatarUserId;

        @com.aliyun.core.annotation.NameInMap("channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("clientUserId")
        private String clientUserId;

        @com.aliyun.core.annotation.NameInMap("gslb")
        private String gslb;

        @com.aliyun.core.annotation.NameInMap("nonce")
        private String nonce;

        @com.aliyun.core.annotation.NameInMap("serverUserId")
        private String serverUserId;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("token")
        private String token;

        private RtcParams(Builder builder) {
            this.appId = builder.appId;
            this.avatarUserId = builder.avatarUserId;
            this.channel = builder.channel;
            this.clientUserId = builder.clientUserId;
            this.gslb = builder.gslb;
            this.nonce = builder.nonce;
            this.serverUserId = builder.serverUserId;
            this.timestamp = builder.timestamp;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RtcParams create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return avatarUserId
         */
        public String getAvatarUserId() {
            return this.avatarUserId;
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return clientUserId
         */
        public String getClientUserId() {
            return this.clientUserId;
        }

        /**
         * @return gslb
         */
        public String getGslb() {
            return this.gslb;
        }

        /**
         * @return nonce
         */
        public String getNonce() {
            return this.nonce;
        }

        /**
         * @return serverUserId
         */
        public String getServerUserId() {
            return this.serverUserId;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private String appId; 
            private String avatarUserId; 
            private String channel; 
            private String clientUserId; 
            private String gslb; 
            private String nonce; 
            private String serverUserId; 
            private Long timestamp; 
            private String token; 

            private Builder() {
            } 

            private Builder(RtcParams model) {
                this.appId = model.appId;
                this.avatarUserId = model.avatarUserId;
                this.channel = model.channel;
                this.clientUserId = model.clientUserId;
                this.gslb = model.gslb;
                this.nonce = model.nonce;
                this.serverUserId = model.serverUserId;
                this.timestamp = model.timestamp;
                this.token = model.token;
            } 

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * avatarUserId.
             */
            public Builder avatarUserId(String avatarUserId) {
                this.avatarUserId = avatarUserId;
                return this;
            }

            /**
             * channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * clientUserId.
             */
            public Builder clientUserId(String clientUserId) {
                this.clientUserId = clientUserId;
                return this;
            }

            /**
             * gslb.
             */
            public Builder gslb(String gslb) {
                this.gslb = gslb;
                return this;
            }

            /**
             * nonce.
             */
            public Builder nonce(String nonce) {
                this.nonce = nonce;
                return this;
            }

            /**
             * serverUserId.
             */
            public Builder serverUserId(String serverUserId) {
                this.serverUserId = serverUserId;
                return this;
            }

            /**
             * timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public RtcParams build() {
                return new RtcParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateChatSessionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateChatSessionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avatarAssets")
        private AvatarAssets avatarAssets;

        @com.aliyun.core.annotation.NameInMap("rtcParams")
        private RtcParams rtcParams;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        private Data(Builder builder) {
            this.avatarAssets = builder.avatarAssets;
            this.rtcParams = builder.rtcParams;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avatarAssets
         */
        public AvatarAssets getAvatarAssets() {
            return this.avatarAssets;
        }

        /**
         * @return rtcParams
         */
        public RtcParams getRtcParams() {
            return this.rtcParams;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private AvatarAssets avatarAssets; 
            private RtcParams rtcParams; 
            private String sessionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.avatarAssets = model.avatarAssets;
                this.rtcParams = model.rtcParams;
                this.sessionId = model.sessionId;
            } 

            /**
             * avatarAssets.
             */
            public Builder avatarAssets(AvatarAssets avatarAssets) {
                this.avatarAssets = avatarAssets;
                return this;
            }

            /**
             * rtcParams.
             */
            public Builder rtcParams(RtcParams rtcParams) {
                this.rtcParams = rtcParams;
                return this;
            }

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
