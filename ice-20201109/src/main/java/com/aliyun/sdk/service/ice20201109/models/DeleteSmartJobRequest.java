// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteSmartJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteSmartJobRequest</p>
 */
public class DeleteSmartJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    private DeleteSmartJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSmartJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<DeleteSmartJobRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSmartJobRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * <p>The IDs of the jobs to delete. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>b48fb04483915d4f2cd8</strong></strong></strong>,<strong><strong><strong>042d5e4db6866f6289d1</strong></strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public DeleteSmartJobRequest build() {
            return new DeleteSmartJobRequest(this);
        } 

    } 

}
