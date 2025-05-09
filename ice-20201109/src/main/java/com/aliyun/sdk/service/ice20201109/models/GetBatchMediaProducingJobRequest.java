// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetBatchMediaProducingJobRequest} extends {@link RequestModel}
 *
 * <p>GetBatchMediaProducingJobRequest</p>
 */
public class GetBatchMediaProducingJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    private GetBatchMediaProducingJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBatchMediaProducingJobRequest create() {
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

    public static final class Builder extends Request.Builder<GetBatchMediaProducingJobRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(GetBatchMediaProducingJobRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * <p>The ID of the quick video production job.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>b4549d46c88681030f6e</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public GetBatchMediaProducingJobRequest build() {
            return new GetBatchMediaProducingJobRequest(this);
        } 

    } 

}
