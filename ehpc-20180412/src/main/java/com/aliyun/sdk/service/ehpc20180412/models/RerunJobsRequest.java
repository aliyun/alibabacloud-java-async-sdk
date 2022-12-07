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
         * Async.
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Jobs.
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
