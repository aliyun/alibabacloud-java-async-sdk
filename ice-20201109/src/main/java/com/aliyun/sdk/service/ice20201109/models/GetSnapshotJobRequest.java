// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSnapshotJobRequest} extends {@link RequestModel}
 *
 * <p>GetSnapshotJobRequest</p>
 */
public class GetSnapshotJobRequest extends Request {
    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    private GetSnapshotJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSnapshotJobRequest create() {
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

    public static final class Builder extends Request.Builder<GetSnapshotJobRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(GetSnapshotJobRequest request) {
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
        public GetSnapshotJobRequest build() {
            return new GetSnapshotJobRequest(this);
        } 

    } 

}
