// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeploymentJobCertRequest} extends {@link RequestModel}
 *
 * <p>ListDeploymentJobCertRequest</p>
 */
public class ListDeploymentJobCertRequest extends Request {
    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private Long jobId;

    private ListDeploymentJobCertRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeploymentJobCertRequest create() {
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

    public static final class Builder extends Request.Builder<ListDeploymentJobCertRequest, Builder> {
        private Long jobId; 

        private Builder() {
            super();
        } 

        private Builder(ListDeploymentJobCertRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * JobId.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public ListDeploymentJobCertRequest build() {
            return new ListDeploymentJobCertRequest(this);
        } 

    } 

}
