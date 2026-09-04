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
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * Conversation.
         */
        public Builder conversation(Conversation conversation) {
            this.conversation = conversation;
            return this;
        }

        /**
         * RequestId.
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
             * ConversationId.
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * ConversationSummary.
             */
            public Builder conversationSummary(String conversationSummary) {
                this.conversationSummary = conversationSummary;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * Feedback.
             */
            public Builder feedback(Long feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * LastTurnId.
             */
            public Builder lastTurnId(String lastTurnId) {
                this.lastTurnId = lastTurnId;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * PlanMode.
             */
            public Builder planMode(String planMode) {
                this.planMode = planMode;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ScheduledTaskId.
             */
            public Builder scheduledTaskId(String scheduledTaskId) {
                this.scheduledTaskId = scheduledTaskId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SummaryVersion.
             */
            public Builder summaryVersion(Long summaryVersion) {
                this.summaryVersion = summaryVersion;
                return this;
            }

            /**
             * ThinkingMode.
             */
            public Builder thinkingMode(String thinkingMode) {
                this.thinkingMode = thinkingMode;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * UpdatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * Visibility.
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
