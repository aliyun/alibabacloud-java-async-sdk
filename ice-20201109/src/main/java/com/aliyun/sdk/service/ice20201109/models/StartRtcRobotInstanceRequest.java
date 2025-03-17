// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link StartRtcRobotInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartRtcRobotInstanceRequest</p>
 */
public class StartRtcRobotInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private Config config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RobotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String robotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private StartRtcRobotInstanceRequest(Builder builder) {
        super(builder);
        this.authToken = builder.authToken;
        this.channelId = builder.channelId;
        this.config = builder.config;
        this.robotId = builder.robotId;
        this.userData = builder.userData;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartRtcRobotInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return robotId
     */
    public String getRobotId() {
        return this.robotId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<StartRtcRobotInstanceRequest, Builder> {
        private String authToken; 
        private String channelId; 
        private Config config; 
        private String robotId; 
        private String userData; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(StartRtcRobotInstanceRequest request) {
            super(request);
            this.authToken = request.authToken;
            this.channelId = request.channelId;
            this.config = request.config;
            this.robotId = request.robotId;
            this.userData = request.userData;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder authToken(String authToken) {
            this.putQueryParameter("AuthToken", authToken);
            this.authToken = authToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(Config config) {
            String configShrink = shrink(config, "Config", "json");
            this.putQueryParameter("Config", configShrink);
            this.config = config;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca28b08ad3464ebcb42e5c0f7c6d2e89</p>
         */
        public Builder robotId(String robotId) {
            this.putQueryParameter("RobotId", robotId);
            this.robotId = robotId;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-robot</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public StartRtcRobotInstanceRequest build() {
            return new StartRtcRobotInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartRtcRobotInstanceRequest} extends {@link TeaModel}
     *
     * <p>StartRtcRobotInstanceRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrMaxSilence")
        private Integer asrMaxSilence;

        @com.aliyun.core.annotation.NameInMap("EnableVoiceInterrupt")
        private Boolean enableVoiceInterrupt;

        @com.aliyun.core.annotation.NameInMap("Greeting")
        private String greeting;

        @com.aliyun.core.annotation.NameInMap("UseVoiceprint")
        private Boolean useVoiceprint;

        @com.aliyun.core.annotation.NameInMap("UserOfflineTimeout")
        private Integer userOfflineTimeout;

        @com.aliyun.core.annotation.NameInMap("UserOnlineTimeout")
        private Integer userOnlineTimeout;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        @com.aliyun.core.annotation.NameInMap("VoiceprintId")
        private String voiceprintId;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Long volume;

        private Config(Builder builder) {
            this.asrMaxSilence = builder.asrMaxSilence;
            this.enableVoiceInterrupt = builder.enableVoiceInterrupt;
            this.greeting = builder.greeting;
            this.useVoiceprint = builder.useVoiceprint;
            this.userOfflineTimeout = builder.userOfflineTimeout;
            this.userOnlineTimeout = builder.userOnlineTimeout;
            this.voiceId = builder.voiceId;
            this.voiceprintId = builder.voiceprintId;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return asrMaxSilence
         */
        public Integer getAsrMaxSilence() {
            return this.asrMaxSilence;
        }

        /**
         * @return enableVoiceInterrupt
         */
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        /**
         * @return greeting
         */
        public String getGreeting() {
            return this.greeting;
        }

        /**
         * @return useVoiceprint
         */
        public Boolean getUseVoiceprint() {
            return this.useVoiceprint;
        }

        /**
         * @return userOfflineTimeout
         */
        public Integer getUserOfflineTimeout() {
            return this.userOfflineTimeout;
        }

        /**
         * @return userOnlineTimeout
         */
        public Integer getUserOnlineTimeout() {
            return this.userOnlineTimeout;
        }

        /**
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        /**
         * @return voiceprintId
         */
        public String getVoiceprintId() {
            return this.voiceprintId;
        }

        /**
         * @return volume
         */
        public Long getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private Integer asrMaxSilence; 
            private Boolean enableVoiceInterrupt; 
            private String greeting; 
            private Boolean useVoiceprint; 
            private Integer userOfflineTimeout; 
            private Integer userOnlineTimeout; 
            private String voiceId; 
            private String voiceprintId; 
            private Long volume; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.asrMaxSilence = model.asrMaxSilence;
                this.enableVoiceInterrupt = model.enableVoiceInterrupt;
                this.greeting = model.greeting;
                this.useVoiceprint = model.useVoiceprint;
                this.userOfflineTimeout = model.userOfflineTimeout;
                this.userOnlineTimeout = model.userOnlineTimeout;
                this.voiceId = model.voiceId;
                this.voiceprintId = model.voiceprintId;
                this.volume = model.volume;
            } 

            /**
             * AsrMaxSilence.
             */
            public Builder asrMaxSilence(Integer asrMaxSilence) {
                this.asrMaxSilence = asrMaxSilence;
                return this;
            }

            /**
             * EnableVoiceInterrupt.
             */
            public Builder enableVoiceInterrupt(Boolean enableVoiceInterrupt) {
                this.enableVoiceInterrupt = enableVoiceInterrupt;
                return this;
            }

            /**
             * Greeting.
             */
            public Builder greeting(String greeting) {
                this.greeting = greeting;
                return this;
            }

            /**
             * UseVoiceprint.
             */
            public Builder useVoiceprint(Boolean useVoiceprint) {
                this.useVoiceprint = useVoiceprint;
                return this;
            }

            /**
             * UserOfflineTimeout.
             */
            public Builder userOfflineTimeout(Integer userOfflineTimeout) {
                this.userOfflineTimeout = userOfflineTimeout;
                return this;
            }

            /**
             * UserOnlineTimeout.
             */
            public Builder userOnlineTimeout(Integer userOnlineTimeout) {
                this.userOnlineTimeout = userOnlineTimeout;
                return this;
            }

            /**
             * VoiceId.
             */
            public Builder voiceId(String voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            /**
             * VoiceprintId.
             */
            public Builder voiceprintId(String voiceprintId) {
                this.voiceprintId = voiceprintId;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Long volume) {
                this.volume = volume;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
