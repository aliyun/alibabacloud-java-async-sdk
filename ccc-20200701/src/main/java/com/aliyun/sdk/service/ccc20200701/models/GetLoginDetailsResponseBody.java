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
 * {@link GetLoginDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoginDetailsResponseBody</p>
 */
public class GetLoginDetailsResponseBody extends TeaModel {
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

    private GetLoginDetailsResponseBody(Builder builder) {
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

    public static GetLoginDetailsResponseBody create() {
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

        private Builder(GetLoginDetailsResponseBody model) {
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
         * <p>Logon information data.</p>
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
         * <p>Response parameters.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F1A4774A-F28B-5C40-AEF6-D88D2DD6C7E4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLoginDetailsResponseBody build() {
            return new GetLoginDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLoginDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoginDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentServerUrl")
        private String agentServerUrl;

        @com.aliyun.core.annotation.NameInMap("AvatarUrl")
        private String avatarUrl;

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

        @com.aliyun.core.annotation.NameInMap("DeviceExt")
        private String deviceExt;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceState")
        private String deviceState;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("Nickname")
        private String nickname;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("Signature2")
        private String signature2;

        @com.aliyun.core.annotation.NameInMap("SipServerUrl")
        private String sipServerUrl;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserKey")
        private String userKey;

        @com.aliyun.core.annotation.NameInMap("UserKey2")
        private String userKey2;

        @com.aliyun.core.annotation.NameInMap("WorkMode")
        private String workMode;

        private Data(Builder builder) {
            this.agentServerUrl = builder.agentServerUrl;
            this.avatarUrl = builder.avatarUrl;
            this.chatAppId = builder.chatAppId;
            this.chatAppKey = builder.chatAppKey;
            this.chatDeviceId = builder.chatDeviceId;
            this.chatLoginToken = builder.chatLoginToken;
            this.chatServerUrl = builder.chatServerUrl;
            this.chatUserId = builder.chatUserId;
            this.deviceExt = builder.deviceExt;
            this.deviceId = builder.deviceId;
            this.deviceState = builder.deviceState;
            this.displayName = builder.displayName;
            this.extension = builder.extension;
            this.nickname = builder.nickname;
            this.signature = builder.signature;
            this.signature2 = builder.signature2;
            this.sipServerUrl = builder.sipServerUrl;
            this.userId = builder.userId;
            this.userKey = builder.userKey;
            this.userKey2 = builder.userKey2;
            this.workMode = builder.workMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentServerUrl
         */
        public String getAgentServerUrl() {
            return this.agentServerUrl;
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
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

        /**
         * @return deviceExt
         */
        public String getDeviceExt() {
            return this.deviceExt;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceState
         */
        public String getDeviceState() {
            return this.deviceState;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return nickname
         */
        public String getNickname() {
            return this.nickname;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return signature2
         */
        public String getSignature2() {
            return this.signature2;
        }

        /**
         * @return sipServerUrl
         */
        public String getSipServerUrl() {
            return this.sipServerUrl;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userKey
         */
        public String getUserKey() {
            return this.userKey;
        }

        /**
         * @return userKey2
         */
        public String getUserKey2() {
            return this.userKey2;
        }

        /**
         * @return workMode
         */
        public String getWorkMode() {
            return this.workMode;
        }

        public static final class Builder {
            private String agentServerUrl; 
            private String avatarUrl; 
            private String chatAppId; 
            private String chatAppKey; 
            private String chatDeviceId; 
            private String chatLoginToken; 
            private String chatServerUrl; 
            private String chatUserId; 
            private String deviceExt; 
            private String deviceId; 
            private String deviceState; 
            private String displayName; 
            private String extension; 
            private String nickname; 
            private String signature; 
            private String signature2; 
            private String sipServerUrl; 
            private String userId; 
            private String userKey; 
            private String userKey2; 
            private String workMode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentServerUrl = model.agentServerUrl;
                this.avatarUrl = model.avatarUrl;
                this.chatAppId = model.chatAppId;
                this.chatAppKey = model.chatAppKey;
                this.chatDeviceId = model.chatDeviceId;
                this.chatLoginToken = model.chatLoginToken;
                this.chatServerUrl = model.chatServerUrl;
                this.chatUserId = model.chatUserId;
                this.deviceExt = model.deviceExt;
                this.deviceId = model.deviceId;
                this.deviceState = model.deviceState;
                this.displayName = model.displayName;
                this.extension = model.extension;
                this.nickname = model.nickname;
                this.signature = model.signature;
                this.signature2 = model.signature2;
                this.sipServerUrl = model.sipServerUrl;
                this.userId = model.userId;
                this.userKey = model.userKey;
                this.userKey2 = model.userKey2;
                this.workMode = model.workMode;
            } 

            /**
             * <p>Agent data push server URL. After a successful connection, the server pushes agent status data to the agent Workbench.</p>
             * 
             * <strong>example:</strong>
             * <p>sh-wss-ccc.aliyuncs.com</p>
             */
            public Builder agentServerUrl(String agentServerUrl) {
                this.agentServerUrl = agentServerUrl;
                return this;
            }

            /**
             * <p>Agent profile picture URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://abc.com/sam.jpb">http://abc.com/sam.jpb</a></p>
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
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
             * <p>Chat Device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4c51c9116c36537cb850dc1081d745df</p>
             */
            public Builder chatDeviceId(String chatDeviceId) {
                this.chatDeviceId = chatDeviceId;
                return this;
            }

            /**
             * <p>Chat session logon token.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;accessToken&quot;:&quot;oauth_cloud_key:4xxx0=&quot;,&quot;accessTokenExpiredTime&quot;:864xxxx,&quot;refreshToken&quot;:&quot;oauth_cloud_key:Paxxxx==&quot;}</p>
             */
            public Builder chatLoginToken(String chatLoginToken) {
                this.chatLoginToken = chatLoginToken;
                return this;
            }

            /**
             * <p>Chat session server URL.</p>
             * 
             * <strong>example:</strong>
             * <p>wss://wss.im.dingtalk.cn</p>
             */
            public Builder chatServerUrl(String chatServerUrl) {
                this.chatServerUrl = chatServerUrl;
                return this;
            }

            /**
             * <p>Chat session Device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>A-8000100x</p>
             */
            public Builder chatUserId(String chatUserId) {
                this.chatUserId = chatUserId;
                return this;
            }

            /**
             * <p>SIP device extension number. This field is required when using a SIP phone.</p>
             * 
             * <strong>example:</strong>
             * <p>8033****</p>
             */
            public Builder deviceExt(String deviceExt) {
                this.deviceExt = deviceExt;
                return this;
            }

            /**
             * <p>If the agent has registered an SIP phone, this parameter is the Device ID of the SIP phone device; otherwise, it is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>Yealink SIP-T23G 44.84.XX.XX</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>SIP device status.</p>
             * 
             * <strong>example:</strong>
             * <p>OFFLINE</p>
             */
            public Builder deviceState(String deviceState) {
                this.deviceState = deviceState;
                return this;
            }

            /**
             * <p>Agent display name.</p>
             * 
             * <strong>example:</strong>
             * <p>坐席小王</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Agent extension number.</p>
             * 
             * <strong>example:</strong>
             * <p>8001****</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>Agent nickname</p>
             * 
             * <strong>example:</strong>
             * <p>老王</p>
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * <p>Signature information generated using an asymmetric key encryption algorithm. This information is required for authentication when registering with the SIP server.</p>
             * 
             * <strong>example:</strong>
             * <p>zi31STIMtIfa/UN2l+6lww****</p>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * <p>Signature information generated using an asymmetric key encryption algorithm. This information is required for authentication when registering with the SIP server.</p>
             * 
             * <strong>example:</strong>
             * <p>zi31STIMtIfa/UN2l+6lww****</p>
             */
            public Builder signature2(String signature2) {
                this.signature2 = signature2;
                return this;
            }

            /**
             * <p>SIP registration server URL. The agent must register with the server as an SIP user to perform transactional processing (TP) operations.</p>
             * 
             * <strong>example:</strong>
             * <p>sh-sip-ccc.aliyuncs.com:443</p>
             */
            public Builder sipServerUrl(String sipServerUrl) {
                this.sipServerUrl = sipServerUrl;
                return this;
            }

            /**
             * <p>Agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent@ccc-test</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Signature data used to generate signature information. Because this signature mechanism does not support Chinese characters, UserKey2 is currently used for signing instead.</p>
             * 
             * <strong>example:</strong>
             * <p>坐席@aliyun:802001:1656406628862</p>
             */
            public Builder userKey(String userKey) {
                this.userKey = userKey;
                return this;
            }

            /**
             * <p>Signature data used to generate signature information. UserKey2 was added because UserKey does not support Chinese characters in signatures.</p>
             * 
             * <strong>example:</strong>
             * <p>802001:1656406628862&quot;</p>
             */
            public Builder userKey2(String userKey2) {
                this.userKey2 = userKey2;
                return this;
            }

            /**
             * <p>Work mode.</p>
             * 
             * <strong>example:</strong>
             * <p>ON_SITE</p>
             */
            public Builder workMode(String workMode) {
                this.workMode = workMode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
