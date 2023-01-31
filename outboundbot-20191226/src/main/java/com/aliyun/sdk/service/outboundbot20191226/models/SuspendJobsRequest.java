// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendJobsRequest} extends {@link RequestModel}
 *
 * <p>SuspendJobsRequest</p>
 */
public class SuspendJobsRequest extends Request {
    @Query
    @NameInMap("All")
    @Validation(required = true)
    private Boolean all;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobGroupId")
    private String jobGroupId;

    @Query
    @NameInMap("JobId")
    private java.util.List < String > jobId;

    @Query
    @NameInMap("JobReferenceId")
    private java.util.List < String > jobReferenceId;

    @Query
    @NameInMap("ScenarioId")
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
    public java.util.List < String > getJobId() {
        return this.jobId;
    }

    /**
     * @return jobReferenceId
     */
    public java.util.List < String > getJobReferenceId() {
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
        private java.util.List < String > jobId; 
        private java.util.List < String > jobReferenceId; 
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
         * All.
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * InstanceId.
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
        public Builder jobId(java.util.List < String > jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * JobReferenceId.
         */
        public Builder jobReferenceId(java.util.List < String > jobReferenceId) {
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
        public SuspendJobsRequest build() {
            return new SuspendJobsRequest(this);
        } 

    } 

}
