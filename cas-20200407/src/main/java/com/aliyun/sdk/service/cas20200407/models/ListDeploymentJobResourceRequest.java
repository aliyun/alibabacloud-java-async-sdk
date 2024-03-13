// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeploymentJobResourceRequest} extends {@link RequestModel}
 *
 * <p>ListDeploymentJobResourceRequest</p>
 */
public class ListDeploymentJobResourceRequest extends Request {
    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private Long jobId;

    private ListDeploymentJobResourceRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeploymentJobResourceRequest create() {
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

    public static final class Builder extends Request.Builder<ListDeploymentJobResourceRequest, Builder> {
        private Long jobId; 

        private Builder() {
            super();
        } 

        private Builder(ListDeploymentJobResourceRequest request) {
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
        public ListDeploymentJobResourceRequest build() {
            return new ListDeploymentJobResourceRequest(this);
        } 

    } 

}
