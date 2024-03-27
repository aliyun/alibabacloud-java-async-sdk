// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkflowInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListWorkflowInstancesRequest</p>
 */
public class ListWorkflowInstancesRequest extends Request {
    @Path
    @NameInMap("projectId")
    @Validation(required = true)
    private Long projectId;

    @Query
    @NameInMap("endDate")
    private String endDate;

    @Query
    @NameInMap("maxResults")
    private Integer maxResults;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("startDate")
    private String startDate;

    @Query
    @NameInMap("workflowId")
    private Long workflowId;

    @Query
    @NameInMap("workspaceId")
    @Validation(required = true)
    private Long workspaceId;

    private ListWorkflowInstancesRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.endDate = builder.endDate;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.startDate = builder.startDate;
        this.workflowId = builder.workflowId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowInstancesRequest create() {
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
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
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
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return workflowId
     */
    public Long getWorkflowId() {
        return this.workflowId;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListWorkflowInstancesRequest, Builder> {
        private Long projectId; 
        private String endDate; 
        private Integer maxResults; 
        private String nextToken; 
        private String startDate; 
        private Long workflowId; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkflowInstancesRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.endDate = request.endDate;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.startDate = request.startDate;
            this.workflowId = request.workflowId;
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
         * endDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("endDate", endDate);
            this.endDate = endDate;
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
         * startDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * workflowId.
         */
        public Builder workflowId(Long workflowId) {
            this.putQueryParameter("workflowId", workflowId);
            this.workflowId = workflowId;
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
        public ListWorkflowInstancesRequest build() {
            return new ListWorkflowInstancesRequest(this);
        } 

    } 

}
