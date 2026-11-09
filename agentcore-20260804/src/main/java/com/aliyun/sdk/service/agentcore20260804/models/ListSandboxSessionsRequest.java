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
 * {@link ListSandboxSessionsRequest} extends {@link RequestModel}
 *
 * <p>ListSandboxSessionsRequest</p>
 */
public class ListSandboxSessionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sandboxId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sandboxId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceEndpointId")
    private String serviceEndpointId;

    private ListSandboxSessionsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentId = builder.agentId;
        this.sandboxId = builder.sandboxId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.serviceEndpointId = builder.serviceEndpointId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSandboxSessionsRequest create() {
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
     * @return sandboxId
     */
    public String getSandboxId() {
        return this.sandboxId;
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
     * @return serviceEndpointId
     */
    public String getServiceEndpointId() {
        return this.serviceEndpointId;
    }

    public static final class Builder extends Request.Builder<ListSandboxSessionsRequest, Builder> {
        private String workspaceId; 
        private String agentId; 
        private String sandboxId; 
        private Integer maxResults; 
        private String nextToken; 
        private String serviceEndpointId; 

        private Builder() {
            super();
        } 

        private Builder(ListSandboxSessionsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentId = request.agentId;
            this.sandboxId = request.sandboxId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.serviceEndpointId = request.serviceEndpointId;
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
         * <p>The managed Harness agent ID.</p>
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
         * <p>The sandbox ID. You can query the ID by calling the ListSandboxes operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sbx-2</p>
         */
        public Builder sandboxId(String sandboxId) {
            this.putPathParameter("sandboxId", sandboxId);
            this.sandboxId = sandboxId;
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
         * <p>The token for the next page. Omit this parameter in the first request. For subsequent requests, use the returned token as is, and keep the workspace, agent, instance, and maxResults unchanged. An empty value indicates that no more pages are available.</p>
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
         * <p>The value must be consistent with the request parameters used in the ListSandboxes operation to obtain the sandboxId. If this parameter is omitted or left blank, the latest running unit of the agent is queried. If this parameter is specified, the service endpoint must belong to the agent and the target type must be AGENT_VERSION. Otherwise, Resource.NotFound is returned. If the target is not DEFAULT and is not running independently, ServiceEndpointTargetNotReady is returned. If the sandboxId does not belong to the specified running unit, Sandbox.NotFound is returned instead of an empty list.</p>
         * 
         * <strong>example:</strong>
         * <p>se-7f3a92c1</p>
         */
        public Builder serviceEndpointId(String serviceEndpointId) {
            this.putQueryParameter("serviceEndpointId", serviceEndpointId);
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }

        @Override
        public ListSandboxSessionsRequest build() {
            return new ListSandboxSessionsRequest(this);
        } 

    } 

}
