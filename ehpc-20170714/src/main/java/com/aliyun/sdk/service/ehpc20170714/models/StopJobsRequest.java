// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopJobsRequest} extends {@link RequestModel}
 *
 * <p>StopJobsRequest</p>
 */
public class StopJobsRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Jobs")
    @Validation(required = true)
    private String jobs;

    private StopJobsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.jobs = builder.jobs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<StopJobsRequest, Builder> {
        private String clusterId; 
        private String jobs; 

        private Builder() {
            super();
        } 

        private Builder(StopJobsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.jobs = request.jobs;
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
        public StopJobsRequest build() {
            return new StopJobsRequest(this);
        } 

    } 

}
