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
         * <p>The error code for the RUN_ERROR event.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The tool output text for the TOOL_CALL_RESULT event. The text may be truncated.</p>
         * 
         * <strong>example:</strong>
         * <p>done</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The incremental fragment of text, reasoning, or tool parameters. Fragments with the same ID are concatenated in order.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello</p>
         */
        public Builder delta(String delta) {
            this.delta = delta;
            return this;
        }

        /**
         * <p>The error description for the RUN_ERROR event.</p>
         * 
         * <strong>example:</strong>
         * <p>Request failed</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the message to which the text, reasoning, or tool result belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>m-1</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The name of the CUSTOM extension event, such as analysis_result.</p>
         * 
         * <strong>example:</strong>
         * <p>analysis_result</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The completion reason for the RUN_FINISHED event. A value of success indicates normal completion, and interrupt indicates waiting for a response.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;success&quot;}</p>
         */
        public Builder outcome(Outcome outcome) {
            this.outcome = outcome;
            return this;
        }

        /**
         * <p>The optional parent message ID for the TOOL_CALL_START event.</p>
         * 
         * <strong>example:</strong>
         * <p>m-1</p>
         */
        public Builder parentMessageId(String parentMessageId) {
            this.parentMessageId = parentMessageId;
            return this;
        }

        /**
         * <p>The role of the message. The role is assistant for text messages and tool for tool results.</p>
         * 
         * <strong>example:</strong>
         * <p>assistant</p>
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * <p>The run ID of the current run for RUN_STARTED and RUN_FINISHED events.</p>
         * 
         * <strong>example:</strong>
         * <p>r-1</p>
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * <p>The thread snapshot for the STATE_SNAPSHOT event, including sessionId and requestId.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sessionId&quot;:&quot;abcdef0123456789abcdef0123456789&quot;,&quot;requestId&quot;:&quot;req-1&quot;}</p>
         */
        public Builder snapshot(Object snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        /**
         * <p>The thread ID for RUN_STARTED and RUN_FINISHED events. It is consistent with the request and the thread snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef0123456789abcdef0123456789</p>
         */
        public Builder threadId(String threadId) {
            this.threadId = threadId;
            return this;
        }

        /**
         * <p>The tool invoke ID. It associates TOOL_CALL_START/ARGS/END/RESULT events with approval interrupts.</p>
         * 
         * <strong>example:</strong>
         * <p>call-1</p>
         */
        public Builder toolCallId(String toolCallId) {
            this.toolCallId = toolCallId;
            return this;
        }

        /**
         * <p>The name of the tool for the TOOL_CALL_START event.</p>
         * 
         * <strong>example:</strong>
         * <p>example_tool</p>
         */
        public Builder toolCallName(String toolCallName) {
            this.toolCallName = toolCallName;
            return this;
        }

        /**
         * <p>The event type of the SSE data object. For the required fields of each event type, see the response description.</p>
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
         * <p>The extension value of the CUSTOM event. It can be any JSON object or null.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;reference&quot;:null,&quot;actions&quot;:[],&quot;messageId&quot;:null}</p>
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
             * <p>The optional expiration time string of the interrupt. This field is not output for current tool approvals.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-04T00:00:00Z</p>
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>The ID of the interrupt. It is used as resume[].interruptId when resuming the run.</p>
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
             * <p>The approval description or follow-up question text displayed to the user.</p>
             * 
             * <strong>example:</strong>
             * <p>Proceed with execution?</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The optional extension information of the interrupt. It cannot replace tool events.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The reason for the interrupt. The value is tool_call_approve for tool approval and ask_human for follow-up questions.</p>
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
             * <p>The JSON Schema for the response. Tool approval requires decision=yes/no, and follow-up questions use strings.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;decision&quot;:{&quot;type&quot;:&quot;string&quot;,&quot;enum&quot;:[&quot;yes&quot;,&quot;no&quot;]}},&quot;required&quot;:[&quot;decision&quot;]}</p>
             */
            public Builder responseSchema(java.util.Map<String, ?> responseSchema) {
                this.responseSchema = responseSchema;
                return this;
            }

            /**
             * <p>The optional associated tool invoke ID. It is the same as the toolCallId of the preceding TOOL_CALL_START event.</p>
             * 
             * <strong>example:</strong>
             * <p>call-1</p>
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
             * <p>The list of interrupts waiting for a response. This field appears only when outcome.type is interrupt and contains at least one item.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;id&quot;:&quot;i-1&quot;,&quot;reason&quot;:&quot;tool_call_approve&quot;,&quot;toolCallId&quot;:&quot;call-1&quot;}]</p>
             */
            public Builder interrupts(java.util.List<Interrupts> interrupts) {
                this.interrupts = interrupts;
                return this;
            }

            /**
             * <p>The outcome type. A value of success indicates normal completion. A value of interrupt indicates waiting for a response, in which case the interrupts array contains at least one item.</p>
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
