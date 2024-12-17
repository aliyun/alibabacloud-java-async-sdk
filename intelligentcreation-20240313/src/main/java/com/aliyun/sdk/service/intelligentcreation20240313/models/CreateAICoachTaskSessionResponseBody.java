// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link CreateAICoachTaskSessionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAICoachTaskSessionResponseBody</p>
 */
public class CreateAICoachTaskSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("channelToken")
    private String channelToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scriptInfo")
    private ScriptInfo scriptInfo;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("webSocketUrl")
    private String webSocketUrl;

    private CreateAICoachTaskSessionResponseBody(Builder builder) {
        this.channelToken = builder.channelToken;
        this.requestId = builder.requestId;
        this.scriptInfo = builder.scriptInfo;
        this.sessionId = builder.sessionId;
        this.token = builder.token;
        this.webSocketUrl = builder.webSocketUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAICoachTaskSessionResponseBody create() {
        return builder().build();
    }

    /**
     * @return channelToken
     */
    public String getChannelToken() {
        return this.channelToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scriptInfo
     */
    public ScriptInfo getScriptInfo() {
        return this.scriptInfo;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return webSocketUrl
     */
    public String getWebSocketUrl() {
        return this.webSocketUrl;
    }

    public static final class Builder {
        private String channelToken; 
        private String requestId; 
        private ScriptInfo scriptInfo; 
        private String sessionId; 
        private String token; 
        private String webSocketUrl; 

        /**
         * <p>rtctoken</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder channelToken(String channelToken) {
            this.channelToken = channelToken;
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
         * scriptInfo.
         */
        public Builder scriptInfo(ScriptInfo scriptInfo) {
            this.scriptInfo = scriptInfo;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>Token</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * webSocketUrl.
         */
        public Builder webSocketUrl(String webSocketUrl) {
            this.webSocketUrl = webSocketUrl;
            return this;
        }

        public CreateAICoachTaskSessionResponseBody build() {
            return new CreateAICoachTaskSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAICoachTaskSessionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAICoachTaskSessionResponseBody</p>
     */
    public static class ScriptInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("initiator")
        private String initiator;

        @com.aliyun.core.annotation.NameInMap("maxDuration")
        private Long maxDuration;

        @com.aliyun.core.annotation.NameInMap("scriptDesc")
        private String scriptDesc;

        @com.aliyun.core.annotation.NameInMap("scriptName")
        private String scriptName;

        private ScriptInfo(Builder builder) {
            this.initiator = builder.initiator;
            this.maxDuration = builder.maxDuration;
            this.scriptDesc = builder.scriptDesc;
            this.scriptName = builder.scriptName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptInfo create() {
            return builder().build();
        }

        /**
         * @return initiator
         */
        public String getInitiator() {
            return this.initiator;
        }

        /**
         * @return maxDuration
         */
        public Long getMaxDuration() {
            return this.maxDuration;
        }

        /**
         * @return scriptDesc
         */
        public String getScriptDesc() {
            return this.scriptDesc;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
        }

        public static final class Builder {
            private String initiator; 
            private Long maxDuration; 
            private String scriptDesc; 
            private String scriptName; 

            /**
             * initiator.
             */
            public Builder initiator(String initiator) {
                this.initiator = initiator;
                return this;
            }

            /**
             * maxDuration.
             */
            public Builder maxDuration(Long maxDuration) {
                this.maxDuration = maxDuration;
                return this;
            }

            /**
             * scriptDesc.
             */
            public Builder scriptDesc(String scriptDesc) {
                this.scriptDesc = scriptDesc;
                return this;
            }

            /**
             * scriptName.
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            public ScriptInfo build() {
                return new ScriptInfo(this);
            } 

        } 

    }
}
