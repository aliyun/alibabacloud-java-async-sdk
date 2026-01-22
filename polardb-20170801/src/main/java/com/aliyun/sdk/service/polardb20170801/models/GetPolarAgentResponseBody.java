// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link GetPolarAgentResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolarAgentResponseBody</p>
 */
public class GetPolarAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("FunctionCall")
    private java.util.List<FunctionCall> functionCall;

    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.NameInMap("QueryId")
    private String queryId;

    @com.aliyun.core.annotation.NameInMap("ReasoningContent")
    private String reasoningContent;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("UiFunctionCall")
    private java.util.List<UiFunctionCall> uiFunctionCall;

    private GetPolarAgentResponseBody(Builder builder) {
        this.content = builder.content;
        this.functionCall = builder.functionCall;
        this.product = builder.product;
        this.queryId = builder.queryId;
        this.reasoningContent = builder.reasoningContent;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
        this.uiFunctionCall = builder.uiFunctionCall;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolarAgentResponseBody create() {
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
     * @return functionCall
     */
    public java.util.List<FunctionCall> getFunctionCall() {
        return this.functionCall;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return reasoningContent
     */
    public String getReasoningContent() {
        return this.reasoningContent;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return uiFunctionCall
     */
    public java.util.List<UiFunctionCall> getUiFunctionCall() {
        return this.uiFunctionCall;
    }

    public static final class Builder {
        private String content; 
        private java.util.List<FunctionCall> functionCall; 
        private String product; 
        private String queryId; 
        private String reasoningContent; 
        private String requestId; 
        private String sessionId; 
        private java.util.List<UiFunctionCall> uiFunctionCall; 

        private Builder() {
        } 

        private Builder(GetPolarAgentResponseBody model) {
            this.content = model.content;
            this.functionCall = model.functionCall;
            this.product = model.product;
            this.queryId = model.queryId;
            this.reasoningContent = model.reasoningContent;
            this.requestId = model.requestId;
            this.sessionId = model.sessionId;
            this.uiFunctionCall = model.uiFunctionCall;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>QZ-13661677-80</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * FunctionCall.
         */
        public Builder functionCall(java.util.List<FunctionCall> functionCall) {
            this.functionCall = functionCall;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.product = product;
            return this;
        }

        /**
         * QueryId.
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * ReasoningContent.
         */
        public Builder reasoningContent(String reasoningContent) {
            this.reasoningContent = reasoningContent;
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
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * UiFunctionCall.
         */
        public Builder uiFunctionCall(java.util.List<UiFunctionCall> uiFunctionCall) {
            this.uiFunctionCall = uiFunctionCall;
            return this;
        }

        public GetPolarAgentResponseBody build() {
            return new GetPolarAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPolarAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolarAgentResponseBody</p>
     */
    public static class FunctionCall extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arguments")
        private String arguments;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private FunctionCall(Builder builder) {
            this.arguments = builder.arguments;
            this.id = builder.id;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionCall create() {
            return builder().build();
        }

        /**
         * @return arguments
         */
        public String getArguments() {
            return this.arguments;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String arguments; 
            private String id; 
            private String name; 
            private String status; 

            private Builder() {
            } 

            private Builder(FunctionCall model) {
                this.arguments = model.arguments;
                this.id = model.id;
                this.name = model.name;
                this.status = model.status;
            } 

            /**
             * Arguments.
             */
            public Builder arguments(String arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public FunctionCall build() {
                return new FunctionCall(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolarAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolarAgentResponseBody</p>
     */
    public static class UiFunctionCall extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArgsText")
        private String argsText;

        @com.aliyun.core.annotation.NameInMap("ToolName")
        private String toolName;

        private UiFunctionCall(Builder builder) {
            this.argsText = builder.argsText;
            this.toolName = builder.toolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UiFunctionCall create() {
            return builder().build();
        }

        /**
         * @return argsText
         */
        public String getArgsText() {
            return this.argsText;
        }

        /**
         * @return toolName
         */
        public String getToolName() {
            return this.toolName;
        }

        public static final class Builder {
            private String argsText; 
            private String toolName; 

            private Builder() {
            } 

            private Builder(UiFunctionCall model) {
                this.argsText = model.argsText;
                this.toolName = model.toolName;
            } 

            /**
             * <p>xxx</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder argsText(String argsText) {
                this.argsText = argsText;
                return this;
            }

            /**
             * ToolName.
             */
            public Builder toolName(String toolName) {
                this.toolName = toolName;
                return this;
            }

            public UiFunctionCall build() {
                return new UiFunctionCall(this);
            } 

        } 

    }
}
