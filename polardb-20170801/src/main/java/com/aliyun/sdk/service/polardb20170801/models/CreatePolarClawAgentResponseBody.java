// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreatePolarClawAgentResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePolarClawAgentResponseBody</p>
 */
public class CreatePolarClawAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Agent")
    private Agent agent;

    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Workspace")
    private String workspace;

    private CreatePolarClawAgentResponseBody(Builder builder) {
        this.agent = builder.agent;
        this.agentId = builder.agentId;
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.message = builder.message;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolarClawAgentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agent
     */
    public Agent getAgent() {
        return this.agent;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private Agent agent; 
        private String agentId; 
        private String applicationId; 
        private Integer code; 
        private String message; 
        private String name; 
        private String requestId; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(CreatePolarClawAgentResponseBody model) {
            this.agent = model.agent;
            this.agentId = model.agentId;
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.message = model.message;
            this.name = model.name;
            this.requestId = model.requestId;
            this.workspace = model.workspace;
        } 

        /**
         * Agent.
         */
        public Builder agent(Agent agent) {
            this.agent = agent;
            return this;
        }

        /**
         * <p>Agent ID</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public CreatePolarClawAgentResponseBody build() {
            return new CreatePolarClawAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePolarClawAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePolarClawAgentResponseBody</p>
     */
    public static class Identity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("AvatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("Emoji")
        private String emoji;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Theme")
        private String theme;

        private Identity(Builder builder) {
            this.avatar = builder.avatar;
            this.avatarUrl = builder.avatarUrl;
            this.emoji = builder.emoji;
            this.name = builder.name;
            this.theme = builder.theme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Identity create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return emoji
         */
        public String getEmoji() {
            return this.emoji;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return theme
         */
        public String getTheme() {
            return this.theme;
        }

        public static final class Builder {
            private String avatar; 
            private String avatarUrl; 
            private String emoji; 
            private String name; 
            private String theme; 

            private Builder() {
            } 

            private Builder(Identity model) {
                this.avatar = model.avatar;
                this.avatarUrl = model.avatarUrl;
                this.emoji = model.emoji;
                this.name = model.name;
                this.theme = model.theme;
            } 

            /**
             * Avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
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
             * Emoji.
             */
            public Builder emoji(String emoji) {
                this.emoji = emoji;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Theme.
             */
            public Builder theme(String theme) {
                this.theme = theme;
                return this;
            }

            public Identity build() {
                return new Identity(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePolarClawAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePolarClawAgentResponseBody</p>
     */
    public static class Agent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Identity")
        private Identity identity;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Workspace")
        private String workspace;

        private Agent(Builder builder) {
            this.id = builder.id;
            this.identity = builder.identity;
            this.name = builder.name;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agent create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return identity
         */
        public Identity getIdentity() {
            return this.identity;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String id; 
            private Identity identity; 
            private String name; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Agent model) {
                this.id = model.id;
                this.identity = model.identity;
                this.name = model.name;
                this.workspace = model.workspace;
            } 

            /**
             * <p>Agent ID</p>
             * 
             * <strong>example:</strong>
             * <p>work</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Identity.
             */
            public Builder identity(Identity identity) {
                this.identity = identity;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Agent build() {
                return new Agent(this);
            } 

        } 

    }
}
