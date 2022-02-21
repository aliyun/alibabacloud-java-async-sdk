// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPictureSearchJobStatusRequest} extends {@link RequestModel}
 *
 * <p>GetPictureSearchJobStatusRequest</p>
 */
public class GetPictureSearchJobStatusRequest extends Request {
    @Query
    @NameInMap("AppInstanceId")
    @Validation(required = true)
    private String appInstanceId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    private GetPictureSearchJobStatusRequest(Builder builder) {
        super(builder);
        this.appInstanceId = builder.appInstanceId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPictureSearchJobStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<GetPictureSearchJobStatusRequest, Builder> {
        private String appInstanceId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(GetPictureSearchJobStatusRequest response) {
            super(response);
            this.appInstanceId = response.appInstanceId;
            this.jobId = response.jobId;
        } 

        /**
         * AppInstanceId.
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putQueryParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
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
        public GetPictureSearchJobStatusRequest build() {
            return new GetPictureSearchJobStatusRequest(this);
        } 

    } 

}
