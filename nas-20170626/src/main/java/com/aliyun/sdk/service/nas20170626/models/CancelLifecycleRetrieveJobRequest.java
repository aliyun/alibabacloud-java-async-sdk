// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelLifecycleRetrieveJobRequest} extends {@link RequestModel}
 *
 * <p>CancelLifecycleRetrieveJobRequest</p>
 */
public class CancelLifecycleRetrieveJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private CancelLifecycleRetrieveJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelLifecycleRetrieveJobRequest create() {
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

    public static final class Builder extends Request.Builder<CancelLifecycleRetrieveJobRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(CancelLifecycleRetrieveJobRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * The ID of the data retrieval task.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public CancelLifecycleRetrieveJobRequest build() {
            return new CancelLifecycleRetrieveJobRequest(this);
        } 

    } 

}
