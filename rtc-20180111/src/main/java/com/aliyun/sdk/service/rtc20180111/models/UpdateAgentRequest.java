// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link UpdateAgentRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgentRequest</p>
 */
public class UpdateAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceChatConfig")
    private VoiceChatConfig voiceChatConfig;

    private UpdateAgentRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.taskId = builder.taskId;
        this.voiceChatConfig = builder.voiceChatConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return voiceChatConfig
     */
    public VoiceChatConfig getVoiceChatConfig() {
        return this.voiceChatConfig;
    }

    public static final class Builder extends Request.Builder<UpdateAgentRequest, Builder> {
        private String appId; 
        private String channelId; 
        private String taskId; 
        private VoiceChatConfig voiceChatConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgentRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.taskId = request.taskId;
            this.voiceChatConfig = request.voiceChatConfig;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4eah****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourTaskId</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * VoiceChatConfig.
         */
        public Builder voiceChatConfig(VoiceChatConfig voiceChatConfig) {
            String voiceChatConfigShrink = shrink(voiceChatConfig, "VoiceChatConfig", "json");
            this.putQueryParameter("VoiceChatConfig", voiceChatConfigShrink);
            this.voiceChatConfig = voiceChatConfig;
            return this;
        }

        @Override
        public UpdateAgentRequest build() {
            return new UpdateAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAgentRequest} extends {@link TeaModel}
     *
     * <p>UpdateAgentRequest</p>
     */
    public static class VoiceChatConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChatMode")
        private Integer chatMode;

        @com.aliyun.core.annotation.NameInMap("InterruptMode")
        private Integer interruptMode;

        private VoiceChatConfig(Builder builder) {
            this.chatMode = builder.chatMode;
            this.interruptMode = builder.interruptMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceChatConfig create() {
            return builder().build();
        }

        /**
         * @return chatMode
         */
        public Integer getChatMode() {
            return this.chatMode;
        }

        /**
         * @return interruptMode
         */
        public Integer getInterruptMode() {
            return this.interruptMode;
        }

        public static final class Builder {
            private Integer chatMode; 
            private Integer interruptMode; 

            private Builder() {
            } 

            private Builder(VoiceChatConfig model) {
                this.chatMode = model.chatMode;
                this.interruptMode = model.interruptMode;
            } 

            /**
             * ChatMode.
             */
            public Builder chatMode(Integer chatMode) {
                this.chatMode = chatMode;
                return this;
            }

            /**
             * InterruptMode.
             */
            public Builder interruptMode(Integer interruptMode) {
                this.interruptMode = interruptMode;
                return this;
            }

            public VoiceChatConfig build() {
                return new VoiceChatConfig(this);
            } 

        } 

    }
}
