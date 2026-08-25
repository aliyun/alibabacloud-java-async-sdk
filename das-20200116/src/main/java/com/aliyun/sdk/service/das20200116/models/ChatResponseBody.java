// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link ChatResponseBody} extends {@link TeaModel}
 *
 * <p>ChatResponseBody</p>
 */
public class ChatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActivityType")
    private String activityType;

    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Delta")
    private String delta;

    @com.aliyun.core.annotation.NameInMap("Kind")
    private String kind;

    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OriginatingToolCallId")
    private String originatingToolCallId;

    @com.aliyun.core.annotation.NameInMap("ParentAgentId")
    private String parentAgentId;

    @com.aliyun.core.annotation.NameInMap("ParentMessageId")
    private String parentMessageId;

    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("RunId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("StepName")
    private String stepName;

    @com.aliyun.core.annotation.NameInMap("StepStatus")
    private String stepStatus;

    @com.aliyun.core.annotation.NameInMap("TaskTrackerId")
    private String taskTrackerId;

    @com.aliyun.core.annotation.NameInMap("ThreadId")
    private String threadId;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    @com.aliyun.core.annotation.NameInMap("ToolCallError")
    private String toolCallError;

    @com.aliyun.core.annotation.NameInMap("ToolCallId")
    private String toolCallId;

    @com.aliyun.core.annotation.NameInMap("ToolCallName")
    private String toolCallName;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Value")
    private Object value;

    private ChatResponseBody(Builder builder) {
        this.activityType = builder.activityType;
        this.agentId = builder.agentId;
        this.content = builder.content;
        this.delta = builder.delta;
        this.kind = builder.kind;
        this.label = builder.label;
        this.messageId = builder.messageId;
        this.name = builder.name;
        this.originatingToolCallId = builder.originatingToolCallId;
        this.parentAgentId = builder.parentAgentId;
        this.parentMessageId = builder.parentMessageId;
        this.role = builder.role;
        this.runId = builder.runId;
        this.stepName = builder.stepName;
        this.stepStatus = builder.stepStatus;
        this.taskTrackerId = builder.taskTrackerId;
        this.threadId = builder.threadId;
        this.timestamp = builder.timestamp;
        this.toolCallError = builder.toolCallError;
        this.toolCallId = builder.toolCallId;
        this.toolCallName = builder.toolCallName;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityType
     */
    public String getActivityType() {
        return this.activityType;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return delta
     */
    public String getDelta() {
        return this.delta;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return originatingToolCallId
     */
    public String getOriginatingToolCallId() {
        return this.originatingToolCallId;
    }

    /**
     * @return parentAgentId
     */
    public String getParentAgentId() {
        return this.parentAgentId;
    }

    /**
     * @return parentMessageId
     */
    public String getParentMessageId() {
        return this.parentMessageId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    /**
     * @return stepStatus
     */
    public String getStepStatus() {
        return this.stepStatus;
    }

    /**
     * @return taskTrackerId
     */
    public String getTaskTrackerId() {
        return this.taskTrackerId;
    }

    /**
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return toolCallError
     */
    public String getToolCallError() {
        return this.toolCallError;
    }

    /**
     * @return toolCallId
     */
    public String getToolCallId() {
        return this.toolCallId;
    }

    /**
     * @return toolCallName
     */
    public String getToolCallName() {
        return this.toolCallName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return value
     */
    public Object getValue() {
        return this.value;
    }

    public static final class Builder {
        private String activityType; 
        private String agentId; 
        private String content; 
        private String delta; 
        private String kind; 
        private String label; 
        private String messageId; 
        private String name; 
        private String originatingToolCallId; 
        private String parentAgentId; 
        private String parentMessageId; 
        private String role; 
        private String runId; 
        private String stepName; 
        private String stepStatus; 
        private String taskTrackerId; 
        private String threadId; 
        private Long timestamp; 
        private String toolCallError; 
        private String toolCallId; 
        private String toolCallName; 
        private String type; 
        private Object value; 

        private Builder() {
        } 

        private Builder(ChatResponseBody model) {
            this.activityType = model.activityType;
            this.agentId = model.agentId;
            this.content = model.content;
            this.delta = model.delta;
            this.kind = model.kind;
            this.label = model.label;
            this.messageId = model.messageId;
            this.name = model.name;
            this.originatingToolCallId = model.originatingToolCallId;
            this.parentAgentId = model.parentAgentId;
            this.parentMessageId = model.parentMessageId;
            this.role = model.role;
            this.runId = model.runId;
            this.stepName = model.stepName;
            this.stepStatus = model.stepStatus;
            this.taskTrackerId = model.taskTrackerId;
            this.threadId = model.threadId;
            this.timestamp = model.timestamp;
            this.toolCallError = model.toolCallError;
            this.toolCallId = model.toolCallId;
            this.toolCallName = model.toolCallName;
            this.type = model.type;
            this.value = model.value;
        } 

        /**
         * ActivityType.
         */
        public Builder activityType(String activityType) {
            this.activityType = activityType;
            return this;
        }

        /**
         * AgentId.
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Delta.
         */
        public Builder delta(String delta) {
            this.delta = delta;
            return this;
        }

        /**
         * Kind.
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
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
         * OriginatingToolCallId.
         */
        public Builder originatingToolCallId(String originatingToolCallId) {
            this.originatingToolCallId = originatingToolCallId;
            return this;
        }

        /**
         * ParentAgentId.
         */
        public Builder parentAgentId(String parentAgentId) {
            this.parentAgentId = parentAgentId;
            return this;
        }

        /**
         * ParentMessageId.
         */
        public Builder parentMessageId(String parentMessageId) {
            this.parentMessageId = parentMessageId;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * RunId.
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * StepName.
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        /**
         * StepStatus.
         */
        public Builder stepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }

        /**
         * TaskTrackerId.
         */
        public Builder taskTrackerId(String taskTrackerId) {
            this.taskTrackerId = taskTrackerId;
            return this;
        }

        /**
         * ThreadId.
         */
        public Builder threadId(String threadId) {
            this.threadId = threadId;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * ToolCallError.
         */
        public Builder toolCallError(String toolCallError) {
            this.toolCallError = toolCallError;
            return this;
        }

        /**
         * ToolCallId.
         */
        public Builder toolCallId(String toolCallId) {
            this.toolCallId = toolCallId;
            return this;
        }

        /**
         * ToolCallName.
         */
        public Builder toolCallName(String toolCallName) {
            this.toolCallName = toolCallName;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(Object value) {
            this.value = value;
            return this;
        }

        public ChatResponseBody build() {
            return new ChatResponseBody(this);
        } 

    } 

}
