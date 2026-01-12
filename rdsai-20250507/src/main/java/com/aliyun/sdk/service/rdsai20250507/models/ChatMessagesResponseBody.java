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

    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private Long createdAt;

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

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private ChatMessagesResponseBody(Builder builder) {
        this.answer = builder.answer;
        this.conversationId = builder.conversationId;
        this.createdAt = builder.createdAt;
        this.event = builder.event;
        this.id = builder.id;
        this.messageId = builder.messageId;
        this.mode = builder.mode;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String answer; 
        private String conversationId; 
        private Long createdAt; 
        private String event; 
        private String id; 
        private String messageId; 
        private String mode; 
        private String requestId; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(ChatMessagesResponseBody model) {
            this.answer = model.answer;
            this.conversationId = model.conversationId;
            this.createdAt = model.createdAt;
            this.event = model.event;
            this.id = model.id;
            this.messageId = model.messageId;
            this.mode = model.mode;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The answer.</p>
         */
        public Builder answer(String answer) {
            this.answer = answer;
            return this;
        }

        /**
         * <p>The ID of the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>9cbbe885-b240-4803-9d15-6781a3fd****</p>
         */
        public Builder conversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>The creation time of the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>1763986004</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
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
         * <p>The ID of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>01c3d43d-9466-4bd5-8196-4cbbce08****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public ChatMessagesResponseBody build() {
            return new ChatMessagesResponseBody(this);
        } 

    } 

}
