// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeJobStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobStatusRequest</p>
 */
public class DescribeJobStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    private DescribeJobStatusRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<DescribeJobStatusRequest, Builder> {
        private String appId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeJobStatusRequest request) {
            super(request);
            this.appId = request.appId;
            this.jobId = request.jobId;
        } 

        /**
         * <p>The ID of the job template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e1a7a07-abcb-4652-a1d3-2d57f415****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>event-b798157b-40a2-4388-b578-71fb897103**-**</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public DescribeJobStatusRequest build() {
            return new DescribeJobStatusRequest(this);
        } 

    } 

}
