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

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Delta")
    private String delta;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ParentMessageId")
    private String parentMessageId;

    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("RunId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("StepName")
    private String stepName;

    @com.aliyun.core.annotation.NameInMap("TaskTrackerId")
    private String taskTrackerId;

    @com.aliyun.core.annotation.NameInMap("ThreadId")
    private String threadId;

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
        this.content = builder.content;
        this.delta = builder.delta;
        this.messageId = builder.messageId;
        this.name = builder.name;
        this.parentMessageId = builder.parentMessageId;
        this.role = builder.role;
        this.runId = builder.runId;
        this.stepName = builder.stepName;
        this.taskTrackerId = builder.taskTrackerId;
        this.threadId = builder.threadId;
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
        private String content; 
        private String delta; 
        private String messageId; 
        private String name; 
        private String parentMessageId; 
        private String role; 
        private String runId; 
        private String stepName; 
        private String taskTrackerId; 
        private String threadId; 
        private String toolCallId; 
        private String toolCallName; 
        private String type; 
        private Object value; 

        private Builder() {
        } 

        private Builder(ChatResponseBody model) {
            this.activityType = model.activityType;
            this.content = model.content;
            this.delta = model.delta;
            this.messageId = model.messageId;
            this.name = model.name;
            this.parentMessageId = model.parentMessageId;
            this.role = model.role;
            this.runId = model.runId;
            this.stepName = model.stepName;
            this.taskTrackerId = model.taskTrackerId;
            this.threadId = model.threadId;
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
