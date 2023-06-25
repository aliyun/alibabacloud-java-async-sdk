// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogPipelineJobRunRequest} extends {@link RequestModel}
 *
 * <p>LogPipelineJobRunRequest</p>
 */
public class LogPipelineJobRunRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("pipelineId")
    @Validation(required = true)
    private Long pipelineId;

    @Path
    @NameInMap("jobId")
    @Validation(required = true)
    private Long jobId;

    @Path
    @NameInMap("pipelineRunId")
    private Long pipelineRunId;

    private LogPipelineJobRunRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.jobId = builder.jobId;
        this.pipelineRunId = builder.pipelineRunId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogPipelineJobRunRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return pipelineRunId
     */
    public Long getPipelineRunId() {
        return this.pipelineRunId;
    }

    public static final class Builder extends Request.Builder<LogPipelineJobRunRequest, Builder> {
        private String organizationId; 
        private Long pipelineId; 
        private Long jobId; 
        private Long pipelineRunId; 

        private Builder() {
            super();
        } 

        private Builder(LogPipelineJobRunRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.pipelineId = request.pipelineId;
            this.jobId = request.jobId;
            this.pipelineRunId = request.pipelineRunId;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * pipelineId.
         */
        public Builder pipelineId(Long pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * jobId.
         */
        public Builder jobId(Long jobId) {
            this.putPathParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * pipelineRunId.
         */
        public Builder pipelineRunId(Long pipelineRunId) {
            this.putPathParameter("pipelineRunId", pipelineRunId);
            this.pipelineRunId = pipelineRunId;
            return this;
        }

        @Override
        public LogPipelineJobRunRequest build() {
            return new LogPipelineJobRunRequest(this);
        } 

    } 

}
