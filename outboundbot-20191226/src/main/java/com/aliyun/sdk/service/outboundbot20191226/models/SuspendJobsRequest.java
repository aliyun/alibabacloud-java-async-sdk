// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link SuspendJobsRequest} extends {@link RequestModel}
 *
 * <p>SuspendJobsRequest</p>
 */
public class SuspendJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("All")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean all;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupId")
    private String jobGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private java.util.List<String> jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobReferenceId")
    private java.util.List<String> jobReferenceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScenarioId")
    private String scenarioId;

    private SuspendJobsRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
        this.jobId = builder.jobId;
        this.jobReferenceId = builder.jobReferenceId;
        this.scenarioId = builder.scenarioId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SuspendJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobGroupId
     */
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    /**
     * @return jobId
     */
    public java.util.List<String> getJobId() {
        return this.jobId;
    }

    /**
     * @return jobReferenceId
     */
    public java.util.List<String> getJobReferenceId() {
        return this.jobReferenceId;
    }

    /**
     * @return scenarioId
     */
    public String getScenarioId() {
        return this.scenarioId;
    }

    public static final class Builder extends Request.Builder<SuspendJobsRequest, Builder> {
        private Boolean all; 
        private String instanceId; 
        private String jobGroupId; 
        private java.util.List<String> jobId; 
        private java.util.List<String> jobReferenceId; 
        private String scenarioId; 

        private Builder() {
            super();
        } 

        private Builder(SuspendJobsRequest request) {
            super(request);
            this.all = request.all;
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
            this.jobId = request.jobId;
            this.jobReferenceId = request.jobReferenceId;
            this.scenarioId = request.scenarioId;
        } 

        /**
         * <p>Filter condition: whether to suspend all jobs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * <p>Instance ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ef4c09ac-2f5c-49e7-9d33-5d85249cee10</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Filter condition, task group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6b3ea2a1-32b3-4041-842b-9bde5de9dda0</p>
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * <p>Job ID list.</p>
         * <blockquote>
         * <p>When ALL is false, JobId is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>11994321-e6bc-47bb-8b1c-8eef8f2f768b</p>
         */
        public Builder jobId(java.util.List<String> jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>Third-party ID of the job.</p>
         * <blockquote>
         * <p>This is the ReferenceId uploaded by the customer when uploading the outbound list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>de3ab269-6746-477c-b13d-bd49f13202c2</p>
         */
        public Builder jobReferenceId(java.util.List<String> jobReferenceId) {
            this.putQueryParameter("JobReferenceId", jobReferenceId);
            this.jobReferenceId = jobReferenceId;
            return this;
        }

        /**
         * <p>Filter condition, scenario ID (historical parameter, deprecated).</p>
         * 
         * <strong>example:</strong>
         * <p>4b6dd926-3cc3-4111-a333-15d9b006fe81</p>
         */
        public Builder scenarioId(String scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        @Override
        public SuspendJobsRequest build() {
            return new SuspendJobsRequest(this);
        } 

    } 

}
