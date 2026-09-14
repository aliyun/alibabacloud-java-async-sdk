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
         * <p>The JSON-RPC response.</p>
         */
        public Builder jsonRpcResponse(JsonRpcResponse jsonRpcResponse) {
            this.jsonRpcResponse = jsonRpcResponse;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>50C5A9F7-B5BD-58B2-9EB8-ADFFA9E6A56F</p>
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
    public static class SessionTagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionTagCode")
        private String sessionTagCode;

        private SessionTagList(Builder builder) {
            this.sessionTagCode = builder.sessionTagCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionTagList create() {
            return builder().build();
        }

        /**
         * @return sessionTagCode
         */
        public String getSessionTagCode() {
            return this.sessionTagCode;
        }

        public static final class Builder {
            private String sessionTagCode; 

            private Builder() {
            } 

            private Builder(SessionTagList model) {
                this.sessionTagCode = model.sessionTagCode;
            } 

            /**
             * <p>The session tag. You can filter sessions based on session tags. For example, if you use a fixed RAM user to call OpenAPI but the calling system has its own account system, you can filter the session list based on an account ID. In this case, set this parameter to the account ID of the calling system.</p>
             * 
             * <strong>example:</strong>
             * <p>user_123456</p>
             */
            public Builder sessionTagCode(String sessionTagCode) {
                this.sessionTagCode = sessionTagCode;
                return this;
            }

            public SessionTagList build() {
                return new SessionTagList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentSessionsResponseBody</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionSource")
        private String sessionSource;

        @com.aliyun.core.annotation.NameInMap("SessionStatus")
        private String sessionStatus;

        @com.aliyun.core.annotation.NameInMap("SessionTagList")
        private java.util.List<SessionTagList> sessionTagList;

        private Meta(Builder builder) {
            this.sessionSource = builder.sessionSource;
            this.sessionStatus = builder.sessionStatus;
            this.sessionTagList = builder.sessionTagList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return sessionSource
         */
        public String getSessionSource() {
            return this.sessionSource;
        }

        /**
         * @return sessionStatus
         */
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        /**
         * @return sessionTagList
         */
        public java.util.List<SessionTagList> getSessionTagList() {
            return this.sessionTagList;
        }

        public static final class Builder {
            private String sessionSource; 
            private String sessionStatus; 
            private java.util.List<SessionTagList> sessionTagList; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.sessionSource = model.sessionSource;
                this.sessionStatus = model.sessionStatus;
                this.sessionTagList = model.sessionTagList;
            } 

            /**
             * <p>The session source.</p>
             * 
             * <strong>example:</strong>
             * <p>openapi_sdk</p>
             */
            public Builder sessionSource(String sessionSource) {
                this.sessionSource = sessionSource;
                return this;
            }

            /**
             * <p>The session connection status.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>NORMAL: Stateless session</li>
             * <li>INIT: Initialization state</li>
             * <li>RUNNING: Running</li>
             * <li>RELEASED: Released state</li>
             * </ul>
             */
            public Builder sessionStatus(String sessionStatus) {
                this.sessionStatus = sessionStatus;
                return this;
            }

            /**
             * <p>The list of session tags.</p>
             */
            public Builder sessionTagList(java.util.List<SessionTagList> sessionTagList) {
                this.sessionTagList = sessionTagList;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentSessionsResponseBody</p>
     */
    public static class AgentSessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Meta")
        private Meta meta;

        @com.aliyun.core.annotation.NameInMap("SessionCreatedAt")
        private Long sessionCreatedAt;

        @com.aliyun.core.annotation.NameInMap("SessionDescription")
        private String sessionDescription;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("SessionTitle")
        private String sessionTitle;

        @com.aliyun.core.annotation.NameInMap("SessionUpdatedAt")
        private Long sessionUpdatedAt;

        private AgentSessions(Builder builder) {
            this.meta = builder.meta;
            this.sessionCreatedAt = builder.sessionCreatedAt;
            this.sessionDescription = builder.sessionDescription;
            this.sessionId = builder.sessionId;
            this.sessionTitle = builder.sessionTitle;
            this.sessionUpdatedAt = builder.sessionUpdatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentSessions create() {
            return builder().build();
        }

        /**
         * @return meta
         */
        public Meta getMeta() {
            return this.meta;
        }

        /**
         * @return sessionCreatedAt
         */
        public Long getSessionCreatedAt() {
            return this.sessionCreatedAt;
        }

        /**
         * @return sessionDescription
         */
        public String getSessionDescription() {
            return this.sessionDescription;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return sessionTitle
         */
        public String getSessionTitle() {
            return this.sessionTitle;
        }

        /**
         * @return sessionUpdatedAt
         */
        public Long getSessionUpdatedAt() {
            return this.sessionUpdatedAt;
        }

        public static final class Builder {
            private Meta meta; 
            private Long sessionCreatedAt; 
            private String sessionDescription; 
            private String sessionId; 
            private String sessionTitle; 
            private Long sessionUpdatedAt; 

            private Builder() {
            } 

            private Builder(AgentSessions model) {
                this.meta = model.meta;
                this.sessionCreatedAt = model.sessionCreatedAt;
                this.sessionDescription = model.sessionDescription;
                this.sessionId = model.sessionId;
                this.sessionTitle = model.sessionTitle;
                this.sessionUpdatedAt = model.sessionUpdatedAt;
            } 

            /**
             * <p>The extended session information from DataWorks, which is not part of the ACP standard protocol.</p>
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The time when the session was created.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder sessionCreatedAt(Long sessionCreatedAt) {
                this.sessionCreatedAt = sessionCreatedAt;
                return this;
            }

            /**
             * <p>The session description.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales trend analysis</p>
             */
            public Builder sessionDescription(String sessionDescription) {
                this.sessionDescription = sessionDescription;
                return this;
            }

            /**
             * <p>The unique ID of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>sess_0f12abc34</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The session title.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales analysis for the last 30 days</p>
             */
            public Builder sessionTitle(String sessionTitle) {
                this.sessionTitle = sessionTitle;
                return this;
            }

            /**
             * <p>The time when the session was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder sessionUpdatedAt(Long sessionUpdatedAt) {
                this.sessionUpdatedAt = sessionUpdatedAt;
                return this;
            }

            public AgentSessions build() {
                return new AgentSessions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentSessionsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentSessions")
        private java.util.List<AgentSessions> agentSessions;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Result(Builder builder) {
            this.agentSessions = builder.agentSessions;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return agentSessions
         */
        public java.util.List<AgentSessions> getAgentSessions() {
            return this.agentSessions;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<AgentSessions> agentSessions; 
            private Integer maxResults; 
            private String nextToken; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.agentSessions = model.agentSessions;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The session list.</p>
             */
            public Builder agentSessions(java.util.List<AgentSessions> agentSessions) {
                this.agentSessions = agentSessions;
                return this;
            }

            /**
             * <p>The actual number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token for the next page. Set this parameter to 1 for the first page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The total number of matched sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
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
             * <p>The ID passed in by the requester. The value is returned as-is.</p>
             * 
             * <strong>example:</strong>
             * <p>29d9a29c-a284-48c1-9eaa-4a42c7c616d5</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The JSON-RPC version. Fixed value: 2.0.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder jsonrpc(String jsonrpc) {
                this.jsonrpc = jsonrpc;
                return this;
            }

            /**
             * <p>The paginated result set of the session query.</p>
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
