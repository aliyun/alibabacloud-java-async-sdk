// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobRequest} extends {@link RequestModel}
 *
 * <p>GetJobRequest</p>
 */
public class GetJobRequest extends Request {
    @Path
    @NameInMap("JobId")
    @Validation(required = true, maxLength = 256, minLength = 1)
    private String jobId;

    @Query
    @NameInMap("NeedDetail")
    private Boolean needDetail;

    private GetJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.needDetail = builder.needDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobRequest create() {
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

    /**
     * @return needDetail
     */
    public Boolean getNeedDetail() {
        return this.needDetail;
    }

    public static final class Builder extends Request.Builder<GetJobRequest, Builder> {
        private String jobId; 
        private Boolean needDetail; 

        private Builder() {
            super();
        } 

        private Builder(GetJobRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.needDetail = request.needDetail;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * NeedDetail.
         */
        public Builder needDetail(Boolean needDetail) {
            this.putQueryParameter("NeedDetail", needDetail);
            this.needDetail = needDetail;
            return this;
        }

        @Override
        public GetJobRequest build() {
            return new GetJobRequest(this);
        } 

    } 

}
