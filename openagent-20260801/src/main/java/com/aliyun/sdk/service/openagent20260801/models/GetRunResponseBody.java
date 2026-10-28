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
 * {@link GetRunResponseBody} extends {@link TeaModel}
 *
 * <p>GetRunResponseBody</p>
 */
public class GetRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetRunResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRunResponseBody create() {
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

        private Builder(GetRunResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRunResponseBody build() {
            return new GetRunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetRunResponseBody</p>
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
             * <p>The API name.</p>
             * 
             * <strong>example:</strong>
             * <p>ExampleAction</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The operation description.</p>
             * 
             * <strong>example:</strong>
             * <p>Perform changes on the sample resource</p>
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
     * {@link GetRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetRunResponseBody</p>
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
             * <p>The list of APIs pending approval.</p>
             */
            public Builder apiCalls(java.util.List<ApiCalls> apiCalls) {
                this.apiCalls = apiCalls;
                return this;
            }

            /**
             * <p>The approval ID.</p>
             * 
             * <strong>example:</strong>
             * <p>approval_example_001</p>
             */
            public Builder approvalId(String approvalId) {
                this.approvalId = approvalId;
                return this;
            }

            /**
             * <p>The approval URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/approvals/approval_example_001">https://example.com/approvals/approval_example_001</a></p>
             */
            public Builder approvalUrl(String approvalUrl) {
                this.approvalUrl = approvalUrl;
                return this;
            }

            /**
             * <p>Specifies whether the interrupt can be canceled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cancellable(Boolean cancellable) {
                this.cancellable = cancellable;
                return this;
            }

            /**
             * <p>The change digest.</p>
             * 
             * <strong>example:</strong>
             * <p>example-change-digest</p>
             */
            public Builder changeDigest(String changeDigest) {
                this.changeDigest = changeDigest;
                return this;
            }

            /**
             * <p>The approval title.</p>
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
     * {@link GetRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetRunResponseBody</p>
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
             * <p>The interrupt data.</p>
             */
            public Builder data(InterruptsData data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The expiration time of the interrupt, in ISO 8601 format.</p>
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
             * <p>The interrupt prompt.</p>
             * 
             * <strong>example:</strong>
             * <p>Specify the region of the target resource</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The extended information.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The reason for the interrupt: <code>tool_call</code> (tool calling requires processing), <code>input_required</code> (user input is required), <code>confirmation</code> (confirmation is required), or <code>out_of_band_approval</code> (waiting for out-of-band approval).</p>
             * 
             * <strong>example:</strong>
             * <p>input_required</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The JSON Schema that the payload must conform to when resuming the interrupt.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;region&quot;:{&quot;type&quot;:&quot;string&quot;}},&quot;required&quot;:[&quot;region&quot;]}</p>
             */
            public Builder responseSchema(java.util.Map<String, ?> responseSchema) {
                this.responseSchema = responseSchema;
                return this;
            }

            /**
             * <p>The ID used to invoke the tool calling.</p>
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
     * {@link GetRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetRunResponseBody</p>
     */
    public static class Outcome extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("interrupts")
        private java.util.List<Interrupts> interrupts;

        @com.aliyun.core.annotation.NameInMap("type")
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
             * <p>The list of interrupts.</p>
             */
            public Builder interrupts(java.util.List<Interrupts> interrupts) {
                this.interrupts = interrupts;
                return this;
            }

            /**
             * <p>The outcome type: <code>success</code> (completed successfully) or <code>interrupt</code> (waiting for interrupt processing).</p>
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
    /**
     * 
     * {@link GetRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetRunResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("outcome")
        private Outcome outcome;

        @com.aliyun.core.annotation.NameInMap("runId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.outcome = builder.outcome;
            this.runId = builder.runId;
            this.sessionId = builder.sessionId;
            this.status = builder.status;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return outcome
         */
        public Outcome getOutcome() {
            return this.outcome;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String createdAt; 
            private Outcome outcome; 
            private String runId; 
            private String sessionId; 
            private String status; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdAt = model.createdAt;
                this.outcome = model.outcome;
                this.runId = model.runId;
                this.sessionId = model.sessionId;
                this.status = model.status;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The time when the run was created, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The run outcome.</p>
             */
            public Builder outcome(Outcome outcome) {
                this.outcome = outcome;
                return this;
            }

            /**
             * <p>The run ID.</p>
             * 
             * <strong>example:</strong>
             * <p>run_example_001</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>session_example_001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The run status: <code>PENDING</code> (pending execution), <code>RUNNING</code> (running), <code>WAITING_USER</code> (waiting for interrupt processing), <code>COMPLETED</code> (completed), <code>FAILED</code> (failed), <code>CANCELLED</code> (canceled), or <code>REJECTED</code> (rejected).</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the run was last updated, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:01:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
