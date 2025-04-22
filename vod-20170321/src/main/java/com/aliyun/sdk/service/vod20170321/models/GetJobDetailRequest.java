// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetJobDetailRequest} extends {@link RequestModel}
 *
 * <p>GetJobDetailRequest</p>
 */
public class GetJobDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobType;

    private GetJobDetailRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.jobType = builder.jobType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobDetailRequest create() {
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
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    public static final class Builder extends Request.Builder<GetJobDetailRequest, Builder> {
        private String jobId; 
        private String jobType; 

        private Builder() {
            super();
        } 

        private Builder(GetJobDetailRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.jobType = request.jobType;
        } 

        /**
         * <p>The ID of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5c9dff***************59d50a967f5</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>transcode</li>
         * <li>snapshot</li>
         * <li>ai</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>transcode</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        @Override
        public GetJobDetailRequest build() {
            return new GetJobDetailRequest(this);
        } 

    } 

}
