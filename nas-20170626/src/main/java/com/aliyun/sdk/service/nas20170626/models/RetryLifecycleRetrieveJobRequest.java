// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link RetryLifecycleRetrieveJobRequest} extends {@link RequestModel}
 *
 * <p>RetryLifecycleRetrieveJobRequest</p>
 */
public class RetryLifecycleRetrieveJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private RetryLifecycleRetrieveJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryLifecycleRetrieveJobRequest create() {
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

    public static final class Builder extends Request.Builder<RetryLifecycleRetrieveJobRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(RetryLifecycleRetrieveJobRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * <p>The ID of the data retrieval task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lrj-nfstest-ia-160****853-hshvw</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public RetryLifecycleRetrieveJobRequest build() {
            return new RetryLifecycleRetrieveJobRequest(this);
        } 

    } 

}
