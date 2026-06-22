// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkakopilot20260414.models;

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
 * {@link KopilotChatStreamResponseBody} extends {@link TeaModel}
 *
 * <p>KopilotChatStreamResponseBody</p>
 */
public class KopilotChatStreamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Delta")
    private String delta;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("RunId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("ThreadId")
    private String threadId;

    @com.aliyun.core.annotation.NameInMap("ToolCallId")
    private String toolCallId;

    @com.aliyun.core.annotation.NameInMap("ToolCallName")
    private String toolCallName;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private KopilotChatStreamResponseBody(Builder builder) {
        this.content = builder.content;
        this.delta = builder.delta;
        this.message = builder.message;
        this.messageId = builder.messageId;
        this.requestId = builder.requestId;
        this.role = builder.role;
        this.runId = builder.runId;
        this.threadId = builder.threadId;
        this.toolCallId = builder.toolCallId;
        this.toolCallName = builder.toolCallName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KopilotChatStreamResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String content; 
        private String delta; 
        private String message; 
        private String messageId; 
        private String requestId; 
        private String role; 
        private String runId; 
        private String threadId; 
        private String toolCallId; 
        private String toolCallName; 
        private String type; 

        private Builder() {
        } 

        private Builder(KopilotChatStreamResponseBody model) {
            this.content = model.content;
            this.delta = model.delta;
            this.message = model.message;
            this.messageId = model.messageId;
            this.requestId = model.requestId;
            this.role = model.role;
            this.runId = model.runId;
            this.threadId = model.threadId;
            this.toolCallId = model.toolCallId;
            this.toolCallName = model.toolCallName;
            this.type = model.type;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public KopilotChatStreamResponseBody build() {
            return new KopilotChatStreamResponseBody(this);
        } 

    } 

}
