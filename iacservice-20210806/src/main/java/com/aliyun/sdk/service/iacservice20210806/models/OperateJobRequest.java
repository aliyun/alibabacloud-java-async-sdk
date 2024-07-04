// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("comment")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String comment;

    private OperateJobRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.jobId = builder.jobId;
        this.operationType = builder.operationType;
        this.comment = builder.comment;
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

    public static final class Builder extends Request.Builder<OperateJobRequest, Builder> {
        private String taskId; 
        private String jobId; 
        private String operationType; 
        private String comment; 

        private Builder() {
            super();
        } 

        private Builder(OperateJobRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.jobId = request.jobId;
            this.operationType = request.operationType;
            this.comment = request.comment;
        } 

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * jobId.
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * operationType.
         */
        public Builder operationType(String operationType) {
            this.putPathParameter("operationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("comment", comment);
            this.comment = comment;
            return this;
        }

        @Override
        public OperateJobRequest build() {
            return new OperateJobRequest(this);
        } 

    } 

}
