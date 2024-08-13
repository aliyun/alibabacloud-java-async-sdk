// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeploymentJobRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeploymentJobRequest</p>
 */
public class DescribeDeploymentJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    private DescribeDeploymentJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeploymentJobRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDeploymentJobRequest, Builder> {
        private Long jobId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeploymentJobRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * The ID of the deployment job. The **ID** of the job is returned after you call the [CreateDeploymentJob](~~2712234~~) operation. You can also call the [ListDeploymentJob](~~2712223~~) operation to obtain the ID.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public DescribeDeploymentJobRequest build() {
            return new DescribeDeploymentJobRequest(this);
        } 

    } 

}
