// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWorkerResourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteWorkerResourceRequest</p>
 */
public class DeleteWorkerResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long workerId;

    private DeleteWorkerResourceRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.workerId = builder.workerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkerResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return workerId
     */
    public Long getWorkerId() {
        return this.workerId;
    }

    public static final class Builder extends Request.Builder<DeleteWorkerResourceRequest, Builder> {
        private Long jobId; 
        private Long workerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWorkerResourceRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.workerId = request.workerId;
        } 

        /**
         * The ID of the deployment task.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The ID of the worker for the deployment task.
         */
        public Builder workerId(Long workerId) {
            this.putQueryParameter("WorkerId", workerId);
            this.workerId = workerId;
            return this;
        }

        @Override
        public DeleteWorkerResourceRequest build() {
            return new DeleteWorkerResourceRequest(this);
        } 

    } 

}
