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
 * {@link ListServiceEndpointsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceEndpointsRequest</p>
 */
public class ListServiceEndpointsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentVersion")
    private String agentVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("collaborationComponent")
    private String collaborationComponent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceBindingId")
    private String resourceBindingId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("targetType")
    private String targetType;

    private ListServiceEndpointsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentId = builder.agentId;
        this.agentVersion = builder.agentVersion;
        this.collaborationComponent = builder.collaborationComponent;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceBindingId = builder.resourceBindingId;
        this.status = builder.status;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceEndpointsRequest create() {
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
     * @return agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @return collaborationComponent
     */
    public String getCollaborationComponent() {
        return this.collaborationComponent;
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
     * @return resourceBindingId
     */
    public String getResourceBindingId() {
        return this.resourceBindingId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<ListServiceEndpointsRequest, Builder> {
        private String workspaceId; 
        private String agentId; 
        private String agentVersion; 
        private String collaborationComponent; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceBindingId; 
        private String status; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceEndpointsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentId = request.agentId;
            this.agentVersion = request.agentVersion;
            this.collaborationComponent = request.collaborationComponent;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceBindingId = request.resourceBindingId;
            this.status = request.status;
            this.targetType = request.targetType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * agentVersion.
         */
        public Builder agentVersion(String agentVersion) {
            this.putQueryParameter("agentVersion", agentVersion);
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * collaborationComponent.
         */
        public Builder collaborationComponent(String collaborationComponent) {
            this.putQueryParameter("collaborationComponent", collaborationComponent);
            this.collaborationComponent = collaborationComponent;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * resourceBindingId.
         */
        public Builder resourceBindingId(String resourceBindingId) {
            this.putQueryParameter("resourceBindingId", resourceBindingId);
            this.resourceBindingId = resourceBindingId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * targetType.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("targetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public ListServiceEndpointsRequest build() {
            return new ListServiceEndpointsRequest(this);
        } 

    } 

}
