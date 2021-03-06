// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskExecutionsRequest} extends {@link RequestModel}
 *
 * <p>ListTaskExecutionsRequest</p>
 */
public class ListTaskExecutionsRequest extends Request {
    @Query
    @NameInMap("EndDateAfter")
    private String endDateAfter;

    @Query
    @NameInMap("EndDateBefore")
    private String endDateBefore;

    @Query
    @NameInMap("ExecutionId")
    private String executionId;

    @Query
    @NameInMap("IncludeChildTaskExecution")
    private Boolean includeChildTaskExecution;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ParentTaskExecutionId")
    private String parentTaskExecutionId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SortField")
    private String sortField;

    @Query
    @NameInMap("SortOrder")
    private String sortOrder;

    @Query
    @NameInMap("StartDateAfter")
    private String startDateAfter;

    @Query
    @NameInMap("StartDateBefore")
    private String startDateBefore;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TaskAction")
    private String taskAction;

    @Query
    @NameInMap("TaskExecutionId")
    private String taskExecutionId;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    private ListTaskExecutionsRequest(Builder builder) {
        super(builder);
        this.endDateAfter = builder.endDateAfter;
        this.endDateBefore = builder.endDateBefore;
        this.executionId = builder.executionId;
        this.includeChildTaskExecution = builder.includeChildTaskExecution;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.parentTaskExecutionId = builder.parentTaskExecutionId;
        this.regionId = builder.regionId;
        this.sortField = builder.sortField;
        this.sortOrder = builder.sortOrder;
        this.startDateAfter = builder.startDateAfter;
        this.startDateBefore = builder.startDateBefore;
        this.status = builder.status;
        this.taskAction = builder.taskAction;
        this.taskExecutionId = builder.taskExecutionId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskExecutionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDateAfter
     */
    public String getEndDateAfter() {
        return this.endDateAfter;
    }

    /**
     * @return endDateBefore
     */
    public String getEndDateBefore() {
        return this.endDateBefore;
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @return includeChildTaskExecution
     */
    public Boolean getIncludeChildTaskExecution() {
        return this.includeChildTaskExecution;
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
     * @return parentTaskExecutionId
     */
    public String getParentTaskExecutionId() {
        return this.parentTaskExecutionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return startDateAfter
     */
    public String getStartDateAfter() {
        return this.startDateAfter;
    }

    /**
     * @return startDateBefore
     */
    public String getStartDateBefore() {
        return this.startDateBefore;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskAction
     */
    public String getTaskAction() {
        return this.taskAction;
    }

    /**
     * @return taskExecutionId
     */
    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<ListTaskExecutionsRequest, Builder> {
        private String endDateAfter; 
        private String endDateBefore; 
        private String executionId; 
        private Boolean includeChildTaskExecution; 
        private Integer maxResults; 
        private String nextToken; 
        private String parentTaskExecutionId; 
        private String regionId; 
        private String sortField; 
        private String sortOrder; 
        private String startDateAfter; 
        private String startDateBefore; 
        private String status; 
        private String taskAction; 
        private String taskExecutionId; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(ListTaskExecutionsRequest response) {
            super(response);
            this.endDateAfter = response.endDateAfter;
            this.endDateBefore = response.endDateBefore;
            this.executionId = response.executionId;
            this.includeChildTaskExecution = response.includeChildTaskExecution;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.parentTaskExecutionId = response.parentTaskExecutionId;
            this.regionId = response.regionId;
            this.sortField = response.sortField;
            this.sortOrder = response.sortOrder;
            this.startDateAfter = response.startDateAfter;
            this.startDateBefore = response.startDateBefore;
            this.status = response.status;
            this.taskAction = response.taskAction;
            this.taskExecutionId = response.taskExecutionId;
            this.taskName = response.taskName;
        } 

        /**
         * EndDateAfter.
         */
        public Builder endDateAfter(String endDateAfter) {
            this.putQueryParameter("EndDateAfter", endDateAfter);
            this.endDateAfter = endDateAfter;
            return this;
        }

        /**
         * EndDateBefore.
         */
        public Builder endDateBefore(String endDateBefore) {
            this.putQueryParameter("EndDateBefore", endDateBefore);
            this.endDateBefore = endDateBefore;
            return this;
        }

        /**
         * ExecutionId.
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
            return this;
        }

        /**
         * IncludeChildTaskExecution.
         */
        public Builder includeChildTaskExecution(Boolean includeChildTaskExecution) {
            this.putQueryParameter("IncludeChildTaskExecution", includeChildTaskExecution);
            this.includeChildTaskExecution = includeChildTaskExecution;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ParentTaskExecutionId.
         */
        public Builder parentTaskExecutionId(String parentTaskExecutionId) {
            this.putQueryParameter("ParentTaskExecutionId", parentTaskExecutionId);
            this.parentTaskExecutionId = parentTaskExecutionId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SortField.
         */
        public Builder sortField(String sortField) {
            this.putQueryParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * SortOrder.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * StartDateAfter.
         */
        public Builder startDateAfter(String startDateAfter) {
            this.putQueryParameter("StartDateAfter", startDateAfter);
            this.startDateAfter = startDateAfter;
            return this;
        }

        /**
         * StartDateBefore.
         */
        public Builder startDateBefore(String startDateBefore) {
            this.putQueryParameter("StartDateBefore", startDateBefore);
            this.startDateBefore = startDateBefore;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TaskAction.
         */
        public Builder taskAction(String taskAction) {
            this.putQueryParameter("TaskAction", taskAction);
            this.taskAction = taskAction;
            return this;
        }

        /**
         * TaskExecutionId.
         */
        public Builder taskExecutionId(String taskExecutionId) {
            this.putQueryParameter("TaskExecutionId", taskExecutionId);
            this.taskExecutionId = taskExecutionId;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public ListTaskExecutionsRequest build() {
            return new ListTaskExecutionsRequest(this);
        } 

    } 

}
