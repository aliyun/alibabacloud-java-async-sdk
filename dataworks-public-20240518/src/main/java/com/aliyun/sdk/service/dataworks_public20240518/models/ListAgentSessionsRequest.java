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
         * <p>The ID passed by the requester, which is returned as is.</p>
         * 
         * <strong>example:</strong>
         * <p>676303114031776</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The JSON-RPC version. Fixed to 2.0.</p>
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
         * <p>The business parameters.</p>
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

        @com.aliyun.core.annotation.NameInMap("Archived")
        private Boolean archived;

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
            this.archived = builder.archived;
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
         * @return archived
         */
        public Boolean getArchived() {
            return this.archived;
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
            private Boolean archived; 
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
                this.archived = model.archived;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.sessionId = model.sessionId;
                this.sessionSourceList = model.sessionSourceList;
                this.sessionTitle = model.sessionTitle;
                this.tagList = model.tagList;
            } 

            /**
             * <p>The exact filter for the <strong>agent name</strong>. You must specify at least one of this parameter and SessionSourceList.</p>
             * 
             * <strong>example:</strong>
             * <p>chat_cli_chatbi</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>Specifies whether to return only archived sessions. Valid values:</p>
             * <ul>
             * <li>true: Only archived sessions are returned.</li>
             * <li>false or not specified: Only unarchived sessions are returned.</li>
             * </ul>
             */
            public Builder archived(Boolean archived) {
                this.archived = archived;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 50.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token for the next page. Set this parameter to 1 for the first page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The exact match for the session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sess_0f12abc34</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The filter for the <strong>session source list</strong>. You must specify at least one of this parameter and AgentName.</p>
             */
            public Builder sessionSourceList(java.util.List<String> sessionSourceList) {
                this.sessionSourceList = sessionSourceList;
                return this;
            }

            /**
             * <p>The fuzzy filter for the session title.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales in the last 30 days</p>
             */
            public Builder sessionTitle(String sessionTitle) {
                this.sessionTitle = sessionTitle;
                return this;
            }

            /**
             * <p>The filter for the session tag code list.</p>
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
