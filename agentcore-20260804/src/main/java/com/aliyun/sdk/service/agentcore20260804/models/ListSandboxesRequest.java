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
 * {@link ListSandboxesRequest} extends {@link RequestModel}
 *
 * <p>ListSandboxesRequest</p>
 */
public class ListSandboxesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("searchText")
    private String searchText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceEndpointId")
    private String serviceEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    private ListSandboxesRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentId = builder.agentId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.searchText = builder.searchText;
        this.serviceEndpointId = builder.serviceEndpointId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSandboxesRequest create() {
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
     * @return searchText
     */
    public String getSearchText() {
        return this.searchText;
    }

    /**
     * @return serviceEndpointId
     */
    public String getServiceEndpointId() {
        return this.serviceEndpointId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<ListSandboxesRequest, Builder> {
        private String workspaceId; 
        private String agentId; 
        private Integer maxResults; 
        private String nextToken; 
        private String searchText; 
        private String serviceEndpointId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(ListSandboxesRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentId = request.agentId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.searchText = request.searchText;
            this.serviceEndpointId = request.serviceEndpointId;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The ID of the managed Harness agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        public Builder agentId(String agentId) {
            this.putPathParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The maximum number of entries to return per page. Default value: 20. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The cursor for querying the next page. During pagination, you must keep workspaceId, agentId, searchText, sessionId, and maxResults unchanged.</p>
         * 
         * <strong>example:</strong>
         * <p>next-token-1</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Performs a case-insensitive fuzzy search by Sandbox ID fragment.</p>
         * 
         * <strong>example:</strong>
         * <p>2f360</p>
         */
        public Builder searchText(String searchText) {
            this.putQueryParameter("searchText", searchText);
            this.searchText = searchText;
            return this;
        }

        /**
         * <p>If omitted or left blank, queries the latest running unit of the agent. If specified, the service endpoint must belong to the agent and the target type must be AGENT_VERSION. Otherwise, Resource.NotFound is returned. An independently running service endpoint returns only the sandboxes of its own running unit. If the DEFAULT service endpoint has not taken over independent running, it falls back to the latest running unit. If a non-DEFAULT service endpoint is not running independently, ServiceEndpointTargetNotReady is returned. If the running unit has not been created, an empty list is returned and totalCount is 0, without reporting an error.</p>
         * 
         * <strong>example:</strong>
         * <p>se-7f3a92c1</p>
         */
        public Builder serviceEndpointId(String serviceEndpointId) {
            this.putQueryParameter("serviceEndpointId", serviceEndpointId);
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }

        /**
         * <p>Performs a case-insensitive fuzzy search by current valid session ID fragment.</p>
         * 
         * <strong>example:</strong>
         * <p>session-a</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public ListSandboxesRequest build() {
            return new ListSandboxesRequest(this);
        } 

    } 

}
