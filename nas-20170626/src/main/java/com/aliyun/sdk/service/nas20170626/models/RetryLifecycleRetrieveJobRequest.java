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
         * <p>The data retrieval task ID.</p>
         * <p><strong>Scenarios</strong></p>
         * <p>Call this operation to retry a data retrieval task that has entered the <code>failed</code> state. Common causes for a task to enter the <code>failed</code> state include:</p>
         * <ul>
         * <li>A backend error occurred during data retrieval from the InfrequentAccess or Archive storage tier.</li>
         * <li>The data retrieval request timed out.</li>
         * <li>A temporary storage tier failure or network exception occurred.</li>
         * </ul>
         * <p><strong>Before you begin</strong></p>
         * <p>Before calling this operation, call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-listlifecycleretrievejobs">ListLifecycleRetrieveJobs</a> to query the task list, confirm that the target task is in the <code>failed</code> state, and obtain the JobId of the task you want to retry.</p>
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
