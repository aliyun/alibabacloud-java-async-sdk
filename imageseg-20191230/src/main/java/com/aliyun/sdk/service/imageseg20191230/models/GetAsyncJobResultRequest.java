// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imageseg20191230.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * JobId.
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
