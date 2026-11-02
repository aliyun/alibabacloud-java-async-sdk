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
 * {@link StartAIAgentInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartAIAgentInstanceRequest</p>
 */
public class StartAIAgentInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AIAgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String AIAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentConfig")
    private AIAgentConfig agentConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatSyncConfig")
    private ChatSyncConfig chatSyncConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuntimeConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private AIAgentRuntimeConfig runtimeConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateConfig")
    @Deprecated
    private AIAgentTemplateConfig templateConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private StartAIAgentInstanceRequest(Builder builder) {
        super(builder);
        this.AIAgentId = builder.AIAgentId;
        this.agentConfig = builder.agentConfig;
        this.chatSyncConfig = builder.chatSyncConfig;
        this.runtimeConfig = builder.runtimeConfig;
        this.sessionId = builder.sessionId;
        this.templateConfig = builder.templateConfig;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAIAgentInstanceRequest create() {
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
     * @return agentConfig
     */
    public AIAgentConfig getAgentConfig() {
        return this.agentConfig;
    }

    /**
     * @return chatSyncConfig
     */
    public ChatSyncConfig getChatSyncConfig() {
        return this.chatSyncConfig;
    }

    /**
     * @return runtimeConfig
     */
    public AIAgentRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
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

    public static final class Builder extends Request.Builder<StartAIAgentInstanceRequest, Builder> {
        private String AIAgentId; 
        private AIAgentConfig agentConfig; 
        private ChatSyncConfig chatSyncConfig; 
        private AIAgentRuntimeConfig runtimeConfig; 
        private String sessionId; 
        private AIAgentTemplateConfig templateConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(StartAIAgentInstanceRequest request) {
            super(request);
            this.AIAgentId = request.AIAgentId;
            this.agentConfig = request.agentConfig;
            this.chatSyncConfig = request.chatSyncConfig;
            this.runtimeConfig = request.runtimeConfig;
            this.sessionId = request.sessionId;
            this.templateConfig = request.templateConfig;
            this.userData = request.userData;
        } 

        /**
         * <p>The ID of the agent configured in the <a href="https://ims.console.aliyun.com/ai/robot/list">IMS console</a>.</p>
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
         * <p>The agent template configuration. The specified configuration is merged and updated with the agent template configuration in the console. If this parameter is not specified, the default configurations of the agent in the console are used.</p>
         * <blockquote>
         * <p>Compatible with TemplateConfig rules: Fields in AgentConfig take precedence. If TemplateConfig contains fields that are not specified in AgentConfig, the fields in TemplateConfig are used. Use AgentConfig instead of TemplateConfig.</p>
         * </blockquote>
         */
        public Builder agentConfig(AIAgentConfig agentConfig) {
            String agentConfigShrink = shrink(agentConfig, "AgentConfig", "json");
            this.putQueryParameter("AgentConfig", agentConfigShrink);
            this.agentConfig = agentConfig;
            return this;
        }

        /**
         * <p>The configuration for synchronizing chat history.</p>
         */
        public Builder chatSyncConfig(ChatSyncConfig chatSyncConfig) {
            String chatSyncConfigShrink = shrink(chatSyncConfig, "ChatSyncConfig", "json");
            this.putQueryParameter("ChatSyncConfig", chatSyncConfigShrink);
            this.chatSyncConfig = chatSyncConfig;
            return this;
        }

        /**
         * <p>The configuration required for the agent runtime.</p>
         * <p>This parameter is required.</p>
         */
        public Builder runtimeConfig(AIAgentRuntimeConfig runtimeConfig) {
            String runtimeConfigShrink = shrink(runtimeConfig, "RuntimeConfig", "json");
            this.putQueryParameter("RuntimeConfig", runtimeConfigShrink);
            this.runtimeConfig = runtimeConfig;
            return this;
        }

        /**
         * <p>The unique identifier of the conversation. Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p>f213fbc005e4f309379701645f4****</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The agent template configuration. The specified configuration is merged and updated with the agent template configuration in the console. If this parameter is not specified, the default configurations of the agent in the console are used.</p>
         * <blockquote>
         * <p>Agent template configuration. <strong>[Deprecated]</strong> For more information, see the AgentConfig field.</p>
         * </blockquote>
         */
        public Builder templateConfig(AIAgentTemplateConfig templateConfig) {
            String templateConfigShrink = shrink(templateConfig, "TemplateConfig", "json");
            this.putQueryParameter("TemplateConfig", templateConfigShrink);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * <p>The user-defined information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Email&quot;:&quot;<a href="mailto:johndoe@example.com">johndoe@example.com</a>&quot;,&quot;Preferences&quot;:{&quot;Language&quot;:&quot;en&quot;}}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public StartAIAgentInstanceRequest build() {
            return new StartAIAgentInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartAIAgentInstanceRequest} extends {@link TeaModel}
     *
     * <p>StartAIAgentInstanceRequest</p>
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

            private Builder() {
            } 

            private Builder(ChatSyncConfig model) {
                this.IMAIAgentId = model.IMAIAgentId;
                this.receiverId = model.receiverId;
            } 

            /**
             * <p>The ID of the IM agent.</p>
             * 
             * <strong>example:</strong>
             * <p>**<strong><strong>005e4f309379701645f4</strong></strong></p>
             */
            public Builder IMAIAgentId(String IMAIAgentId) {
                this.IMAIAgentId = IMAIAgentId;
                return this;
            }

            /**
             * <p>The ID of the receiving user.</p>
             * 
             * <strong>example:</strong>
             * <p>4167626d312034b2b1c3b7f2f3e41884</p>
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
