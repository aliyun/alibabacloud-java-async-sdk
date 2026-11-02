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
 * {@link DescribeRtcRobotInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRtcRobotInstanceResponseBody</p>
 */
public class DescribeRtcRobotInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthToken")
    private String authToken;

    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.NameInMap("Config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private DescribeRtcRobotInstanceResponseBody(Builder builder) {
        this.authToken = builder.authToken;
        this.channelId = builder.channelId;
        this.config = builder.config;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.userData = builder.userData;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRtcRobotInstanceResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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

    public static final class Builder {
        private String authToken; 
        private String channelId; 
        private Config config; 
        private String requestId; 
        private String status; 
        private String userData; 
        private String userId; 

        private Builder() {
        } 

        private Builder(DescribeRtcRobotInstanceResponseBody model) {
            this.authToken = model.authToken;
            this.channelId = model.channelId;
            this.config = model.config;
            this.requestId = model.requestId;
            this.status = model.status;
            this.userData = model.userData;
            this.userId = model.userId;
        } 

        /**
         * <p>The authentication token for joining the RTC channel.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder authToken(String authToken) {
            this.authToken = authToken;
            return this;
        }

        /**
         * <p>The channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        public Builder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The advanced configuration of the AI agent.</p>
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20B3A1B6-4BD2-5DE6-BCBC-098C9B4F4E91</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><p>Executing: Running.</p>
         * </li>
         * <li><p>Finished: Finished.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The custom user information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        /**
         * <p>The ID of the AI agent in the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>my-robot</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public DescribeRtcRobotInstanceResponseBody build() {
            return new DescribeRtcRobotInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRtcRobotInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcRobotInstanceResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableVoiceInterrupt")
        private Boolean enableVoiceInterrupt;

        @com.aliyun.core.annotation.NameInMap("Greeting")
        private String greeting;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        private Config(Builder builder) {
            this.enableVoiceInterrupt = builder.enableVoiceInterrupt;
            this.greeting = builder.greeting;
            this.voiceId = builder.voiceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
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
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        public static final class Builder {
            private Boolean enableVoiceInterrupt; 
            private String greeting; 
            private String voiceId; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.enableVoiceInterrupt = model.enableVoiceInterrupt;
                this.greeting = model.greeting;
                this.voiceId = model.voiceId;
            } 

            /**
             * <p>Specifies whether voice interruption is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableVoiceInterrupt(Boolean enableVoiceInterrupt) {
                this.enableVoiceInterrupt = enableVoiceInterrupt;
                return this;
            }

            /**
             * <p>The greeting message.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello</p>
             */
            public Builder greeting(String greeting) {
                this.greeting = greeting;
                return this;
            }

            /**
             * <p>The voice ID.</p>
             * 
             * <strong>example:</strong>
             * <p>zhixiaoxia</p>
             */
            public Builder voiceId(String voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
