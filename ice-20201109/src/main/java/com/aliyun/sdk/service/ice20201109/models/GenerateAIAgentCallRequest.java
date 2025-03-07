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
 * {@link GenerateAIAgentCallRequest} extends {@link RequestModel}
 *
 * <p>GenerateAIAgentCallRequest</p>
 */
public class GenerateAIAgentCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AIAgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String AIAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatSyncConfig")
    private ChatSyncConfig chatSyncConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expire")
    private Long expire;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateConfig")
    private AIAgentTemplateConfig templateConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GenerateAIAgentCallRequest(Builder builder) {
        super(builder);
        this.AIAgentId = builder.AIAgentId;
        this.chatSyncConfig = builder.chatSyncConfig;
        this.expire = builder.expire;
        this.sessionId = builder.sessionId;
        this.templateConfig = builder.templateConfig;
        this.userData = builder.userData;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAIAgentCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIAgentId
     */
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    /**
     * @return chatSyncConfig
     */
    public ChatSyncConfig getChatSyncConfig() {
        return this.chatSyncConfig;
    }

    /**
     * @return expire
     */
    public Long getExpire() {
        return this.expire;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return templateConfig
     */
    public AIAgentTemplateConfig getTemplateConfig() {
        return this.templateConfig;
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

    public static final class Builder extends Request.Builder<GenerateAIAgentCallRequest, Builder> {
        private String AIAgentId; 
        private ChatSyncConfig chatSyncConfig; 
        private Long expire; 
        private String sessionId; 
        private AIAgentTemplateConfig templateConfig; 
        private String userData; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateAIAgentCallRequest request) {
            super(request);
            this.AIAgentId = request.AIAgentId;
            this.chatSyncConfig = request.chatSyncConfig;
            this.expire = request.expire;
            this.sessionId = request.sessionId;
            this.templateConfig = request.templateConfig;
            this.userData = request.userData;
            this.userId = request.userId;
        } 

        /**
         * <p>The ID of the AI agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>39f8e0bc005e4f309379701645f4****</p>
         */
        public Builder AIAgentId(String AIAgentId) {
            this.putQueryParameter("AIAgentId", AIAgentId);
            this.AIAgentId = AIAgentId;
            return this;
        }

        /**
         * ChatSyncConfig.
         */
        public Builder chatSyncConfig(ChatSyncConfig chatSyncConfig) {
            String chatSyncConfigShrink = shrink(chatSyncConfig, "ChatSyncConfig", "json");
            this.putQueryParameter("ChatSyncConfig", chatSyncConfigShrink);
            this.chatSyncConfig = chatSyncConfig;
            return this;
        }

        /**
         * <p>The time when the token expires. Unit: seconds. Default value: 3600. Valid values: 0 to 604800.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder expire(Long expire) {
            this.putQueryParameter("Expire", expire);
            this.expire = expire;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The template configurations of the AI agent. The specified configurations are merged with the template configurations that are specified in the console. If you do not specify this parameter, the system uses the default configurations for an AI agent created in the console.</p>
         */
        public Builder templateConfig(AIAgentTemplateConfig templateConfig) {
            String templateConfigShrink = shrink(templateConfig, "TemplateConfig", "json");
            this.putQueryParameter("TemplateConfig", templateConfigShrink);
            this.templateConfig = templateConfig;
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
         * <p>The username of the AI agent in the channel. If you do not specify this parameter, the system automatically generates a username. The value can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>877ae632caae49b1afc81c2e8194ffb4</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GenerateAIAgentCallRequest build() {
            return new GenerateAIAgentCallRequest(this);
        } 

    } 

    /**
     * 
     * {@link GenerateAIAgentCallRequest} extends {@link TeaModel}
     *
     * <p>GenerateAIAgentCallRequest</p>
     */
    public static class ChatSyncConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IMAIAgentId")
        private String IMAIAgentId;

        @com.aliyun.core.annotation.NameInMap("ReceiverId")
        private String receiverId;

        private ChatSyncConfig(Builder builder) {
            this.IMAIAgentId = builder.IMAIAgentId;
            this.receiverId = builder.receiverId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChatSyncConfig create() {
            return builder().build();
        }

        /**
         * @return IMAIAgentId
         */
        public String getIMAIAgentId() {
            return this.IMAIAgentId;
        }

        /**
         * @return receiverId
         */
        public String getReceiverId() {
            return this.receiverId;
        }

        public static final class Builder {
            private String IMAIAgentId; 
            private String receiverId; 

            /**
             * IMAIAgentId.
             */
            public Builder IMAIAgentId(String IMAIAgentId) {
                this.IMAIAgentId = IMAIAgentId;
                return this;
            }

            /**
             * ReceiverId.
             */
            public Builder receiverId(String receiverId) {
                this.receiverId = receiverId;
                return this;
            }

            public ChatSyncConfig build() {
                return new ChatSyncConfig(this);
            } 

        } 

    }
}
