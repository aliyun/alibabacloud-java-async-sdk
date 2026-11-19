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
 * {@link ListMemoryTasksRequest} extends {@link RequestModel}
 *
 * <p>ListMemoryTasksRequest</p>
 */
public class ListMemoryTasksRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListMemoryTasksRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memoryStoreName = builder.memoryStoreName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ruleId = builder.ruleId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMemoryTasksRequest create() {
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
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListMemoryTasksRequest, Builder> {
        private String workspaceId; 
        private String memoryStoreName; 
        private Integer maxResults; 
        private String nextToken; 
        private String ruleId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListMemoryTasksRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memoryStoreName = request.memoryStoreName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ruleId = request.ruleId;
            this.status = request.status;
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
         * <p>The maximum number of results per page.</p>
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
         * <p>The pagination token returned for the same resource and filter conditions.</p>
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
         * <p>ruleId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-2f5f9c5a8d0e4c3b</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>status</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListMemoryTasksRequest build() {
            return new ListMemoryTasksRequest(this);
        } 

    } 

}
