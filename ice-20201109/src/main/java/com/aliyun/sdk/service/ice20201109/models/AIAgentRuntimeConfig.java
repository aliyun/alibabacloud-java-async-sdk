// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AIAgentRuntimeConfig} extends {@link TeaModel}
 *
 * <p>AIAgentRuntimeConfig</p>
 */
public class AIAgentRuntimeConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvatarChat3D")
    private AvatarChat3D avatarChat3D;

    @com.aliyun.core.annotation.NameInMap("VoiceChat")
    private VoiceChat voiceChat;

    private AIAgentRuntimeConfig(Builder builder) {
        this.avatarChat3D = builder.avatarChat3D;
        this.voiceChat = builder.voiceChat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIAgentRuntimeConfig create() {
        return builder().build();
    }

    /**
     * @return avatarChat3D
     */
    public AvatarChat3D getAvatarChat3D() {
        return this.avatarChat3D;
    }

    /**
     * @return voiceChat
     */
    public VoiceChat getVoiceChat() {
        return this.voiceChat;
    }

    public static final class Builder {
        private AvatarChat3D avatarChat3D; 
        private VoiceChat voiceChat; 

        /**
         * AvatarChat3D.
         */
        public Builder avatarChat3D(AvatarChat3D avatarChat3D) {
            this.avatarChat3D = avatarChat3D;
            return this;
        }

        /**
         * VoiceChat.
         */
        public Builder voiceChat(VoiceChat voiceChat) {
            this.voiceChat = voiceChat;
            return this;
        }

        public AIAgentRuntimeConfig build() {
            return new AIAgentRuntimeConfig(this);
        } 

    } 

    public static class AvatarChat3D extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentUserId")
        private String agentUserId;

        @com.aliyun.core.annotation.NameInMap("AuthToken")
        private String authToken;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        private AvatarChat3D(Builder builder) {
            this.agentUserId = builder.agentUserId;
            this.authToken = builder.authToken;
            this.channelId = builder.channelId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvatarChat3D create() {
            return builder().build();
        }

        /**
         * @return agentUserId
         */
        public String getAgentUserId() {
            return this.agentUserId;
        }

        /**
         * @return authToken
         */
        public String getAuthToken() {
            return this.authToken;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        public static final class Builder {
            private String agentUserId; 
            private String authToken; 
            private String channelId; 

            /**
             * AgentUserId.
             */
            public Builder agentUserId(String agentUserId) {
                this.agentUserId = agentUserId;
                return this;
            }

            /**
             * AuthToken.
             */
            public Builder authToken(String authToken) {
                this.authToken = authToken;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            public AvatarChat3D build() {
                return new AvatarChat3D(this);
            } 

        } 

    }
    public static class VoiceChat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentUserId")
        private String agentUserId;

        @com.aliyun.core.annotation.NameInMap("AuthToken")
        private String authToken;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        private VoiceChat(Builder builder) {
            this.agentUserId = builder.agentUserId;
            this.authToken = builder.authToken;
            this.channelId = builder.channelId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceChat create() {
            return builder().build();
        }

        /**
         * @return agentUserId
         */
        public String getAgentUserId() {
            return this.agentUserId;
        }

        /**
         * @return authToken
         */
        public String getAuthToken() {
            return this.authToken;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        public static final class Builder {
            private String agentUserId; 
            private String authToken; 
            private String channelId; 

            /**
             * AgentUserId.
             */
            public Builder agentUserId(String agentUserId) {
                this.agentUserId = agentUserId;
                return this;
            }

            /**
             * AuthToken.
             */
            public Builder authToken(String authToken) {
                this.authToken = authToken;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            public VoiceChat build() {
                return new VoiceChat(this);
            } 

        } 

    }
}
