// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListManualTaskInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListManualTaskInstancesRequest</p>
 */
public class ListManualTaskInstancesRequest extends Request {
    @Path
    @NameInMap("projectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("endTime")
    private String endTime;

    @Query
    @NameInMap("executionStatus")
    private String executionStatus;

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
    @NameInMap("startTime")
    private String startTime;

    @Query
    @NameInMap("workspaceId")
    @Validation(required = true)
    private String workspaceId;

    private ListManualTaskInstancesRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.endTime = builder.endTime;
        this.executionStatus = builder.executionStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.searchVal = builder.searchVal;
        this.startTime = builder.startTime;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListManualTaskInstancesRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return executionStatus
     */
    public String getExecutionStatus() {
        return this.executionStatus;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListManualTaskInstancesRequest, Builder> {
        private String projectId; 
        private String endTime; 
        private String executionStatus; 
        private Integer maxResults; 
        private String nextToken; 
        private String searchVal; 
        private String startTime; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListManualTaskInstancesRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.endTime = request.endTime;
            this.executionStatus = request.executionStatus;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.searchVal = request.searchVal;
            this.startTime = request.startTime;
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
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * executionStatus.
         */
        public Builder executionStatus(String executionStatus) {
            this.putQueryParameter("executionStatus", executionStatus);
            this.executionStatus = executionStatus;
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
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
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
        public ListManualTaskInstancesRequest build() {
            return new ListManualTaskInstancesRequest(this);
        } 

    } 

}
