// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCacheAnalysisJobRequest} extends {@link RequestModel}
 *
 * <p>DescribeCacheAnalysisJobRequest</p>
 */
public class DescribeCacheAnalysisJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private DescribeCacheAnalysisJobRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCacheAnalysisJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<DescribeCacheAnalysisJobRequest, Builder> {
        private String instanceId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCacheAnalysisJobRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp18ff4a195d****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the cache analysis task. You can obtain the task ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/180982.html">CreateCacheAnalysisJob</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sf79-sd99-sa37-****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public DescribeCacheAnalysisJobRequest build() {
            return new DescribeCacheAnalysisJobRequest(this);
        } 

    } 

}
