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
 * {@link ListDeploymentJobCertRequest} extends {@link RequestModel}
 *
 * <p>ListDeploymentJobCertRequest</p>
 */
public class ListDeploymentJobCertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the deployment task. You can call the <a href="https://help.aliyun.com/document_detail/2712234.html">CreateDeploymentJob</a> operation to obtain the ID of a deployment task from the <strong>JobId</strong> parameter. You can also call the <a href="https://help.aliyun.com/document_detail/2712223.html">ListDeploymentJob</a> operation to obtain the ID of a deployment task.</p>
         * <p>This parameter is required.</p>
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
        public ListDeploymentJobCertRequest build() {
            return new ListDeploymentJobCertRequest(this);
        } 

    } 

}
