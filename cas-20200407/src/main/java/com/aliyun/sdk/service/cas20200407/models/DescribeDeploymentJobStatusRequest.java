// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeploymentJobStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeploymentJobStatusRequest</p>
 */
public class DescribeDeploymentJobStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private Long jobId;

    private DescribeDeploymentJobStatusRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeploymentJobStatusRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDeploymentJobStatusRequest, Builder> {
        private Long jobId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeploymentJobStatusRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * The ID of the deployment task. You can call the [CreateDeploymentJob](~~2712234~~) operation to obtain the ID of a deployment task from the **JobId** parameter. You can also call the [ListDeploymentJob](~~2712223~~) operation to obtain the ID of a deployment task.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public DescribeDeploymentJobStatusRequest build() {
            return new DescribeDeploymentJobStatusRequest(this);
        } 

    } 

}
