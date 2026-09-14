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
 * {@link GetAgentSessionTokenUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentSessionTokenUsageResponseBody</p>
 */
public class GetAgentSessionTokenUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JsonRpcResponse")
    private JsonRpcResponse jsonRpcResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAgentSessionTokenUsageResponseBody(Builder builder) {
        this.jsonRpcResponse = builder.jsonRpcResponse;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentSessionTokenUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jsonRpcResponse
     */
    public JsonRpcResponse getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private JsonRpcResponse jsonRpcResponse; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAgentSessionTokenUsageResponseBody model) {
            this.jsonRpcResponse = model.jsonRpcResponse;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The JSON-RPC result.</p>
         */
        public Builder jsonRpcResponse(JsonRpcResponse jsonRpcResponse) {
            this.jsonRpcResponse = jsonRpcResponse;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B313938A-4475-599B-98EB-A0875019FD5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAgentSessionTokenUsageResponseBody build() {
            return new GetAgentSessionTokenUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentSessionTokenUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentSessionTokenUsageResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CachedTokens")
        private Long cachedTokens;

        @com.aliyun.core.annotation.NameInMap("CompletionTokens")
        private Long completionTokens;

        @com.aliyun.core.annotation.NameInMap("PromptTokens")
        private Long promptTokens;

        @com.aliyun.core.annotation.NameInMap("ThoughtsTokens")
        private Long thoughtsTokens;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Long totalTokens;

        private Result(Builder builder) {
            this.cachedTokens = builder.cachedTokens;
            this.completionTokens = builder.completionTokens;
            this.promptTokens = builder.promptTokens;
            this.thoughtsTokens = builder.thoughtsTokens;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cachedTokens
         */
        public Long getCachedTokens() {
            return this.cachedTokens;
        }

        /**
         * @return completionTokens
         */
        public Long getCompletionTokens() {
            return this.completionTokens;
        }

        /**
         * @return promptTokens
         */
        public Long getPromptTokens() {
            return this.promptTokens;
        }

        /**
         * @return thoughtsTokens
         */
        public Long getThoughtsTokens() {
            return this.thoughtsTokens;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Long cachedTokens; 
            private Long completionTokens; 
            private Long promptTokens; 
            private Long thoughtsTokens; 
            private Long totalTokens; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.cachedTokens = model.cachedTokens;
                this.completionTokens = model.completionTokens;
                this.promptTokens = model.promptTokens;
                this.thoughtsTokens = model.thoughtsTokens;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * <p>The cumulative number of cache-hit tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>4000</p>
             */
            public Builder cachedTokens(Long cachedTokens) {
                this.cachedTokens = cachedTokens;
                return this;
            }

            /**
             * <p><strong>Cumulative number of completion tokens generated.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder completionTokens(Long completionTokens) {
                this.completionTokens = completionTokens;
                return this;
            }

            /**
             * <p><strong>Cumulative number of prompt tokens consumed.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder promptTokens(Long promptTokens) {
                this.promptTokens = promptTokens;
                return this;
            }

            /**
             * <p>Cumulative number of tokens used for thoughts.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder thoughtsTokens(Long thoughtsTokens) {
                this.thoughtsTokens = thoughtsTokens;
                return this;
            }

            /**
             * <p>The cumulative number of all tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentSessionTokenUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentSessionTokenUsageResponseBody</p>
     */
    public static class JsonRpcResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Jsonrpc")
        private String jsonrpc;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        private JsonRpcResponse(Builder builder) {
            this.id = builder.id;
            this.jsonrpc = builder.jsonrpc;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JsonRpcResponse create() {
            return builder().build();
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
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        public static final class Builder {
            private String id; 
            private String jsonrpc; 
            private Result result; 

            private Builder() {
            } 

            private Builder(JsonRpcResponse model) {
                this.id = model.id;
                this.jsonrpc = model.jsonrpc;
                this.result = model.result;
            } 

            /**
             * <p>The ID provided by the requester, which is echoed in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>8212598228302533855</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The JSON-RPC version. The value is always 2.0.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder jsonrpc(String jsonrpc) {
                this.jsonrpc = jsonrpc;
                return this;
            }

            /**
             * <p>Token usage result.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            public JsonRpcResponse build() {
                return new JsonRpcResponse(this);
            } 

        } 

    }
}
