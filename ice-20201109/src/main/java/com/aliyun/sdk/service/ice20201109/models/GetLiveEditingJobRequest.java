// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveEditingJobRequest} extends {@link RequestModel}
 *
 * <p>GetLiveEditingJobRequest</p>
 */
public class GetLiveEditingJobRequest extends Request {
    @Query
    @NameInMap("JobId")
    private String jobId;

    private GetLiveEditingJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveEditingJobRequest create() {
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

    public static final class Builder extends Request.Builder<GetLiveEditingJobRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(GetLiveEditingJobRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public GetLiveEditingJobRequest build() {
            return new GetLiveEditingJobRequest(this);
        } 

    } 

}
