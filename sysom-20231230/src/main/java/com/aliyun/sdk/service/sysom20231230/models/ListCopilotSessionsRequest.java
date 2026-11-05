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
 * {@link ListCopilotSessionsRequest} extends {@link RequestModel}
 *
 * <p>ListCopilotSessionsRequest</p>
 */
public class ListCopilotSessionsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("scheduledTaskId")
    private Long scheduledTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionType")
    private String sessionType;

    private ListCopilotSessionsRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.scheduledTaskId = builder.scheduledTaskId;
        this.sessionType = builder.sessionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCopilotSessionsRequest create() {
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
     * @return scheduledTaskId
     */
    public Long getScheduledTaskId() {
        return this.scheduledTaskId;
    }

    /**
     * @return sessionType
     */
    public String getSessionType() {
        return this.sessionType;
    }

    public static final class Builder extends Request.Builder<ListCopilotSessionsRequest, Builder> {
        private String agentId; 
        private Integer maxResults; 
        private String nextToken; 
        private Long scheduledTaskId; 
        private String sessionType; 

        private Builder() {
            super();
        } 

        private Builder(ListCopilotSessionsRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.scheduledTaskId = request.scheduledTaskId;
            this.sessionType = request.sessionType;
        } 

        /**
         * <p>The agent ID. If this parameter is not specified, all agent sessions of the current user are queried.</p>
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
         * <p>The maximum number of records per page. Default value: 50. Valid values: 1 to 1000.</p>
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
         * <p>The pagination token for the next page. Do not specify this parameter for the first query.</p>
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
         * <p>The scheduled task ID, which must be a positive integer. If this parameter is specified, sessionType must be omitted or set to cron.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        public Builder scheduledTaskId(Long scheduledTaskId) {
            this.putQueryParameter("scheduledTaskId", scheduledTaskId);
            this.scheduledTaskId = scheduledTaskId;
            return this;
        }

        /**
         * <p>The session source. If this parameter is not specified, sessions are not filtered by source.</p>
         * 
         * <strong>example:</strong>
         * <p>openapi</p>
         */
        public Builder sessionType(String sessionType) {
            this.putQueryParameter("sessionType", sessionType);
            this.sessionType = sessionType;
            return this;
        }

        @Override
        public ListCopilotSessionsRequest build() {
            return new ListCopilotSessionsRequest(this);
        } 

    } 

}
