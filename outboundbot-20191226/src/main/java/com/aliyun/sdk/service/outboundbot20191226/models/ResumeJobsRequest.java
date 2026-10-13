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
 * {@link ResumeJobsRequest} extends {@link RequestModel}
 *
 * <p>ResumeJobsRequest</p>
 */
public class ResumeJobsRequest extends Request {
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

    private ResumeJobsRequest(Builder builder) {
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

    public static ResumeJobsRequest create() {
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

    public static final class Builder extends Request.Builder<ResumeJobsRequest, Builder> {
        private Boolean all; 
        private String instanceId; 
        private String jobGroupId; 
        private java.util.List<String> jobId; 
        private java.util.List<String> jobReferenceId; 
        private String scenarioId; 

        private Builder() {
            super();
        } 

        private Builder(ResumeJobsRequest request) {
            super(request);
            this.all = request.all;
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
            this.jobId = request.jobId;
            this.jobReferenceId = request.jobReferenceId;
            this.scenarioId = request.scenarioId;
        } 

        /**
         * <p>Filter condition: Specifies whether to restart all jobs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Filter condition: Task group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>de48407d-309e-451a-81ec-6fb11f8fdbf3</p>
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * <p>Job ID list.</p>
         * <blockquote>
         * <p>This parameter is required when All is false.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>b72425bd-7871-4050-838e-033d80d754b7</p>
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
         * <p>d5971d98-7312-4f0e-a918-a17d67133e28</p>
         */
        public Builder jobReferenceId(java.util.List<String> jobReferenceId) {
            this.putQueryParameter("JobReferenceId", jobReferenceId);
            this.jobReferenceId = jobReferenceId;
            return this;
        }

        /**
         * <p>Filter condition: Scenario ID (historical parameter, deprecated).</p>
         * 
         * <strong>example:</strong>
         * <p>b016fbdb-b81c-4c06-8870-cb36b8783b6d</p>
         */
        public Builder scenarioId(String scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        @Override
        public ResumeJobsRequest build() {
            return new ResumeJobsRequest(this);
        } 

    } 

}
