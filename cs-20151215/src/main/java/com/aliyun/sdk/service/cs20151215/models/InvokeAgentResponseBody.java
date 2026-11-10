// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link InvokeAgentResponseBody} extends {@link TeaModel}
 *
 * <p>InvokeAgentResponseBody</p>
 */
public class InvokeAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("delta")
    private String delta;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("messageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("outcome")
    private Outcome outcome;

    @com.aliyun.core.annotation.NameInMap("parentMessageId")
    private String parentMessageId;

    @com.aliyun.core.annotation.NameInMap("role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("snapshot")
    private Object snapshot;

    @com.aliyun.core.annotation.NameInMap("threadId")
    private String threadId;

    @com.aliyun.core.annotation.NameInMap("toolCallId")
    private String toolCallId;

    @com.aliyun.core.annotation.NameInMap("toolCallName")
    private String toolCallName;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("value")
    private Object value;

    private InvokeAgentResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.delta = builder.delta;
        this.message = builder.message;
        this.messageId = builder.messageId;
        this.name = builder.name;
        this.outcome = builder.outcome;
        this.parentMessageId = builder.parentMessageId;
        this.role = builder.role;
        this.runId = builder.runId;
        this.snapshot = builder.snapshot;
        this.threadId = builder.threadId;
        this.toolCallId = builder.toolCallId;
        this.toolCallName = builder.toolCallName;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeAgentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return outcome
     */
    public Outcome getOutcome() {
        return this.outcome;
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
     * @return snapshot
     */
    public Object getSnapshot() {
        return this.snapshot;
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
        private String code; 
        private String content; 
        private String delta; 
        private String message; 
        private String messageId; 
        private String name; 
        private Outcome outcome; 
        private String parentMessageId; 
        private String role; 
        private String runId; 
        private Object snapshot; 
        private String threadId; 
        private String toolCallId; 
        private String toolCallName; 
        private String type; 
        private Object value; 

        private Builder() {
        } 

        private Builder(InvokeAgentResponseBody model) {
            this.code = model.code;
            this.content = model.content;
            this.delta = model.delta;
            this.message = model.message;
            this.messageId = model.messageId;
            this.name = model.name;
            this.outcome = model.outcome;
            this.parentMessageId = model.parentMessageId;
            this.role = model.role;
            this.runId = model.runId;
            this.snapshot = model.snapshot;
            this.threadId = model.threadId;
            this.toolCallId = model.toolCallId;
            this.toolCallName = model.toolCallName;
            this.type = model.type;
            this.value = model.value;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * delta.
         */
        public Builder delta(String delta) {
            this.delta = delta;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * messageId.
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * outcome.
         */
        public Builder outcome(Outcome outcome) {
            this.outcome = outcome;
            return this;
        }

        /**
         * parentMessageId.
         */
        public Builder parentMessageId(String parentMessageId) {
            this.parentMessageId = parentMessageId;
            return this;
        }

        /**
         * role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * runId.
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * snapshot.
         */
        public Builder snapshot(Object snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        /**
         * threadId.
         */
        public Builder threadId(String threadId) {
            this.threadId = threadId;
            return this;
        }

        /**
         * toolCallId.
         */
        public Builder toolCallId(String toolCallId) {
            this.toolCallId = toolCallId;
            return this;
        }

        /**
         * toolCallName.
         */
        public Builder toolCallName(String toolCallName) {
            this.toolCallName = toolCallName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RUN_STARTED</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * value.
         */
        public Builder value(Object value) {
            this.value = value;
            return this;
        }

        public InvokeAgentResponseBody build() {
            return new InvokeAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InvokeAgentResponseBody} extends {@link TeaModel}
     *
     * <p>InvokeAgentResponseBody</p>
     */
    public static class Interrupts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expiresAt")
        private String expiresAt;

        @com.aliyun.core.annotation.NameInMap("id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("reason")
        @com.aliyun.core.annotation.Validation(required = true)
        private String reason;

        @com.aliyun.core.annotation.NameInMap("responseSchema")
        private java.util.Map<String, ?> responseSchema;

        @com.aliyun.core.annotation.NameInMap("toolCallId")
        private String toolCallId;

        private Interrupts(Builder builder) {
            this.expiresAt = builder.expiresAt;
            this.id = builder.id;
            this.message = builder.message;
            this.metadata = builder.metadata;
            this.reason = builder.reason;
            this.responseSchema = builder.responseSchema;
            this.toolCallId = builder.toolCallId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Interrupts create() {
            return builder().build();
        }

        /**
         * @return expiresAt
         */
        public String getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return responseSchema
         */
        public java.util.Map<String, ?> getResponseSchema() {
            return this.responseSchema;
        }

        /**
         * @return toolCallId
         */
        public String getToolCallId() {
            return this.toolCallId;
        }

        public static final class Builder {
            private String expiresAt; 
            private String id; 
            private String message; 
            private java.util.Map<String, ?> metadata; 
            private String reason; 
            private java.util.Map<String, ?> responseSchema; 
            private String toolCallId; 

            private Builder() {
            } 

            private Builder(Interrupts model) {
                this.expiresAt = model.expiresAt;
                this.id = model.id;
                this.message = model.message;
                this.metadata = model.metadata;
                this.reason = model.reason;
                this.responseSchema = model.responseSchema;
                this.toolCallId = model.toolCallId;
            } 

            /**
             * expiresAt.
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * metadata.
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>tool_call_approve</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * responseSchema.
             */
            public Builder responseSchema(java.util.Map<String, ?> responseSchema) {
                this.responseSchema = responseSchema;
                return this;
            }

            /**
             * toolCallId.
             */
            public Builder toolCallId(String toolCallId) {
                this.toolCallId = toolCallId;
                return this;
            }

            public Interrupts build() {
                return new Interrupts(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAgentResponseBody} extends {@link TeaModel}
     *
     * <p>InvokeAgentResponseBody</p>
     */
    public static class Outcome extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("interrupts")
        private java.util.List<Interrupts> interrupts;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Outcome(Builder builder) {
            this.interrupts = builder.interrupts;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outcome create() {
            return builder().build();
        }

        /**
         * @return interrupts
         */
        public java.util.List<Interrupts> getInterrupts() {
            return this.interrupts;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Interrupts> interrupts; 
            private String type; 

            private Builder() {
            } 

            private Builder(Outcome model) {
                this.interrupts = model.interrupts;
                this.type = model.type;
            } 

            /**
             * interrupts.
             */
            public Builder interrupts(java.util.List<Interrupts> interrupts) {
                this.interrupts = interrupts;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>interrupt</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Outcome build() {
                return new Outcome(this);
            } 

        } 

    }
}
