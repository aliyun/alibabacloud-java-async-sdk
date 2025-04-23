// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link RerunJobsRequest} extends {@link RequestModel}
 *
 * <p>RerunJobsRequest</p>
 */
public class RerunJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Async")
    private Boolean async;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Jobs")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to use an asynchronous link to rerun the job.</p>
         * <p>Default value: false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-sh-3VeFyR****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The list of jobs that you want to run. Maximum number of jobs: 100. Minimum number of jobs: 1.</p>
         * <p>Format: <code>[{&quot;Id&quot;: &quot;0.sched****&quot;},{&quot;Id&quot;: &quot;1.sched****&quot;}]</code>. Separate multiple jobs with commas (,).</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87251.html">ListJobs</a> operation to query the job ID.</p>
         * <blockquote>
         * <p> You can rerun only jobs that are in the RUNNING or QUEUED state.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Id&quot;:&quot;1.scheduler&quot;}]</p>
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
