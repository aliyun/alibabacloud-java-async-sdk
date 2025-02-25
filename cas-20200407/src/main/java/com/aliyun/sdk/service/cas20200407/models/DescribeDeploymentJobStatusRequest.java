// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
         * <p>The ID of the deployment task. You can call the <a href="https://help.aliyun.com/document_detail/2712234.html">CreateDeploymentJob</a> operation to obtain the ID of a deployment task from the <strong>JobId</strong> parameter. You can also call the <a href="https://help.aliyun.com/document_detail/2712223.html">ListDeploymentJob</a> operation to obtain the ID of a deployment task.</p>
         * 
         * <strong>example:</strong>
         * <p>8888</p>
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
