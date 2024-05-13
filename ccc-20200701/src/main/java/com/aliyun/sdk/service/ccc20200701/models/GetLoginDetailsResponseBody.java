// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > params;

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

        public GetLoginDetailsResponseBody build() {
            return new GetLoginDetailsResponseBody(this);
        } 

    } 

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

            /**
             * AgentServerUrl.
             */
            public Builder agentServerUrl(String agentServerUrl) {
                this.agentServerUrl = agentServerUrl;
                return this;
            }

            /**
             * AvatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

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

            /**
             * DeviceExt.
             */
            public Builder deviceExt(String deviceExt) {
                this.deviceExt = deviceExt;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceState.
             */
            public Builder deviceState(String deviceState) {
                this.deviceState = deviceState;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * Nickname.
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * Signature2.
             */
            public Builder signature2(String signature2) {
                this.signature2 = signature2;
                return this;
            }

            /**
             * SipServerUrl.
             */
            public Builder sipServerUrl(String sipServerUrl) {
                this.sipServerUrl = sipServerUrl;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserKey.
             */
            public Builder userKey(String userKey) {
                this.userKey = userKey;
                return this;
            }

            /**
             * UserKey2.
             */
            public Builder userKey2(String userKey2) {
                this.userKey2 = userKey2;
                return this;
            }

            /**
             * WorkMode.
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
