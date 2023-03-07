// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RerunJobsRequest} extends {@link RequestModel}
 *
 * <p>RerunJobsRequest</p>
 */
public class RerunJobsRequest extends Request {
    @Query
    @NameInMap("Async")
    private Boolean async;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Jobs")
    @Validation(required = true)
    private String jobs;

    private RerunJobsRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
        this.clusterId = builder.clusterId;
        this.jobs = builder.jobs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RerunJobsRequest create() {
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
     * @return jobs
     */
    public String getJobs() {
        return this.jobs;
    }

    public static final class Builder extends Request.Builder<RerunJobsRequest, Builder> {
        private Boolean async; 
        private String clusterId; 
        private String jobs; 

        private Builder() {
            super();
        } 

        private Builder(RerunJobsRequest request) {
            super(request);
            this.async = request.async;
            this.clusterId = request.clusterId;
            this.jobs = request.jobs;
        } 

        /**
         * Specifies whether to use an asynchronous link to rerun the job.
         * <p>
         * 
         * Default value: false
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * The ID of the cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The list of jobs that you want to run. Maximum number of jobs: 100. Minimum number of jobs: 1.
         * <p>
         * 
         * Format: `[{"Id": "0.sched****"},{"Id": "1.sched****"}]`. Separate multiple jobs with commas (,).
         * 
         * You can call the [ListJobs](~~87251~~) operation to query the job ID.
         * 
         * >  You can rerun only jobs that are in the RUNNING or QUEUED state.
         */
        public Builder jobs(String jobs) {
            this.putQueryParameter("Jobs", jobs);
            this.jobs = jobs;
            return this;
        }

        @Override
        public RerunJobsRequest build() {
            return new RerunJobsRequest(this);
        } 

    } 

}
