// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ReplyAgentSessionRequest} extends {@link RequestModel}
 *
 * <p>ReplyAgentSessionRequest</p>
 */
public class ReplyAgentSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Jsonrpc")
    private String jsonrpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    @com.aliyun.core.annotation.Validation(required = true)
    private Params params;

    private ReplyAgentSessionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.jsonrpc = builder.jsonrpc;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplyAgentSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return jsonrpc
     */
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    /**
     * @return params
     */
    public Params getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<ReplyAgentSessionRequest, Builder> {
        private String id; 
        private String jsonrpc; 
        private Params params; 

        private Builder() {
            super();
        } 

        private Builder(ReplyAgentSessionRequest request) {
            super(request);
            this.id = request.id;
            this.jsonrpc = request.jsonrpc;
            this.params = request.params;
        } 

        /**
         * <p>The JSON-RPC correlation ID for the current reply request. It is returned as-is in the response and is different from PermissionRequestId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>reply-rpc-001</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The JSON-RPC protocol version. Fixed to 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder jsonrpc(String jsonrpc) {
            this.putBodyParameter("Jsonrpc", jsonrpc);
            this.jsonrpc = jsonrpc;
            return this;
        }

        /**
         * <p>The user interaction reply parameters.</p>
         * <p>This parameter is required.</p>
         */
        public Builder params(Params params) {
            String paramsShrink = shrink(params, "Params", "json");
            this.putBodyParameter("Params", paramsShrink);
            this.params = params;
            return this;
        }

        @Override
        public ReplyAgentSessionRequest build() {
            return new ReplyAgentSessionRequest(this);
        } 

    } 

    /**
     * 
     * {@link ReplyAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>ReplyAgentSessionRequest</p>
     */
    public static class Outcome extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OptionId")
        private String optionId;

        @com.aliyun.core.annotation.NameInMap("Outcome")
        @com.aliyun.core.annotation.Validation(required = true)
        private String outcome;

        private Outcome(Builder builder) {
            this.optionId = builder.optionId;
            this.outcome = builder.outcome;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outcome create() {
            return builder().build();
        }

        /**
         * @return optionId
         */
        public String getOptionId() {
            return this.optionId;
        }

        /**
         * @return outcome
         */
        public String getOutcome() {
            return this.outcome;
        }

        public static final class Builder {
            private String optionId; 
            private String outcome; 

            private Builder() {
            } 

            private Builder(Outcome model) {
                this.optionId = model.optionId;
                this.outcome = model.outcome;
            } 

            /**
             * <p>Required and cannot be empty when Outcome is selected. It takes the optionId of the actual option in the options of the current event (when submitting an answer, the option with kind=allow_once is usually selected). Omit this parameter when Outcome is cancelled.</p>
             * 
             * <strong>example:</strong>
             * <p>option-from-event</p>
             */
            public Builder optionId(String optionId) {
                this.optionId = optionId;
                return this;
            }

            /**
             * <p>The processing type. selected indicates that an option is selected, and cancelled indicates that the user explicitly cancels the interaction.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>selected</p>
             */
            public Builder outcome(String outcome) {
                this.outcome = outcome;
                return this;
            }

            public Outcome build() {
                return new Outcome(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReplyAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>ReplyAgentSessionRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Answers")
        private java.util.Map<String, String> answers;

        @com.aliyun.core.annotation.NameInMap("Outcome")
        @com.aliyun.core.annotation.Validation(required = true)
        private Outcome outcome;

        @com.aliyun.core.annotation.NameInMap("PermissionRequestId")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
        private String permissionRequestId;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
        private String sessionId;

        private Params(Builder builder) {
            this.answers = builder.answers;
            this.outcome = builder.outcome;
            this.permissionRequestId = builder.permissionRequestId;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return answers
         */
        public java.util.Map<String, String> getAnswers() {
            return this.answers;
        }

        /**
         * @return outcome
         */
        public Outcome getOutcome() {
            return this.outcome;
        }

        /**
         * @return permissionRequestId
         */
        public String getPermissionRequestId() {
            return this.permissionRequestId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private java.util.Map<String, String> answers; 
            private Outcome outcome; 
            private String permissionRequestId; 
            private String sessionId; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.answers = model.answers;
                this.outcome = model.outcome;
                this.permissionRequestId = model.permissionRequestId;
                this.sessionId = model.sessionId;
            } 

            /**
             * <p>The answers to ask_user_question. The key is a 0-based string index of the question, and the value is the answer text. Fill in each question one by one for multiple questions. Omit this parameter for general tool authorization or cancellation.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;0&quot;:&quot;lakehouse_uat&quot;}</p>
             */
            public Builder answers(java.util.Map<String, String> answers) {
                this.answers = answers;
                return this;
            }

            /**
             * <p>The processing result of the user for the current interaction.</p>
             * <p>This parameter is required.</p>
             */
            public Builder outcome(Outcome outcome) {
                this.outcome = outcome;
                return this;
            }

            /**
             * <p>The identifier of the current permission_request. It is obtained from _qwen/notify.params.data.requestId of the original SSE, and is not ToolCallId, HTTP RequestId, or the current JSON-RPC Id. It cannot be . or ..</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>permission-001</p>
             */
            public Builder permissionRequestId(String permissionRequestId) {
                this.permissionRequestId = permissionRequestId;
                return this;
            }

            /**
             * <p>The LSP session ID. Use the SessionId returned when creating the session, not the internal session ID of the daemon.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>lsp-session-001</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
