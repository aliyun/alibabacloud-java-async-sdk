// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkflowsRequest} extends {@link RequestModel}
 *
 * <p>ListWorkflowsRequest</p>
 */
public class ListWorkflowsRequest extends Request {
    @Path
    @NameInMap("projectId")
    @Validation(required = true)
    private Long projectId;

    @Query
    @NameInMap("maxResults")
    private Integer maxResults;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("searchVal")
    private String searchVal;

    @Query
    @NameInMap("workspaceId")
    @Validation(required = true)
    private Long workspaceId;

    private ListWorkflowsRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.searchVal = builder.searchVal;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
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
     * @return searchVal
     */
    public String getSearchVal() {
        return this.searchVal;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListWorkflowsRequest, Builder> {
        private Long projectId; 
        private Integer maxResults; 
        private String nextToken; 
        private String searchVal; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkflowsRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.searchVal = request.searchVal;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * projectId.
         */
        public Builder projectId(Long projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
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
         * searchVal.
         */
        public Builder searchVal(String searchVal) {
            this.putQueryParameter("searchVal", searchVal);
            this.searchVal = searchVal;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(Long workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListWorkflowsRequest build() {
            return new ListWorkflowsRequest(this);
        } 

    } 

}
