// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListTaskExecutionsRequest} extends {@link RequestModel}
 *
 * <p>ListTaskExecutionsRequest</p>
 */
public class ListTaskExecutionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDateAfter")
    private String endDateAfter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDateBefore")
    private String endDateBefore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionId")
    private String executionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeChildTaskExecution")
    private Boolean includeChildTaskExecution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentTaskExecutionId")
    private String parentTaskExecutionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortField")
    private String sortField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDateAfter")
    private String startDateAfter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDateBefore")
    private String startDateBefore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskAction")
    private String taskAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskExecutionId")
    private String taskExecutionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
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

        private Builder(ListTaskExecutionsRequest request) {
            super(request);
            this.endDateAfter = request.endDateAfter;
            this.endDateBefore = request.endDateBefore;
            this.executionId = request.executionId;
            this.includeChildTaskExecution = request.includeChildTaskExecution;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.parentTaskExecutionId = request.parentTaskExecutionId;
            this.regionId = request.regionId;
            this.sortField = request.sortField;
            this.sortOrder = request.sortOrder;
            this.startDateAfter = request.startDateAfter;
            this.startDateBefore = request.startDateBefore;
            this.status = request.status;
            this.taskAction = request.taskAction;
            this.taskExecutionId = request.taskExecutionId;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The execution ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        public Builder endDateAfter(String endDateAfter) {
            this.putQueryParameter("EndDateAfter", endDateAfter);
            this.endDateAfter = endDateAfter;
            return this;
        }

        /**
         * <p>Specifies to query task executions that stop running at or later than the specified time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        public Builder endDateBefore(String endDateBefore) {
            this.putQueryParameter("EndDateBefore", endDateBefore);
            this.endDateBefore = endDateBefore;
            return this;
        }

        /**
         * <p>The status of the execution. Valid values: Running, Started, Success, Failed, Waiting, Cancelled, Pending, and Skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-xxx</p>
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 20 to 100. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeChildTaskExecution(Boolean includeChildTaskExecution) {
            this.putQueryParameter("IncludeChildTaskExecution", includeChildTaskExecution);
            this.includeChildTaskExecution = includeChildTaskExecution;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Sorts the task executions to query. Valid values:</p>
         * <ul>
         * <li><strong>StartDate</strong>: specifies that the task executions are sorted based on the time when they are created. This is the default value.</li>
         * <li><strong>EndDate</strong>: specifies that the task executions are sorted based on the time when the time when they stop running.</li>
         * <li><strong>Status</strong>: specifies that the task executions are sorted based on their statuses.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJDQzQ3NjFENDdB</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Specifies whether to show the child nodes in the loop task. Default value: False.</p>
         * 
         * <strong>example:</strong>
         * <p>task-exec-xxx</p>
         */
        public Builder parentTaskExecutionId(String parentTaskExecutionId) {
            this.putQueryParameter("ParentTaskExecutionId", parentTaskExecutionId);
            this.parentTaskExecutionId = parentTaskExecutionId;
            return this;
        }

        /**
         * <p>The ID of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The order in which you want to sort the task executions to query. Valid values:</p>
         * <ul>
         * <li><strong>Ascending</strong>: ascending order.</li>
         * <li><strong>Descending</strong>: descending order. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>StartDate</p>
         */
        public Builder sortField(String sortField) {
            this.putQueryParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>Ascending</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>Specifies to query task executions that stop running at or before the specified time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        public Builder startDateAfter(String startDateAfter) {
            this.putQueryParameter("StartDateAfter", startDateAfter);
            this.startDateAfter = startDateAfter;
            return this;
        }

        /**
         * <p>Specifies to query task executions that start to run at or later than the specified time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        public Builder startDateBefore(String startDateBefore) {
            this.putQueryParameter("StartDateBefore", startDateBefore);
            this.startDateBefore = startDateBefore;
            return this;
        }

        /**
         * <p>Specifies to query task executions that start to run at or before the specified time.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The execution ID of the parent node. In a loop task, set this parameter to the execution ID of the parent node.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::Sleep</p>
         */
        public Builder taskAction(String taskAction) {
            this.putQueryParameter("TaskAction", taskAction);
            this.taskAction = taskAction;
            return this;
        }

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>task-exec-xxx</p>
         */
        public Builder taskExecutionId(String taskExecutionId) {
            this.putQueryParameter("TaskExecutionId", taskExecutionId);
            this.taskExecutionId = taskExecutionId;
            return this;
        }

        /**
         * <p>The action of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>describeInstance</p>
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
