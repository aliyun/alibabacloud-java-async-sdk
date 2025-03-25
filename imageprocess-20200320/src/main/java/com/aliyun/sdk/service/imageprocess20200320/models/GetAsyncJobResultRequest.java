// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imageprocess20200320.models;

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
 * {@link GetAsyncJobResultRequest} extends {@link RequestModel}
 *
 * <p>GetAsyncJobResultRequest</p>
 */
public class GetAsyncJobResultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private GetAsyncJobResultRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncJobResultRequest create() {
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

    public static final class Builder extends Request.Builder<GetAsyncJobResultRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(GetAsyncJobResultRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7CB9B663-3EF8-4C9C-A464-FDA2B5F1E3A4</p>
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public GetAsyncJobResultRequest build() {
            return new GetAsyncJobResultRequest(this);
        } 

    } 

}
