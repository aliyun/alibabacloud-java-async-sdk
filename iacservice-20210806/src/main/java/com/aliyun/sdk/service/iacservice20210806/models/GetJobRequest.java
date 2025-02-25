// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobRequest} extends {@link RequestModel}
 *
 * <p>GetJobRequest</p>
 */
public class GetJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("jobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private GetJobRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobRequest create() {
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

    public static final class Builder extends Request.Builder<GetJobRequest, Builder> {
        private String taskId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(GetJobRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.jobId = request.jobId;
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

        @Override
        public GetJobRequest build() {
            return new GetJobRequest(this);
        } 

    } 

}
