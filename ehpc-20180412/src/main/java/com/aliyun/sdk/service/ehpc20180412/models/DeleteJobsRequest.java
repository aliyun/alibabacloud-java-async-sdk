// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteJobsRequest} extends {@link RequestModel}
 *
 * <p>DeleteJobsRequest</p>
 */
public class DeleteJobsRequest extends Request {
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

    private DeleteJobsRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
        this.clusterId = builder.clusterId;
        this.jobs = builder.jobs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteJobsRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteJobsRequest, Builder> {
        private Boolean async; 
        private String clusterId; 
        private String jobs; 

        private Builder() {
            super();
        } 

        private Builder(DeleteJobsRequest request) {
            super(request);
            this.async = request.async;
            this.clusterId = request.clusterId;
            this.jobs = request.jobs;
        } 

        /**
         * Specifies whether to use an asynchronous link to delete the jobs.
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
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The list of jobs that you want to delete. Maximum number of jobs: 100. Minimum number of jobs: 1.
         * <p>
         * 
         * Format: `[{"Id": "0.sched****"},{"Id": "1.sched****"}]`. Separate multiple jobs with commas (,).
         * 
         * You can call the [ListJobs](~~87251~~) operation to query the job ID.
         */
        public Builder jobs(String jobs) {
            this.putQueryParameter("Jobs", jobs);
            this.jobs = jobs;
            return this;
        }

        @Override
        public DeleteJobsRequest build() {
            return new DeleteJobsRequest(this);
        } 

    } 

}
