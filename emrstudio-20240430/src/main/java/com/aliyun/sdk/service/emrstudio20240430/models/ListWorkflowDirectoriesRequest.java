// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListWorkflowDirectoriesRequest} extends {@link RequestModel}
 *
 * <p>ListWorkflowDirectoriesRequest</p>
 */
public class ListWorkflowDirectoriesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("parentDirectoryId")
    private String parentDirectoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListWorkflowDirectoriesRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.directoryId = builder.directoryId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.parentDirectoryId = builder.parentDirectoryId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowDirectoriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
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
     * @return parentDirectoryId
     */
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListWorkflowDirectoriesRequest, Builder> {
        private String projectId; 
        private String directoryId; 
        private Integer maxResults; 
        private String nextToken; 
        private String parentDirectoryId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkflowDirectoriesRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.directoryId = request.directoryId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.parentDirectoryId = request.parentDirectoryId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * directoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("directoryId", directoryId);
            this.directoryId = directoryId;
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
         * parentDirectoryId.
         */
        public Builder parentDirectoryId(String parentDirectoryId) {
            this.putQueryParameter("parentDirectoryId", parentDirectoryId);
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListWorkflowDirectoriesRequest build() {
            return new ListWorkflowDirectoriesRequest(this);
        } 

    } 

}
