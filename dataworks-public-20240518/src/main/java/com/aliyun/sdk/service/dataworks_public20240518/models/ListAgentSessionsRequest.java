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
 * {@link ListAgentSessionsRequest} extends {@link RequestModel}
 *
 * <p>ListAgentSessionsRequest</p>
 */
public class ListAgentSessionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Jsonrpc")
    private String jsonrpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private Params params;

    private ListAgentSessionsRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.jsonrpc = builder.jsonrpc;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentSessionsRequest create() {
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

    public static final class Builder extends Request.Builder<ListAgentSessionsRequest, Builder> {
        private String id; 
        private String jsonrpc; 
        private Params params; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentSessionsRequest request) {
            super(request);
            this.id = request.id;
            this.jsonrpc = request.jsonrpc;
            this.params = request.params;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Jsonrpc.
         */
        public Builder jsonrpc(String jsonrpc) {
            this.putBodyParameter("Jsonrpc", jsonrpc);
            this.jsonrpc = jsonrpc;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(Params params) {
            String paramsShrink = shrink(params, "Params", "json");
            this.putBodyParameter("Params", paramsShrink);
            this.params = params;
            return this;
        }

        @Override
        public ListAgentSessionsRequest build() {
            return new ListAgentSessionsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentSessionsRequest} extends {@link TeaModel}
     *
     * <p>ListAgentSessionsRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("SessionSourceList")
        private java.util.List<String> sessionSourceList;

        @com.aliyun.core.annotation.NameInMap("SessionTitle")
        private String sessionTitle;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<String> tagList;

        private Params(Builder builder) {
            this.agentName = builder.agentName;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.sessionId = builder.sessionId;
            this.sessionSourceList = builder.sessionSourceList;
            this.sessionTitle = builder.sessionTitle;
            this.tagList = builder.tagList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
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
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return sessionSourceList
         */
        public java.util.List<String> getSessionSourceList() {
            return this.sessionSourceList;
        }

        /**
         * @return sessionTitle
         */
        public String getSessionTitle() {
            return this.sessionTitle;
        }

        /**
         * @return tagList
         */
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        public static final class Builder {
            private String agentName; 
            private Integer maxResults; 
            private String nextToken; 
            private String sessionId; 
            private java.util.List<String> sessionSourceList; 
            private String sessionTitle; 
            private java.util.List<String> tagList; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.agentName = model.agentName;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.sessionId = model.sessionId;
                this.sessionSourceList = model.sessionSourceList;
                this.sessionTitle = model.sessionTitle;
                this.tagList = model.tagList;
            } 

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
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
             * SessionSourceList.
             */
            public Builder sessionSourceList(java.util.List<String> sessionSourceList) {
                this.sessionSourceList = sessionSourceList;
                return this;
            }

            /**
             * SessionTitle.
             */
            public Builder sessionTitle(String sessionTitle) {
                this.sessionTitle = sessionTitle;
                return this;
            }

            /**
             * TagList.
             */
            public Builder tagList(java.util.List<String> tagList) {
                this.tagList = tagList;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
