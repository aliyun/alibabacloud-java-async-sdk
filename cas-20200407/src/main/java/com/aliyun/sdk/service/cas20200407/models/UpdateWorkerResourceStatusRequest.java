// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkerResourceStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkerResourceStatusRequest</p>
 */
public class UpdateWorkerResourceStatusRequest extends Request {
    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private Long jobId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    @Query
    @NameInMap("WorkerId")
    @Validation(required = true)
    private Long workerId;

    private UpdateWorkerResourceStatusRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.status = builder.status;
        this.workerId = builder.workerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkerResourceStatusRequest create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return workerId
     */
    public Long getWorkerId() {
        return this.workerId;
    }

    public static final class Builder extends Request.Builder<UpdateWorkerResourceStatusRequest, Builder> {
        private Long jobId; 
        private String status; 
        private Long workerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkerResourceStatusRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.status = request.status;
            this.workerId = request.workerId;
        } 

        /**
         * JobId.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
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
         * WorkerId.
         */
        public Builder workerId(Long workerId) {
            this.putQueryParameter("WorkerId", workerId);
            this.workerId = workerId;
            return this;
        }

        @Override
        public UpdateWorkerResourceStatusRequest build() {
            return new UpdateWorkerResourceStatusRequest(this);
        } 

    } 

}
