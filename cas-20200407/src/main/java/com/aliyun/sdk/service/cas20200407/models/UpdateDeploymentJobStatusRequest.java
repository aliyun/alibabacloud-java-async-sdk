// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDeploymentJobStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeploymentJobStatusRequest</p>
 */
public class UpdateDeploymentJobStatusRequest extends Request {
    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private Long jobId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    private UpdateDeploymentJobStatusRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeploymentJobStatusRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateDeploymentJobStatusRequest, Builder> {
        private Long jobId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeploymentJobStatusRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.status = request.status;
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

        @Override
        public UpdateDeploymentJobStatusRequest build() {
            return new UpdateDeploymentJobStatusRequest(this);
        } 

    } 

}
