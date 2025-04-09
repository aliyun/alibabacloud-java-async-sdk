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
         * JobGroupId.
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(java.util.List<String> jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * JobReferenceId.
         */
        public Builder jobReferenceId(java.util.List<String> jobReferenceId) {
            this.putQueryParameter("JobReferenceId", jobReferenceId);
            this.jobReferenceId = jobReferenceId;
            return this;
        }

        /**
         * ScenarioId.
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
