// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListCopilotSessionMessagesRequest} extends {@link RequestModel}
 *
 * <p>ListCopilotSessionMessagesRequest</p>
 */
public class ListCopilotSessionMessagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("limit")
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("offset")
    private Long offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private ListCopilotSessionMessagesRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.limit = builder.limit;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.offset = builder.offset;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCopilotSessionMessagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
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
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<ListCopilotSessionMessagesRequest, Builder> {
        private String agentId; 
        private Long limit; 
        private Integer maxResults; 
        private String nextToken; 
        private Long offset; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(ListCopilotSessionMessagesRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.limit = request.limit;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.offset = request.offset;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>The agent ID retained for compatibility with historical calls. This parameter can be omitted. Currently, the entire session is queried by sessionId, and this parameter does not change the query scope of historical events.</p>
         * 
         * <strong>example:</strong>
         * <p>sysagent</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The page size retained for compatibility with historical calls. Default value: 50. Valid values: 1 to 200. For new integrations, use maxResults. If both parameters are passed, maxResults takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The page size. Default value: 50. Valid values: 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page. Do not pass this parameter in the first request. For subsequent requests, use the nextToken from the previous response. Clear this value when switching filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The pagination offset retained for compatibility with historical calls. Default value: 0. For new integrations, use nextToken. Do not pass this parameter and nextToken at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>The session ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s001</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public ListCopilotSessionMessagesRequest build() {
            return new ListCopilotSessionMessagesRequest(this);
        } 

    } 

}
