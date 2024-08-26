// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AIAssistantMessage} extends {@link TeaModel}
 *
 * <p>AIAssistantMessage</p>
 */
public class AIAssistantMessage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("client_id")
    private String clientId;

    @com.aliyun.core.annotation.NameInMap("constraint")
    private AIAssistantChatConstraint constraint;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("files")
    private java.util.List < AIAssistantMessageFileMeta > files;

    @com.aliyun.core.annotation.NameInMap("message_id")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("references")
    private java.util.List < AIAssistantChatReference > references;

    @com.aliyun.core.annotation.NameInMap("regenerate")
    private Boolean regenerate;

    @com.aliyun.core.annotation.NameInMap("replied_at")
    private Long repliedAt;

    @com.aliyun.core.annotation.NameInMap("reply")
    private String reply;

    @com.aliyun.core.annotation.NameInMap("reply_type")
    private String replyType;

    @com.aliyun.core.annotation.NameInMap("scope")
    private AIAssistantChatScope scope;

    @com.aliyun.core.annotation.NameInMap("score")
    private Double score;

    @com.aliyun.core.annotation.NameInMap("session_id")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("tools")
    private java.util.List < AIAssistantChatTool > tools;

    @com.aliyun.core.annotation.NameInMap("topic")
    private String topic;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    private AIAssistantMessage(Builder builder) {
        this.clientId = builder.clientId;
        this.constraint = builder.constraint;
        this.createdAt = builder.createdAt;
        this.files = builder.files;
        this.messageId = builder.messageId;
        this.query = builder.query;
        this.references = builder.references;
        this.regenerate = builder.regenerate;
        this.repliedAt = builder.repliedAt;
        this.reply = builder.reply;
        this.replyType = builder.replyType;
        this.scope = builder.scope;
        this.score = builder.score;
        this.sessionId = builder.sessionId;
        this.tools = builder.tools;
        this.topic = builder.topic;
        this.type = builder.type;
        this.updatedAt = builder.updatedAt;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIAssistantMessage create() {
        return builder().build();
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return constraint
     */
    public AIAssistantChatConstraint getConstraint() {
        return this.constraint;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return files
     */
    public java.util.List < AIAssistantMessageFileMeta > getFiles() {
        return this.files;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return references
     */
    public java.util.List < AIAssistantChatReference > getReferences() {
        return this.references;
    }

    /**
     * @return regenerate
     */
    public Boolean getRegenerate() {
        return this.regenerate;
    }

    /**
     * @return repliedAt
     */
    public Long getRepliedAt() {
        return this.repliedAt;
    }

    /**
     * @return reply
     */
    public String getReply() {
        return this.reply;
    }

    /**
     * @return replyType
     */
    public String getReplyType() {
        return this.replyType;
    }

    /**
     * @return scope
     */
    public AIAssistantChatScope getScope() {
        return this.scope;
    }

    /**
     * @return score
     */
    public Double getScore() {
        return this.score;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return tools
     */
    public java.util.List < AIAssistantChatTool > getTools() {
        return this.tools;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String clientId; 
        private AIAssistantChatConstraint constraint; 
        private Long createdAt; 
        private java.util.List < AIAssistantMessageFileMeta > files; 
        private String messageId; 
        private String query; 
        private java.util.List < AIAssistantChatReference > references; 
        private Boolean regenerate; 
        private Long repliedAt; 
        private String reply; 
        private String replyType; 
        private AIAssistantChatScope scope; 
        private Double score; 
        private String sessionId; 
        private java.util.List < AIAssistantChatTool > tools; 
        private String topic; 
        private String type; 
        private Long updatedAt; 
        private String userId; 

        /**
         * client_id.
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * constraint.
         */
        public Builder constraint(AIAssistantChatConstraint constraint) {
            this.constraint = constraint;
            return this;
        }

        /**
         * created_at.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * files.
         */
        public Builder files(java.util.List < AIAssistantMessageFileMeta > files) {
            this.files = files;
            return this;
        }

        /**
         * message_id.
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * references.
         */
        public Builder references(java.util.List < AIAssistantChatReference > references) {
            this.references = references;
            return this;
        }

        /**
         * regenerate.
         */
        public Builder regenerate(Boolean regenerate) {
            this.regenerate = regenerate;
            return this;
        }

        /**
         * replied_at.
         */
        public Builder repliedAt(Long repliedAt) {
            this.repliedAt = repliedAt;
            return this;
        }

        /**
         * reply.
         */
        public Builder reply(String reply) {
            this.reply = reply;
            return this;
        }

        /**
         * reply_type.
         */
        public Builder replyType(String replyType) {
            this.replyType = replyType;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(AIAssistantChatScope scope) {
            this.scope = scope;
            return this;
        }

        /**
         * score.
         */
        public Builder score(Double score) {
            this.score = score;
            return this;
        }

        /**
         * session_id.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * tools.
         */
        public Builder tools(java.util.List < AIAssistantChatTool > tools) {
            this.tools = tools;
            return this;
        }

        /**
         * topic.
         */
        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AIAssistantMessage build() {
            return new AIAssistantMessage(this);
        } 

    } 

}
