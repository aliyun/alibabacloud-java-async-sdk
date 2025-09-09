// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagerecog20190930.models;

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
    @com.aliyun.core.annotation.Query
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
         * <p>72CFDC08-3FEF-56AA-91E5-B14DE31C09C2</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public GetAsyncJobResultRequest build() {
            return new GetAsyncJobResultRequest(this);
        } 

    } 

}
