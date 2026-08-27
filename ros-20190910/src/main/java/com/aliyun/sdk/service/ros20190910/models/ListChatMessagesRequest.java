// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link ListChatMessagesRequest} extends {@link RequestModel}
 *
 * <p>ListChatMessagesRequest</p>
 */
public class ListChatMessagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentVersion")
    private String agentVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private ListChatMessagesRequest(Builder builder) {
        super(builder);
        this.agentVersion = builder.agentVersion;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChatMessagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
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

    public static final class Builder extends Request.Builder<ListChatMessagesRequest, Builder> {
        private String agentVersion; 
        private Integer maxResults; 
        private String nextToken; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(ListChatMessagesRequest request) {
            super(request);
            this.agentVersion = request.agentVersion;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.sessionId = request.sessionId;
        } 

        /**
         * AgentVersion.
         */
        public Builder agentVersion(String agentVersion) {
            this.putQueryParameter("AgentVersion", agentVersion);
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7f4e2a8c6d9b4a1f8e3c5b7d2a6f9012</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public ListChatMessagesRequest build() {
            return new ListChatMessagesRequest(this);
        } 

    } 

}
