// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateWorkerResourceStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkerResourceStatusRequest</p>
 */
public class UpdateWorkerResourceStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkerId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        /**
         * <p>The desired status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>rollback</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rollback</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the worker task. You can call the <a href="https://help.aliyun.com/document_detail/2712224.html">ListWorkerResource</a> operation to obtain the ID of a worker task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
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
