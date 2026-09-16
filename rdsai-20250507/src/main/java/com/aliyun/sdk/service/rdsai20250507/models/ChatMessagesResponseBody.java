// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ChatMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>ChatMessagesResponseBody</p>
 */
public class ChatMessagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Answer")
    private String answer;

    @com.aliyun.core.annotation.NameInMap("ApprovalStatus")
    private String approvalStatus;

    @com.aliyun.core.annotation.NameInMap("CallId")
    private String callId;

    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Event")
    private String event;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoundId")
    private String roundId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("ToolArguments")
    private java.util.Map<String, ?> toolArguments;

    @com.aliyun.core.annotation.NameInMap("ToolName")
    private String toolName;

    private ChatMessagesResponseBody(Builder builder) {
        this.answer = builder.answer;
        this.approvalStatus = builder.approvalStatus;
        this.callId = builder.callId;
        this.conversationId = builder.conversationId;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.event = builder.event;
        this.id = builder.id;
        this.messageId = builder.messageId;
        this.mode = builder.mode;
        this.requestId = builder.requestId;
        this.roundId = builder.roundId;
        this.taskId = builder.taskId;
        this.toolArguments = builder.toolArguments;
        this.toolName = builder.toolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatMessagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answer
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * @return approvalStatus
     */
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roundId
     */
    public String getRoundId() {
        return this.roundId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return toolArguments
     */
    public java.util.Map<String, ?> getToolArguments() {
        return this.toolArguments;
    }

    /**
     * @return toolName
     */
    public String getToolName() {
        return this.toolName;
    }

    public static final class Builder {
        private String answer; 
        private String approvalStatus; 
        private String callId; 
        private String conversationId; 
        private Long createdAt; 
        private String description; 
        private String event; 
        private String id; 
        private String messageId; 
        private String mode; 
        private String requestId; 
        private String roundId; 
        private String taskId; 
        private java.util.Map<String, ?> toolArguments; 
        private String toolName; 

        private Builder() {
        } 

        private Builder(ChatMessagesResponseBody model) {
            this.answer = model.answer;
            this.approvalStatus = model.approvalStatus;
            this.callId = model.callId;
            this.conversationId = model.conversationId;
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.event = model.event;
            this.id = model.id;
            this.messageId = model.messageId;
            this.mode = model.mode;
            this.requestId = model.requestId;
            this.roundId = model.roundId;
            this.taskId = model.taskId;
            this.toolArguments = model.toolArguments;
            this.toolName = model.toolName;
        } 

        /**
         * <p>The answer content.</p>
         * 
         * <strong>example:</strong>
         * <p>The disk usage of instance rm-bp14as9914vd3**** is 23%, and storage expansion is not needed at this time. If you need to view the detailed configuration, performance monitoring, or perform other operations for an instance, let me know your specific requirements!</p>
         */
        public Builder answer(String answer) {
            this.answer = answer;
            return this;
        }

        /**
         * <p>The tool invocation approval status.</p>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        public Builder approvalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * <p>The tool invocation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>call-example</p>
         */
        public Builder callId(String callId) {
            this.callId = callId;
            return this;
        }

        /**
         * <p>The conversation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9cbbe885-b240-4803-9d15-6781a3fd****</p>
         */
        public Builder conversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1763986004</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The tool invocation description.</p>
         * 
         * <strong>example:</strong>
         * <p>Search ContextDB records</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The event.</p>
         * 
         * <strong>example:</strong>
         * <p>MysqlIOException</p>
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>60b335ca-124d-4ee1-864b-de554987****</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>oas8pwy2-slxw-sf98-bx83-cb2hkktl****</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The query mode.</p>
         * 
         * <strong>example:</strong>
         * <p>This field will be deprecated in the future. Ignore it</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tool approval round ID.</p>
         * 
         * <strong>example:</strong>
         * <p>round-example</p>
         */
        public Builder roundId(String roundId) {
            this.roundId = roundId;
            return this;
        }

        /**
         * <p>The asynchronous task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01c3d43d-9466-4bd5-8196-4cbbce08****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The tool invocation parameters.</p>
         */
        public Builder toolArguments(java.util.Map<String, ?> toolArguments) {
            this.toolArguments = toolArguments;
            return this;
        }

        /**
         * <p>The tool name.</p>
         * 
         * <strong>example:</strong>
         * <p>contextdb.search</p>
         */
        public Builder toolName(String toolName) {
            this.toolName = toolName;
            return this;
        }

        public ChatMessagesResponseBody build() {
            return new ChatMessagesResponseBody(this);
        } 

    } 

}
