// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAvatarTrainingJobRequest} extends {@link RequestModel}
 *
 * <p>GetAvatarTrainingJobRequest</p>
 */
public class GetAvatarTrainingJobRequest extends Request {
    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    private GetAvatarTrainingJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAvatarTrainingJobRequest create() {
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

    public static final class Builder extends Request.Builder<GetAvatarTrainingJobRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(GetAvatarTrainingJobRequest request) {
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
        public GetAvatarTrainingJobRequest build() {
            return new GetAvatarTrainingJobRequest(this);
        } 

    } 

}
