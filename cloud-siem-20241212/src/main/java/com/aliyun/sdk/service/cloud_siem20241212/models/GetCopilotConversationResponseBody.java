// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link GetCopilotConversationResponseBody} extends {@link TeaModel}
 *
 * <p>GetCopilotConversationResponseBody</p>
 */
public class GetCopilotConversationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiVersion")
    private String apiVersion;

    @com.aliyun.core.annotation.NameInMap("Conversation")
    private Conversation conversation;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCopilotConversationResponseBody(Builder builder) {
        this.apiVersion = builder.apiVersion;
        this.conversation = builder.conversation;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCopilotConversationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return conversation
     */
    public Conversation getConversation() {
        return this.conversation;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String apiVersion; 
        private Conversation conversation; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCopilotConversationResponseBody model) {
            this.apiVersion = model.apiVersion;
            this.conversation = model.conversation;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The API version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.2</p>
         */
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * <p>The conversation text ID.</p>
         */
        public Builder conversation(Conversation conversation) {
            this.conversation = conversation;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCopilotConversationResponseBody build() {
            return new GetCopilotConversationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCopilotConversationResponseBody} extends {@link TeaModel}
     *
     * <p>GetCopilotConversationResponseBody</p>
     */
    public static class Conversation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConversationId")
        private String conversationId;

        @com.aliyun.core.annotation.NameInMap("ConversationSummary")
        private String conversationSummary;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Feedback")
        private Long feedback;

        @com.aliyun.core.annotation.NameInMap("LastTurnId")
        private String lastTurnId;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("PlanMode")
        private String planMode;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ScheduledTaskId")
        private String scheduledTaskId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SummaryVersion")
        private Long summaryVersion;

        @com.aliyun.core.annotation.NameInMap("ThinkingMode")
        private String thinkingMode;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("Visibility")
        private String visibility;

        private Conversation(Builder builder) {
            this.conversationId = builder.conversationId;
            this.conversationSummary = builder.conversationSummary;
            this.createdAt = builder.createdAt;
            this.feedback = builder.feedback;
            this.lastTurnId = builder.lastTurnId;
            this.model = builder.model;
            this.planMode = builder.planMode;
            this.projectId = builder.projectId;
            this.scheduledTaskId = builder.scheduledTaskId;
            this.status = builder.status;
            this.summaryVersion = builder.summaryVersion;
            this.thinkingMode = builder.thinkingMode;
            this.title = builder.title;
            this.updatedAt = builder.updatedAt;
            this.visibility = builder.visibility;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conversation create() {
            return builder().build();
        }

        /**
         * @return conversationId
         */
        public String getConversationId() {
            return this.conversationId;
        }

        /**
         * @return conversationSummary
         */
        public String getConversationSummary() {
            return this.conversationSummary;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return feedback
         */
        public Long getFeedback() {
            return this.feedback;
        }

        /**
         * @return lastTurnId
         */
        public String getLastTurnId() {
            return this.lastTurnId;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return planMode
         */
        public String getPlanMode() {
            return this.planMode;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return scheduledTaskId
         */
        public String getScheduledTaskId() {
            return this.scheduledTaskId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return summaryVersion
         */
        public Long getSummaryVersion() {
            return this.summaryVersion;
        }

        /**
         * @return thinkingMode
         */
        public String getThinkingMode() {
            return this.thinkingMode;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return visibility
         */
        public String getVisibility() {
            return this.visibility;
        }

        public static final class Builder {
            private String conversationId; 
            private String conversationSummary; 
            private String createdAt; 
            private Long feedback; 
            private String lastTurnId; 
            private String model; 
            private String planMode; 
            private String projectId; 
            private String scheduledTaskId; 
            private String status; 
            private Long summaryVersion; 
            private String thinkingMode; 
            private String title; 
            private String updatedAt; 
            private String visibility; 

            private Builder() {
            } 

            private Builder(Conversation model) {
                this.conversationId = model.conversationId;
                this.conversationSummary = model.conversationSummary;
                this.createdAt = model.createdAt;
                this.feedback = model.feedback;
                this.lastTurnId = model.lastTurnId;
                this.model = model.model;
                this.planMode = model.planMode;
                this.projectId = model.projectId;
                this.scheduledTaskId = model.scheduledTaskId;
                this.status = model.status;
                this.summaryVersion = model.summaryVersion;
                this.thinkingMode = model.thinkingMode;
                this.title = model.title;
                this.updatedAt = model.updatedAt;
                this.visibility = model.visibility;
            } 

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>54b6c969-4b75-47be-9f43-71f88aeb****</p>
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * <p>The session summary.</p>
             * 
             * <strong>example:</strong>
             * <p>Initial correlation analysis between alerts and network logs has been completed</p>
             */
            public Builder conversationSummary(String conversationSummary) {
                this.conversationSummary = conversationSummary;
                return this;
            }

            /**
             * <p>This field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-29T02:07:24Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The feedback.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder feedback(Long feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * <p>The ID of the most recent conversation turn.</p>
             * 
             * <strong>example:</strong>
             * <p>dc18b894-19a3-45ee-8768-a59478e0****</p>
             */
            public Builder lastTurnId(String lastTurnId) {
                this.lastTurnId = lastTurnId;
                return this;
            }

            /**
             * <p>The model identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3.7-max</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>Specifies whether the plan mode is enabled. Valid values: disable, enable, and force. Default value: enable.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder planMode(String planMode) {
                this.planMode = planMode;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>project-incident-****</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The ID of the scheduled task. The ID is generated by the system and is globally unique.</p>
             * 
             * <strong>example:</strong>
             * <p>task-e34f770da4f04f6db21c2819****</p>
             */
            public Builder scheduledTaskId(String scheduledTaskId) {
                this.scheduledTaskId = scheduledTaskId;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The version number of the session summary.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder summaryVersion(Long summaryVersion) {
                this.summaryVersion = summaryVersion;
                return this;
            }

            /**
             * <p>The deep thinking configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder thinkingMode(String thinkingMode) {
                this.thinkingMode = thinkingMode;
                return this;
            }

            /**
             * <p>The session title.</p>
             * 
             * <strong>example:</strong>
             * <p>Security event investigation</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The update date. The format is YYYY-MM-DDTHH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-09T10:27:35</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The visibility. Valid values:</p>
             * <ul>
             * <li><strong>PUBLIC</strong>: Public.</li>
             * <li><strong>PRIVATE</strong>: Private.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            public Conversation build() {
                return new Conversation(this);
            } 

        } 

    }
}
