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
 * {@link CancelRecycleBinJobRequest} extends {@link RequestModel}
 *
 * <p>CancelRecycleBinJobRequest</p>
 */
public class CancelRecycleBinJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private CancelRecycleBinJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelRecycleBinJobRequest create() {
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

    public static final class Builder extends Request.Builder<CancelRecycleBinJobRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(CancelRecycleBinJobRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * <p>The job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rb-15<strong><strong>ed-r-1625</strong></strong>2441</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public CancelRecycleBinJobRequest build() {
            return new CancelRecycleBinJobRequest(this);
        } 

    } 

}
