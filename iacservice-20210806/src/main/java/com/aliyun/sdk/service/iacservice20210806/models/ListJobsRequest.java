// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListJobsRequest} extends {@link RequestModel}
 *
 * <p>ListJobsRequest</p>
 */
public class ListJobsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jobType")
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskType")
    private String taskType;

    private ListJobsRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.jobType = builder.jobType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<ListJobsRequest, Builder> {
        private String taskId; 
        private String jobType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String status; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(ListJobsRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.jobType = request.jobType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-55f1739d9050fff</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The job type.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("jobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of results returned per page. Default value: 20. Minimum value: 1. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li>Pending: The initial status after the job is created.</li>
         * <li>PlanQueued: After the job is created, if no workflow is available, the job is queued.</li>
         * <li>Planning: The resource job is in the Plan execution phase.</li>
         * <li>ConfigProactiveInProgress: Compliance pre-check is in progress. The account must have the compliance pre-check feature enabled.</li>
         * <li>ConfigProactiveSuccess: Compliance pre-check succeeded. The account must have the compliance pre-check feature enabled.</li>
         * <li>Planned: The resource job has completed Plan execution.</li>
         * <li>PlannedAndFinished: After Plan execution is completed, no diff is found. This is a final status.</li>
         * <li>Confirmed: The resource job is waiting for confirmation after Plan execution is completed.</li>
         * <li>ApplyQueued: During job execution, if no workflow is available, the job is queued.</li>
         * <li>Applying: The resource job is in the Apply execution phase.</li>
         * <li>Applied: The resource job has completed Apply execution. This is a final status.</li>
         * <li>Errored: The job execution encountered an error. This is a final status.</li>
         * <li>Canceled: The job execution was canceled. This is a final status.</li>
         * <li>Discarded: The plan of the resource job was discarded. This is a final status.</li>
         * <li>ConfigProactiveFailure: Compliance pre-check failed. The account must have the compliance pre-check feature enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Errored</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>Task: Regular task (default).</li>
         * <li>SceneTestingTask: Scenario-based testing task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SceneTestingTask</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("taskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public ListJobsRequest build() {
            return new ListJobsRequest(this);
        } 

    } 

}
