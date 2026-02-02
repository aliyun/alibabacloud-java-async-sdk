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
         * <p>响应码。</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>响应数据。</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>http响应码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>状态码描述。</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求ID</p>
         * 
         * <strong>example:</strong>
         * <p>7239F9E5-A4DB-55BA-B701-0CE47DBDB0A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>请求是否成功</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
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
             * <p>资产MD5值。</p>
             * 
             * <strong>example:</strong>
             * <p>5B83BE2114489274BB88BADE7EBC****</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>支持的SDK最低版本。</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.1</p>
             */
            public Builder minRequiredVersion(String minRequiredVersion) {
                this.minRequiredVersion = minRequiredVersion;
                return this;
            }

            /**
             * <p>SDK使用的密钥。</p>
             * 
             * <strong>example:</strong>
             * <p>J562PNqJBZDhzOQpLBgIcIW8+rHQoM7P6IONGMP7P5vGxrWLxT7VtRenFnMY+wg/zpA2qwpFBmJYO2rVexnlCQ2WE4kvYOH/OKmlTzpQddY34U5jS9KaS3b3ulpq4xnKDjWJ+sLZSRMhuPDdlq8ZPfcfEPhJhF3zPO8Hu4QOSu+D/pAIDJUoixOTo9Q14DXFKGFuuVRQOQ7f/VxJcoSLIWIusV917pLtph/IYBaLd27gzbrTZBEVD8qrucR+WOQPY1g67PGAdafkhJWrs/+coM7+5dc3HEUC+KgI9JN4X4Akelc94aJcy78RZ6tRdr73hBzN83/cMZdzt2hx******</p>
             */
            public Builder secret(String secret) {
                this.secret = secret;
                return this;
            }

            /**
             * <p>资产类型。</p>
             * 
             * <strong>example:</strong>
             * <p>AVATAR_3D_TRADITIONAL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>资产下载链接。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://daily-avatar-property.oss-cn-beijing.aliyuncs.com/avatar-share-property/AVATAR_3D_TRADITIONAL/Mt.CNMU6BO4RBYU2/secret_assets_web.zip?Expires=1752637519&OSSAccessKeyId=STS.NZULzwLRx8thHDHQxem94****&Signature=Oni3%2Be8dY8Xrv3iRGDyzn7u****%3D&security-token=CAISzAJ1q6Ft5B2yfSjIr5ngB8DDoY1Zj7aDSmL5tXgwYbYYi5LPrDz2IHhMfnloB%2BEcsfU3nmxT6vkZlrp6SJtIXleCZtF94oxN9h2gb4fb4093DEHt08%2FLI3OaLjKm9u2wCryLYbGwU%2FOpbE%2B%2B5U0X6LDmdDKkckW4OJmS8%2FBOZcgWWQ%2FKBlgvRq0hRG1YpdQdKGHaONu0LxfumRCwNkdzvRdmgm4NgsbWgO%2Fks0KA1QSml7ZP%2B9WuesH0M%2FMBZskvD42Hu8VtbbfE3SJq7BxHybx7lqQs%2B02c5onHUwEPsk%2FZYrKOroYzc1RjAbM%2FErRY6fP8nOE9ovbUm5RXHpT05CrMOs62ZPdDoKOscIvBXr6yZaP7JmcGC6iQLG%2FznQkSc081IsK2C7Xq0pe54O3lg9Ab41ZGNYEjq%2BpCIUP%2Fs97dqXEelD2e%2Bh8UezDnKxqAAXuAiYRY7Ox3cf6h2MlmRsK5yywg45O%2FizjiK2k8Z8p6WeOA54W3pfbg6ElV4d8TMWCVZ7tuAbSgRCKBg3q5YYrdS2ENqDu6njIea1pxG4LT4ydGxDBkYpjwcUxutDd0aAhFjsypSK%2Feuk0%2FDCfKMrWzCmkr1AtPpcNfJ8LPj58qIA">https://daily-avatar-property.oss-cn-beijing.aliyuncs.com/avatar-share-property/AVATAR_3D_TRADITIONAL/Mt.CNMU6BO4RBYU2/secret_assets_web.zip?Expires=1752637519&amp;OSSAccessKeyId=STS.NZULzwLRx8thHDHQxem94****&amp;Signature=Oni3%2Be8dY8Xrv3iRGDyzn7u****%3D&amp;security-token=CAISzAJ1q6Ft5B2yfSjIr5ngB8DDoY1Zj7aDSmL5tXgwYbYYi5LPrDz2IHhMfnloB%2BEcsfU3nmxT6vkZlrp6SJtIXleCZtF94oxN9h2gb4fb4093DEHt08%2FLI3OaLjKm9u2wCryLYbGwU%2FOpbE%2B%2B5U0X6LDmdDKkckW4OJmS8%2FBOZcgWWQ%2FKBlgvRq0hRG1YpdQdKGHaONu0LxfumRCwNkdzvRdmgm4NgsbWgO%2Fks0KA1QSml7ZP%2B9WuesH0M%2FMBZskvD42Hu8VtbbfE3SJq7BxHybx7lqQs%2B02c5onHUwEPsk%2FZYrKOroYzc1RjAbM%2FErRY6fP8nOE9ovbUm5RXHpT05CrMOs62ZPdDoKOscIvBXr6yZaP7JmcGC6iQLG%2FznQkSc081IsK2C7Xq0pe54O3lg9Ab41ZGNYEjq%2BpCIUP%2Fs97dqXEelD2e%2Bh8UezDnKxqAAXuAiYRY7Ox3cf6h2MlmRsK5yywg45O%2FizjiK2k8Z8p6WeOA54W3pfbg6ElV4d8TMWCVZ7tuAbSgRCKBg3q5YYrdS2ENqDu6njIea1pxG4LT4ydGxDBkYpjwcUxutDd0aAhFjsypSK%2Feuk0%2FDCfKMrWzCmkr1AtPpcNfJ8LPj58qIA</a></p>
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
             * <p>应用id。</p>
             * 
             * <strong>example:</strong>
             * <p>895cbf3b</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>数字人侧用户ID。</p>
             * 
             * <strong>example:</strong>
             * <p>E7enIvjUos</p>
             */
            public Builder avatarUserId(String avatarUserId) {
                this.avatarUserId = avatarUserId;
                return this;
            }

            /**
             * <p>RTC通道ID。</p>
             * 
             * <strong>example:</strong>
             * <p>pPltqR3FovNCK3hNQc8eHUL3Zt****</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>客户端侧用户ID。</p>
             * 
             * <strong>example:</strong>
             * <p>aw0tqpFlP4</p>
             */
            public Builder clientUserId(String clientUserId) {
                this.clientUserId = clientUserId;
                return this;
            }

            /**
             * <p>RTC服务地址。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://gw.rtn.aliyuncs.com">https://gw.rtn.aliyuncs.com</a></p>
             */
            public Builder gslb(String gslb) {
                this.gslb = gslb;
                return this;
            }

            /**
             * <p>随机串。</p>
             * 
             * <strong>example:</strong>
             * <p>f8b0ef02c5da778f4488e2470c</p>
             */
            public Builder nonce(String nonce) {
                this.nonce = nonce;
                return this;
            }

            /**
             * <p>服务端侧用户ID。</p>
             * 
             * <strong>example:</strong>
             * <p>YzZtSQP8QX</p>
             */
            public Builder serverUserId(String serverUserId) {
                this.serverUserId = serverUserId;
                return this;
            }

            /**
             * <p>过期时间戳。</p>
             * 
             * <strong>example:</strong>
             * <p>1560588594</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>访问凭证token。</p>
             * 
             * <strong>example:</strong>
             * <p>PtGgv2dM9F8tEuAtda50c0VNNFjn0WUbyTDPa1im4cUBE****</p>
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
             * <p>端渲染数字人资产信息。</p>
             */
            public Builder avatarAssets(AvatarAssets avatarAssets) {
                this.avatarAssets = avatarAssets;
                return this;
            }

            /**
             * <p>RTC入参。</p>
             */
            public Builder rtcParams(RtcParams rtcParams) {
                this.rtcParams = rtcParams;
                return this;
            }

            /**
             * <p>会话ID</p>
             * 
             * <strong>example:</strong>
             * <p>9827f4bd-5008-4d34-98fb-62598f3ad3b5</p>
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
