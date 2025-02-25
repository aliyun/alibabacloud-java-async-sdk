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
 * {@link UpdateDeploymentJobStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeploymentJobStatusRequest</p>
 */
public class UpdateDeploymentJobStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the deployment task.</p>
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

        /**
         * <p>The desired status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>pending</li>
         * <li>scheduling</li>
         * <li>editing</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>editing</p>
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
