// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobRequest</p>
 */
public class DescribeJobRequest extends Request {
    @Query
    @NameInMap("Async")
    private Boolean async;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    private DescribeJobRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
        this.clusterId = builder.clusterId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return async
     */
    public Boolean getAsync() {
        return this.async;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<DescribeJobRequest, Builder> {
        private Boolean async; 
        private String clusterId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeJobRequest request) {
            super(request);
            this.async = request.async;
            this.clusterId = request.clusterId;
            this.jobId = request.jobId;
        } 

        /**
         * Specifies whether to use an asynchronous link to stop the job.
         * <p>
         * 
         * Default value: false.
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * The ID of the E-HPC cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to obtain the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The job ID.
         * <p>
         * 
         * You can call the [ListJobs](~~87251~~) operation to obtain the job ID.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public DescribeJobRequest build() {
            return new DescribeJobRequest(this);
        } 

    } 

}
