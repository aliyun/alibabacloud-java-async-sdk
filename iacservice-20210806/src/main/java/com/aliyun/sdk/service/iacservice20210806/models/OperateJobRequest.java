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
 * {@link OperateJobRequest} extends {@link RequestModel}
 *
 * <p>OperateJobRequest</p>
 */
public class OperateJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("jobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("operationType")
    private String operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("comment")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskType")
    private String taskType;

    private OperateJobRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.jobId = builder.jobId;
        this.operationType = builder.operationType;
        this.comment = builder.comment;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateJobRequest create() {
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
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<OperateJobRequest, Builder> {
        private String taskId; 
        private String jobId; 
        private String operationType; 
        private String comment; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(OperateJobRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.jobId = request.jobId;
            this.operationType = request.operationType;
            this.comment = request.comment;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-518855d9a058cfffe0e0a92745bbc</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>job-5fd38c9b92d54fff865d936f22a39</p>
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>execute: continues the Apply operation after the Plan is complete.</li>
         * <li>abolish: abandons a job that has completed the Plan preview.</li>
         * <li>cancel: cancels a job that is running or queued.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>execute</p>
         */
        public Builder operationType(String operationType) {
            this.putPathParameter("operationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>The description. The length is 0 to 128 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dasd</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>Task: regular task (default).</li>
         * <li>SceneTestingTask: scenario-based testing task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Task</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("taskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public OperateJobRequest build() {
            return new OperateJobRequest(this);
        } 

    } 

}
