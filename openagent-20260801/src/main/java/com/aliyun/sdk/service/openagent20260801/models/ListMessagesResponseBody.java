// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openagent20260801.models;

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
 * {@link ListMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessagesResponseBody</p>
 */
public class ListMessagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListMessagesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListMessagesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The message history and pagination information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. A value of true indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListMessagesResponseBody build() {
            return new ListMessagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessagesResponseBody</p>
     */
    public static class ApiCalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        private ApiCalls(Builder builder) {
            this.action = builder.action;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiCalls create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String action; 
            private String description; 

            private Builder() {
            } 

            private Builder(ApiCalls model) {
                this.action = model.action;
                this.description = model.description;
            } 

            /**
             * <p>The name of the API action.</p>
             * 
             * <strong>example:</strong>
             * <p>ExampleAction</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The description of the operation pending approval.</p>
             * 
             * <strong>example:</strong>
             * <p>Execute changes on the sample resource</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public ApiCalls build() {
                return new ApiCalls(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessagesResponseBody</p>
     */
    public static class InterruptsData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiCalls")
        private java.util.List<ApiCalls> apiCalls;

        @com.aliyun.core.annotation.NameInMap("approvalId")
        private String approvalId;

        @com.aliyun.core.annotation.NameInMap("approvalUrl")
        private String approvalUrl;

        @com.aliyun.core.annotation.NameInMap("cancellable")
        private Boolean cancellable;

        @com.aliyun.core.annotation.NameInMap("changeDigest")
        private String changeDigest;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private InterruptsData(Builder builder) {
            this.apiCalls = builder.apiCalls;
            this.approvalId = builder.approvalId;
            this.approvalUrl = builder.approvalUrl;
            this.cancellable = builder.cancellable;
            this.changeDigest = builder.changeDigest;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InterruptsData create() {
            return builder().build();
        }

        /**
         * @return apiCalls
         */
        public java.util.List<ApiCalls> getApiCalls() {
            return this.apiCalls;
        }

        /**
         * @return approvalId
         */
        public String getApprovalId() {
            return this.approvalId;
        }

        /**
         * @return approvalUrl
         */
        public String getApprovalUrl() {
            return this.approvalUrl;
        }

        /**
         * @return cancellable
         */
        public Boolean getCancellable() {
            return this.cancellable;
        }

        /**
         * @return changeDigest
         */
        public String getChangeDigest() {
            return this.changeDigest;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List<ApiCalls> apiCalls; 
            private String approvalId; 
            private String approvalUrl; 
            private Boolean cancellable; 
            private String changeDigest; 
            private String title; 

            private Builder() {
            } 

            private Builder(InterruptsData model) {
                this.apiCalls = model.apiCalls;
                this.approvalId = model.approvalId;
                this.approvalUrl = model.approvalUrl;
                this.cancellable = model.cancellable;
                this.changeDigest = model.changeDigest;
                this.title = model.title;
            } 

            /**
             * <p>The list of API operations that require approval.</p>
             */
            public Builder apiCalls(java.util.List<ApiCalls> apiCalls) {
                this.apiCalls = apiCalls;
                return this;
            }

            /**
             * <p>The associated approval ID.</p>
             * 
             * <strong>example:</strong>
             * <p>approval_example_001</p>
             */
            public Builder approvalId(String approvalId) {
                this.approvalId = approvalId;
                return this;
            }

            /**
             * <p>The URL of the approval page. The example URL cannot be used for actual approval.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/approvals/approval_example_001">https://example.com/approvals/approval_example_001</a></p>
             */
            public Builder approvalUrl(String approvalUrl) {
                this.approvalUrl = approvalUrl;
                return this;
            }

            /**
             * <p>Specifies whether the approval can be canceled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cancellable(Boolean cancellable) {
                this.cancellable = cancellable;
                return this;
            }

            /**
             * <p>The digest identifier of the change pending approval.</p>
             * 
             * <strong>example:</strong>
             * <p>example-change-digest</p>
             */
            public Builder changeDigest(String changeDigest) {
                this.changeDigest = changeDigest;
                return this;
            }

            /**
             * <p>The title of the approval item.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample change approval</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public InterruptsData build() {
                return new InterruptsData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessagesResponseBody</p>
     */
    public static class Interrupts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private InterruptsData data;

        @com.aliyun.core.annotation.NameInMap("expiresAt")
        private String expiresAt;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("responseSchema")
        private java.util.Map<String, ?> responseSchema;

        @com.aliyun.core.annotation.NameInMap("toolCallId")
        private String toolCallId;

        private Interrupts(Builder builder) {
            this.data = builder.data;
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
         * @return data
         */
        public InterruptsData getData() {
            return this.data;
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
            private InterruptsData data; 
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
                this.data = model.data;
                this.expiresAt = model.expiresAt;
                this.id = model.id;
                this.message = model.message;
                this.metadata = model.metadata;
                this.reason = model.reason;
                this.responseSchema = model.responseSchema;
                this.toolCallId = model.toolCallId;
            } 

            /**
             * <p>The supplementary business data for the interrupt.</p>
             */
            public Builder data(InterruptsData data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The expiration time of the interrupt, in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-02T00:00:00Z</p>
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>The interrupt ID.</p>
             * 
             * <strong>example:</strong>
             * <p>interrupt_example_001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The interrupt prompt displayed to the user.</p>
             * 
             * <strong>example:</strong>
             * <p>Specify the target region</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The extended metadata of the interrupt.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The reason for the interrupt. Valid values: <code>tool_call</code> (tool invocation requires processing), <code>input_required</code> (user input is required), <code>confirmation</code> (confirmation is required), and <code>out_of_band_approval</code> (waiting for out-of-band approval).</p>
             * 
             * <strong>example:</strong>
             * <p>input_required</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The JSON schema that the resume result payload must follow.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;region&quot;:{&quot;type&quot;:&quot;string&quot;}},&quot;required&quot;:[&quot;region&quot;]}</p>
             */
            public Builder responseSchema(java.util.Map<String, ?> responseSchema) {
                this.responseSchema = responseSchema;
                return this;
            }

            /**
             * <p>The ID of the tool invocation associated with the interrupt.</p>
             * 
             * <strong>example:</strong>
             * <p>tool_call_example_001</p>
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
     * {@link ListMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessagesResponseBody</p>
     */
    public static class InterruptOutcome extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("interrupts")
        private java.util.List<Interrupts> interrupts;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private InterruptOutcome(Builder builder) {
            this.interrupts = builder.interrupts;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InterruptOutcome create() {
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

            private Builder(InterruptOutcome model) {
                this.interrupts = model.interrupts;
                this.type = model.type;
            } 

            /**
             * <p>The list of historical interrupts.</p>
             */
            public Builder interrupts(java.util.List<Interrupts> interrupts) {
                this.interrupts = interrupts;
                return this;
            }

            /**
             * <p>The type of the interrupt result. The value is fixed to <code>interrupt</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>interrupt</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public InterruptOutcome build() {
                return new InterruptOutcome(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessagesResponseBody</p>
     */
    public static class Resume extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("interruptId")
        private String interruptId;

        @com.aliyun.core.annotation.NameInMap("payload")
        private Object payload;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Resume(Builder builder) {
            this.interruptId = builder.interruptId;
            this.payload = builder.payload;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resume create() {
            return builder().build();
        }

        /**
         * @return interruptId
         */
        public String getInterruptId() {
            return this.interruptId;
        }

        /**
         * @return payload
         */
        public Object getPayload() {
            return this.payload;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String interruptId; 
            private Object payload; 
            private String status; 

            private Builder() {
            } 

            private Builder(Resume model) {
                this.interruptId = model.interruptId;
                this.payload = model.payload;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the processed interrupt.</p>
             * 
             * <strong>example:</strong>
             * <p>interrupt_example_001</p>
             */
            public Builder interruptId(String interruptId) {
                this.interruptId = interruptId;
                return this;
            }

            /**
             * <p>The processing result for the corresponding interrupt, which must comply with the responseSchema of the interrupt.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;region&quot;:&quot;cn-hangzhou&quot;}</p>
             */
            public Builder payload(Object payload) {
                this.payload = payload;
                return this;
            }

            /**
             * <p>The response method for the current interrupt. Valid values: <code>resolved</code> (the answer, confirmation, or tool result required by the interrupt has been submitted, including the <code>payload</code>) and <code>cancelled</code> (the interrupt has been canceled, excluding the <code>payload</code>).</p>
             * 
             * <strong>example:</strong>
             * <p>resolved</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Resume build() {
                return new Resume(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessagesResponseBody</p>
     */
    public static class ResumeInput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resolvedAt")
        private String resolvedAt;

        @com.aliyun.core.annotation.NameInMap("resume")
        private java.util.List<Resume> resume;

        @com.aliyun.core.annotation.NameInMap("runId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        private ResumeInput(Builder builder) {
            this.resolvedAt = builder.resolvedAt;
            this.resume = builder.resume;
            this.runId = builder.runId;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResumeInput create() {
            return builder().build();
        }

        /**
         * @return resolvedAt
         */
        public String getResolvedAt() {
            return this.resolvedAt;
        }

        /**
         * @return resume
         */
        public java.util.List<Resume> getResume() {
            return this.resume;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String resolvedAt; 
            private java.util.List<Resume> resume; 
            private String runId; 
            private String source; 

            private Builder() {
            } 

            private Builder(ResumeInput model) {
                this.resolvedAt = model.resolvedAt;
                this.resume = model.resume;
                this.runId = model.runId;
                this.source = model.source;
            } 

            /**
             * <p>The time when the interrupt processing was completed, in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:01:00Z</p>
             */
            public Builder resolvedAt(String resolvedAt) {
                this.resolvedAt = resolvedAt;
                return this;
            }

            /**
             * <p>The submitted processing results for each interrupt.</p>
             */
            public Builder resume(java.util.List<Resume> resume) {
                this.resume = resume;
                return this;
            }

            /**
             * <p>The ID of the original run that was resumed.</p>
             * 
             * <strong>example:</strong>
             * <p>run_example_001</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The source of the resume request. Valid values: <code>USER</code> (submitted by a user) and <code>INTERNAL</code> (submitted by an internal process).</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public ResumeInput build() {
                return new ResumeInput(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessagesResponseBody</p>
     */
    public static class Function extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arguments")
        private String arguments;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Function(Builder builder) {
            this.arguments = builder.arguments;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Function create() {
            return builder().build();
        }

        /**
         * @return arguments
         */
        public String getArguments() {
            return this.arguments;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String arguments; 
            private String name; 

            private Builder() {
            } 

            private Builder(Function model) {
                this.arguments = model.arguments;
                this.name = model.name;
            } 

            /**
             * <p>The tool parameters in the form of a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;keyword&quot;:&quot;example&quot;}</p>
             */
            public Builder arguments(String arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * <p>The name of the function or tool.</p>
             * 
             * <strong>example:</strong>
             * <p>lookup_example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Function build() {
                return new Function(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessagesResponseBody</p>
     */
    public static class ToolCalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("encryptedValue")
        private String encryptedValue;

        @com.aliyun.core.annotation.NameInMap("function")
        private Function function;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ToolCalls(Builder builder) {
            this.encryptedValue = builder.encryptedValue;
            this.function = builder.function;
            this.id = builder.id;
            this.metadata = builder.metadata;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolCalls create() {
            return builder().build();
        }

        /**
         * @return encryptedValue
         */
        public String getEncryptedValue() {
            return this.encryptedValue;
        }

        /**
         * @return function
         */
        public Function getFunction() {
            return this.function;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String encryptedValue; 
            private Function function; 
            private String id; 
            private java.util.Map<String, ?> metadata; 
            private String type; 

            private Builder() {
            } 

            private Builder(ToolCalls model) {
                this.encryptedValue = model.encryptedValue;
                this.function = model.function;
                this.id = model.id;
                this.metadata = model.metadata;
                this.type = model.type;
            } 

            /**
             * <p>The encrypted content of the tool invocation. The example is only a placeholder value.</p>
             * 
             * <strong>example:</strong>
             * <p>EXAMPLE_ENCRYPTED_VALUE</p>
             */
            public Builder encryptedValue(String encryptedValue) {
                this.encryptedValue = encryptedValue;
                return this;
            }

            /**
             * <p>The information about the function to be executed.</p>
             */
            public Builder function(Function function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The tool invocation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tool_call_example_001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The extended metadata of the tool invocation.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The type of the tool invocation. The value is fixed to <code>function</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>function</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ToolCalls build() {
                return new ToolCalls(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessagesResponseBody</p>
     */
    public static class Message extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("activityType")
        private String activityType;

        @com.aliyun.core.annotation.NameInMap("content")
        private Object content;

        @com.aliyun.core.annotation.NameInMap("encryptedValue")
        private String encryptedValue;

        @com.aliyun.core.annotation.NameInMap("error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("interruptOutcome")
        private InterruptOutcome interruptOutcome;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("resumeInput")
        private ResumeInput resumeInput;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("toolCallId")
        private String toolCallId;

        @com.aliyun.core.annotation.NameInMap("toolCalls")
        private java.util.List<ToolCalls> toolCalls;

        private Message(Builder builder) {
            this.activityType = builder.activityType;
            this.content = builder.content;
            this.encryptedValue = builder.encryptedValue;
            this.error = builder.error;
            this.id = builder.id;
            this.interruptOutcome = builder.interruptOutcome;
            this.metadata = builder.metadata;
            this.name = builder.name;
            this.resumeInput = builder.resumeInput;
            this.role = builder.role;
            this.toolCallId = builder.toolCallId;
            this.toolCalls = builder.toolCalls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
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
        public Object getContent() {
            return this.content;
        }

        /**
         * @return encryptedValue
         */
        public String getEncryptedValue() {
            return this.encryptedValue;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return interruptOutcome
         */
        public InterruptOutcome getInterruptOutcome() {
            return this.interruptOutcome;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resumeInput
         */
        public ResumeInput getResumeInput() {
            return this.resumeInput;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return toolCallId
         */
        public String getToolCallId() {
            return this.toolCallId;
        }

        /**
         * @return toolCalls
         */
        public java.util.List<ToolCalls> getToolCalls() {
            return this.toolCalls;
        }

        public static final class Builder {
            private String activityType; 
            private Object content; 
            private String encryptedValue; 
            private String error; 
            private String id; 
            private InterruptOutcome interruptOutcome; 
            private java.util.Map<String, ?> metadata; 
            private String name; 
            private ResumeInput resumeInput; 
            private String role; 
            private String toolCallId; 
            private java.util.List<ToolCalls> toolCalls; 

            private Builder() {
            } 

            private Builder(Message model) {
                this.activityType = model.activityType;
                this.content = model.content;
                this.encryptedValue = model.encryptedValue;
                this.error = model.error;
                this.id = model.id;
                this.interruptOutcome = model.interruptOutcome;
                this.metadata = model.metadata;
                this.name = model.name;
                this.resumeInput = model.resumeInput;
                this.role = model.role;
                this.toolCallId = model.toolCallId;
                this.toolCalls = model.toolCalls;
            } 

            /**
             * <p>The type identifier of the activity message.</p>
             * 
             * <strong>example:</strong>
             * <p>example_activity</p>
             */
            public Builder activityType(String activityType) {
                this.activityType = activityType;
                return this;
            }

            /**
             * <p>The message content. The structure is determined by the message type.</p>
             * 
             * <strong>example:</strong>
             * <p>Query the status of the sample resource</p>
             */
            public Builder content(Object content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The encrypted content. The example is an invalid placeholder value and does not contain real ciphertext.</p>
             * 
             * <strong>example:</strong>
             * <p>EXAMPLE_ENCRYPTED_VALUE</p>
             */
            public Builder encryptedValue(String encryptedValue) {
                this.encryptedValue = encryptedValue;
                return this;
            }

            /**
             * <p>The error description when tool execution fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample tool execution failure</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>message_example_001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The result information of historical interrupts.</p>
             */
            public Builder interruptOutcome(InterruptOutcome interruptOutcome) {
                this.interruptOutcome = interruptOutcome;
                return this;
            }

            /**
             * <p>The extended metadata of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The name of the message sender.</p>
             * 
             * <strong>example:</strong>
             * <p>example-user</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The resume input corresponding to the historical interrupt.</p>
             */
            public Builder resumeInput(ResumeInput resumeInput) {
                this.resumeInput = resumeInput;
                return this;
            }

            /**
             * <p>The role of the message. Valid values: <code>user</code> (user message), <code>assistant</code> (assistant message), <code>tool</code> (tool result), <code>activity</code> (activity message), <code>reasoning</code> (reasoning message), and <code>interrupt</code> (interrupt record).</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The ID of the tool invocation associated with the tool result.</p>
             * 
             * <strong>example:</strong>
             * <p>tool_call_example_001</p>
             */
            public Builder toolCallId(String toolCallId) {
                this.toolCallId = toolCallId;
                return this;
            }

            /**
             * <p>The list of tool invocations initiated by the agent.</p>
             */
            public Builder toolCalls(java.util.List<ToolCalls> toolCalls) {
                this.toolCalls = toolCalls;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessagesResponseBody</p>
     */
    public static class Timeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("message")
        private Message message;

        @com.aliyun.core.annotation.NameInMap("runId")
        private String runId;

        private Timeline(Builder builder) {
            this.message = builder.message;
            this.runId = builder.runId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timeline create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public Message getMessage() {
            return this.message;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        public static final class Builder {
            private Message message; 
            private String runId; 

            private Builder() {
            } 

            private Builder(Timeline model) {
                this.message = model.message;
                this.runId = model.runId;
            } 

            /**
             * <p>The message object. Different message types are distinguished by role, and each type uses the corresponding fields.</p>
             */
            public Builder message(Message message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the run to which the message belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>run_example_001</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            public Timeline build() {
                return new Timeline(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("nextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("timeline")
        private java.util.List<Timeline> timeline;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.nextToken = builder.nextToken;
            this.sessionId = builder.sessionId;
            this.timeline = builder.timeline;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return timeline
         */
        public java.util.List<Timeline> getTimeline() {
            return this.timeline;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String nextToken; 
            private String sessionId; 
            private java.util.List<Timeline> timeline; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.nextToken = model.nextToken;
                this.sessionId = model.sessionId;
                this.timeline = model.timeline;
                this.total = model.total;
            } 

            /**
             * <p>The pagination token for the next page. A value of null indicates that no more data is available.</p>
             * 
             * <strong>example:</strong>
             * <p>example-next-token</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The ID of the session to which the messages belong.</p>
             * 
             * <strong>example:</strong>
             * <p>session_example_001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The message records returned in a timeline.</p>
             */
            public Builder timeline(java.util.List<Timeline> timeline) {
                this.timeline = timeline;
                return this;
            }

            /**
             * <p>The number of timeline records on the current page, which is equal to the length of the timeline array.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
