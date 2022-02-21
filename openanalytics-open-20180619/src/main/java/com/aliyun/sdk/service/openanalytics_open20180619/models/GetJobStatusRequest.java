// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobStatusRequest} extends {@link RequestModel}
 *
 * <p>GetJobStatusRequest</p>
 */
public class GetJobStatusRequest extends Request {
    @Body
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Body
    @NameInMap("VcName")
    @Validation(required = true)
    private String vcName;

    private GetJobStatusRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.vcName = builder.vcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobStatusRequest create() {
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
     * @return vcName
     */
    public String getVcName() {
        return this.vcName;
    }

    public static final class Builder extends Request.Builder<GetJobStatusRequest, Builder> {
        private String jobId; 
        private String vcName; 

        private Builder() {
            super();
        } 

        private Builder(GetJobStatusRequest response) {
            super(response);
            this.jobId = response.jobId;
            this.vcName = response.vcName;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * VcName.
         */
        public Builder vcName(String vcName) {
            this.putBodyParameter("VcName", vcName);
            this.vcName = vcName;
            return this;
        }

        @Override
        public GetJobStatusRequest build() {
            return new GetJobStatusRequest(this);
        } 

    } 

}
