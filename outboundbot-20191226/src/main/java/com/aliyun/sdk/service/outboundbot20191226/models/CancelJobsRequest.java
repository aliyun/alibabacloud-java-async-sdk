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
 * {@link CancelJobsRequest} extends {@link RequestModel}
 *
 * <p>CancelJobsRequest</p>
 */
public class CancelJobsRequest extends Request {
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

    private CancelJobsRequest(Builder builder) {
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

    public static CancelJobsRequest create() {
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

    public static final class Builder extends Request.Builder<CancelJobsRequest, Builder> {
        private Boolean all; 
        private String instanceId; 
        private String jobGroupId; 
        private java.util.List<String> jobId; 
        private java.util.List<String> jobReferenceId; 
        private String scenarioId; 

        private Builder() {
            super();
        } 

        private Builder(CancelJobsRequest request) {
            super(request);
            this.all = request.all;
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
            this.jobId = request.jobId;
            this.jobReferenceId = request.jobReferenceId;
            this.scenarioId = request.scenarioId;
        } 

        /**
         * <p>Specifies whether to cancel all jobs.</p>
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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>A filter condition. The task group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9f84892d-721a-4069-9975-668c8164d64e</p>
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * <p>A filter condition. The job ID.</p>
         * <blockquote>
         * <p>The JobId parameter is required when the All parameter is set to false.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>edf45790-7200-4cbc-b157-8c0a5f400b75</p>
         */
        public Builder jobId(java.util.List<String> jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>A filter condition. The reference ID of the job.</p>
         * <blockquote>
         * <p>This is the ReferenceId that you specified when you uploaded the contact list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4a875676-b136-4087-88b4-de67c61fed69</p>
         */
        public Builder jobReferenceId(java.util.List<String> jobReferenceId) {
            this.putQueryParameter("JobReferenceId", jobReferenceId);
            this.jobReferenceId = jobReferenceId;
            return this;
        }

        /**
         * <p>A filter condition. The scenario ID.</p>
         * <blockquote>
         * <p>Obtain this ID by calling the DescribeJobGroup operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>35641113-b2f6-464e-a772-25c25554798b</p>
         */
        public Builder scenarioId(String scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        @Override
        public CancelJobsRequest build() {
            return new CancelJobsRequest(this);
        } 

    } 

}
