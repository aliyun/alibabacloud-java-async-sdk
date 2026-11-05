// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701.models;

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
 * {@link ListAgentSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentSessionsResponseBody</p>
 */
public class ListAgentSessionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JsonRpcResponse")
    private JsonRpcResponse jsonRpcResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAgentSessionsResponseBody(Builder builder) {
        this.jsonRpcResponse = builder.jsonRpcResponse;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentSessionsResponseBody create() {
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

        private Builder(ListAgentSessionsResponseBody model) {
            this.jsonRpcResponse = model.jsonRpcResponse;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The JSON-RPC response object. The business result is located in Result.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Jsonrpc&quot;:&quot;2.0&quot;,&quot;Id&quot;:&quot;request-001&quot;,&quot;Result&quot;:{&quot;MaxResults&quot;:20,&quot;NextToken&quot;:&quot;next-token-example&quot;,&quot;SessionList&quot;:[{&quot;sessionId&quot;:&quot;0123456789abcdef0123456789abcdef&quot;,&quot;title&quot;:&quot;代码评审&quot;,&quot;agentName&quot;:&quot;review-agent-demo&quot;,&quot;createdAt&quot;:1793232000000,&quot;updatedAt&quot;:1793232060000}]}}</p>
         */
        public Builder jsonRpcResponse(JsonRpcResponse jsonRpcResponse) {
            this.jsonRpcResponse = jsonRpcResponse;
            return this;
        }

        /**
         * <p>The server-side request ID used to troubleshoot this call.</p>
         * 
         * <strong>example:</strong>
         * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAgentSessionsResponseBody build() {
            return new ListAgentSessionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentSessionsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("SessionList")
        private Object sessionList;

        private Result(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.sessionList = builder.sessionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return sessionList
         */
        public Object getSessionList() {
            return this.sessionList;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private Object sessionList; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.sessionList = model.sessionList;
            } 

            /**
             * <p>The effective page size for the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The credential to continue querying the next page. Pass it as is to Params.NextToken. Pagination ends when the token is not returned or is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>next-token-example</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The array of session summaries for the current page. If no matching records are found, an empty array [] is returned. The type is any. The fields of array elements retain the original backend names. For the structure, see the supplementary description of response parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;sessionId&quot;:&quot;0123456789abcdef0123456789abcdef&quot;,&quot;title&quot;:&quot;Code review&quot;,&quot;agentName&quot;:&quot;review-agent-demo&quot;,&quot;createdAt&quot;:1793232000000,&quot;updatedAt&quot;:1793232060000}]</p>
             */
            public Builder sessionList(Object sessionList) {
                this.sessionList = sessionList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentSessionsResponseBody</p>
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
             * <p>The Id from the request, echoed as is.</p>
             * 
             * <strong>example:</strong>
             * <p>request-001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The fixed value <code>2.0</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder jsonrpc(String jsonrpc) {
                this.jsonrpc = jsonrpc;
                return this;
            }

            /**
             * <p>The paginated result.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;MaxResults&quot;:20,&quot;NextToken&quot;:&quot;next-token-example&quot;,&quot;SessionList&quot;:[{&quot;sessionId&quot;:&quot;0123456789abcdef0123456789abcdef&quot;}]}</p>
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
