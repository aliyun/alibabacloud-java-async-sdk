// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListEventsRequest} extends {@link RequestModel}
 *
 * <p>ListEventsRequest</p>
 */
public class ListEventsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("teamId")
    private String teamId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private ListEventsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memoryStoreName = builder.memoryStoreName;
        this.agentId = builder.agentId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.sessionId = builder.sessionId;
        this.teamId = builder.teamId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
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
     * @return teamId
     */
    public String getTeamId() {
        return this.teamId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListEventsRequest, Builder> {
        private String workspaceId; 
        private String memoryStoreName; 
        private String agentId; 
        private Integer maxResults; 
        private String nextToken; 
        private String sessionId; 
        private String teamId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListEventsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memoryStoreName = request.memoryStoreName;
            this.agentId = request.agentId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.sessionId = request.sessionId;
            this.teamId = request.teamId;
            this.userId = request.userId;
        } 

        /**
         * <p>The ID of the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-2f5f9c5a8d0e4c3b</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The name of the memory store.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-memory</p>
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putPathParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * <p>The exact filter for the business agent.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-001</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. Default value: 200. Valid values: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token used to continue reading the same query.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwMH0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the session.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>session-001</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The exact filter for the business team.</p>
         * 
         * <strong>example:</strong>
         * <p>team-001</p>
         */
        public Builder teamId(String teamId) {
            this.putQueryParameter("teamId", teamId);
            this.teamId = teamId;
            return this;
        }

        /**
         * <p>The exact filter for the business user. This is not the platform tenant identity.</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListEventsRequest build() {
            return new ListEventsRequest(this);
        } 

    } 

}
